package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.TwistedknightEntity;
import net.mcreator.elementure.entity.GreedyknightEntity;
import net.mcreator.elementure.entity.CruelknightEntity;
import net.mcreator.elementure.entity.CausticknightEntity;

public class SwordtempleStartGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rnd = 0;
		WaterclearerClearProcedure.execute(world, x, y, z);
		rnd = Math.random();
		if (rnd < 0.25) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_twistedknight_start"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 6, y, z - 6), new BlockPos(x - 6, y, z - 6),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new TwistedknightEntity(ElementureModEntities.TWISTEDKNIGHT.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (rnd < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_greedyknight_start"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 6, y, z - 6), new BlockPos(x - 6, y, z - 6),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new GreedyknightEntity(ElementureModEntities.GREEDYKNIGHT.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (rnd < 0.75) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_cruelknight_start"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 6, y, z - 6), new BlockPos(x - 6, y, z - 6),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new CruelknightEntity(ElementureModEntities.CRUELKNIGHT.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_causticknight_start"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 6, y, z - 6), new BlockPos(x - 6, y, z - 6),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new CausticknightEntity(ElementureModEntities.CAUSTICKNIGHT.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
