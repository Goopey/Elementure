package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.init.ElementureModBlocks;
import net.mcreator.elementure.entity.MycenashroomvillagerelderEntity;

public class MycenaomeganvillageGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsZ = 0;
		double heightUnder = 0;
		double CoordsX2 = 0;
		double CoordsZ2 = 0;
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager()
					.getOrCreate(new ResourceLocation("elementure", "mycenan_elder_house_20212"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 10, y - 1, z - 10), new BlockPos(x - 10, y - 1, z - 10),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new MycenashroomvillagerelderEntity(ElementureModEntities.MYCENASHROOMVILLAGERELDER.get(), _level);
			entityToSpawn.moveTo(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		CoordsX = -8;
		CoordsZ = -8;
		CoordsX2 = -9;
		CoordsZ2 = -9;
		heightUnder = 3;
		for (int index0 = 0; index0 < (int) (289); index0++) {
			if (CoordsX * CoordsX + CoordsZ * CoordsZ <= 72.25) {
				if ((world.getBlockState(new BlockPos(x + CoordsX, y - 2, z + CoordsZ))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX, y - 2, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK
								.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX, y - 2, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENASPROUTS
								.get()) {
					if (Math.random() < 0.87) {
						world.setBlock(new BlockPos(x + CoordsX, y - 2, z + CoordsZ), ElementureModBlocks.MYCENIUM.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x + CoordsX, y - 2, z + CoordsZ), ElementureModBlocks.MYCENAMOSSYGRASS.get().defaultBlockState(),
								3);
					}
				}
				if ((world.getBlockState(new BlockPos(x + CoordsX + 1, y - 2, z + CoordsZ))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX + 1, y - 2, z + CoordsZ)))
								.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX + 1, y - 2, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENASPROUTS
								.get()) {
					if (Math.random() < 0.87) {
						world.setBlock(new BlockPos(x + CoordsX + 1, y - 2, z + CoordsZ), ElementureModBlocks.MYCENIUM.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x + CoordsX + 1, y - 2, z + CoordsZ),
								ElementureModBlocks.MYCENAMOSSYGRASS.get().defaultBlockState(), 3);
					}
				}
				if ((world.getBlockState(new BlockPos(x + CoordsX + 1, y - 2, z + CoordsZ + 1))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX + 1, y - 2, z + CoordsZ + 1)))
								.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX + 1, y - 2, z + CoordsZ + 1)))
								.getBlock() == ElementureModBlocks.MYCENASPROUTS.get()) {
					if (Math.random() < 0.87) {
						world.setBlock(new BlockPos(x + CoordsX + 1, y - 2, z + CoordsZ + 1), ElementureModBlocks.MYCENIUM.get().defaultBlockState(),
								3);
					} else {
						world.setBlock(new BlockPos(x + CoordsX + 1, y - 2, z + CoordsZ + 1),
								ElementureModBlocks.MYCENAMOSSYGRASS.get().defaultBlockState(), 3);
					}
				}
				if ((world.getBlockState(new BlockPos(x + CoordsX, y - 2, z + CoordsZ + 1))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX, y - 2, z + CoordsZ + 1)))
								.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX, y - 2, z + CoordsZ + 1))).getBlock() == ElementureModBlocks.MYCENASPROUTS
								.get()) {
					if (Math.random() < 0.87) {
						world.setBlock(new BlockPos(x + CoordsX, y - 2, z + CoordsZ + 1), ElementureModBlocks.MYCENIUM.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x + CoordsX, y - 2, z + CoordsZ + 1),
								ElementureModBlocks.MYCENAMOSSYGRASS.get().defaultBlockState(), 3);
					}
				}
			}
			if (CoordsX * CoordsX + CoordsZ * CoordsZ <= 72.25) {
				if ((world.getBlockState(new BlockPos(x + CoordsX, y - 5, z + CoordsZ))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX, y - 5, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK
								.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX, y - 5, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENASPROUTS
								.get()) {
					world.setBlock(new BlockPos(x + CoordsX, y - 5, z + CoordsZ), Blocks.DIRT.defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x + CoordsX + 1, y - 5, z + CoordsZ))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX + 1, y - 5, z + CoordsZ)))
								.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX + 1, y - 5, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENASPROUTS
								.get()) {
					world.setBlock(new BlockPos(x + CoordsX + 1, y - 5, z + CoordsZ), Blocks.DIRT.defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x + CoordsX + 1, y - 5, z + CoordsZ + 1))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX + 1, y - 5, z + CoordsZ + 1)))
								.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX + 1, y - 5, z + CoordsZ + 1)))
								.getBlock() == ElementureModBlocks.MYCENASPROUTS.get()) {
					world.setBlock(new BlockPos(x + CoordsX + 1, y - 5, z + CoordsZ + 1), Blocks.DIRT.defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x + CoordsX, y - 5, z + CoordsZ + 1))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX, y - 5, z + CoordsZ + 1)))
								.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX, y - 5, z + CoordsZ + 1))).getBlock() == ElementureModBlocks.MYCENASPROUTS
								.get()) {
					world.setBlock(new BlockPos(x + CoordsX, y - 5, z + CoordsZ + 1), Blocks.DIRT.defaultBlockState(), 3);
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 9) {
				CoordsX = -8;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 9) {
					CoordsX = -8;
					CoordsZ = -8;
				}
			}
		}
		for (int index1 = 0; index1 < (int) (361); index1++) {
			if (CoordsX2 * CoordsX2 + CoordsZ2 * CoordsZ2 <= 72.25) {
				if ((world.getBlockState(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2))).getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK
								.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2))).getBlock() == ElementureModBlocks.MYCENASPROUTS
								.get()) {
					world.setBlock(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2), Blocks.DIRT.defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2)))
								.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2))).getBlock() == ElementureModBlocks.MYCENASPROUTS
								.get()) {
					world.setBlock(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2), Blocks.DIRT.defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2 + 1))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2 + 1)))
								.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2 + 1)))
								.getBlock() == ElementureModBlocks.MYCENASPROUTS.get()) {
					world.setBlock(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2 + 1), Blocks.DIRT.defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2 + 1))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2 + 1)))
								.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2 + 1))).getBlock() == ElementureModBlocks.MYCENASPROUTS
								.get()) {
					world.setBlock(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2 + 1), Blocks.DIRT.defaultBlockState(), 3);
				}
			} else if (CoordsX2 * CoordsX2 + CoordsZ2 * CoordsZ2 <= 90.25 && !(CoordsX2 * CoordsX2 + CoordsZ2 * CoordsZ2 <= 72.25)) {
				if ((world.getBlockState(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2))).getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK
								.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2))).getBlock() == ElementureModBlocks.MYCENASPROUTS
								.get()) {
					if (Math.random() < 0.87) {
						world.setBlock(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2), ElementureModBlocks.MYCENIUM.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2),
								ElementureModBlocks.MYCENAMOSSYGRASS.get().defaultBlockState(), 3);
					}
				}
				if ((world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2)))
								.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2))).getBlock() == ElementureModBlocks.MYCENASPROUTS
								.get()) {
					if (Math.random() < 0.87) {
						world.setBlock(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2), ElementureModBlocks.MYCENIUM.get().defaultBlockState(),
								3);
					} else {
						world.setBlock(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2),
								ElementureModBlocks.MYCENAMOSSYGRASS.get().defaultBlockState(), 3);
					}
				}
				if ((world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2 + 1))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2 + 1)))
								.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2 + 1)))
								.getBlock() == ElementureModBlocks.MYCENASPROUTS.get()) {
					if (Math.random() < 0.87) {
						world.setBlock(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2 + 1),
								ElementureModBlocks.MYCENIUM.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2 + 1),
								ElementureModBlocks.MYCENAMOSSYGRASS.get().defaultBlockState(), 3);
					}
				}
				if ((world.getBlockState(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2 + 1))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2 + 1)))
								.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2 + 1))).getBlock() == ElementureModBlocks.MYCENASPROUTS
								.get()) {
					if (Math.random() < 0.87) {
						world.setBlock(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2 + 1), ElementureModBlocks.MYCENIUM.get().defaultBlockState(),
								3);
					} else {
						world.setBlock(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2 + 1),
								ElementureModBlocks.MYCENAMOSSYGRASS.get().defaultBlockState(), 3);
					}
				}
			}
			if (CoordsX2 * CoordsX2 + CoordsZ2 * CoordsZ2 <= 90.25) {
				if ((world.getBlockState(new BlockPos(x + CoordsX2, y - 4, z + CoordsZ2))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2))).getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK
								.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2))).getBlock() == ElementureModBlocks.MYCENASPROUTS
								.get()) {
					world.setBlock(new BlockPos(x + CoordsX2, y - 4, z + CoordsZ2), Blocks.DIRT.defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 4, z + CoordsZ2))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2)))
								.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2))).getBlock() == ElementureModBlocks.MYCENASPROUTS
								.get()) {
					world.setBlock(new BlockPos(x + CoordsX2 + 1, y - 4, z + CoordsZ2), Blocks.DIRT.defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 4, z + CoordsZ2 + 1))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2 + 1)))
								.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX2 + 1, y - 3, z + CoordsZ2 + 1)))
								.getBlock() == ElementureModBlocks.MYCENASPROUTS.get()) {
					world.setBlock(new BlockPos(x + CoordsX2 + 1, y - 4, z + CoordsZ2 + 1), Blocks.DIRT.defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x + CoordsX2, y - 4, z + CoordsZ2 + 1))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2 + 1)))
								.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get()
						|| (world.getBlockState(new BlockPos(x + CoordsX2, y - 3, z + CoordsZ2 + 1))).getBlock() == ElementureModBlocks.MYCENASPROUTS
								.get()) {
					world.setBlock(new BlockPos(x + CoordsX2, y - 4, z + CoordsZ2 + 1), Blocks.DIRT.defaultBlockState(), 3);
				}
			}
			CoordsX2 = CoordsX2 + 1;
			if (CoordsX2 == 10) {
				CoordsX2 = -9;
				CoordsZ2 = CoordsZ2 + 1;
				if (CoordsZ2 == 10) {
					CoordsX2 = -9;
					CoordsZ2 = -9;
				}
			}
		}
	}
}
