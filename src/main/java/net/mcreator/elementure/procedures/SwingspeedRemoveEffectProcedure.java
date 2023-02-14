package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class SwingspeedRemoveEffectProcedure {
	public static void execute(Entity entity, double amplifier) {
		if (entity == null)
			return;
		double sum = 0;
		double counter = 0;
		double potionLevel = 0;
		potionLevel = amplifier + 1;
		for (int index0 = 0; index0 < (int) (potionLevel); index0++) {
			sum = sum + (counter > 3 ? potionLevel - counter : (potionLevel - counter) / counter);
			counter = counter + 1;
		}
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED).setBaseValue(
				(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED).getValue() - sum * 0.33));
	}
}
