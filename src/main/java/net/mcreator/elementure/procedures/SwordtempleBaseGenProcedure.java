package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SwordtempleBaseGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locY = 0;
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "swordtemple_top"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 4, y - 2, z - 4), new BlockPos(x - 4, y - 2, z - 4),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false).setKeepLiquids(false),
						_serverworld.random, 3);
			}
		}
		SpawnTombstonesSwordTempleProcedure.execute(world, x, z);
		locY = 1;
		while ((y - 2) - locY * 4 > 50) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "swordtemple_tunnel"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 2, (y - 2) - locY * 4, z - 2),
							new BlockPos(x - 2, (y - 2) - locY * 4, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE)
									.setMirror(Mirror.NONE).setKeepLiquids(false).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			locY = locY + 1;
		}
		if (Math.random() < 0.33) {
			SwordtempleStartGenSecretProcedure.execute(world, x, ((y - 8) - locY * 4), z);
			SwordtempleFloorGenSecret1Procedure.execute(world, x, ((y - 2) - locY * 4), z);
		} else {
			SwordtempleStartGenProcedure.execute(world, x, ((y - 8) - locY * 4), z);
			SwordtempleFloorGenProcedure.execute(world, x, ((y - 2) - locY * 4), z);
		}
	}
}
