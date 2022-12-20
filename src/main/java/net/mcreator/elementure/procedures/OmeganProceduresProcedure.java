package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class OmeganProceduresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "omeganProcedure")).equals("swordTempleBase")) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			SwordtempleBaseGenProcedure.execute(world, x, y, z);
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "omeganProcedure")).equals("swordTempleBase")) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			SwordtempleBaseGenProcedure.execute(world, x, y, z);
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "omeganProcedure")).equals("ruinGranite")) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			RuinGraniteEyeBiomeProcedure.execute(world, x, y, z);
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "omeganProcedure")).equals("energyDiorite")) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			EnergydioritecoreBiomeProcedure.execute(world, x, y, z);
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "omeganProcedure")).equals("lightningAndesite")) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			LightningandesitesuperchargedBiomeProcedure.execute(world, x, y, z);
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "omeganProcedure")).equals("memoryGrotto")) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			MemorygrottoSpawnHeartProcedure.execute(world, x, y, z);
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "omeganProcedure")).equals("smallDeepRuins")) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			DeepruinsRandomStructureProcedure.execute(world, x, y, z);
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "omeganProcedure")).equals("deepRuins")) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			DeepRuinsBaseGenProcedure.execute(world, x, y, z);
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "omeganProcedure")).equals("grayskullLake")) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			GrayskulllakeGenProcedure.execute(world, x, y, z);
		} else {
			OmeganProcedures2Procedure.execute(world, x, y, z);
		}
	}
}
