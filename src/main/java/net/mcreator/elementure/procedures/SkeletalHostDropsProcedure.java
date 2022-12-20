package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.HeadlessDiscardedSkeletonEntity;
import net.mcreator.elementure.entity.DiscardedSkeletonEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class SkeletalHostDropsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.3) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.BONE));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (Math.random() < 0.05) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
						new ItemStack(ElementureModItems.ARACHNEELFANG.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.BONE_FRAGMENTS.get()), (entity.getX()), (entity.getY() + 1),
					(entity.getZ()), 7, 0.5, 0.5, 0.5, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.WEB_PARTICLES.get()), (entity.getX()), (entity.getY() + 1),
					(entity.getZ()), 7, 0.5, 0.5, 0.5, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SMOKE, (entity.getX()), (entity.getY() + 1), (entity.getZ()), 3, 0.5, 0.5, 0.5, 0.05);
		if (Math.random() < 0.7) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new HeadlessDiscardedSkeletonEntity(ElementureModEntities.HEADLESS_DISCARDED_SKELETON.get(), _level);
				entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), 0);
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (Math.random() < 0.7) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new DiscardedSkeletonEntity(ElementureModEntities.DISCARDED_SKELETON.get(), _level);
				entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), 0);
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new DiscardedSkeletonEntity(ElementureModEntities.DISCARDED_SKELETON.get(), _level);
				entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), 0);
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof DiscardedSkeletonEntity) {
						entityiterator.getPersistentData().putBoolean("host", (true));
					}
				}
			}
		}
	}
}
