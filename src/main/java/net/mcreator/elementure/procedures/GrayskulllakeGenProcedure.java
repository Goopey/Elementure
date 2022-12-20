package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class GrayskulllakeGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		locX = -15;
		locZ = -15;
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "grayskull_lake"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 15, y - 4, z - 15), new BlockPos(x - 15, y - 4, z - 15),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		for (int index0 = 0; index0 < (int) (961); index0++) {
			world.setBlock(new BlockPos(x + locX, -64, z + locZ), ElementureModBlocks.PERVADEDBEDROCK.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x + locX, -64, z + locZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putBoolean("grayskullLake", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			locX = locX + 1;
			if (locX >= 15) {
				locX = -15;
				locZ = locZ + 1;
				if (locZ >= 15) {
					locX = -15;
					locZ = -15;
				}
			}
		}
	}
}
