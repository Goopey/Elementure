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

public class MycenadepthsYRoomGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		CoordsX = -8;
		CoordsY = -11;
		CoordsZ = -8;
		for (int index0 = 0; index0 < (int) (6647); index0++) {
			if (CoordsX * CoordsX + 0.65 * CoordsY * CoordsY + CoordsZ * CoordsZ <= 64 && y + CoordsY > 0) {
				if (CoordsX * CoordsX + 0.65 * CoordsY * CoordsY + CoordsZ * CoordsZ >= 63 && CoordsY < -3 && world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ)).canOcclude()
						&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENA_BIOME_ALPHAN.get())
						&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENAVINE.get()) && Math.random() < 0.75) {
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("omeganGenRole", 11);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if (CoordsX * CoordsX + 0.65 * CoordsY * CoordsY + CoordsZ * CoordsZ >= 63 && CoordsY > 3 && !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY + 1, z + CoordsZ))).getBlock() == Blocks.AIR)
						&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENA_BIOME_ALPHAN.get())
						&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENAVINE.get()) && Math.random() < 0.5) {
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("omeganGenRole", 12);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if (!((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENA_BIOME_ALPHAN.get())
						&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENAVINE.get())) {
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), Blocks.AIR.defaultBlockState(), 3);
				}
				if (CoordsX * CoordsX + 0.65 * CoordsY * CoordsY + CoordsZ * CoordsZ >= 63 && CoordsY < -3 && Math.random() < 0.025) {
					world.setBlock(new BlockPos(x + CoordsX, (y + CoordsY) - 4, z + CoordsZ), ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + CoordsX, (y + CoordsY) - 4, z + CoordsZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("omeganGenRole", 17);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 8) {
				CoordsX = -8;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 8) {
					CoordsX = -8;
					CoordsZ = -8;
					CoordsY = CoordsY + 1;
					if (CoordsY == 11) {
						CoordsX = -8;
						CoordsZ = -8;
						CoordsY = -11;
					}
				}
			}
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"kill @e[type=minecraft:item, distance=0.1..24]");
	}
}
