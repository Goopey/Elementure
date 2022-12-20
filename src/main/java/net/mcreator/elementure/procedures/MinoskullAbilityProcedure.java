package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class MinoskullAbilityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) : false) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FALLING_LAVA, (entity.getX()), (entity.getY()), (entity.getZ()), 5, 0.8, 0.8, 0.8, 0.25);
		}
		if (entity.getPersistentData().getDouble("minochargeWait") >= 20) {
			entity.getPersistentData().putDouble("minochargeWait", 0);
			if (Math.random() < 0.002) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 20));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 1));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 0));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cow.hurt")), SoundSource.NEUTRAL, 4, (float) 0.2);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cow.hurt")), SoundSource.NEUTRAL, 4, (float) 0.2,
								false);
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("minochargeWait", (entity.getPersistentData().getDouble("minochargeWait") + 1));
		}
	}
}
