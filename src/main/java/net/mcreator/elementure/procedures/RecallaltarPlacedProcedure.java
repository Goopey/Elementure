package net.mcreator.elementure.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModBlocks;

public class RecallaltarPlacedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (y > 3) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ElementureModBlocks.RECALLALTAR.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else {
			ElementureModVariables.MapVariables.get(world).isPitlandsDiverPlaced = true;
			ElementureModVariables.MapVariables.get(world).syncData(world);
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastSystemMessage(
							Component.literal("A Recall Altar has been placed! You may now dive under the bedrock into the deep lands below without dying. Make sure to equip yourself correctly so that you can come back."), false);
			}
		}
	}
}
