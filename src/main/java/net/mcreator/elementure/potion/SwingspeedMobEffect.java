
package net.mcreator.elementure.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.elementure.procedures.SwingspeedRemoveEffectProcedure;
import net.mcreator.elementure.procedures.SwingspeedEffectProcedure;

public class SwingspeedMobEffect extends MobEffect {
	public SwingspeedMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16737793);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.swingspeed";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		SwingspeedEffectProcedure.execute(entity, amplifier);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SwingspeedRemoveEffectProcedure.execute(entity, amplifier);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
