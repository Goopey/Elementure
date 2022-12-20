package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.HeadlessDiscardedSkeletonEntity;
import net.mcreator.elementure.entity.HeadHostEntity;

import java.util.Comparator;

public class DiscardedSkeletonSpawnHeadHostProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("host")) {
			if (entity.getPersistentData().getDouble("spawnHostTimer") > 240) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.BONE_FRAGMENTS.get()), (entity.getX()), (entity.getY()),
							(entity.getZ()), 5, 0.5, 0.5, 0.5, 0);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.WEB_PARTICLES.get()), (entity.getX()), (entity.getY()),
							(entity.getZ()), 5, 0.5, 0.5, 0.5, 0);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMOKE, (entity.getX()), (entity.getY()), (entity.getZ()), 2, 0.5, 0.5, 0.5, 0);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new HeadlessDiscardedSkeletonEntity(ElementureModEntities.HEADLESS_DISCARDED_SKELETON.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new HeadHostEntity(ElementureModEntities.HEAD_HOST.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY() + 0.5), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (!world
					.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 8, 8, 8), e -> true)
					.isEmpty()
					&& !(((Entity) world.getEntitiesOfClass(Player.class,
							AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 8, 8, 8), e -> true).stream()
							.sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf((entity.getX()), (entity.getY()), (entity.getZ()))).findFirst().orElse(null)) instanceof Player _plr
									? _plr.getAbilities().instabuild
									: false)) {
				entity.getPersistentData().putDouble("spawnHostTimer", (entity.getPersistentData().getDouble("spawnHostTimer") + 1));
			} else if (entity.getPersistentData().getDouble("spawnHostTimer") > 0) {
				entity.getPersistentData().putDouble("spawnHostTimer", (entity.getPersistentData().getDouble("spawnHostTimer") + 1));
			}
		}
	}
}
