package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class AbyssalheartEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isSprinting()) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = (true);
				_player.onUpdateAbilities();
			}
			entity.fallDistance = 0;
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.DRAGON_BREATH, x, y, z, 10, 2, 2, 2, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 2, 2, 2, 1);
		} else if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = (false);
				_player.onUpdateAbilities();
			}
		}
		if (entity.isShiftKeyDown()) {
			entity.clearFire();
			entity.fallDistance = 0;
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CRIT, x, y, z, 10, 2, 2, 2, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.DRAGON_BREATH, x, y, z, 10, 2, 2, 2, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 2, 2, 2, 1);
		}
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 120, 1, (false), (false)));
	}
}
