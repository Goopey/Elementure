package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.entity.HarpoonbulletEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

public class HarpoonUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean staySpawned = false;
		double dist = 0;
		double playX = 0;
		double playY = 0;
		double playZ = 0;
		if (new Object() {
			public double getSubmergedHeight(Entity _entity) {
				for (TagKey<Fluid> _fldtag : Registry.FLUID.getTagNames().toList()) {
					if (_entity.level.getFluidState(entity.blockPosition()).is(_fldtag))
						return _entity.getFluidHeight(_fldtag);
				}
				return 0;
			}
		}.getSubmergedHeight(entity) > 0.1) {
			entity.setDeltaMovement(new Vec3(0, 0.075, 0));
		}
		{
			List<? extends Player> _players = new ArrayList<>(world.players());
			for (Entity entityiterator : _players) {
				if ((entityiterator.getDisplayName().getString()).equals(entity.getPersistentData().getString("playerName"))) {
					if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getItem() == ElementureModItems.HARPOON_USED.get()) {
						if ((world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.5, entity.getZ()))).getBlock() == Blocks.WATER
								|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.5, entity.getZ())))
										.getBlock() == Blocks.WATER) {
							if (entity.getPersistentData().getDouble("bobberWait") >= 110) {
								if (Math.random() < 0.4) {
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
									}.start(world, 12);
								}
								entity.getPersistentData().putDouble("bobberWait", 0);
							} else {
								entity.getPersistentData().putDouble("bobberWait", (entity.getPersistentData().getDouble("bobberWait") + 1));
							}
						}
					} else if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
							.getItem() == ElementureModItems.HARPOON_USED.get()) {
						if ((world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.5, entity.getZ()))).getBlock() == Blocks.WATER
								|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.5, entity.getZ())))
										.getBlock() == Blocks.WATER) {
							if (entity.getPersistentData().getDouble("bobberWait") >= 110) {
								if (Math.random() < 0.4) {
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
									}.start(world, 12);
								}
								entity.getPersistentData().putDouble("bobberWait", 0);
							} else {
								entity.getPersistentData().putDouble("bobberWait", (entity.getPersistentData().getDouble("bobberWait") + 1));
							}
						}
					} else {
						entityiterator.getPersistentData().putBoolean("FISH", (false));
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
		}
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator instanceof HarpoonbulletEntity)
						&& !(entityiterator.getDisplayName().getString()).equals(entity.getPersistentData().getString("playerName"))
						&& !(entityiterator instanceof ItemEntity) && !(entityiterator instanceof ItemFrame)) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > 0) {
						entityiterator.hurt(DamageSource.GENERIC, 5);
						entity.hurt(DamageSource.GENERIC, 6);
					}
				}
			}
		}
		staySpawned = false;
		dist = 1;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
					if ((entityiterator.getDisplayName().getString()).equals(entity.getPersistentData().getString("playerName"))
							&& ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
									.getItem() == ElementureModItems.HARPOON_USED.get()
									|| (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
											.getItem() == ElementureModItems.HARPOON_USED.get())) {
						staySpawned = true;
						playX = entityiterator.getX();
						playY = entityiterator.getY() + 1.2;
						playZ = entityiterator.getZ();
					}
				}
			}
		}
		if (!staySpawned) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
		for (int index0 = 0; index0 < (int) (15); index0++) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.STRINGPARTICLE.get()),
						(entity.getX() + (dist * (entity.getX() - playX)) / (-15)), (entity.getY() + (dist * (entity.getY() - playY)) / (-15)),
						(entity.getZ() + (dist * (entity.getZ() - playZ)) / (-15)), 1, 0, 0, 0, 0);
			dist = dist + 1;
		}
	}
}
