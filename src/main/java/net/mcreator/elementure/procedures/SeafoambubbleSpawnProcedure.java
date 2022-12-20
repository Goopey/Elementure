package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.FoamfishEntity;

public class SeafoambubbleSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(!world.getEntitiesOfClass(FoamfishEntity.class, AABB.ofSize(new Vec3(x, y, z), 18, 18, 18), e -> true).isEmpty())) {
			if (Math.random() < 0.07) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.JELLYBUBBLE.get()), x, (y + 1.2), z, 20, 0.2, 0.2, 0.2,
							0.02);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new FoamfishEntity(ElementureModEntities.FOAMFISH.get(), _level);
					entityToSpawn.moveTo(x, (y + 1.5), z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
