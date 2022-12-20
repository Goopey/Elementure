package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
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

public class MycenalibrarianguinextProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("trades") == 0) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(3 + entity.getPersistentData().getDouble("tradeAmount") / 2.5));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.BOOKSHELF);
				_setstack.setCount((int) Math.round(2 + entity.getPersistentData().getDouble("tradeAmount") / 2.5));
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round((6 + entity.getPersistentData().getDouble("tradeAmount") / 3)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1)));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANTRANSLATIONBOOK.get());
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
				ItemStack _setstack = new ItemStack(Items.COMPASS);
				_setstack.setCount(1);
				((Slot) _slots.get(11)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (entity.getPersistentData().getDouble("trades") == 1) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.GLASS_PANE);
				_setstack.setCount((int) Math.round((20 + entity.getPersistentData().getDouble("tradeAmount") / 0.75)
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
				_setstack.setCount((int) Math.round((4 + entity.getPersistentData().getDouble("tradeAmount") / 6)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1)));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.CLOCK);
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
				ItemStack _setstack = new ItemStack(Items.COMPASS);
				_setstack.setCount(1);
				((Slot) _slots.get(11)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (entity.getPersistentData().getDouble("trades") == 2) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.BOOK);
				_setstack.setCount((int) Math.round(3 + entity.getPersistentData().getDouble("tradeAmount") / 5));
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
				_setstack.setCount((int) Math.round((4 + entity.getPersistentData().getDouble("tradeAmount") / 6)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1)));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.CLOCK);
				_setstack.setCount(1);
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(3 + entity.getPersistentData().getDouble("tradeAmount") / 2.5));
				((Slot) _slots.get(8)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.BOOKSHELF);
				_setstack.setCount((int) Math.round(2 + entity.getPersistentData().getDouble("tradeAmount") / 3));
				((Slot) _slots.get(11)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (entity.getPersistentData().getDouble("trades") == 3) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round((7 + entity.getPersistentData().getDouble("tradeAmount") / 4.5)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1) * 2));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.NAME_TAG);
				_setstack.setCount(1);
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.GLASS_PANE);
				_setstack.setCount((int) Math.round(18 + entity.getPersistentData().getDouble("tradeAmount") / 0.75));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 6));
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
				ItemStack _setstack = new ItemStack(Blocks.BOOKSHELF);
				_setstack.setCount((int) Math.round(2 + entity.getPersistentData().getDouble("tradeAmount") / 3.5));
				((Slot) _slots.get(11)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.WRITABLE_BOOK);
				_setstack.setCount(1);
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 4));
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round((6 + entity.getPersistentData().getDouble("tradeAmount") / 3)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1)));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANTRANSLATIONBOOK.get());
				_setstack.setCount(1);
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round((14 + entity.getPersistentData().getDouble("tradeAmount") / 1.5)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1) * 0.5));
				((Slot) _slots.get(8)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity.getPersistentData().getDouble("tradeAmount") < 10) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANMONOCLE_HELMET.get());
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANMONOCLE_HELMET.get());
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}
