package net.mcreator.elementure.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.elementure.init.ElementureModItems;

import java.util.function.Supplier;
import java.util.Map;

public class MycenaleatherworkerguinextProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("trades") == 0) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round((4 + entity.getPersistentData().getDouble("tradeAmount") / 4.5)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1) * 2));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.LEATHER_HORSE_ARMOR);
				_setstack.setCount(1);
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round((4 + entity.getPersistentData().getDouble("tradeAmount") / 4.5)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1) * 2));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.LEATHER_BOOTS);
				_setstack.setCount(1);
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) ((int) Math.round(7 + entity.getPersistentData().getDouble("tradeAmount") / 6)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1)));
				((Slot) _slots.get(8)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.SADDLE);
				_setstack.setCount(1);
				((Slot) _slots.get(11)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (entity.getPersistentData().getDouble("trades") == 1) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.FLINT);
				_setstack.setCount((int) Math.round((6 + entity.getPersistentData().getDouble("tradeAmount") / 2.5)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1)));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 5));
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round((3 + entity.getPersistentData().getDouble("tradeAmount") / 4.5)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1) * 2));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.LEATHER_CHESTPLATE);
				_setstack.setCount(1);
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) ((int) Math.round(7 + entity.getPersistentData().getDouble("tradeAmount") / 6)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1)));
				((Slot) _slots.get(8)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.SADDLE);
				_setstack.setCount(1);
				((Slot) _slots.get(11)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (entity.getPersistentData().getDouble("trades") == 2) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.SCUTE);
				_setstack.setCount((int) Math.round(3 + entity.getPersistentData().getDouble("tradeAmount") / 5));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 3
						+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0)
						+ 1));
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round((3 + entity.getPersistentData().getDouble("tradeAmount") / 6)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1)));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.LEATHER_CHESTPLATE);
				_setstack.setCount(1);
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) ((int) Math.round(4 + entity.getPersistentData().getDouble("tradeAmount") / 6)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1)));
				((Slot) _slots.get(8)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.LEATHER_LEGGINGS);
				_setstack.setCount(1);
				((Slot) _slots.get(11)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (entity.getPersistentData().getDouble("trades") == 3) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round((4 + entity.getPersistentData().getDouble("tradeAmount") / 4.5)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1) * 2));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.LEATHER_HELMET);
				_setstack.setCount(1);
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.FLINT);
				_setstack.setCount((int) Math.round(6 + entity.getPersistentData().getDouble("tradeAmount") / 2));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) ((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 6)
						+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0)
						+ 1));
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) ((int) Math.round(7 + entity.getPersistentData().getDouble("tradeAmount") / 6)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1)));
				((Slot) _slots.get(8)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.SADDLE);
				_setstack.setCount(1);
				((Slot) _slots.get(11)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.GREEN_DYE);
				_setstack.setCount((int) Math.round(42 + entity.getPersistentData().getDouble("tradeAmount") / 1.5));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(3 + entity.getPersistentData().getDouble("tradeAmount") / 2));
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 5));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(ElementureModItems.MYCENATRUFFLOONCHITINSCALE.get());
				_setstack.setCount((int) ((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 6)
						+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0)
						+ 1));
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) ((int) Math.round(7 + entity.getPersistentData().getDouble("tradeAmount") / 6)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1)));
				((Slot) _slots.get(8)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.SADDLE);
				_setstack.setCount(1);
				((Slot) _slots.get(11)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
