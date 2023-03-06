package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModMobEffects;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class TheninefamiliarTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.canSeeSkyFromBelowWater(new BlockPos(entity.getX(), entity.getY(), entity.getZ())) && world.getMaxLocalRawBrightness(new BlockPos(entity.getX(), entity.getY(), entity.getZ())) <= 3 && !(world instanceof Level _lvl && _lvl.isDay())
				&& world.dimensionType().moonPhase(world.dayTime()) == 8) {
			entity.getPersistentData().putDouble("eye_timer", 400);
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
						if (entityiterator instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.CURSEDSIGHT_POTION_ITEM.get(), 120, 0));
					}
				}
			}
		} else if (!(entity.getPersistentData().getDouble("eye_timer") <= 0)) {
			entity.getPersistentData().putDouble("eye_timer", (entity.getPersistentData().getDouble("eye_timer") - 1));
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
						if (entityiterator instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.CURSEDSIGHT_POTION_ITEM.get(), 120, 0));
					}
				}
			}
		}
		FamiliarCheckPlayerProcedure.execute(world, entity);
	}
}
