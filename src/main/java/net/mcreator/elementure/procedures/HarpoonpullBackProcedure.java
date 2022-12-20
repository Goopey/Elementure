package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.entity.HarpoonbulletEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Iterator;
import java.util.Comparator;

public class HarpoonpullBackProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double pitch = 0;
		double pitch2 = 0;
		double yaw = 0;
		double yaw2 = 0;
		boolean fishBobber = false;
		ItemStack harpoon = ItemStack.EMPTY;
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("")) {
			fishBobber = false;
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof HarpoonbulletEntity
							&& (entityiterator.getPersistentData().getString("playerName")).equals(entity.getDisplayName().getString())
							&& entityiterator.getPersistentData().getBoolean("FISH")) {
						fishBobber = true;
					}
				}
			}
			if (entity.getPersistentData().getBoolean("FISH")) {
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
					entity.getPersistentData().putBoolean("FISH", (false));
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("You lost the fish!"), (true));
				}
			} else if (fishBobber) {
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
					entity.getPersistentData().putBoolean("FISH", (false));
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("You lost the fish!"), (true));
				}
			} else {
				entity.getPersistentData().putBoolean("FISH", (false));
			}
			HarpoonTransformProcedure.execute(entity, itemstack);
		}
	}
}
