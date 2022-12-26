package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;

public class WindyshorescloudFloatProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player || sourceentity instanceof ServerPlayer) {
			sourceentity.setDeltaMovement(new Vec3((sourceentity.getDeltaMovement().x()), 3.7, (sourceentity.getDeltaMovement().z())));
			if (sourceentity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 300, 1));
		}
		if (world.dayTime() % 20 <= 0) {
			entity.getPersistentData().putDouble("lifeSpan", (entity.getPersistentData().getDouble("lifeSpan") + 1));
		}
		if (entity.getPersistentData().getDouble("lifeSpan") > 120) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (sourceentity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 300, 1));
		} else if (entity.getPersistentData().getDouble("lifeSpan") > 60) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 300, 1));
		}
	}
}
