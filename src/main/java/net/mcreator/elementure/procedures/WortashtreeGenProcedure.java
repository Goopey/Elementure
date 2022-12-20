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

public class WortashtreeGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rnd = 0;
		double locY = 0;
		double locX = 0;
		double locZ = 0;
		double yBot = 0;
		if (Math.random() < 0.25) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "wortash_tree_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 2, z - 3), new BlockPos(x - 3, y - 2, z - 3),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (Math.random() < 0.33) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "wortash_tree_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x + 3, y - 2, z - 3), new BlockPos(x + 3, y - 2, z - 3),
							new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "wortash_tree_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x + 3, y - 2, z + 3), new BlockPos(x + 3, y - 2, z + 3),
							new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "wortash_tree_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 2, z + 3), new BlockPos(x - 3, y - 2, z + 3),
							new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		locX = -2;
		locY = -2;
		locZ = -2;
		for (int index0 = 0; index0 < (int) (125); index0++) {
			if (locX * locX + locY * locY + locZ * locZ < 8 && Math.random() < 0.015
					&& world.isEmptyBlock(new BlockPos(x + locX, y + locY, z + locZ))) {
				world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.WORTASHROOTS.get().defaultBlockState(), 3);
			}
			locX = locX + 1;
			if (locX >= 2) {
				locX = -2;
				locY = locY + 1;
				if (locY >= 2) {
					locX = -2;
					locY = -2;
					locZ = locZ + 1;
					if (locZ >= 2) {
						locX = -2;
						locY = -2;
						locZ = -2;
					}
				}
			}
		}
		locX = -3;
		locY = -3;
		locZ = -3;
		for (int index1 = 0; index1 < (int) (343); index1++) {
			if (locX * locX + locY * locY + locZ * locZ < 27 && Math.random() < 0.015
					&& world.isEmptyBlock(new BlockPos(x + locX, y + locY + 6, z + locZ))) {
				world.setBlock(new BlockPos(x + locX, y + locY + 6, z + locZ), ElementureModBlocks.WORTASHLEAVES.get().defaultBlockState(), 3);
			}
			locX = locX + 1;
			if (locX >= 3) {
				locX = -3;
				locY = locY + 1;
				if (locY >= 3) {
					locX = -3;
					locY = -3;
					locZ = locZ + 1;
					if (locZ >= 3) {
						locX = -3;
						locY = -3;
						locZ = -3;
					}
				}
			}
		}
	}
}
