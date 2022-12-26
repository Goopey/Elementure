package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SwordtempleEndRoomSecret1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "swordtemple_tunnelair"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 4, y - 3, z - 4), new BlockPos(x - 4, y - 3, z - 4),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false).setKeepLiquids(false),
						_serverworld.random, 3);
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "swordtemple_tunnelair"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 4, y - 6, z - 4), new BlockPos(x - 4, y - 6, z - 4),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false).setKeepLiquids(false),
						_serverworld.random, 3);
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "swordtemple_tunnelair"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 4, y - 9, z - 4), new BlockPos(x - 4, y - 9, z - 4),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false).setKeepLiquids(false),
						_serverworld.random, 3);
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager()
					.getOrCreate(new ResourceLocation("elementure", "swordtemple_endroom_secret"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 4, y - 11, z - 4), new BlockPos(x - 4, y - 11, z - 4),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false).setKeepLiquids(false),
						_serverworld.random, 3);
			}
		}
		SwordtempleFloorGenSecret2Procedure.execute(world, x, (y - 11), z);
	}
}
