
package net.mcreator.elementure.item;

import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.elementure.world.inventory.CustomfishingrodInventoryMenu;
import net.mcreator.elementure.procedures.ReinforcedfishingrodSendBobberProcedure;
import net.mcreator.elementure.procedures.ReinforcedfishingrodResetLineProcedure;
import net.mcreator.elementure.item.inventory.ReinforcedfishingrodInventoryCapability;
import net.mcreator.elementure.init.ElementureModTabs;

import javax.annotation.Nullable;

import java.util.List;

import io.netty.buffer.Unpooled;

public class ReinforcedfishingrodItem extends Item {
	public ReinforcedfishingrodItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDTOOLS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Allows you to fish trickier fish to catch."));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		if (entity instanceof ServerPlayer serverPlayer) {
			NetworkHooks.openScreen(serverPlayer, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Reinforced fishing rod");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					FriendlyByteBuf packetBuffer = new FriendlyByteBuf(Unpooled.buffer());
					packetBuffer.writeBlockPos(entity.blockPosition());
					packetBuffer.writeByte(hand == InteractionHand.MAIN_HAND ? 0 : 1);
					return new CustomfishingrodInventoryMenu(id, inventory, packetBuffer);
				}
			}, buf -> {
				buf.writeBlockPos(entity.blockPosition());
				buf.writeByte(hand == InteractionHand.MAIN_HAND ? 0 : 1);
			});
		}

		ReinforcedfishingrodSendBobberProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		ReinforcedfishingrodResetLineProcedure.execute(world, entity, itemstack);
	}

	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundTag compound) {
		return new ReinforcedfishingrodInventoryCapability();
	}

	@Override
	public CompoundTag getShareTag(ItemStack stack) {
		CompoundTag nbt = super.getShareTag(stack);
		if (nbt != null)
			stack.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
					.ifPresent(capability -> nbt.put("Inventory", ((ItemStackHandler) capability).serializeNBT()));
		return nbt;
	}

	@Override
	public void readShareTag(ItemStack stack, @Nullable CompoundTag nbt) {
		super.readShareTag(stack, nbt);
		if (nbt != null)
			stack.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
					.ifPresent(capability -> ((ItemStackHandler) capability).deserializeNBT((CompoundTag) nbt.get("Inventory")));
	}
}
