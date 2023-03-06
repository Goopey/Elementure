package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.init.ElementureModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DodgeeffectHitEffectProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(ElementureModMobEffects.DODGE.get()) : false)
				&& Math.random() < ((double) (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.DODGE.get()) ? _livEnt.getEffect(ElementureModMobEffects.DODGE.get()).getAmplifier() : 0) + 1.0) / 10.0) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.SHADOWPARTICLE_2.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 12, 0.3, 0.3, 0.3, 0.01);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getX() + Math.random() * 4 - 2), (entity.getY() + Math.random()), (entity.getZ() + Math.random() * 4 - 2));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getX() + Math.random() * 4 - 2), (entity.getY() + Math.random()), (entity.getZ() + Math.random() * 4 - 2), _ent.getYRot(), _ent.getXRot());
			}
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
	}
}
