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

public class NetherstarislandGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "netherisland_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 2, z - 3), new BlockPos(x - 3, y - 2, z - 3),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "netherstarisland_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y - 2, z - 4), new BlockPos(x - 4, y - 2, z - 4),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		PrismaticsproutspreadGenProcedure.execute(world, x, (y + 1), z);
		if (Math.random() < 0.4) {
			if (Math.random() < 0.2) {
				world.setBlock(new BlockPos(x + Math.random() * 6 - 3, y + 1, z + Math.random() * 6 - 3),
						ElementureModBlocks.STARFLOWER.get().defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x + Math.random() * 6 - 3, y + 1, z + Math.random() * 6 - 3),
						ElementureModBlocks.SOLARLILY.get().defaultBlockState(), 3);
			}
		}
		for (int index0 = 0; index0 < (int) (3); index0++) {
			NethersaplinggrowProcedure.execute(world, (x + Math.random() * 4 - 3), (y + 1), (z + Math.random() * 4 - 3));
		}
	}
}
