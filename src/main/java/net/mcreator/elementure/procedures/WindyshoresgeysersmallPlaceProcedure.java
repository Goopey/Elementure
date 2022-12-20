package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class WindyshoresgeysersmallPlaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean canPlace = false;
		double locZ = 0;
		double locX = 0;
		double locY = 0;
		double quad4 = 0;
		double quad3 = 0;
		double quad2 = 0;
		double quad1 = 0;
		double quadM = 0;
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "windyshores_geyser_1"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 2, z - 3), new BlockPos(x - 3, y - 2, z - 3),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		locX = -6;
		locZ = -6;
		for (int index0 = 0; index0 < (int) (169); index0++) {
			if (locX * locX + locZ * locZ < 36 && world.isEmptyBlock(new BlockPos(x + locX, y, z + locZ))) {
				world.setBlock(new BlockPos(x + locX, y, z + locZ), ElementureModBlocks.CLOUDBLOCK.get().defaultBlockState(), 3);
			}
			if (locX * locX + locZ * locZ < 24 && world.isEmptyBlock(new BlockPos(x + locX, y - 1, z + locZ))) {
				world.setBlock(new BlockPos(x + locX, y - 1, z + locZ), ElementureModBlocks.CLOUDBLOCK.get().defaultBlockState(), 3);
			}
			locX = locX + 1;
			if (locX >= 6) {
				locX = -6;
				locZ = locZ + 1;
				if (locZ >= 6) {
					locX = -6;
					locZ = -6;
				}
			}
		}
	}
}
