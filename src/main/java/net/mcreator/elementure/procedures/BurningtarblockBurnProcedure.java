package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class BurningtarblockBurnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.fireImmune() && !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.FIRE_RESISTANCE) : false)) {
			entity.setSecondsOnFire(10);
		}
	}
}
