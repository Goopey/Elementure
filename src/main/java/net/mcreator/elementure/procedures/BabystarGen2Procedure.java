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

public class BabystarGen2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsZ = 0;
		double CoordsY = 0;
		double CoordsX = 0;
		double randomHeight = 0;
		double CoordY = 0;
		CoordsX = -8;
		CoordsY = -8;
		CoordsZ = -8;
		for (int index0 = 0; index0 < (int) (4913); index0++) {
			if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ <= 64) {
				if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ <= 14) {
					if (y + CoordsY > 0) {
						if (Math.random() < 0.01) {
							world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
									ElementureModBlocks.BLAZINGNETHERUMSHINY.get().defaultBlockState(), 3);
						} else {
							world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
									ElementureModBlocks.BLAZINGNETHERUM.get().defaultBlockState(), 3);
						}
					}
				} else if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ <= 36) {
					if (y + CoordsY > 0) {
						if (Math.random() < 0.01) {
							world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
									ElementureModBlocks.DENSENETHERUMSHINY.get().defaultBlockState(), 3);
						} else {
							world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
									ElementureModBlocks.DENSENETHERUM.get().defaultBlockState(), 3);
						}
					}
				} else {
					if (y + CoordsY > 0) {
						if (Math.random() < 0.01) {
							world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
									ElementureModBlocks.NETHERUMSHINY.get().defaultBlockState(), 3);
						} else {
							world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
									ElementureModBlocks.NETHERUM.get().defaultBlockState(), 3);
						}
					}
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 8) {
				CoordsX = -8;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 8) {
					CoordsX = -8;
					CoordsY = CoordsY + 1;
					CoordsZ = -8;
					if (CoordsY == 8) {
						CoordsX = -8;
						CoordsY = -8;
						CoordsZ = -8;
					}
				}
			}
		}
		randomHeight = (Math.random() * 2 - 1) * 3;
		for (int index1 = 0; index1 < (int) (Math.ceil(Math.random() * 3)); index1++) {
			if (Math.random() < 0.17) {
				if (y + randomHeight > 0) {
					BabystarGenAirProcedure.execute(world, (x - 7), (y + randomHeight), (z + randomHeight));
				}
			} else if (Math.random() > 0.17 && Math.random() < 0.34) {
				if (y + randomHeight > 0) {
					BabystarGenAirProcedure.execute(world, (x + 7), (y + randomHeight), (z + randomHeight));
				}
			} else if (Math.random() > 0.34 && Math.random() < 0.51) {
				if (y + randomHeight > 0) {
					BabystarGenAirProcedure.execute(world, (x + randomHeight), (y + randomHeight), (z + 7));
				}
			} else if (Math.random() > 0.51 && Math.random() < 0.68) {
				if (y + randomHeight > 0) {
					BabystarGenAirProcedure.execute(world, (x + randomHeight), (y + randomHeight), (z - 7));
				}
			} else if (Math.random() > 0.68 && Math.random() < 0.85) {
				if (y - 7 > 0) {
					BabystarGenAirProcedure.execute(world, (x + randomHeight), (y - 7), (z + randomHeight));
				}
			} else {
				if (y + 7 > 0) {
					BabystarGenAirProcedure.execute(world, (x + randomHeight), (y + 7), (z + randomHeight));
				}
			}
		}
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.BLAZINGNETHERUM.get().defaultBlockState(), 3);
		while (0 + CoordY < y - 7) {
			if (world.getBlockState(new BlockPos(x, 0 + CoordY, z)).canOcclude()) {
				CoordY = CoordY + 1;
			} else {
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "netherite_crystal"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 1, CoordY, z - 1), new BlockPos(x - 1, CoordY, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "netherite_crystal"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 1, CoordY, z - 1), new BlockPos(x - 1, CoordY, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.75) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "netherite_crystal"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 1, CoordY, z - 1), new BlockPos(x - 1, CoordY, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "netherite_crystal"));
						if (template != null) {
							template.placeInWorld(
									_serverworld, new BlockPos(x - 1, CoordY, z - 1), new BlockPos(x - 1, CoordY, z - 1), new StructurePlaceSettings()
											.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				break;
			}
		}
	}
}
