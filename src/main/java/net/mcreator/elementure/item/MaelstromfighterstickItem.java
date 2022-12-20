
package net.mcreator.elementure.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.elementure.init.ElementureModTabs;

public class MaelstromfighterstickItem extends SwordItem {
	public MaelstromfighterstickItem() {
		super(new Tier() {
			public int getUses() {
				return 80;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 36;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -1.2f, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDSWORDS));
	}
}
