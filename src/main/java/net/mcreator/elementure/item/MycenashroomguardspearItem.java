
package net.mcreator.elementure.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.elementure.procedures.MycenashroomguardspearHighlightProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

public class MycenashroomguardspearItem extends SwordItem {
	public MycenashroomguardspearItem() {
		super(new Tier() {
			public int getUses() {
				return 165;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 1.9999999999999996f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 3;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 3, -2.7000000000000002f, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDSWORDS));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		MycenashroomguardspearHighlightProcedure.execute(entity);
		return retval;
	}
}
