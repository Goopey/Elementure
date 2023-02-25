package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.elementure.init.ElementureModBlocks;
import net.mcreator.elementure.ElementureMod;

public class LilypadLargeGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		double locY = 0;
		locX = -40;
		locZ = -40;
		for (int index0 = 0; index0 < (int) (6561); index0++) {
			if (locX * locX + locZ * locZ < 1600) {
				if (locX * locX + locZ * locZ >= 1512) {
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
					if (Math.random() < 0.022) {
						DiverscrownlilypadDecorateProcedure.execute(world, (x + locX), (y + 4), (z + locZ));
					}
				} else {
					world.setBlock(new BlockPos(x + locX, y, z + locZ), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 1, z + locZ), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 2, z + locZ), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 3, z + locZ), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
				}
			}
			locX = locX + 1;
			if (locX > 40) {
				locX = -40;
				locZ = locZ + 1;
				if (locZ > 40) {
					locX = -40;
					locZ = -40;
				}
			}
		}
		locX = -40;
		locZ = -40;
		locY = -10;
		for (int index1 = 0; index1 < (int) (65610); index1++) {
			if (locX * locX + locY * locY * 4 + locZ * locZ < 1600) {
				if (Math.round(Math.sin((locX * locZ) / 60)) == 0) {
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
				}
			}
			locX = locX + 1;
			if (locX > 40) {
				locX = -40;
				locZ = locZ + 1;
				if (locZ > 40) {
					locX = -40;
					locZ = -40;
					locY = locY + 1;
					if (locZ > 0) {
						locX = -40;
						locZ = -40;
						locY = -10;
					}
				}
			}
		}
		DiverscrownLilypadGroundSlopeProcedure.execute(world, x, (y + 6), z);
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
		for (int index2 = 0; index2 < (int) (2); index2++) {
			locX = x + Math.random() * 32 - 16;
			locZ = z + Math.random() * 32 - 16;
			DiverscrownRavineEntryWaitProcedure.execute(world, locX, (y + 5), locZ);
		}
		if (Math.random() < 0.5) {
			locX = x + Math.random() * 32 - 16;
			locZ = z + Math.random() * 32 - 16;
			DiverscrownRavineEntryWaitProcedure.execute(world, locX, (y + 5), locZ);
		}
	}
}
