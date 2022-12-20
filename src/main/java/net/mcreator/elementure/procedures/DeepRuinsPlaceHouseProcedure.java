package net.mcreator.elementure.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class DeepRuinsPlaceHouseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rnd = 0;
		rnd = Math.round(Math.random() * 9);
		if (rnd == 0) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "deepslateruins_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 2, y - 1, z - 2), new BlockPos(x - 2, y - 1, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 10);
		} else if (rnd == 1) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "deepslateruins_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 1, z - 3), new BlockPos(x - 3, y - 1, z - 3),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 10);
		} else if (rnd == 2) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "deepslateruins_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 1, z - 3), new BlockPos(x - 3, y - 1, z - 3),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 10);
		} else if (rnd == 3) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "deepslateruins_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 1, z - 5), new BlockPos(x - 3, y - 1, z - 5),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 10);
		} else if (rnd == 4) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "deepslateruins_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 2, y - 1, z - 3), new BlockPos(x - 2, y - 1, z - 3),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 10);
		} else if (rnd == 5) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "deepslateruins_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 4, y - 1, z - 4), new BlockPos(x - 4, y - 1, z - 4),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 10);
		} else if (rnd == 6) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "deepslateruins_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 2, y - 1, z - 2), new BlockPos(x - 2, y - 1, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 10);
		} else if (rnd == 7) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "deepslateruins_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 1, z - 2), new BlockPos(x - 3, y - 1, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 10);
		} else if (rnd == 8) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "deepslateruins_9"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 2, y - 1, z - 3), new BlockPos(x - 2, y - 1, z - 3),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 10);
		} else {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("elementure", "deepslateruins_10"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 1, z - 4), new BlockPos(x - 3, y - 1, z - 4),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 10);
		}
	}
}
