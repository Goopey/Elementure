package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.ObsidianbobberEntEntity;
import net.mcreator.elementure.entity.MemorybobberEntityEntity;
import net.mcreator.elementure.entity.CustombobberEntity;

import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Iterator;
import java.util.Comparator;

public class ReinforcedfishingrodSendBobberProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double pitch = 0;
		double pitch2 = 0;
		double yaw = 0;
		double yaw2 = 0;
		boolean fishBobber = false;
		fishBobber = false;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:fishingbobberentity")))
						&& (entityiterator.getPersistentData().getString("playerName")).equals(entity.getDisplayName().getString())
						&& entityiterator.getPersistentData().getBoolean("FISH")) {
					fishBobber = true;
				}
			}
		}
		if (entity.isShiftKeyDown()) {
			ReinforcedfishingrodOpenInventoryProcedure.execute(world, x, y, z, entity, itemstack);
		} else {
			if (!itemstack.getOrCreateTag().getBoolean("sent")) {
				itemstack.getOrCreateTag().putBoolean("sent", (true));
				if ((world.getBlockState(new BlockPos(
						entity.level
								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(80)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
								.getBlockPos().getX(),
						entity.level
								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(80)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
								.getBlockPos().getY(),
						entity.level
								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(80)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
								.getBlockPos().getZ())))
						.is(BlockTags.create(new ResourceLocation("elementure:fishingblocks")))) {
					pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
					pitch2 = Math.sin(entity.getXRot() / ((-180) / Math.PI));
					yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
					yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
					if ((new Object() {
						public ItemStack getItemStack(int sltid, ItemStack _isc) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack(1, itemstack)).getItem() == ElementureModItems.OBSIDIANBOBBER.get() || (new Object() {
						public ItemStack getItemStack(int sltid, ItemStack _isc) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack(1, itemstack)).getItem() == ElementureModItems.PRISMATICPIP.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new ObsidianbobberEntEntity(ElementureModEntities.OBSIDIANBOBBER_ENT.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (1.2 + entity.getY()), (entity.getZ()), 0, 0);
							entityToSpawn.setYBodyRot(0);
							entityToSpawn.setYHeadRot(0);
							entityToSpawn.setDeltaMovement((1.5 * yaw * pitch), (1.5 * pitch2), (1.5 * yaw2 * pitch));
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new CustombobberEntity(ElementureModEntities.CUSTOMBOBBER.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (1.2 + entity.getY()), (entity.getZ()), 0, 0);
							entityToSpawn.setYBodyRot(0);
							entityToSpawn.setYHeadRot(0);
							entityToSpawn.setDeltaMovement((1.5 * yaw * pitch), (1.5 * pitch2), (1.5 * yaw2 * pitch));
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack
							.getItem()) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.OFF_HAND, true);
					}
				} else if ((new Object() {
					public ItemStack getItemStack(int sltid, ItemStack _isc) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(1, itemstack)).getItem() == ElementureModItems.MEMORYBOBBER.get()) {
					pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
					pitch2 = Math.sin(entity.getXRot() / ((-180) / Math.PI));
					yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
					yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MemorybobberEntityEntity(ElementureModEntities.MEMORYBOBBER_ENTITY.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (1.2 + entity.getY()), (entity.getZ()), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement((1.5 * yaw * pitch), 0, (1.5 * yaw2 * pitch));
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack
							.getItem()) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.OFF_HAND, true);
					}
				}
			} else if (entity.getPersistentData().getBoolean("FISH") == true) {
				if (Math.random() / 2 + itemstack.getOrCreateTag().getDouble("fishingPower") / 12 > 0.4) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements()
								.getAdvancement(new ResourceLocation("elementure:elementure_fishingadvancement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
					{
						ItemStack _ist = itemstack;
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					CustomFishingPoolProcedure.execute(world, entity, itemstack);
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.break")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.break")), SoundSource.NEUTRAL, 1, 1,
									false);
						}
					}
					itemstack.getOrCreateTag().putBoolean("sent", (false));
					entity.getPersistentData().putBoolean("FISH", (false));
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("You lost the fish!"), (true));
				}
			} else if (fishBobber == true) {
				if (Math.random() / 2 + itemstack.getOrCreateTag().getDouble("fishingPower") / 12 > 0.4) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements()
								.getAdvancement(new ResourceLocation("elementure:elementure_fishingadvancement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
					{
						ItemStack _ist = itemstack;
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					CustomFishingPoolProcedure.execute(world, entity, itemstack);
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.break")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.break")), SoundSource.NEUTRAL, 1, 1,
									false);
						}
					}
					itemstack.getOrCreateTag().putBoolean("sent", (false));
					entity.getPersistentData().putBoolean("FISH", (false));
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("You lost the fish!"), (true));
				}
			} else {
				entity.getPersistentData().putBoolean("FISH", (false));
				itemstack.getOrCreateTag().putBoolean("sent", (false));
			}
		}
	}
}
