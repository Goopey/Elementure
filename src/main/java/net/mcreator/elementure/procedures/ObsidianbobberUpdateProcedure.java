package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.init.ElementureModBlocks;

import java.util.List;
import java.util.ArrayList;

public class ObsidianbobberUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.1, entity.getZ())))
				.is(BlockTags.create(new ResourceLocation("forge:lavafishingblocks")))
				|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.1, entity.getZ())))
						.getBlock() == ElementureModBlocks.DUNGEONWATER.get()
				|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.1, entity.getZ()))).getBlock() == Blocks.WATER
				|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.1, entity.getZ()))).getBlock() == Blocks.WATER) {
			entity.setDeltaMovement(new Vec3(0, 0.075, 0));
		}
		{
			List<? extends Player> _players = new ArrayList<>(world.players());
			for (Entity entityiterator : _players) {
				if ((entityiterator.getDisplayName().getString()).equals(entity.getPersistentData().getString("playerName"))) {
					if (((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString())
							.equals(entity.getPersistentData().getString("rodName"))) {
						if ((world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.5, entity.getZ())))
								.is(BlockTags.create(new ResourceLocation("forge:lavafishingblocks")))
								|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.1, entity.getZ())))
										.getBlock() == ElementureModBlocks.DUNGEONWATER.get()
								|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.5, entity.getZ()))).getBlock() == Blocks.WATER
								|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.5, entity.getZ())))
										.getBlock() == Blocks.WATER) {
							if (entity.getPersistentData()
									.getDouble("bobberWait") >= ((150 - EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_SPEED,
											(entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) * 15)
											- EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_LUCK,
													(entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))
													* 5)
											- entity.getPersistentData().getDouble("attractionPower") * 3) {
								if (Math.random() < 0.25 + EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_LUCK,
										(entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) / 5) {
									entity.getPersistentData().putBoolean("FISH", (true));
									entityiterator.getPersistentData().putBoolean("FISH", (true));
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
													ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")),
													SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
													ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")),
													SoundSource.NEUTRAL, 1, 1, false);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.FALLING_WATER, (entity.getX()), (entity.getY()), (entity.getZ()), 50, 0.2,
												0.2, 0.2, 0.3);
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.FISHNOTIFPARTICLE.get()),
												(entity.getX()), (entity.getY() + 0.375), (entity.getZ()), (int) (3 + Math.random() * 2), 0.1, 0.1,
												0.1, 0);
									new Object() {
										private int ticks = 0;
										private float waitTicks;
										private LevelAccessor world;

										public void start(LevelAccessor world, int waitTicks) {
											this.waitTicks = waitTicks;
											MinecraftForge.EVENT_BUS.register(this);
											this.world = world;
										}

										@SubscribeEvent
										public void tick(TickEvent.ServerTickEvent event) {
											if (event.phase == TickEvent.Phase.END) {
												this.ticks += 1;
												if (this.ticks >= this.waitTicks)
													run();
											}
										}

										private void run() {
											entityiterator.getPersistentData().putBoolean("FISH", (false));
											entity.getPersistentData().putBoolean("FISH", (false));
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, 24);
								}
								entity.getPersistentData().putDouble("bobberWait", 0);
							} else {
								entity.getPersistentData().putDouble("bobberWait", (entity.getPersistentData().getDouble("bobberWait") + 1));
							}
						}
						if (!((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
								.getBoolean("sent"))) {
							entityiterator.getPersistentData().putBoolean("FISH", (false));
							if (!entity.level.isClientSide())
								entity.discard();
						}
					} else if (((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getDisplayName()
							.getString()).equals(entity.getPersistentData().getString("rodName"))) {
						if ((world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.5, entity.getZ())))
								.is(BlockTags.create(new ResourceLocation("forge:lavafishingblocks")))
								|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.1, entity.getZ())))
										.getBlock() == ElementureModBlocks.DUNGEONWATER.get()
								|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.5, entity.getZ()))).getBlock() == Blocks.WATER
								|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.5, entity.getZ())))
										.getBlock() == Blocks.WATER) {
							if (entity.getPersistentData()
									.getDouble("bobberWait") >= ((150 - EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_SPEED,
											(entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) * 15)
											- EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_LUCK,
													(entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY))
													* 5)
											- entity.getPersistentData().getDouble("attractionPower") * 3) {
								if (Math.random() < 0.25 + EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_LUCK,
										(entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) / 10) {
									entity.getPersistentData().putBoolean("FISH", (true));
									entityiterator.getPersistentData().putBoolean("FISH", (true));
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
													ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")),
													SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
													ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")),
													SoundSource.NEUTRAL, 1, 1, false);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.FALLING_WATER, (entity.getX()), (entity.getY()), (entity.getZ()), 50, 0.2,
												0.2, 0.2, 0.3);
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.FISHNOTIFPARTICLE.get()),
												(entity.getX()), (entity.getY() + 0.375), (entity.getZ()), (int) (3 + Math.random() * 2), 0.1, 0.1,
												0.1, 0);
									new Object() {
										private int ticks = 0;
										private float waitTicks;
										private LevelAccessor world;

										public void start(LevelAccessor world, int waitTicks) {
											this.waitTicks = waitTicks;
											MinecraftForge.EVENT_BUS.register(this);
											this.world = world;
										}

										@SubscribeEvent
										public void tick(TickEvent.ServerTickEvent event) {
											if (event.phase == TickEvent.Phase.END) {
												this.ticks += 1;
												if (this.ticks >= this.waitTicks)
													run();
											}
										}

										private void run() {
											entityiterator.getPersistentData().putBoolean("FISH", (false));
											entity.getPersistentData().putBoolean("FISH", (false));
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, 24);
								}
								entity.getPersistentData().putDouble("bobberWait", 0);
							} else {
								entity.getPersistentData().putDouble("bobberWait", (entity.getPersistentData().getDouble("bobberWait") + 1));
							}
						}
						if (!((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag()
								.getBoolean("sent"))) {
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
}
