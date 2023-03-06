
package net.mcreator.elementure.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.procedures.RainbowarmorFullaEffectProcedure;
import net.mcreator.elementure.init.ElementureModTabs;
import net.mcreator.elementure.init.ElementureModItems;

import java.util.List;

public abstract class RainbowarmorItem extends ArmorItem {
	public RainbowarmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 22;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 6, 8, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 10;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_generic"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementureModItems.RAINBOWINGOT.get()));
			}

			@Override
			public String getName() {
				return "rainbowarmor";
			}

			@Override
			public float getToughness() {
				return 2.6f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends RainbowarmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDARMOR));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("Full armor effect : using light essence makes you regain 8 light essence and applies glowing and regeneration"));
			list.add(Component.literal("Also makes the chromatic channeler stronger and free to use, but with a slightly longer cooldown"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementure:textures/models/armor/tetrachrome_armor__layer_1.png";
		}
	}

	public static class Chestplate extends RainbowarmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDARMOR));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("Full armor effect : using light essence makes you regain 8 light essence and applies glowing and regeneration"));
			list.add(Component.literal("Also makes the chromatic channeler stronger and free to use, but with a slightly longer cooldown"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementure:textures/models/armor/tetrachrome_armor__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			RainbowarmorFullaEffectProcedure.execute(world, entity, itemstack);
		}
	}

	public static class Leggings extends RainbowarmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDARMOR));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("Full armor effect : using light essence makes you regain 8 light essence and applies glowing and regeneration"));
			list.add(Component.literal("Also makes the chromatic channeler stronger and free to use, but with a slightly longer cooldown"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementure:textures/models/armor/tetrachrome_armor__layer_2.png";
		}
	}

	public static class Boots extends RainbowarmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDARMOR));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("Full armor effect : using light essence makes you regain 8 light essence and applies glowing and regeneration"));
			list.add(Component.literal("Also makes the chromatic channeler stronger and free to use, but with a slightly longer cooldown"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementure:textures/models/armor/tetrachrome_armor__layer_1.png";
		}
	}
}
