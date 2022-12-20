package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenashroomblockBreakProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.STONE
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.PODZOL
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DIRT
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.COARSE_DIRT
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.MYCELIUM
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ElementureModBlocks.MYCENAMOSSYGRASS.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.BROWN_MUSHROOM_BLOCK
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.MUSHROOM_STEM
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ElementureModBlocks.BIGGLOWINGMUSHROOM.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ElementureModBlocks.LIGHTNINGANDESITE.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ElementureModBlocks.MYCENIUM.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ElementureModBlocks.RUINGRANITE.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ElementureModBlocks.ENERGYDIORITE.get())) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 0.5), z, new ItemStack(ElementureModBlocks.MYCENASHROOMBLOCK.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
