
package net.mcreator.elementure.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.procedures.HightrahiraHotEffectProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class HightrahiraItem extends Item {
	public HightrahiraItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_FISHINGTAB).stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(6).saturationMod(1.2f)

				.meat().build()));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("A fiery and schmoovy Trahira. You're going to need some hot stuff to cook this fish."));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		HightrahiraHotEffectProcedure.execute(entity);
		return retval;
	}
}
