package net.mcreator.elementure.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.elementure.init.ElementureModMobEffects;
import net.mcreator.elementure.init.ElementureModItems;

import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Comparator;

public class GlassbellboatActivateInventoryProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double yaw = 0;
		double yaw3 = 0;
		double yaw4 = 0;
		double speedVal = 0;
		boolean spray = false;
		if (Math.random() < 0.4) {
			yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
			yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
			if ((new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack(0, entity)).getItem() == ElementureModItems.GLASSBELLBOAT_DARKFLAMESPRAYER.get() || (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack(1, entity)).getItem() == ElementureModItems.GLASSBELLBOAT_DARKFLAMESPRAYER.get()) {
				{
					final Vec3 _center = new Vec3((entity.getX() + 3.8 * yaw), (entity.getY()), (entity.getZ() + 3.8 * yaw2));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator instanceof Player) && !(entityiterator instanceof ServerPlayer) && !(entityiterator == entity)
								&& !((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)
								&& !entityiterator.getType()
										.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
								&& !entityiterator.getType()
										.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
							spray = true;
							if (entityiterator instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.DARKFLAME.get(), 120, 0));
							entityiterator.hurt(DamageSource.LAVA, 5);
						}
					}
				}
			} else {
				{
					final Vec3 _center = new Vec3((entity.getX() + 3.8 * yaw), (entity.getY()), (entity.getZ() + 3.8 * yaw2));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator instanceof Player) && !(entityiterator instanceof ServerPlayer) && !(entityiterator == entity)
								&& !((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)
								&& !entityiterator.getType()
										.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
								&& !entityiterator.getType()
										.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
							spray = true;
							entityiterator.hurt(DamageSource.LAVA, 4);
						}
					}
				}
			}
			if (spray) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMALL_FLAME, (entity.getX() + 3.8 * yaw), (entity.getY()), (entity.getZ() + 3.8 * yaw2), 100,
							0.85, 0.85, 0.85, 0.01);
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(0, entity)).getItem() == ElementureModItems.DIVERSBEACON.get() || (new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(1, entity)).getItem() == ElementureModItems.DIVERSBEACON.get()) {
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
						if (entityiterator instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 240, 0));
					}
				}
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(0, entity)).getItem() == ElementureModItems.GLASSBELLBOAT_POWER_THRUSTER.get() || (new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(1, entity)).getItem() == ElementureModItems.GLASSBELLBOAT_POWER_THRUSTER.get()) {
			speedVal = 0.3;
		}
		if ((new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(0, entity)).getItem() == ElementureModItems.GLASSBELLBOAT_TURBO_THRUSTER.get() || (new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(1, entity)).getItem() == ElementureModItems.GLASSBELLBOAT_TURBO_THRUSTER.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 60, 1, (false), (false)));
			entity.setDeltaMovement(
					new Vec3((entity.getDeltaMovement().x() / 1.07), (entity.getDeltaMovement().y() / 1.07), (entity.getDeltaMovement().z() / 1.07)));
			if (speedVal > 0) {
				speedVal = 0.24;
			} else {
				speedVal = 0.08;
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(),
						_ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
						_ent.getDisplayName(), _ent.level.getServer(), _ent), ("attribute @s forge:swim_speed base set " + (2.2 + speedVal)));
			}
		}
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.1 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if ((entityiterator.getVehicle()) == entity) {
					pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
					yaw = Math.sin(1.867 * Math.PI + entity.getYRot() / ((-180) / Math.PI));
					yaw2 = Math.cos(1.867 * Math.PI + entity.getYRot() / ((-180) / Math.PI));
					yaw3 = Math.sin((-1.867) * Math.PI + entity.getYRot() / ((-180) / Math.PI));
					yaw4 = Math.cos((-1.867) * Math.PI + entity.getYRot() / ((-180) / Math.PI));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, (entity.getX() + (-3.125) * yaw), (entity.getY()),
								(entity.getZ() + (-3.125) * yaw2), 20, 0.12, 0.12, 0.12, 0.01);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, (entity.getX() + (-3.125) * yaw3), (entity.getY()),
								(entity.getZ() + (-3.125) * yaw4), 20, 0.12, 0.12, 0.12, 0.01);
					if (entityiterator instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 2, 0, (false), (false)));
					entityiterator.setAirSupply((int) entityiterator.getMaxAirSupply());
					if (entityiterator instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 2, 0, (false), (false)));
					if (entity.isInWater()) {
						if (entityiterator.getXRot() <= -33) {
							if (entityiterator.getXRot() <= -45) {
								entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.22, (entity.getDeltaMovement().z())));
							} else {
								entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.13, (entity.getDeltaMovement().z())));
							}
						} else if (entityiterator.getXRot() >= 33) {
							if (entityiterator.getXRot() >= 45) {
								entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (-0.22), (entity.getDeltaMovement().z())));
							} else {
								entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (-0.13), (entity.getDeltaMovement().z())));
							}
						}
					}
				}
			}
		}
		if (!entity.isInWater()) {
			entity.setDeltaMovement(new Vec3(0, 0, 0));
		}
	}
}
