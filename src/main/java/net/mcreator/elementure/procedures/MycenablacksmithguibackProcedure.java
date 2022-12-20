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

public class MycenablacksmithguibackProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("trades") == 0) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.COAL);
				_setstack.setCount((int) Math.round((9 + entity.getPersistentData().getDouble("tradeAmount")) / 2
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1)));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 6));
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
			if (entity.getPersistentData().getDouble("setTrade") < 5) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.CHAINMAIL_CHESTPLATE);
					_setstack.setCount(1);
					((Slot) _slots.get(7)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (entity.getPersistentData().getDouble("setTrade") > 5 && entity.getPersistentData().getDouble("setTrade") < 8) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.IRON_CHESTPLATE);
					_setstack.setCount(1);
					((Slot) _slots.get(7)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (entity.getPersistentData().getDouble("setTrade") > 8 && entity.getPersistentData().getDouble("setTrade") < 15) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.CHAINMAIL_BOOTS);
					_setstack.setCount(1);
					((Slot) _slots.get(7)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.IRON_HELMET);
					_setstack.setCount(1);
					((Slot) _slots.get(7)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.DIAMOND);
				_setstack.setCount(4);
				((Slot) _slots.get(8)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount(4);
				((Slot) _slots.get(11)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (entity.getPersistentData().getDouble("trades") == 1) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(4 + entity.getPersistentData().getDouble("tradeAmount") / 3.5));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.SHIELD);
				_setstack.setCount(1);
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round((22 + entity.getPersistentData().getDouble("tradeAmount") / 2)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1) * 2));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity.getPersistentData().getDouble("tradeAmount") < 19) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BELL);
					_setstack.setCount(1);
					((Slot) _slots.get(7)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANHAMMER.get());
					_setstack.setCount(1);
					((Slot) _slots.get(7)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.LAVA_BUCKET);
				_setstack.setCount(1);
				((Slot) _slots.get(8)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(2 + entity.getPersistentData().getDouble("tradeAmount") / 6));
				((Slot) _slots.get(11)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (entity.getPersistentData().getDouble("trades") == 2) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
				_setstack.setCount((int) Math.round(4 + entity.getPersistentData().getDouble("tradeAmount") / 3.5));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount(1);
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.FLINT);
				_setstack.setCount((int) Math.round((8 + entity.getPersistentData().getDouble("tradeAmount") / 0.75)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1) * 2));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount(1);
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round((7 + entity.getPersistentData().getDouble("tradeAmount") / 4)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1) * 2));
				((Slot) _slots.get(8)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity.getPersistentData().getDouble("setTrade") < 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANARMOR_BOOTS.get());
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (entity.getPersistentData().getDouble("setTrade") > 1 && entity.getPersistentData().getDouble("setTrade") < 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANMACE.get());
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (entity.getPersistentData().getDouble("setTrade") > 2 && entity.getPersistentData().getDouble("setTrade") < 3) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANPICKAXE.get());
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (entity.getPersistentData().getDouble("setTrade") > 3 && entity.getPersistentData().getDouble("setTrade") < 4) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANARMOR_CHESTPLATE.get());
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (entity.getPersistentData().getDouble("setTrade") > 4 && entity.getPersistentData().getDouble("setTrade") < 9) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.CHAINMAIL_LEGGINGS);
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (entity.getPersistentData().getDouble("setTrade") > 9 && entity.getPersistentData().getDouble("setTrade") < 15) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.STONE_PICKAXE);
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.STONE_AXE);
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (entity.getPersistentData().getDouble("trades") == 3) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANALLOY.get());
				_setstack.setCount((int) Math.round(2 + entity.getPersistentData().getDouble("tradeAmount") / 4));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 3));
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.COAL);
				_setstack.setCount((int) Math.round((8 + entity.getPersistentData().getDouble("tradeAmount") / 0.5)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1) * 2));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount(1);
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round((4 + entity.getPersistentData().getDouble("tradeAmount") / 4)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1)));
				((Slot) _slots.get(8)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity.getPersistentData().getDouble("setTrade") < 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.IRON_BOOTS);
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (entity.getPersistentData().getDouble("setTrade") > 2 && entity.getPersistentData().getDouble("setTrade") < 5) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.STONE_SWORD);
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (entity.getPersistentData().getDouble("setTrade") > 5 && entity.getPersistentData().getDouble("setTrade") < 8) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.STONE_SHOVEL);
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (entity.getPersistentData().getDouble("setTrade") > 8 && entity.getPersistentData().getDouble("setTrade") < 11) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.STONE_PICKAXE);
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (entity.getPersistentData().getDouble("setTrade") > 11 && entity.getPersistentData().getDouble("setTrade") < 14) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.STONE_HOE);
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (entity.getPersistentData().getDouble("setTrade") > 14 && entity.getPersistentData().getDouble("setTrade") < 17) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.IRON_SWORD);
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.IRON_HOE);
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(6 + entity.getPersistentData().getDouble("tradeAmount") / 3));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity.getPersistentData().getDouble("setTrade") < 8) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.CHAINMAIL_HELMET);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (entity.getPersistentData().getDouble("setTrade") > 14) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.IRON_LEGGINGS);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANHOE.get());
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.FLINT);
				_setstack.setCount((int) Math.round(8 + entity.getPersistentData().getDouble("tradeAmount") / 0.25));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount(1);
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(5 + entity.getPersistentData().getDouble("tradeAmount") / 2));
				((Slot) _slots.get(8)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(ElementureModItems.SILVERNUGGET.get());
				_setstack.setCount((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 7.5));
				((Slot) _slots.get(11)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
