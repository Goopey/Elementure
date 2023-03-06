package net.mcreator.elementure.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenavineBlockIsPlacedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.MYCENAVINE.get() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.COARSE_DIRT
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DIRT || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.MYCELIUM || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.RUINGRANITE.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.LIGHTNINGANDESITE.get() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.ENERGYDIORITE.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.BIGGLOWINGMUSHROOM.get() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.MYCENIUM.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.MYCENAMOSSYGRASS.get() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.MUSHROOM_STEM
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.BROWN_MUSHROOM_BLOCK || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.PODZOL
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DEEPSLATE || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.MYCENASPORECLOUD_BLOCK.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.STONE)) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if ((entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) == false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(ElementureModBlocks.MYCENAVINE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}
