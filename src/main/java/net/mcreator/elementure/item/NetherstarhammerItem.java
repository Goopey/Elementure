
package net.mcreator.elementure.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.elementure.init.ElementureModTabs;
import net.mcreator.elementure.init.ElementureModBlocks;

public class NetherstarhammerItem extends PickaxeItem {
	public NetherstarhammerItem() {
		super(new Tier() {
			public int getUses() {
				return 2151;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 9;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementureModBlocks.DEBRISSCRAPS.get()));
			}
		}, 1, -2.7f, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDTOOLS).fireResistant());
	}
}
