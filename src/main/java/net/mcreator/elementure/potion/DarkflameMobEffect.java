
package net.mcreator.elementure.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.elementure.procedures.DarkflameLingerBurnProcedure;
import net.mcreator.elementure.procedures.DarkflameEffectProcedure;

public class DarkflameMobEffect extends MobEffect {
	public DarkflameMobEffect() {
		super(MobEffectCategory.HARMFUL, -13434880);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.darkflame";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DarkflameEffectProcedure.execute(entity.level, entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		DarkflameLingerBurnProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
