package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class OmeganProcedures2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "omeganProcedure")).equals("redsun")) {
			RedsunshrineGenProcedure.execute(world, x, z);
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "omeganProcedure")).equals("netherstar")) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			StartNetherstarGenProcedure.execute(world, x, z);
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "omeganProcedure")).equals("boulderPatch")) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			BoulderPatchGenProcedure.execute(world, x, y, z);
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "omeganProcedure")).equals("spiderNestBase")) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			SpidernestBaseGenProcedure.execute(world, x, y, z);
		} else {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
