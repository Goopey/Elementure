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

public class MycenadepthssecretroomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		CoordsX = -6;
		CoordsY = -4;
		CoordsZ = -6;
		for (int index0 = 0; index0 < (int) (1521); index0++) {
			if (CoordsX * CoordsX + CoordsZ * CoordsZ + 2.5 * CoordsY * CoordsY <= 36 && y + CoordsY > 0) {
				if (CoordsX * CoordsX + CoordsZ * CoordsZ + 2.5 * CoordsY * CoordsY >= 35 && CoordsY < -2
						&& world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ)).canOcclude() && Math.random() < 0.5) {
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
							ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("omeganGenRole", 11);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if (CoordsX * CoordsX + CoordsZ * CoordsZ + 2.5 * CoordsY * CoordsY >= 35 && CoordsY > 2 && Math.random() < 0.5
						&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.AIR)) {
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
							ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("omeganGenRole", 12);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), Blocks.AIR.defaultBlockState(), 3);
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 6) {
				CoordsX = -6;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 6) {
					CoordsX = -6;
					CoordsY = CoordsY + 1;
					CoordsZ = -6;
					if (CoordsY == 4) {
						CoordsX = -6;
						CoordsY = -4;
						CoordsZ = -6;
					}
				}
			}
		}
		world.setBlock(new BlockPos(x, y - 3, z), Blocks.CHEST.defaultBlockState(), 3);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 3), z), Vec2.ZERO, _level, 4, "", Component.literal(""),
									_level.getServer(), null).withSuppressedOutput(),
							"data merge block ~ ~ ~ {LootTable:\"elementure:mycenanlootchest\"}");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
							Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"kill @e[type=minecraft:item, distance=0.1..24]");
	}
}
