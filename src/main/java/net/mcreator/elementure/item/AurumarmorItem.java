
package net.mcreator.elementure.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.procedures.AurumHeldGlowProcedure;
import net.mcreator.elementure.init.ElementureModTabs;
import net.mcreator.elementure.init.ElementureModItems;

public abstract class AurumarmorItem extends ArmorItem {
	public AurumarmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 36;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 4, 5, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementureModItems.AURUMINGOT.get()));
			}

			@Override
			public String getName() {
				return "aurumarmor";
			}

			@Override
			public float getToughness() {
				return 1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.4f;
			}
		}, slot, properties);
	}

	public static class Helmet extends AurumarmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementure:textures/models/armor/aurum_armor__layer_1.png";
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean isFoil(ItemStack itemstack) {
			Player entity = Minecraft.getInstance().player;
			Level world = entity.level;
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			return AurumHeldGlowProcedure.execute(entity);
		}
	}

	public static class Chestplate extends AurumarmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementure:textures/models/armor/aurum_armor__layer_1.png";
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean isFoil(ItemStack itemstack) {
			Player entity = Minecraft.getInstance().player;
			Level world = entity.level;
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			return AurumHeldGlowProcedure.execute(entity);
		}
	}

	public static class Leggings extends AurumarmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementure:textures/models/armor/aurum_armor__layer_2.png";
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean isFoil(ItemStack itemstack) {
			Player entity = Minecraft.getInstance().player;
			Level world = entity.level;
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			return AurumHeldGlowProcedure.execute(entity);
		}
	}

	public static class Boots extends AurumarmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementure:textures/models/armor/aurum_armor__layer_1.png";
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean isFoil(ItemStack itemstack) {
			Player entity = Minecraft.getInstance().player;
			Level world = entity.level;
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			return AurumHeldGlowProcedure.execute(entity);
		}
	}
}
