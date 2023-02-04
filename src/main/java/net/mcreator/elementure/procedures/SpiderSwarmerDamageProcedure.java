package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

public class SpiderSwarmerDamageProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			if (Math.random() < 0.7) {
				entity.hurt(DamageSource.GENERIC, 3);
			} else {
				entity.hurt(DamageSource.GENERIC, 4);
			}
			if (Math.random() < 0.2) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 0));
			}
		}
	}
}
