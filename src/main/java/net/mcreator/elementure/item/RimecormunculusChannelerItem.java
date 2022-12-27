
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
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.procedures.RimecormunculuschannelerConsumeProcedure;
import net.mcreator.elementure.procedures.RimecormunculusChannelerGlowProcedure;
import net.mcreator.elementure.procedures.CormunculusReturnDamageBonusProcedure;
import net.mcreator.elementure.init.ElementureModTabs;
import net.mcreator.elementure.entity.RimecormunculusChannelerEntity;

import java.util.List;

public class RimecormunculusChannelerItem extends Item {
	public RimecormunculusChannelerItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_SKILLWINDOW).durability(201));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Casts a bubbling bright Rime Dart."));
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
		return RimecormunculusChannelerGlowProcedure.execute(entity);
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (RimecormunculusChannelerGlowProcedure.execute(entity)) {
				RimecormunculusChannelerEntity entityarrow = RimecormunculusChannelerEntity.shoot(world, entity, world.getRandom(), 1f,
						6 + CormunculusReturnDamageBonusProcedure.execute(entity) * 2, 0);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
				RimecormunculuschannelerConsumeProcedure.execute(entity);
			}
		}
	}
}
