package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.elementure.network.ElementureModVariables;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class SirenqueenAttackMasterProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("attackCooldown") <= 0) {
			if (Math.random() < 0.6) {
				entity.getPersistentData().putBoolean("sirenqueenWillMelee", (false));
				entity.getPersistentData().putDouble("attackCooldown", 200);
			} else if (Math.random() < 0.33) {
				entity.getPersistentData().putDouble("attackCooldown", 320);
				entity.getPersistentData().putDouble("attackType", 1);
			} else {
				entity.getPersistentData().putDouble("attackCooldown", 200);
				entity.getPersistentData().putDouble("attackType", 2);
			}
		} else if (entity.getPersistentData().getDouble("attackCooldown") > 120) {
			if (entity.getPersistentData().getDouble("attackType") == 1) {
				SirenqueenSummonSirensProcedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("attackType") == 2) {
				SirenqueenSuckAttackProcedure.execute(world, entity);
			}
			entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") - 1));
		} else {
			entity.getPersistentData().putBoolean("sirenqueenWillMelee", (false));
			entity.getPersistentData().putDouble("attackType", 0);
			entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") - 1));
		}
		if (!entity.getPersistentData().getBoolean("sirenqueenWillMelee")) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * 0.7), (entity.getDeltaMovement().y() * 0.7), (entity.getDeltaMovement().z() * 0.7)));
		}
		if (world.dayTime() % 200 == 0) {
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 256, 256, 256), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 256, 256, 256), e -> true).isEmpty()) {
				{
					final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(256 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!((entityiterator.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).musicName).equals("sirenqueen")
								&& (entityiterator instanceof Player || entityiterator instanceof ServerPlayer)) {
							{
								String _setval = "sirenqueen";
								entityiterator.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.musicName = _setval;
									capability.syncPlayerVariables(entityiterator);
								});
							}
						}
					}
				}
			}
		}
	}
}
