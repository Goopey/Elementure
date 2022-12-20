
package net.mcreator.elementure.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.elementure.init.ElementureModTabs;
import net.mcreator.elementure.init.ElementureModItems;

public class SeafoampickaxeItem extends PickaxeItem {
	public SeafoampickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 221;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementureModItems.SEAFOAM_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDTOOLS));
	}
}
