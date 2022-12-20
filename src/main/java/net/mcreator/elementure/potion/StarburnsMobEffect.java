
package net.mcreator.elementure.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.elementure.procedures.StarburnsEffectProcedure;

public class StarburnsMobEffect extends MobEffect {
	public StarburnsMobEffect() {
		super(MobEffectCategory.HARMFUL, -103);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.starburns";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		StarburnsEffectProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
