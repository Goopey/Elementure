
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
import net.mcreator.elementure.init.ElementureModItems;

public abstract class DazzlingarmorItem extends ArmorItem {
	public DazzlingarmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 37;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 10, 6, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_iron"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementureModItems.DAZZLINGINGOT.get()));
			}

			@Override
			public String getName() {
				return "dazzlingarmor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends DazzlingarmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementure:textures/models/armor/dazzling_armor__layer_1.png";
		}
	}

	public static class Chestplate extends DazzlingarmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementure:textures/models/armor/dazzling_armor__layer_1.png";
		}
	}

	public static class Leggings extends DazzlingarmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementure:textures/models/armor/dazzling_armor__layer_2.png";
		}
	}

	public static class Boots extends DazzlingarmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementure:textures/models/armor/dazzling_armor__layer_1.png";
		}
	}
}
