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

public class SlatedpoolsRoomGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rnd = 0;
		ElementureMod.queueServerWork(0, () -> {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_airsmall"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		});
		rnd = Math.round(Math.random() * 8);
		if (rnd == 0) {
			ElementureMod.queueServerWork(0, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_emptyroom"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
								3);
					}
				}
			});
		} else if (rnd == 1) {
			ElementureMod.queueServerWork(0, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_emptyroom_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
								3);
					}
				}
			});
		} else if (rnd == 2) {
			ElementureMod.queueServerWork(0, () -> {
				if (Math.random() < 0.85) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_poolroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_poolroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			});
		} else if (rnd == 3) {
			ElementureMod.queueServerWork(0, () -> {
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_room_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.33) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_room_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.75) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_room_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_room_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			});
		} else if (rnd == 4) {
			ElementureMod.queueServerWork(0, () -> {
				if (Math.random() < 0.33) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_spawnerroom_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_spawnerroom_1_wsecret"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_spawnerroom_1_wsecret2"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			});
		} else if (rnd == 5) {
			ElementureMod.queueServerWork(0, () -> {
				if (Math.random() == 0.5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_spawnerroom_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_spawnerroom_2_wsecret"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			});
		} else if (rnd == 6) {
			ElementureMod.queueServerWork(0, () -> {
				if (Math.random() < 0.33) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_spawnerroom_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_spawnerroom_3_wsecret"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_spawnerroom_3_wsecret2"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			});
		} else if (rnd == 7) {
			ElementureMod.queueServerWork(0, () -> {
				if (Math.random() < 0.2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_spawnerroom_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_spawnerroom_4_wsecret"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.33) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_spawnerroom_4_wsecret2"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_spawnerroom_4_wsecret3"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_spawnerroom_4_wsecret4"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			});
		} else if (rnd == 8) {
			ElementureMod.queueServerWork(0, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_spawnerroom_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
								3);
					}
				}
			});
		}
	}
}
