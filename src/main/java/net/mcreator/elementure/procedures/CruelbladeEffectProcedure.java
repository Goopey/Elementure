package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class CruelbladeEffectProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity.getPersistentData().getDouble("rage") > 2) {
			entity.getPersistentData().putDouble("rage", 0);
			if (sourceentity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 1));
		} else if (Math.random() < 0.5) {
			entity.getPersistentData().putDouble("rage", (entity.getPersistentData().getDouble("rage") + 1));
		}
	}
}
