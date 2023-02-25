package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.elementure.init.ElementureModBlocks;
import net.mcreator.elementure.ElementureMod;

public class LilypadSmallGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		double locY = 0;
		locX = -28;
		locZ = -28;
		for (int index0 = 0; index0 < (int) (3249); index0++) {
			if (locX * locX + locZ * locZ < 784) {
				if (locX * locX + locZ * locZ >= 676) {
					world.setBlock(new BlockPos(x + locX, y - 1, z + locZ), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y, z + locZ), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 1, z + locZ), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 2, z + locZ), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 3, z + locZ), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 4, z + locZ), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
				} else if (Math.round(Math.sin((locX * locZ) / 60)) == 0) {
					world.setBlock(new BlockPos(x + locX, y, z + locZ), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 1, z + locZ), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 2, z + locZ), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 3, z + locZ), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x + locX, y, z + locZ), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 1, z + locZ), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 2, z + locZ), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 3, z + locZ), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
				}
				if (!((world.getBlockState(new BlockPos(x + locX, -64, z + locZ))).getBlock() == ElementureModBlocks.PERVADEDBEDROCK.get())) {
					world.setBlock(new BlockPos(x + locX, -64, z + locZ), ElementureModBlocks.PERVADEDBEDROCK.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + locX, -64, z + locZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putBoolean("diverscrownUsed", (true));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + locX, -64, z + locZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putBoolean("diverscrowncenterUsed", (true));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + locX, -64, z + locZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putBoolean("diverscrownsideUsed", (true));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
			locX = locX + 1;
			if (locX > 28) {
				locX = -28;
				locZ = locZ + 1;
				if (locZ > 28) {
					locX = -28;
					locZ = -28;
				}
			}
		}
		locX = -28;
		locZ = -28;
		locY = -10;
		for (int index1 = 0; index1 < (int) (32490); index1++) {
			if (locX * locX + locY * locY * 4 + locZ * locZ < 784) {
				if (Math.round(Math.sin((locX * locZ) / 60)) == 0) {
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
				}
			}
			locX = locX + 1;
			if (locX > 28) {
				locX = -28;
				locZ = locZ + 1;
				if (locZ > 28) {
					locX = -28;
					locZ = -28;
					locY = locY + 1;
					if (locY > 0) {
						locX = -28;
						locZ = -28;
						locY = -10;
					}
				}
			}
		}
		ElementureMod.queueServerWork(10, () -> {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"kill @e[type=minecraft:item, distance=0.1..30]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 20), z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"kill @e[type=minecraft:item, distance=0.1..30]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 40), z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"kill @e[type=minecraft:item, distance=0.1..30]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 60), z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"kill @e[type=minecraft:item, distance=0.1..30]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 80), z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"kill @e[type=minecraft:item, distance=0.1..30]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 100), z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"kill @e[type=minecraft:item, distance=0.1..30]");
		});
	}
}
