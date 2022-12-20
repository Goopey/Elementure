
package net.mcreator.elementure.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.procedures.GraniteheavyaxeTrueVoidProcedure;
import net.mcreator.elementure.procedures.GraniteheavyaxeGatherProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

public class GraniteheavyaxeItem extends AxeItem {
	public GraniteheavyaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 158;
			}

			public float getSpeed() {
				return 3f;
			}

			public float getAttackDamageBonus() {
				return 12.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3.2999999999999999f, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDSWORDS));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		GraniteheavyaxeGatherProcedure.execute(sourceentity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		GraniteheavyaxeTrueVoidProcedure.execute(entity);
	}
}
