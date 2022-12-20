
package net.mcreator.elementure.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.elementure.init.ElementureModTabs;

public abstract class SilverarmorItem extends ArmorItem {
	public SilverarmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 7, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "silverarmor";
			}

			@Override
			public float getToughness() {
				return 1.1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SilverarmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementure:textures/models/armor/silver_armor__layer_1.png";
		}
	}

	public static class Chestplate extends SilverarmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementure:textures/models/armor/silver_armor__layer_1.png";
		}
	}

	public static class Leggings extends SilverarmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementure:textures/models/armor/silver_armor__layer_2.png";
		}
	}

	public static class Boots extends SilverarmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementure:textures/models/armor/silver_armor__layer_1.png";
		}
	}
}
