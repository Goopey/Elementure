package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Registry;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class CausticvialliquidEffectProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double LocX = 0;
		double LocZ = 0;
		LocX = -3;
		LocZ = -3;
		if (entity.getPersistentData().getDouble("wait") > 40) {
			entity.getPersistentData().putDouble("wait", 0);
		} else {
			entity.getPersistentData().putDouble("wait", (entity.getPersistentData().getDouble("wait") + 1));
		}
		if (entity.getPersistentData().getDouble("wait") % 3 == 0) {
			for (int index0 = 0; index0 < (int) (625); index0++) {
				if (LocX * LocX + LocZ * LocZ < 9) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX() + LocX), (entity.getY()), (entity.getZ() + LocZ)),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:entity_effect ~ ~ ~ 0 1 0 1 0 normal");
				}
				LocX = LocX + 0.25;
				if (LocX > 3) {
					LocX = -3;
					LocZ = LocZ + 0.25;
					if (LocZ > 3) {
						LocX = -3;
						LocZ = -3;
					}
				}
			}
			for (int index1 = 0; index1 < (int) (49); index1++) {
				if (LocX * LocX + LocZ * LocZ < 9) {
					{
						final Vec3 _center = new Vec3((entity.getX() + LocX), (entity.getY()), (entity.getZ() + LocZ));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true)
								.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!entityiterator.getType()
									.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))) {
								if (entity instanceof LivingEntity _entity)
									_entity.hurt(new DamageSource("acid").bypassArmor(), 2);
							}
						}
					}
				}
				LocX = LocX + 1;
				if (LocX > 3) {
					LocX = -3;
					LocZ = LocZ + 1;
					if (LocZ > 3) {
						LocX = -3;
						LocZ = -3;
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("wait") == 40) {
			entity.getPersistentData().putDouble("life", (entity.getPersistentData().getDouble("life") + 1));
			if (entity.getPersistentData().getDouble("life") > 10) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}
