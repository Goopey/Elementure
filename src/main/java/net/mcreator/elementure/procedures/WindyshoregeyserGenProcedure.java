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

public class WindyshoregeyserGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "windyshores_geyser_2"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 3, z - 3), new BlockPos(x - 3, y - 3, z - 3),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		for (int index0 = 0; index0 < (int) (8); index0++) {
			locX = Math.random() < 0.5 ? Math.random() * 20 + 3 : Math.random() * (-20) - 3;
			locZ = Math.random() < 0.5 ? Math.random() * 20 + 3 : Math.random() * (-20) - 3;
			FlufftreeGenProcedure.execute(world, (x + locX),
					(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + locX), (int) (z + locZ))), (z + locZ));
		}
	}
}
