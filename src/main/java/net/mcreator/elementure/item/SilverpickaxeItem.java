
package net.mcreator.elementure.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

import net.mcreator.elementure.init.ElementureModTabs;

public class SilverpickaxeItem extends PickaxeItem {
	public SilverpickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 900;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 8;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -1.2f, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDTOOLS));
	}
}
