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

public class MycenadepthsXRoomGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		CoordsX = -9;
		CoordsY = -5;
		CoordsZ = -8;
		for (int index0 = 0; index0 < (int) (3553); index0++) {
			if (0.85 * CoordsX * CoordsX + 2.65 * CoordsY * CoordsY + CoordsZ * CoordsZ <= 64 && y + CoordsY > 0) {
				if (0.85 * CoordsX * CoordsX + 2.65 * CoordsY * CoordsY + CoordsZ * CoordsZ >= 63 && Math.random() < 0.75 && world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ)).canOcclude() && CoordsY < -2
						&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENA_BIOME_ALPHAN.get())
						&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENAVINE.get())) {
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
				} else if (Math.random() < 0.5 && 0.85 * CoordsX * CoordsX + 2.65 * CoordsY * CoordsY + CoordsZ * CoordsZ >= 63 && CoordsY > 2
						&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY + 1, z + CoordsZ))).getBlock() == Blocks.AIR)
						&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENA_BIOME_ALPHAN.get())
						&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENAVINE.get())) {
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
				if (CoordsY < -2 && 0.85 * CoordsX * CoordsX + 2.65 * CoordsY * CoordsY + CoordsZ * CoordsZ >= 63 && Math.random() < 0.025) {
					world.setBlock(new BlockPos(x + CoordsX, (y + CoordsY) - 3, z + CoordsZ), ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + CoordsX, (y + CoordsY) - 3, z + CoordsZ);
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
			if (CoordsX == 9) {
				CoordsX = -9;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 8) {
					CoordsX = -8;
					CoordsZ = -8;
					CoordsY = CoordsY + 1;
					if (CoordsY == 5) {
						CoordsX = -8;
						CoordsZ = -8;
						CoordsY = -5;
					}
				}
			}
		}
		if (Math.random() < 0.2) {
			MycenasingularruinGenProcedure.execute(world, (x + Math.random() * 6 - 3), (y - 4), (z + Math.random() * 6 - 3));
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"kill @e[type=minecraft:item, distance=0.1..24]");
	}
}
