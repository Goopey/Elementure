
package net.mcreator.elementure.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.elementure.init.ElementureModTabs;
import net.mcreator.elementure.init.ElementureModItems;

public class DazzlingshovelItem extends ShovelItem {
	public DazzlingshovelItem() {
		super(new Tier() {
			public int getUses() {
				return 732;
			}

			public float getSpeed() {
				return 9.5f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 8;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementureModItems.DAZZLINGINGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDTOOLS));
	}
}
