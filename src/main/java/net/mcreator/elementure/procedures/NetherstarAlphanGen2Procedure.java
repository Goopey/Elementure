package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;
import net.mcreator.elementure.ElementureMod;

public class NetherstarAlphanGen2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "netherstarAGenRole") == 8) {
			PrismaticcrystalGenProcedure.execute(world, x, y, z);
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "netherstarAGenRole") == 9) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.ACTIVENETHERUM.get().defaultBlockState(), 3);
			NetherstarStalagtiteGenProcedure.execute(world, x, y, z);
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "netherstarAGenRole") == 10) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.BABYNETHERSTARBLOCK.get().defaultBlockState(), 3);
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "babystar"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 2, y - 2, z - 2), new BlockPos(x - 2, y - 2, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "netherstarAGenRole") == 11) {
			NethertstarStalagitebigGenProcedure.execute(world, x, y, z);
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "netherstarAGenRole") == 12) {
			ElementureMod.queueServerWork(20, () -> {
				if (Math.random() < 0.66) {
					if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ElementureModBlocks.PRISMATICCRYSTALBLOCK.get()) {
						world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.PRISMATICCRYSTALBLOCK.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.ACTIVENETHERUM.get().defaultBlockState(), 3);
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x, y + 1, z), ElementureModBlocks.PRISMATICSPROUT.get().defaultBlockState(), 3);
						PrismaticsproutspreadGenProcedure.execute(world, x, (y + 1), z);
					} else if ((world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == Blocks.AIR) {
						if (!((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.PRISMATICSPROUT.get())) {
							world.setBlock(new BlockPos(x, y + 2, z), ElementureModBlocks.PRISMATICSPROUT.get().defaultBlockState(), 3);
							PrismaticsproutspreadGenProcedure.execute(world, x, (y + 2), z);
						}
					} else if ((world.getBlockState(new BlockPos(x, y + 3, z))).getBlock() == Blocks.AIR) {
						if (!((world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == ElementureModBlocks.PRISMATICSPROUT.get())) {
							world.setBlock(new BlockPos(x, y + 3, z), ElementureModBlocks.PRISMATICSPROUT.get().defaultBlockState(), 3);
							PrismaticsproutspreadGenProcedure.execute(world, x, (y + 3), z);
						}
					} else if ((world.getBlockState(new BlockPos(x, y + 4, z))).getBlock() == Blocks.AIR) {
						if (!((world.getBlockState(new BlockPos(x, y + 3, z))).getBlock() == ElementureModBlocks.PRISMATICSPROUT.get())) {
							world.setBlock(new BlockPos(x, y + 4, z), ElementureModBlocks.PRISMATICSPROUT.get().defaultBlockState(), 3);
							PrismaticsproutspreadGenProcedure.execute(world, x, (y + 4), z);
						}
					}
				} else if (Math.random() < 0.33) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "bigprismaticcrystal"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 1, y - Math.round(Math.random() * 3), z - 1), new BlockPos(x - 1, y - Math.round(Math.random() * 3), z - 1),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "prismaticcrystal"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, (y + 1) - Math.round(Math.random()), z), new BlockPos(x, (y + 1) - Math.round(Math.random()), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			});
		} else {
			NetherstarAlphanGen3Procedure.execute(world, x, y, z);
		}
	}
}
