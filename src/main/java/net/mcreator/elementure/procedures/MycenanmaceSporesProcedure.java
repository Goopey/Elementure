package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModMobEffects;

public class MycenanmaceSporesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (Math.random() < 0.2) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.MYCENANSPORES.get(), 80, 0));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z + 0.5), 20, 0.7, 0.7, 0.7, 0);
			MycenashroomcloudProcedure.execute(world, (x + 0.5), (y + 0.5), (z + 0.5));
		}
		if (Math.random() < 0.01) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.MYCENANSPORES.get(), 80, 1));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z + 0.5), 40, 0.7, 0.7, 0.7, 0);
			for (int index0 = 0; index0 < (int) (2); index0++) {
				MycenashroomcloudProcedure.execute(world, (x + 0.5), (y + 0.5), (z + 0.5));
			}
		}
		if (Math.random() < 0.43) {
			{
				double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).earth_essence + 5;
				sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.earth_essence = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
	}
}
