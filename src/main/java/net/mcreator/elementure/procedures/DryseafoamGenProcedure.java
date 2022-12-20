package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DryseafoamGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.33) {
			world.setBlock(new BlockPos(x + 1, y, z), ElementureModBlocks.GREENSLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y, z), ElementureModBlocks.GREENSLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y, z + 1), ElementureModBlocks.GREENSLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y, z + 1), ElementureModBlocks.GREENSLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y, z - 1), ElementureModBlocks.GREENSLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y, z - 1), ElementureModBlocks.GREENSLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z + 1), ElementureModBlocks.GREENSLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z - 1), ElementureModBlocks.GREENSLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z), Blocks.GRAVEL.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 1, z), Blocks.GRAVEL.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 1, z), Blocks.GRAVEL.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z + 1), Blocks.GRAVEL.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z - 1), Blocks.GRAVEL.defaultBlockState(), 3);
		} else if (Math.random() < 0.5) {
			world.setBlock(new BlockPos(x + 1, y, z), ElementureModBlocks.BLUESLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y, z), ElementureModBlocks.BLUESLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y, z + 1), ElementureModBlocks.BLUESLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y, z + 1), ElementureModBlocks.BLUESLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y, z - 1), ElementureModBlocks.BLUESLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y, z - 1), ElementureModBlocks.BLUESLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z + 1), ElementureModBlocks.BLUESLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z - 1), ElementureModBlocks.BLUESLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z), Blocks.GRAVEL.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 1, z), Blocks.GRAVEL.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 1, z), Blocks.GRAVEL.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z + 1), Blocks.GRAVEL.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z - 1), Blocks.GRAVEL.defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x + 1, y, z), ElementureModBlocks.PINKSLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y, z), ElementureModBlocks.PINKSLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y, z + 1), ElementureModBlocks.PINKSLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y, z + 1), ElementureModBlocks.PINKSLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y, z - 1), ElementureModBlocks.PINKSLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y, z - 1), ElementureModBlocks.PINKSLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z + 1), ElementureModBlocks.PINKSLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z - 1), ElementureModBlocks.PINKSLIMETURF.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z), Blocks.GRAVEL.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 1, z), Blocks.GRAVEL.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 1, z), Blocks.GRAVEL.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z + 1), Blocks.GRAVEL.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z - 1), Blocks.GRAVEL.defaultBlockState(), 3);
		}
		if (Math.random() < 0.65) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "dryseafoam_struct"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, y - 1, z - 1), new BlockPos(x - 1, y - 1, z - 1),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "dryseafoam_struct_large"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, y - 1, z - 1), new BlockPos(x - 1, y - 1, z - 1),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
	}
}
