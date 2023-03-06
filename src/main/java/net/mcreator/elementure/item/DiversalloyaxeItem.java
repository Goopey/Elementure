
package net.mcreator.elementure.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.procedures.DiversalloyaxeTrueAirProcedure;
import net.mcreator.elementure.procedures.DiversalloyaxeGatherProcedure;
import net.mcreator.elementure.init.ElementureModTabs;
import net.mcreator.elementure.init.ElementureModItems;

import java.util.List;

public class DiversalloyaxeItem extends AxeItem {
	public DiversalloyaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 459;
			}

			public float getSpeed() {
				return 83f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 4;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementureModItems.DIVERSALLOY.get()));
			}
		}, 1, -3.1f, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDTOOLS));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		DiversalloyaxeGatherProcedure.execute(entity, sourceentity, itemstack);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Mines faster underwater."));
		list.add(Component.literal("Slices through water very well."));
		list.add(Component.literal("Deals increased damage versus water creatures and aquatic mobs and extracts more air essence when attacking them."));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			DiversalloyaxeTrueAirProcedure.execute(entity);
	}
}
