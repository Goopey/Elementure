package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.ElementureMod;

public class RuingranitehouseGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			if (Math.random() < 0.5) {
				ElementureMod.queueServerWork(20, () -> {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "ruingranite_house"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 3), new BlockPos(x - 4, y, z - 3),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					RuingranitehousepillarProcedure.execute(world, (x + 4), (y - 1), (z - 3));
					RuingranitehousepillarProcedure.execute(world, (x - 4), (y - 1), (z - 3));
					RuingranitehousepillarProcedure.execute(world, (x - 4), (y - 1), (z + 2));
					RuingranitehousepillarProcedure.execute(world, (x + 4), (y - 1), (z + 2));
				});
			} else {
				ElementureMod.queueServerWork(20, () -> {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "ruingranite_temple"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					RuingranitehousepillarProcedure.execute(world, (x + 2), (y - 1), (z - 2));
					RuingranitehousepillarProcedure.execute(world, (x - 2), (y - 1), (z - 2));
					RuingranitehousepillarProcedure.execute(world, (x - 2), (y - 1), (z + 2));
					RuingranitehousepillarProcedure.execute(world, (x + 2), (y - 1), (z + 2));
				});
			}
		}
	}
}
