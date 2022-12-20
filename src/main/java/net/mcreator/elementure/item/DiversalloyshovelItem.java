
package net.mcreator.elementure.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.procedures.DiversalloyshovelEffectProcedure;
import net.mcreator.elementure.init.ElementureModTabs;
import net.mcreator.elementure.init.ElementureModItems;

import java.util.List;

public class DiversalloyshovelItem extends ShovelItem {
	public DiversalloyshovelItem() {
		super(new Tier() {
			public int getUses() {
				return 360;
			}

			public float getSpeed() {
				return 83f;
			}

			public float getAttackDamageBonus() {
				return -0.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementureModItems.DIVERSALLOY.get()));
			}
		}, 1, -3f, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDTOOLS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Mines faster underwater"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			DiversalloyshovelEffectProcedure.execute(entity);
	}
}
