
package net.mcreator.elementure.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.elementure.procedures.MycenanfungalsporesImmunityEffectProcedure;

public class MycenanfungalsporesImmunityMobEffect extends MobEffect {
	public MycenanfungalsporesImmunityMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6684775);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.mycenanfungalspores_immunity";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MycenanfungalsporesImmunityEffectProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
