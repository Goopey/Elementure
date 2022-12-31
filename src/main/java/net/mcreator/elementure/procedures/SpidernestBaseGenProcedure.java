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

public class SpidernestBaseGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locZ = 0;
		double locX = 0;
		double locY = 0;
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "spider_nest_cave"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 3, z - 3), new BlockPos(x - 3, y - 3, z - 3),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false).setKeepLiquids(false),
						_serverworld.random, 3);
			}
		}
		locY = 1;
		while ((y - 3) - locY * 8 > 30) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "spider_nest_tunnel"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 2, (y - 3) - locY * 8, z - 2),
							new BlockPos(x - 2, (y - 3) - locY * 8, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE)
									.setMirror(Mirror.NONE).setIgnoreEntities(false).setKeepLiquids(false),
							_serverworld.random, 3);
				}
			}
			locY = locY + 1;
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "spidernest_start_room"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 11, ((y - 3) - locY * 8) - 24, z - 11),
						new BlockPos(x - 11, ((y - 3) - locY * 8) - 24, z - 11),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false).setKeepLiquids(false),
						_serverworld.random, 3);
			}
		}
		SpidernestFloorGenProcedure.execute(world, x, ((y - 3) - locY * 8), z);
		SpidernestFloorGen2Procedure.execute(world, x, (((y - 3) - locY * 8) - 24), z);
		for (int index1 = 0; index1 < (int) (7); index1++) {
			if (Math.random() < 0.5) {
				locX = x + (Math.random() * 8 - 4) * 2;
				locZ = z + (Math.random() * 8 - 4) * 2;
				if (world.getBlockState(new BlockPos(locX, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) locX, (int) locZ), locZ))
						.getLightBlock(world, new BlockPos(locX, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) locX, (int) locZ), locZ)) >= 15) {
					BoulderRandomPickProcedure.execute(world, locX, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) locX, (int) locZ)), locZ);
				}
			}
		}
	}
}
