
package net.mcreator.elementure.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.elementure.procedures.CursedsightBlindnessProcedure;

public class CursedsightMobEffect extends MobEffect {
	public CursedsightMobEffect() {
		super(MobEffectCategory.HARMFUL, -3394816);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.cursedsight_potion_item";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CursedsightBlindnessProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
