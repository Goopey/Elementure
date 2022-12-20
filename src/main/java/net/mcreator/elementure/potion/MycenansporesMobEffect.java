
package net.mcreator.elementure.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.elementure.procedures.MycenansporeseffectProcedure;
import net.mcreator.elementure.procedures.MycenansporesInitialexplosionProcedure;

public class MycenansporesMobEffect extends MobEffect {
	public MycenansporesMobEffect() {
		super(MobEffectCategory.HARMFUL, -13382656);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementure.mycenanspores";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		MycenansporesInitialexplosionProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MycenansporeseffectProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
