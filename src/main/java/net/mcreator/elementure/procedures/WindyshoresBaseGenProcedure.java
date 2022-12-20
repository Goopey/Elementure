package net.mcreator.elementure.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class WindyshoresBaseGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		double locY = 0;
		double HEIGHT_GEN = 0;
		double BEDROCK_BOTTOM = 0;
		double WORLD_MID = 0;
		locX = x + Math.random() * 40 - 20;
		locZ = z + Math.random() * 40 - 20;
		if (!((world.getBlockState(new BlockPos(locX, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) locX, (int) locZ) - 1, locZ)))
				.getBlock() instanceof LiquidBlock)) {
			WindyshoregeyserGenProcedure.execute(world, locX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) locX, (int) locZ)),
					locZ);
		} else {
			WindyshoregeyserGenProcedure.execute(world, x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z);
		}
		locX = -80;
		locZ = -80;
		locY = 0;
		HEIGHT_GEN = 88;
		WORLD_MID = 204;
		BEDROCK_BOTTOM = -64;
		for (int index0 = 0; index0 < (int) (25921); index0++) {
			if (!((world.getBlockState(new BlockPos(x + locX, BEDROCK_BOTTOM, z + locZ))).getBlock() == ElementureModBlocks.PERVADEDBEDROCK.get())) {
				world.setBlock(new BlockPos(x + locX, BEDROCK_BOTTOM, z + locZ), ElementureModBlocks.PERVADEDBEDROCK.get().defaultBlockState(), 3);
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x + locX, BEDROCK_BOTTOM, z + locZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putBoolean("windyshoresUsed", (true));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (Math.random() < 0.0012) {
					for (int index1 = 0; index1 < (int) (8); index1++) {
						if (Math.random() < 0.2) {
							if (Math.random() < 0.88) {
								WindyshoresIslandPatchGenProcedure.execute(world, ((x + locX) - 5 + Math.random() * 10),
										(HEIGHT_GEN + locY * 24 + Math.random() * 6), ((z + locZ) - 5 + Math.random() * 10));
							} else {
								WortashGenProcedure.execute(world, ((x + locX) - 5 + Math.random() * 10),
										(HEIGHT_GEN + locY * 24 + Math.random() * 6), ((z + locZ) - 5 + Math.random() * 10));
							}
						}
						locY = locY + 1;
					}
					locY = 0;
				}
			}
			locX = locX + 1;
			if (locX >= 80) {
				locX = -80;
				locZ = locZ + 1;
				if (locZ >= 80) {
					locX = -80;
					locZ = -80;
				}
			}
		}
		locY = 0;
		for (int index2 = 0; index2 < (int) (8); index2++) {
			WindyshoresgeysersmallPlaceProcedure.execute(world, (x - 60 + Math.random() * 120), (HEIGHT_GEN + locY * 27 + Math.random() * 3),
					(z - 60 + Math.random() * 120));
			locY = locY + 1;
		}
		WORLD_MID = 204;
		for (int index3 = 0; index3 < (int) (1 + Math.round(Math.random() * 2)); index3++) {
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
					IvorytowerGenProcedure.execute(world, (x - 60 + Math.random() * 120), (204 + Math.random() * 96 - 48),
							(z - 60 + Math.random() * 120));
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 20);
		}
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
							.getOrCreate(new ResourceLocation("elementure", "windyshores_starry_beach"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 8, 270, z - 8), new BlockPos(x - 8, 270, z - 8),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 40);
	}
}
