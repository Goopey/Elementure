
package net.mcreator.elementure.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.elementure.init.ElementureModTabs;
import net.mcreator.elementure.init.ElementureModItems;

public class DazzlingswordItem extends SwordItem {
	public DazzlingswordItem() {
		super(new Tier() {
			public int getUses() {
				return 732;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 7;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementureModItems.DAZZLINGINGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDSWORDS));
	}
}
