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

public class EnergydioritehouseGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			if (Math.random() < 0.5) {
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
									.getOrCreate(new ResourceLocation("elementure", "energydiorite_house"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 3), new BlockPos(x - 4, y, z - 3),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
						EnergydioritehousepillarProcedure.execute(world, (x + 4), (y - 1), (z - 3));
						EnergydioritehousepillarProcedure.execute(world, (x - 4), (y - 1), (z - 3));
						EnergydioritehousepillarProcedure.execute(world, (x - 4), (y - 1), (z + 2));
						EnergydioritehousepillarProcedure.execute(world, (x + 4), (y - 1), (z + 2));
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 20);
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
									.getOrCreate(new ResourceLocation("elementure", "energydiorite_temple"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
						EnergydioritehousepillarProcedure.execute(world, (x + 2), (y - 1), (z - 2));
						EnergydioritehousepillarProcedure.execute(world, (x - 2), (y - 1), (z - 2));
						EnergydioritehousepillarProcedure.execute(world, (x - 2), (y - 1), (z + 2));
						EnergydioritehousepillarProcedure.execute(world, (x + 2), (y - 1), (z + 2));
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 20);
			}
		}
	}
}
