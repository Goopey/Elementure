package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class RocketwormTunnelingProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!((world.getBlockState(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.AIR)) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() - 0.01), (entity.getDeltaMovement().z())));
		}
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) {
			entity.setDeltaMovement(new Vec3(0, 0, 0));
		}
		if (!entity.getPersistentData().getBoolean("cannotSpawn")) {
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
						if (!(entityiterator instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							((Mob) entity).setTarget((LivingEntity) entityiterator);
							break;
						}
					}
				}
			}
		}
	}
}
