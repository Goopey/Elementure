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

public class ScrapsaplingGrowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double randomheight = 0;
		double height = 0;
		randomheight = Math.round(Math.random() * 2);
		if (Math.random() < 0.011) {
			world.setBlock(new BlockPos(x - 1, y, z), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y, z), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z + 1), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z - 1), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y + 1, z), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y + 1, z), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 1, z + 1), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 1, z - 1), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 1, z), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
			for (int index0 = 0; index0 < (int) (randomheight + 1); index0++) {
				world.setBlock(new BlockPos(x - 1, y + height, z), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x + 1, y + height, z), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + height, z + 1), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + height, z - 1), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + height, z), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
				height = height + 1;
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "nether_scrap_tree_base"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 3, y + randomheight, z - 3), new BlockPos(x - 3, y + randomheight, z - 3),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		}
	}
}
