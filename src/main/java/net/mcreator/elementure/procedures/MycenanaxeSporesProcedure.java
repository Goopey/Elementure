package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModMobEffects;

public class MycenanaxeSporesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (Math.random() < 0.3) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.MYCENANSPORES.get(), 80, 0));
			for (int index0 = 0; index0 < (int) (2); index0++) {
				MycenashroomcloudProcedure.execute(world, x, y, z);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z + 0.5), 40, 0.7, 0.7, 0.7, 0);
		}
		if (Math.random() < 0.25) {
			{
				double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).earth_essence + 3;
				sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.earth_essence = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
	}
}
