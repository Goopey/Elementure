
package net.mcreator.elementure.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FragilityMobEffect extends MobEffect {
	public FragilityMobEffect() {
		super(MobEffectCategory.HARMFUL, -10092544);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.fragility";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
