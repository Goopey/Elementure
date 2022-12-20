
package net.mcreator.elementure.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.procedures.UnholyaxeTrueDarkProcedure;
import net.mcreator.elementure.procedures.UnholyaxeGatherProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

public class UnholyaxeItem extends AxeItem {
	public UnholyaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 465;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 7.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 1;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3.1f, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDTOOLS));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		UnholyaxeGatherProcedure.execute(sourceentity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		UnholyaxeTrueDarkProcedure.execute(entity);
	}
}
