
package net.mcreator.elementure.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.elementure.procedures.ColdeffectSlowProcedure;

public class ColdeffectMobEffect extends MobEffect {
	public ColdeffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -3342337);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.coldeffect_potion_item";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ColdeffectSlowProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
