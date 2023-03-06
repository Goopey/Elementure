package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.init.ElementureModBlocks;

public class ImmortalizerEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElementureModBlocks.RAREMEMORYPLANT_3.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElementureModBlocks.RAREMEMORYPLANT_2.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElementureModBlocks.RAREMEMORYPLANT_1.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElementureModBlocks.MEMORYPLANT_1.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElementureModBlocks.MEMORYPLANT_2.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElementureModBlocks.MEMORYPLANT_3.get()) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("immortalized", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				(itemstack).shrink(1);
			}
		}
	}
}
