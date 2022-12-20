
package net.mcreator.elementure.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ParryMobEffect extends MobEffect {
	public ParryMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3342337);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.parry";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
