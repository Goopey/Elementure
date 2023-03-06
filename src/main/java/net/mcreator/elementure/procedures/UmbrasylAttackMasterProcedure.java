package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModParticleTypes;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class UmbrasylAttackMasterProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("attackCooldown") <= 0) {
			if (Math.random() < 0.3) {
				entity.getPersistentData().putBoolean("umbrasylWillMelee", (true));
				entity.getPersistentData().putDouble("attackCooldown", 400);
				entity.getPersistentData().putDouble("attackType", 1);
			} else if (Math.random() < 0.45) {
				entity.getPersistentData().putDouble("attackCooldown", 800);
				entity.getPersistentData().putDouble("attackType", 2);
			} else if (Math.random() < 0.35) {
				entity.getPersistentData().putDouble("attackCooldown", 600);
				entity.getPersistentData().putDouble("attackType", 3);
			} else {
				entity.getPersistentData().putDouble("attackCooldown", 650);
				entity.getPersistentData().putDouble("attackType", 4);
			}
		} else if (entity.getPersistentData().getDouble("attackCooldown") > 200) {
			if (entity.getPersistentData().getDouble("attackType") == 1) {
				if (entity.getPersistentData().getBoolean("umbrasylPhase2")) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 0, (false), (false)));
				} else {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 1, (false), (false)));
				}
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") - 2));
			} else if (entity.getPersistentData().getDouble("attackType") == 2) {
				UmbrasylFireBreathProcedure.execute(world, entity);
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") - 2));
			} else if (entity.getPersistentData().getDouble("attackType") == 3) {
				UmbrasylFireAOEProcedure.execute(world, entity);
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") - 2));
			} else if (entity.getPersistentData().getDouble("attackType") == 4) {
				UmbrasylFireBallSpreadAttackProcedure.execute(world, entity);
				if (entity.getPersistentData().getBoolean("umbrasylPhase2")) {
					entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") - 1));
				} else {
					entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") - 2));
				}
			}
		} else {
			entity.getPersistentData().putBoolean("umbrasylWillMelee", (false));
			entity.getPersistentData().putDouble("attackType", 0);
			entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") - 6));
		}
		if (!entity.getPersistentData().getBoolean("umbrasylWillMelee")) {
			if (entity.getPersistentData().getBoolean("umbrasylPhase2")) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * 0.9), (entity.getDeltaMovement().y() * 0.9), (entity.getDeltaMovement().z() * 0.9)));
			} else {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * 0.7), (entity.getDeltaMovement().y() * 0.7), (entity.getDeltaMovement().z() * 0.7)));
			}
		}
		UmbrasylFireBallSprayProcedure.execute(world, entity);
		if (world.dayTime() % 200 == 0) {
			if (entity.getPersistentData().getBoolean("umbrasylPhase2")) {
				if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.growl")), SoundSource.HOSTILE, 1, (float) 0.8);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.growl")), SoundSource.HOSTILE, 1, (float) 0.8, false);
						}
					}
				}
			} else {
				if (Math.random() < 0.35) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.growl")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.growl")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
				}
			}
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 256, 256, 256), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 256, 256, 256), e -> true).isEmpty()) {
				{
					final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(256 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!((entityiterator.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).musicName).equals("umbrasyl")
								&& (entityiterator instanceof Player || entityiterator instanceof ServerPlayer)) {
							{
								String _setval = "umbrasyl";
								entityiterator.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.musicName = _setval;
									capability.syncPlayerVariables(entityiterator);
								});
							}
						}
					}
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) < 0.5 && !entity.getPersistentData().getBoolean("umbrasylPhase2")) {
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 2, Explosion.BlockInteraction.NONE);
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.TARFLAME_PARTICLE.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 20, 0.6, 0.6, 0.6, 0);
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.growl")), SoundSource.HOSTILE, 1, 1);
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.growl")), SoundSource.HOSTILE, 1, 1, false);
				}
			}
			entity.getPersistentData().putBoolean("umbrasylPhase2", (true));
			UmbrasylPhaseChangeProcedure.execute(world, entity);
		}
	}
}
