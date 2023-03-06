
package net.mcreator.elementure.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.procedures.IvorypickaxeInstamineIvoryProcedure;
import net.mcreator.elementure.init.ElementureModTabs;
import net.mcreator.elementure.init.ElementureModItems;

import java.util.List;

public class IvorypickaxeItem extends PickaxeItem {
	public IvorypickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 459;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 4;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementureModItems.IVORYSHARD.get()));
			}
		}, 1, -2.7999999999999998f, new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDTOOLS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Right-click to mine ivory instantaneously."));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		IvorypickaxeInstamineIvoryProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		IvorypickaxeInstamineIvoryProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), itemstack);
		return retval;
	}
}
