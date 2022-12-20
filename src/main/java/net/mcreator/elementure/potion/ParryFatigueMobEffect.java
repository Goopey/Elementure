
package net.mcreator.elementure.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ParryFatigueMobEffect extends MobEffect {
	public ParryFatigueMobEffect() {
		super(MobEffectCategory.HARMFUL, -13421773);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.parry_fatigue";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
