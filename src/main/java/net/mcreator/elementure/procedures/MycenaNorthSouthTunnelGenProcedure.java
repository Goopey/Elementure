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

public class MycenaNorthSouthTunnelGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		CoordsX = -2;
		CoordsY = -2;
		CoordsZ = -2;
		for (int index0 = 0; index0 < (int) (125); index0++) {
			if (CoordsX * CoordsX + CoordsY * CoordsY <= 25 && y + CoordsY > 0 && !(CoordsX == 2) && !(CoordsY == 2) && !(CoordsX == 2) && !(CoordsY == -2) && !(CoordsX == -2) && !(CoordsY == 2) && !(CoordsX == -2) && !(CoordsY == -2)) {
				if (CoordsX * CoordsX + CoordsY * CoordsY <= 25 && (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.AIR
						&& world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY + 1, z + CoordsZ)).canOcclude() && Math.random() < 0.25 && CoordsY > 0) {
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("omeganGenRole", 18);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if (CoordsX * CoordsX + CoordsY * CoordsY <= 25 && (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.AIR
						&& world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ)).canOcclude() && Math.random() < 0.4 && CoordsY < 0) {
					if (Math.random() < 0.2) {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("omeganGenRole", 14);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					} else {
						if (Math.random() < 0.7) {
							world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.MYCENASHROOMBLOCK.get().defaultBlockState(), 3);
						} else {
							world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.MYCENASPROUTS.get().defaultBlockState(), 3);
						}
					}
				} else if (!((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENAVINE.get())
						&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.BIGGLOWINGMUSHROOM.get())
						&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.MUSHROOM_STEM)) {
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), Blocks.AIR.defaultBlockState(), 3);
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 2) {
				CoordsX = -2;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 2) {
					CoordsX = -2;
					CoordsY = CoordsY + 1;
					CoordsZ = -2;
					if (CoordsY == 2) {
						CoordsX = -2;
						CoordsY = -2;
						CoordsZ = -2;
					}
				}
			}
		}
		if (Math.random() < 0.01) {
			world.setBlock(new BlockPos(x, y - 4, z), ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y - 4, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("omeganGenRole", 17);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"kill @e[type=minecraft:item, distance=0.1..100]");
	}
}
