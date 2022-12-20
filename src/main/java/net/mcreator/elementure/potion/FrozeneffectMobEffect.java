
package net.mcreator.elementure.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.elementure.procedures.FrozeneffectGiveColdProcedure;
import net.mcreator.elementure.procedures.FrozeneffectFreezeProcedure;

public class FrozeneffectMobEffect extends MobEffect {
	public FrozeneffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -6684673);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.frozeneffect_potion_item";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FrozeneffectFreezeProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		FrozeneffectGiveColdProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
