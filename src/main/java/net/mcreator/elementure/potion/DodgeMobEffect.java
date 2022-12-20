
package net.mcreator.elementure.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class DodgeMobEffect extends MobEffect {
	public DodgeMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13421773);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.dodge";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
