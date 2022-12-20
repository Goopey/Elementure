package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class AbyssalspotterGenerateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.45) {
			if (Math.random() < 0.5) {
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "mediumadiagonalarm"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y + 1, z), new BlockPos(x, y + 1, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.5 && Math.random() > 0.25) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "mediumadiagonalarm"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x + 13, y + 1, z - 13), new BlockPos(x + 13, y + 1, z - 13),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.75 && Math.random() > 0.5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "mediumbdiagonalarm"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x + 13, y + 1, z), new BlockPos(x + 13, y + 1, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "mediumbdiagonalarm"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y + 1, z - 13), new BlockPos(x, y + 1, z - 13),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else {
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "mediumfrontarm"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y + 1, z), new BlockPos(x, y + 1, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.5 && Math.random() > 0.25) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "mediumfrontarm"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 13, y + 1, z), new BlockPos(x - 13, y + 1, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.75 && Math.random() > 0.5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "mediumsidearm"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y + 1, z), new BlockPos(x, y + 1, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "mediumsidearm"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y + 1, z - 13), new BlockPos(x, y + 1, z - 13),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			}
		} else if (Math.random() < 0.66 && Math.random() > 0.45) {
			if (Math.random() < 0.5) {
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "smalladiagonalarm"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y + 1, z), new BlockPos(x, y + 1, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.5 && Math.random() > 0.25) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "smalladiagonalarm"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x + 13, y + 1, z - 13), new BlockPos(x + 13, y + 1, z - 13),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.75 && Math.random() > 0.5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "smallbdiagonalarm"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x + 13, y + 1, z), new BlockPos(x + 13, y + 1, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "smallbdiagonalarm"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y + 1, z - 13), new BlockPos(x, y + 1, z - 13),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else {
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "smallfrontarm"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y + 1, z), new BlockPos(x, y + 1, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.5 && Math.random() > 0.25) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "smallfrontarm"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 13, y + 1, z), new BlockPos(x - 13, y + 1, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.75 && Math.random() > 0.5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "smallsidearm"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y + 1, z), new BlockPos(x, y + 1, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "smallsidearm"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y + 1, z - 13), new BlockPos(x, y + 1, z - 13),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			}
		} else {
			if (Math.random() < 0.45) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "smallspire"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x, y + 1, z), new BlockPos(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Math.random() < 0.8 && Math.random() > 0.45) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "mediumspire"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x, y + 1, z), new BlockPos(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "bigspire"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x, y + 1, z), new BlockPos(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		}
	}
}
