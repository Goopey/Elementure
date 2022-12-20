
package net.mcreator.elementure.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class BubblingEffectMobEffect extends MobEffect {
	public BubblingEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10066177);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.bubbling_effect";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
