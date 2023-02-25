package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenaCaveOpeningGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsY = 0;
		double LocY = 0;
		for (int index0 = 0; index0 < (int) (16); index0++) {
			world.setBlock(new BlockPos(x - 1, y - CoordsY, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - CoordsY, z - 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - CoordsY, z - 1), Blocks.AIR.defaultBlockState(), 3);
			CoordsY = CoordsY + 1;
			if (CoordsY == 15) {
				CoordsY = 0;
			}
		}
		LocY = 1;
		while (y - LocY * 16 > 16) {
			world.setBlock(new BlockPos(x, y - LocY * 16, z), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y - LocY * 16, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("alphanGenRole", 7);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y - LocY * 16, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("stairway", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if ((y - LocY * 16) - 16 < 16) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y - LocY * 16, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("isLastFloor", (true));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y - LocY * 16, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("stairway", (false));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			LocY = LocY + 1;
		}
		world.setBlock(new BlockPos(x - 2, y - 1, z), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 2, y - 1, z - 1), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y - 1, z - 2), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y - 1, z - 2), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y - 1, z + 1), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y - 1, z + 1), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y - 1, z), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y - 1, z - 1), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		if (Math.random() < 0.5) {
			world.setBlock(new BlockPos(x - 2, y - 2, z), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		}
		if (Math.random() < 0.5) {
			world.setBlock(new BlockPos(x - 2, y - 2, z - 1), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		}
		if (Math.random() < 0.5) {
			world.setBlock(new BlockPos(x - 1, y - 2, z - 2), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		}
		if (Math.random() < 0.5) {
			world.setBlock(new BlockPos(x, y - 2, z - 2), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		}
		if (Math.random() < 0.5) {
			world.setBlock(new BlockPos(x - 1, y - 1, z + 1), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		}
		if (Math.random() < 0.5) {
			world.setBlock(new BlockPos(x, y - 1, z + 1), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		}
		if (Math.random() < 0.5) {
			world.setBlock(new BlockPos(x + 1, y - 1, z), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		}
		if (Math.random() < 0.5) {
			world.setBlock(new BlockPos(x + 1, y - 1, z - 1), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		}
		world.setBlock(new BlockPos(x, y + 3, z), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y + 3, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("alphanGenRole", 6);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level,
					4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "/kill @e[type=minecraft:item, distance=0..40]");
	}
}
