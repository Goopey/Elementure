package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
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

import net.mcreator.elementure.init.ElementureModParticleTypes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MemoryteleportanimationProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double yaw = 0;
		if (entity.getPersistentData().getBoolean("memory_teleporting")) {
			pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
			pitch2 = Math.sin(entity.getXRot() / ((-180) / Math.PI));
			yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
			yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
			entity.setDeltaMovement(new Vec3(0, 0, 0));
			entity.getPersistentData().putDouble("memory_time", (entity.getPersistentData().getDouble("memory_time") + 0.5));
			if (entity.getPersistentData().getDouble("memory_time") >= 216) {
				entity.getPersistentData().putDouble("whitescreen", 0);
				entity.getPersistentData().putDouble("memory_time", 0);
				entity.getPersistentData().putBoolean("memory_teleporting", (false));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 80, 0));
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.TELEPORTPARTICLE.get()),
							(entity.getPersistentData().getDouble("memory_teleporting_x")),
							(entity.getPersistentData().getDouble("memory_teleporting_y")),
							(entity.getPersistentData().getDouble("memory_teleporting_z")), 150, 1, 1, 1, 0.4);
			} else if (entity.getPersistentData().getDouble("memory_time") < 216 && entity.getPersistentData().getDouble("memory_time") > 194) {
				if (entity.getPersistentData().getDouble("memory_time") == 215) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 80, 0));
					FirestareffectProcedure.execute(entity);
					{
						Entity _ent = entity;
						_ent.teleportTo((entity.getPersistentData().getDouble("memory_teleporting_x")),
								(entity.getPersistentData().getDouble("memory_teleporting_y")),
								(entity.getPersistentData().getDouble("memory_teleporting_z")));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("memory_teleporting_x")),
									(entity.getPersistentData().getDouble("memory_teleporting_y")),
									(entity.getPersistentData().getDouble("memory_teleporting_z")), _ent.getYRot(), _ent.getXRot());
					}
				} else {
					entity.getPersistentData().putDouble("whitescreen", (entity.getPersistentData().getDouble("whitescreen") + 1));
				}
				if (entity.getPersistentData().getDouble("memory_time") == 194.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:memory_teleport")), SoundSource.NEUTRAL, 1,
									1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:memory_teleport")),
									SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				for (int index0 = 0; index0 < (int) (20); index0++) {
					world.addParticle((SimpleParticleType) (ElementureModParticleTypes.NEARMEMORYPARTICLE.get()), (entity.getX() + 1.1 * yaw * pitch),
							(entity.getY() + 1.633 + 1.1 * pitch2), (entity.getZ() + 1.1 * yaw2 * pitch),
							(((yaw * pitch) / (-4) + (Math.random() - 0.5) / 3) / 7), ((pitch2 / (-4) + (Math.random() - 0.5) / 3) / 7),
							(((yaw2 * pitch) / (-4) + (Math.random() - 0.5) / 3) / 7));
				}
			} else if (entity.getPersistentData().getDouble("memory_time") < 160 && entity.getPersistentData().getDouble("memory_time") > 112) {
				if (entity.getPersistentData().getDouble("memory_time") == 114.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:memory_teleport_startup")),
									SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z,
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:memory_teleport_startup")),
									SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (entity.getPersistentData().getDouble("memory_time") == 112.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")), SoundSource.NEUTRAL,
									1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")),
									SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				for (int index1 = 0; index1 < (int) (32); index1++) {
					world.addParticle((SimpleParticleType) (ElementureModParticleTypes.MEMORYPARTICLE.get()), (entity.getX() + 1.1 * yaw * pitch),
							(entity.getY() + 1.633 + 1.1 * pitch2), (entity.getZ() + 1.1 * yaw2 * pitch),
							(((yaw * pitch) / (-4) + (Math.random() - 0.5) / 3) / (5 - Math.random() * 3)),
							((pitch2 / (-4) + (Math.random() - 0.5) / 3) / (5 - Math.random() * 3)),
							(((yaw2 * pitch) / (-4) + (Math.random() - 0.5) / 3) / (5 - Math.random() * 3)));
				}
			} else if (entity.getPersistentData().getDouble("memory_time") < 112 && entity.getPersistentData().getDouble("memory_time") > 90) {
				for (int index2 = 0; index2 < (int) (14); index2++) {
					world.addParticle((SimpleParticleType) (ElementureModParticleTypes.TRANSPARENTMEMORYPARTICLE.get()),
							(entity.getX() + 0.85 * yaw * pitch), (entity.getY() + 1.633 + 0.85 * pitch2), (entity.getZ() + 0.85 * yaw2 * pitch),
							(((yaw * pitch) / (-4) + (Math.random() - 0.5) / 3) / 4), ((pitch2 / (-4) + (Math.random() - 0.5) / 3) / 4),
							(((yaw2 * pitch) / (-4) + (Math.random() - 0.5) / 3) / 4));
				}
				for (int index3 = 0; index3 < (int) (20); index3++) {
					world.addParticle((SimpleParticleType) (ElementureModParticleTypes.MEMORYPARTICLE.get()), (entity.getX() + 0.85 * yaw * pitch),
							(entity.getY() + 1.633 + 0.85 * pitch2), (entity.getZ() + 0.85 * yaw2 * pitch),
							(((yaw * pitch) / (-4) + (Math.random() - 0.5) / 3) / 4), ((pitch2 / (-4) + (Math.random() - 0.5) / 3) / 4),
							(((yaw2 * pitch) / (-4) + (Math.random() - 0.5) / 3) / 4));
				}
			} else if (entity.getPersistentData().getDouble("memory_time") < 90 && entity.getPersistentData().getDouble("memory_time") > 70) {
				for (int index4 = 0; index4 < (int) (16); index4++) {
					world.addParticle((SimpleParticleType) (ElementureModParticleTypes.TRANSPARENTMEMORYPARTICLE.get()),
							(entity.getX() + 0.85 * yaw * pitch), (entity.getY() + 1.633 + 0.85 * pitch2), (entity.getZ() + 0.85 * yaw2 * pitch),
							(((yaw * pitch) / (-4) + (Math.random() - 0.5) / 3) / 4), ((pitch2 / (-4) + (Math.random() - 0.5) / 3) / 4),
							(((yaw2 * pitch) / (-4) + (Math.random() - 0.5) / 3) / 4));
				}
				for (int index5 = 0; index5 < (int) (8); index5++) {
					world.addParticle((SimpleParticleType) (ElementureModParticleTypes.MEMORYPARTICLE.get()), (entity.getX() + 0.85 * yaw * pitch),
							(entity.getY() + 1.633 + 0.85 * pitch2), (entity.getZ() + 0.85 * yaw2 * pitch),
							(((yaw * pitch) / (-4) + (Math.random() - 0.5) / 3) / 4), ((pitch2 / (-4) + (Math.random() - 0.5) / 3) / 4),
							(((yaw2 * pitch) / (-4) + (Math.random() - 0.5) / 3) / 4));
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.TELEPORTPARTICLE.get()), (entity.getX()), (entity.getY()),
							(entity.getZ()), 2, 0.05, 0.05, 0.05, 0.05);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.TELEPORTPARTICLE.get()), (entity.getX()),
							(entity.getY() + 1.8), (entity.getZ()), 2, 0.05, 0.05, 0.05, 0.05);
			} else if (entity.getPersistentData().getDouble("memory_time") < 70 && entity.getPersistentData().getDouble("memory_time") > 40) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.TELEPORTPARTICLE.get()), (entity.getX()), (entity.getY()),
							(entity.getZ()), 4, 0.05, 0.05, 0.05, 0.05);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.TELEPORTPARTICLE.get()), (entity.getX()),
							(entity.getY() + 1.8), (entity.getZ()), 4, 0.05, 0.05, 0.05, 0.05);
				for (int index6 = 0; index6 < (int) (10); index6++) {
					world.addParticle((SimpleParticleType) (ElementureModParticleTypes.TRANSPARENTMEMORYPARTICLE.get()),
							(entity.getX() + 0.85 * yaw * pitch), (entity.getY() + 1.633 + 0.85 * pitch2), (entity.getZ() + 0.85 * yaw2 * pitch),
							(((yaw * pitch) / (-4) + (Math.random() - 0.5) / 3) / 4), ((pitch2 / (-4) + (Math.random() - 0.5) / 3) / 4),
							(((yaw2 * pitch) / (-4) + (Math.random() - 0.5) / 3) / 4));
				}
			} else if (entity.getPersistentData().getDouble("memory_time") < 194 && entity.getPersistentData().getDouble("memory_time") > 160) {
				for (int index7 = 0; index7 < (int) (32); index7++) {
					world.addParticle((SimpleParticleType) (ElementureModParticleTypes.NEARMEMORYPARTICLE.get()), (entity.getX() + 1.1 * yaw * pitch),
							(entity.getY() + 1.633 + 1.1 * pitch2), (entity.getZ() + 1.1 * yaw2 * pitch),
							(((yaw * pitch) / (-4) + (Math.random() - 0.5) / 3) / 7), ((pitch2 / (-4) + (Math.random() - 0.5) / 3) / 7),
							(((yaw2 * pitch) / (-4) + (Math.random() - 0.5) / 3) / 7));
				}
			} else {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.TELEPORTPARTICLE.get()), (entity.getX()), (entity.getY()),
							(entity.getZ()), 8, 0.05, 0.05, 0.05, 0.05);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.TELEPORTPARTICLE.get()), (entity.getX()),
							(entity.getY() + 1.8), (entity.getZ()), 8, 0.05, 0.05, 0.05, 0.05);
			}
		}
	}
}
