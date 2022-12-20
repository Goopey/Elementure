
package net.mcreator.elementure.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.elementure.procedures.BubbledSummonBubblesProcedure;

public class BubbledEffectMobEffect extends MobEffect {
	public BubbledEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -6697729);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.bubbled_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BubbledSummonBubblesProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
