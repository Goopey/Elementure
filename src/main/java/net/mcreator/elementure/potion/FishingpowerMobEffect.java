
package net.mcreator.elementure.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FishingpowerMobEffect extends MobEffect {
	public FishingpowerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6684673);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.fishingpower";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
