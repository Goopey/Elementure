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

public class VanillaoaktreegenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "oak_tree_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 2, y, z - 2), new BlockPos(x - 2, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x - 2, y + 1, z - 2), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x - 2, y + 2, z - 2), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x + 2, y + 1, z - 2), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x + 2, y + 2, z - 2), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x - 2, y + 1, z + 2), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x - 2, y + 2, z + 2), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x + 2, y + 1, z + 2), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x + 2, y + 2, z + 2), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x - 1, y + 3, z - 1), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x + 1, y + 3, z - 1), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x + 1, y + 3, z + 1), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x - 1, y + 3, z + 1), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "oak_tree_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 2, y, z - 2), new BlockPos(x - 2, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x - 2, y + 2, z - 2), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x - 2, y + 3, z - 2), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x + 2, y + 2, z - 2), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x + 2, y + 3, z - 2), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x - 2, y + 2, z + 2), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x - 2, y + 3, z + 2), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x + 2, y + 2, z + 2), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x + 2, y + 3, z + 2), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x - 1, y + 4, z - 1), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x + 1, y + 4, z - 1), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x + 1, y + 4, z + 1), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x - 1, y + 4, z + 1), Blocks.OAK_LEAVES.defaultBlockState(), 3);
			}
		}
	}
}
