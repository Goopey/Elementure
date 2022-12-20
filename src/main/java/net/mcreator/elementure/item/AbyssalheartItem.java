
package net.mcreator.elementure.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.procedures.AbyssalheartToggleabyssProcedure;
import net.mcreator.elementure.procedures.AbyssalheartEffectProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class AbyssalheartItem extends Item {
	public AbyssalheartItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_SKILLWINDOW).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent(
				"The heart of the abyss. As long as you have it, you are it's rather ultimate bearer and carry all of it's dark energy and corruption inside of you..."));
		list.add(new TextComponent("How to use :"));
		list.add(new TextComponent("When you sneak"));
		list.add(new TextComponent(
				"you extinguish yourself if you are on fire due to the corruption being slightly freed and devouring it all each time you sneak and you are unable to take fall damage due to dark energy swirling around you..."));
		list.add(new TextComponent("When you're sprinting"));
		list.add(new TextComponent(
				"it allows you to fly through the air by propulsing you using powerful dark energy and softens your fall using that same energy..."));
		list.add(new TextComponent(
				"All the dark energy and the corruption also provide you other nice effects since they'd protect you as their new ruler... Also!"));
		list.add(new TextComponent("it allows you to control the abyssal corruption by right-clicking since... you are it's new ruler..."));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AbyssalheartToggleabyssProcedure.execute(world);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		AbyssalheartToggleabyssProcedure.execute(context.getLevel());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		AbyssalheartEffectProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}
