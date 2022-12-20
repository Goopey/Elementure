
package net.mcreator.elementure.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class HeatresistanceMobEffect extends MobEffect {
	public HeatresistanceMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -11070444);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.heatresistance";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
