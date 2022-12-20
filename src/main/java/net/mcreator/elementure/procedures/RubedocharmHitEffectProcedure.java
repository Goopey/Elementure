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
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModMobEffects;
import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RubedocharmHitEffectProcedure {
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
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getItem() == ElementureModItems.RUBEDO.get()) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(ElementureModMobEffects.PARRY.get()) : false) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(ElementureModMobEffects.PARRY.get());
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.PARRY_FATIGUE.get(), 360, 0));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.PLAYERS, 1, 1,
								false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FALLING_LAVA, (entity.getX()), (entity.getY()), (entity.getZ()), 20, 0.35, 0.35, 0.35, 0);
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getOrCreateTag()
						.putDouble("rage",
								(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getOrCreateTag()
										.getDouble("rage") + 3));
			}
			((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getOrCreateTag()
					.putDouble("rage",
							(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getOrCreateTag()
									.getDouble("rage") + 3));
		}
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getItem() == ElementureModItems.RUBEDO.get()) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(ElementureModMobEffects.PARRY.get()) : false) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(ElementureModMobEffects.PARRY.get());
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.PARRY_FATIGUE.get(), 360, 0));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.PLAYERS, 1, 1,
								false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FALLING_LAVA, (entity.getX()), (entity.getY()), (entity.getZ()), 20, 0.35, 0.35, 0.35, 0);
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getOrCreateTag()
						.putDouble("rage",
								(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getOrCreateTag()
										.getDouble("rage") + 3));
			}
			((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getOrCreateTag()
					.putDouble("rage",
							(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getOrCreateTag()
									.getDouble("rage") + 3));
		}
	}
}
