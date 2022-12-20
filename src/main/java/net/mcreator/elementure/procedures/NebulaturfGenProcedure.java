package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class NebulaturfGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		double modX = 0;
		double modZ = 0;
		locX = -9;
		locZ = -9;
		modX = Math.random() * 1.66 + 0.66;
		modZ = Math.random() * 1.66 + 0.66;
		for (int index0 = 0; index0 < (int) (361); index0++) {
			if (locX * locX * modX + locZ * locZ * modZ < 81 && ((world.getBlockState(new BlockPos(x + locX, y, z + locZ)))
					.getBlock() == ElementureModBlocks.NETHERUMCARPET.get()
					|| (world.getBlockState(new BlockPos(x + locX, y, z + locZ))).getBlock() == ElementureModBlocks.NETHERUMCARPETSHINY.get())) {
				if ((world.getBlockState(new BlockPos(x + locX, y, z + locZ))).getBlock() == ElementureModBlocks.NETHERUMCARPETSHINY.get()) {
					world.setBlock(new BlockPos(x + locX, y + 1, z + locZ), ElementureModBlocks.SPARKLINGSTARS.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.UP;
						BlockPos _pos = new BlockPos(x + locX, y + 1, z + locZ);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				} else if (Math.random() < 0.1) {
					if (Math.random() < 0.05) {
						world.setBlock(new BlockPos(x + locX, y + 1, z + locZ), ElementureModBlocks.NEBULAOXEYE.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x + locX, y + 1, z + locZ), ElementureModBlocks.OBSIDIANSPROUTS.get().defaultBlockState(), 3);
					}
				}
				world.setBlock(new BlockPos(x + locX, y, z + locZ), ElementureModBlocks.NETHERUMDUST_NEBULATURFBLOCK.get().defaultBlockState(), 3);
			}
			locX = locX + 1;
			if (locX >= 9) {
				locX = -9;
				locZ = locZ + 1;
				if (locZ >= 9) {
					locX = -9;
					locZ = -9;
				}
			}
		}
		for (int index1 = 0; index1 < (int) (3); index1++) {
			if (Math.random() < 0.7) {
				NebulaturfsmallGenProcedure.execute(world, (x + Math.random() * 22 - 11), y, (z + Math.random() * 22 - 11));
			}
		}
	}
}
