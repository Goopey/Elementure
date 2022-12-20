package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.init.ElementureModMobEffects;

public class MycenansporesInitialexplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.MYCENANSPORES.get())
				? _livEnt.getEffect(ElementureModMobEffects.MYCENANSPORES.get()).getAmplifier()
				: 0) < 4) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 1), (z + 0.5),
						(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.MYCENANSPORES.get())
								? _livEnt.getEffect(ElementureModMobEffects.MYCENANSPORES.get()).getAmplifier()
								: 0) * 10 + 10),
						0.7, 0.7, 0.7, 0.1);
			for (int index0 = 0; index0 < (int) ((entity instanceof LivingEntity _livEnt
					&& _livEnt.hasEffect(ElementureModMobEffects.MYCENANSPORES.get())
							? _livEnt.getEffect(ElementureModMobEffects.MYCENANSPORES.get()).getAmplifier()
							: 0)
					+ 1); index0++) {
				MycenashroomcloudProcedure.execute(world, (x + 0.5), (y + 0.5), (z + 0.5));
			}
		} else {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 1), (z + 0.5), 50, 0.7, 0.7, 0.7, 0.1);
			for (int index1 = 0; index1 < (int) (4); index1++) {
				MycenashroomcloudProcedure.execute(world, (x + 0.5), (y + 0.5), (z + 0.5));
			}
		}
	}
}
