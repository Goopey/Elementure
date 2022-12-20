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

public class NethersaplingsurfaceGrowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double randomheight = 0;
		double height = 0;
		randomheight = Math.round(Math.random() * 4);
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
		for (int index0 = 0; index0 < (int) (randomheight + 1); index0++) {
			world.setBlock(new BlockPos(x, y + height, z), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
			height = height + 1;
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "nether_tree_base"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 2, y + randomheight, z - 2), new BlockPos(x - 2, y + randomheight, z - 2),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		NetherleavesExtraGenProcedure.execute(world, x, (y + randomheight), z);
	}
}
