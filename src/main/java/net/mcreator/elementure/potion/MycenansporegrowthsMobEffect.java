
package net.mcreator.elementure.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.elementure.procedures.MycenansporegrowthsEffectProcedure;

public class MycenansporegrowthsMobEffect extends MobEffect {
	public MycenansporegrowthsMobEffect() {
		super(MobEffectCategory.HARMFUL, -16751053);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.mycenansporegrowths";
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		MycenansporegrowthsEffectProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
