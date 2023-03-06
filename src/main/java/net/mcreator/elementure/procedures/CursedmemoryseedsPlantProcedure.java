package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.init.ElementureModBlocks;

public class CursedmemoryseedsPlantProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.COBBLESTONE || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.MOSSY_COBBLESTONE)
				&& (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x, y + 1, z), ElementureModBlocks.CURSEDMEMORYPLANT_1.get().defaultBlockState(), 3);
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
