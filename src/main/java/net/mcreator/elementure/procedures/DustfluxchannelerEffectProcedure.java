package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class DustfluxchannelerEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		locX = Math.random() * 10 - 5;
		locY = Math.random() * 2;
		locZ = Math.random() * 10 - 5;
		if (Math.random() < 0.5) {
			if (!world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ)).canOcclude()) {
				{
					Entity _ent = entity;
					_ent.teleportTo((x + locX), (y + locY), (z + locZ));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((x + locX), (y + locY), (z + locZ), _ent.getYRot(), _ent.getXRot());
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, (x + locX), (y + locY), (z + locZ), 32, 0.3, 0.3, 0.3, 0.2);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 22, 0.3, 0.3, 0.3, 0.2);
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120, 3));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 16, 0.3, 0.3, 0.3, 0.2);
		}
	}
}
