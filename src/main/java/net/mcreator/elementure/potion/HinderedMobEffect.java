
package net.mcreator.elementure.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.elementure.procedures.HinderedReenableCapabilitiesProcedure;
import net.mcreator.elementure.procedures.HinderedDisableCapabilitiesProcedure;

public class HinderedMobEffect extends MobEffect {
	public HinderedMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10066330);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.hindered";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		HinderedDisableCapabilitiesProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		HinderedReenableCapabilitiesProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
