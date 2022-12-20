package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class HalloweenspiritPhasingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.33 && entity.getPersistentData().getDouble("phaseWait") >= 32) {
			entity.getPersistentData().putDouble("phaseWait", 0);
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 60, 0, (false), (false)));
		} else if (entity.getPersistentData().getDouble("phaseWait") >= 32) {
			entity.getPersistentData().putDouble("phaseWait", 0);
		} else {
			entity.getPersistentData().putDouble("phaseWait", (entity.getPersistentData().getDouble("phaseWait") + 1));
		}
	}
}
