package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BoulderPatchGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "ow_boulder_5"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 2, z - 3), new BlockPos(x - 3, y - 2, z - 3),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "ow_boulder_6"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y - 3, z - 4), new BlockPos(x - 4, y - 3, z - 4),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		for (int index0 = 0; index0 < (int) (7); index0++) {
			if (Math.random() < 0.5) {
				locX = x + (Math.random() * 8 - 4) * 4;
				locZ = z + (Math.random() * 8 - 4) * 4;
				if (world.getBlockState(new BlockPos(locX, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) locX, (int) locZ), locZ))
						.getLightBlock(world, new BlockPos(locX, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) locX, (int) locZ), locZ)) >= 15) {
					BoulderRandomPickProcedure.execute(world, locX, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) locX, (int) locZ)), locZ);
				}
			}
		}
	}
}
