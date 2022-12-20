
package net.mcreator.elementure.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.elementure.init.ElementureModTabs;

public class UnholyhoeItem extends HoeItem {
	public UnholyhoeItem() {
		super(new Tier() {
			public int getUses() {
				return 452;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 0, -1.2f, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDTOOLS));
	}
}
