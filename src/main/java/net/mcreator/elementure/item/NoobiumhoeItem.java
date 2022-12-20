
package net.mcreator.elementure.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.elementure.init.ElementureModTabs;

public class NoobiumhoeItem extends HoeItem {
	public NoobiumhoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1048;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 6;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 0, -1.1999999999999997f, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDTOOLS));
	}
}
