package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.ElementureMod;

import java.util.ArrayList;

public class MemorybobberUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double numParticle = 0;
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() / 1.75), 0, (entity.getDeltaMovement().z() / 1.75)));
		{
			Entity _ent = entity;
			_ent.teleportTo((entity.getX()), Math.round(entity.getY()), (entity.getZ()));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((entity.getX()), Math.round(entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
		}
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((entityiterator.getDisplayName().getString()).equals(entity.getPersistentData().getString("playerName"))) {
				if (((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).equals(entity.getPersistentData().getString("rodName"))) {
					if (CanfishinVoidProcedure.execute(world, entity)) {
						if (entity.getPersistentData()
								.getDouble("bobberWait") >= ((150 - EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_SPEED, (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) * 15)
										- EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_LUCK, (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) * 5)
										- entity.getPersistentData().getDouble("attractionPower") * 3) {
							if (Math.random() < 0.25 + EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_LUCK, (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) / 5) {
								entity.getPersistentData().putBoolean("FISH", (true));
								entityiterator.getPersistentData().putBoolean("FISH", (true));
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.DRAGON_BREATH, (entity.getX()), (entity.getY()), (entity.getZ()), 50, 0.2, 0.2, 0.2, 0.3);
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.FISHNOTIFPARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), (int) (5 + Math.random() * 4), 0.2, 0.2, 0.2, 0);
								ElementureMod.queueServerWork(24, () -> {
									entityiterator.getPersistentData().putBoolean("FISH", (false));
									entity.getPersistentData().putBoolean("FISH", (false));
								});
							}
							entity.getPersistentData().putDouble("bobberWait", 0);
						} else {
							entity.getPersistentData().putDouble("bobberWait", (entity.getPersistentData().getDouble("bobberWait") + 1));
						}
						while (entity.getY() + numParticle > 0) {
							numParticle = numParticle - 0.1;
							world.addParticle(ParticleTypes.END_ROD, (entity.getX()), (entity.getY() + numParticle), (entity.getZ()), 0, 0, 0);
						}
					}
					if (!((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getBoolean("sent"))) {
						entityiterator.getPersistentData().putBoolean("FISH", (false));
						if (!entity.level.isClientSide())
							entity.discard();
					}
				} else if (((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getDisplayName().getString()).equals(entity.getPersistentData().getString("rodName"))) {
					if (CanfishinVoidProcedure.execute(world, entity)) {
						if (entity.getPersistentData()
								.getDouble("bobberWait") >= ((150 - EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_SPEED, (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) * 15)
										- EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_LUCK, (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) * 5)
										- entity.getPersistentData().getDouble("attractionPower") * 3) {
							if (Math.random() < 0.25 + EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_LUCK, (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) / 10) {
								entity.getPersistentData().putBoolean("FISH", (true));
								entityiterator.getPersistentData().putBoolean("FISH", (true));
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.DRAGON_BREATH, (entity.getX()), (entity.getY()), (entity.getZ()), 50, 0.2, 0.2, 0.2, 0.3);
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.FISHNOTIFPARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), (int) (5 + Math.random() * 4), 0.2, 0.2, 0.2, 0);
								ElementureMod.queueServerWork(24, () -> {
									entityiterator.getPersistentData().putBoolean("FISH", (false));
									entity.getPersistentData().putBoolean("FISH", (false));
								});
							}
							entity.getPersistentData().putDouble("bobberWait", 0);
						} else {
							entity.getPersistentData().putDouble("bobberWait", (entity.getPersistentData().getDouble("bobberWait") + 1));
						}
						while (entity.getY() + numParticle > 0) {
							numParticle = numParticle - 0.1;
							world.addParticle(ParticleTypes.END_ROD, (entity.getX()), (entity.getY() + numParticle), (entity.getZ()), 0, 0, 0);
						}
					}
					if (!((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getBoolean("sent"))) {
						entityiterator.getPersistentData().putBoolean("FISH", (false));
						if (!entity.level.isClientSide())
							entity.discard();
					}
				} else {
					entityiterator.getPersistentData().putBoolean("FISH", (false));
					if (!entity.level.isClientSide())
						entity.discard();
				}
			}
		}
	}
}
