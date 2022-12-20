
package net.mcreator.elementure.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.elementure.init.ElementureModTabs;

public class RustyswordItem extends SwordItem {
	public RustyswordItem() {
		super(new Tier() {
			public int getUses() {
				return 45;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 11;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4000000000000001f, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDSWORDS));
	}
}
