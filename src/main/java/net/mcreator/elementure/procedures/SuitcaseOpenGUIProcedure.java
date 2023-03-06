package net.mcreator.elementure.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.world.inventory.SuitcaseGUIMenu;
import net.mcreator.elementure.world.inventory.PouchGUIMenu;
import net.mcreator.elementure.world.inventory.BeltpouchGUIMenu;
import net.mcreator.elementure.network.ElementureModVariables;

import io.netty.buffer.Unpooled;

public class SuitcaseOpenGUIProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double inventorySlots = 0;
		if (!(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_bag).getItem() == (ItemStack.EMPTY).getItem())) {
			if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_bag).is(ItemTags.create(new ResourceLocation("forge:three_slot_backpacks")))) {
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos(entity.getX(), entity.getY(), entity.getZ());
						NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return Component.literal("BeltpouchGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new BeltpouchGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
				ThreeslotbackpacksOpenProcedure.execute(entity);
			}
			if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_bag).is(ItemTags.create(new ResourceLocation("forge:five_slot_backpacks")))) {
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos(entity.getX(), entity.getY(), entity.getZ());
						NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return Component.literal("PouchGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new PouchGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
				FiveslotbackpacksOpenProcedure.execute(entity);
			}
			if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_bag).is(ItemTags.create(new ResourceLocation("forge:ten_slot_backpacks")))) {
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos(entity.getX(), entity.getY(), entity.getZ());
						NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return Component.literal("SuitcaseGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new SuitcaseGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
				TenslotbackpacksOpenProcedure.execute(entity);
			}
			{
				boolean _setval = true;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.bag_opened_from_relic_inventory = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
