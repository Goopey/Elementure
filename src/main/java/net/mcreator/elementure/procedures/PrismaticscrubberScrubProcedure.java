package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModBlocks;

public class PrismaticscrubberScrubProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElementureModBlocks.NETHERSTAR_PRISMATICSPAWNER.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElementureModBlocks.NETHERSTAR_PRISMATICWALL.get()) {
			for (int index0 = 0; index0 < (int) (6); index0++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ElementureModItems.PRISMITESHARD.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.PRISMATICCRYSTALBLOCK.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.COARSE_DIRT || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.PODZOL
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DIRT_PATH
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.MYCELIUM) {
			world.setBlock(new BlockPos(x, y, z), Blocks.DIRT.defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.MAGMA_BLOCK) {
			world.setBlock(new BlockPos(x, y, z), Blocks.STONE.defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CRYING_OBSIDIAN) {
			world.setBlock(new BlockPos(x, y, z), Blocks.OBSIDIAN.defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WARPED_NYLIUM || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CRIMSON_NYLIUM) {
			world.setBlock(new BlockPos(x, y, z), Blocks.NETHERRACK.defaultBlockState(), 3);
		}
	}
}
