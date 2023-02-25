
package net.mcreator.elementure.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.procedures.FlutanitechannelerConsumeProcedure;
import net.mcreator.elementure.procedures.FlutanitechannelerCanUseProcedure;
import net.mcreator.elementure.init.ElementureModTabs;
import net.mcreator.elementure.entity.FlutanitechannelerEntity;

import java.util.List;

public class FlutanitechannelerItem extends Item {
	public FlutanitechannelerItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_SKILLWINDOW).durability(21));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Allows you to cast a wind-blast skill which greatly pushes back your ennemies"));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		Entity entity = Minecraft.getInstance().player;
		return FlutanitechannelerCanUseProcedure.execute(entity);
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (FlutanitechannelerCanUseProcedure.execute(entity)) {
				FlutanitechannelerEntity entityarrow = FlutanitechannelerEntity.shoot(world, entity, world.getRandom(), 1f, 1.4000000000000001, 3);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
				FlutanitechannelerConsumeProcedure.execute(entity);
			}
		}
	}
}
