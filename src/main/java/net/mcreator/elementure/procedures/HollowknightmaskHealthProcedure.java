package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class HollowknightmaskHealthProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("hkmaskcooldown") <= 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 401, 0));
			entity.getPersistentData().putDouble("hkmaskcooldown", 400);
		} else {
			entity.getPersistentData().putDouble("hkmaskcooldown", (entity.getPersistentData().getDouble("hkmaskcooldown") - 1));
		}
	}
}
