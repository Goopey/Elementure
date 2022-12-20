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
import net.mcreator.elementure.entity.MycenashroomvillagerpriestEntity;
import net.mcreator.elementure.entity.MycenashroomvillagerlibrarianEntity;
import net.mcreator.elementure.entity.MycenashroomvillagerleatherworkerEntity;
import net.mcreator.elementure.entity.MycenashroomvillagerfarmerEntity;
import net.mcreator.elementure.entity.MycenashroomvillagerblacksmithEntity;
import net.mcreator.elementure.entity.MycenashroomvillagerNitwitEntity;
import net.mcreator.elementure.entity.MycenashroomvillagerFishermanEntity;

public class NorthmycenahousesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsZ = 0;
		MycenahousepillargenProcedure.execute(world, x, (y + 1), (z - 3));
		MycenahousepillargenProcedure.execute(world, x, (y - 1), (z + 3));
		MycenahousepillargenProcedure.execute(world, x, (y - 1), (z + 2));
		MycenahousepillargenProcedure.execute(world, x, (y - 1), (z + 1));
		MycenahousepillargenProcedure.execute(world, (x - 1), (y - 1), (z + 3));
		MycenahousepillargenProcedure.execute(world, (x - 1), (y - 1), (z + 2));
		MycenahousepillargenProcedure.execute(world, (x - 1), (y - 1), (z + 1));
		MycenahousepillargenProcedure.execute(world, (x + 1), (y - 1), (z + 1));
		MycenahousepillargenProcedure.execute(world, (x + 1), (y - 1), (z + 2));
		MycenahousepillargenProcedure.execute(world, (x + 1), (y - 1), (z + 3));
		MycenahousepillargenProcedure.execute(world, (x + 2), (y - 1), (z + 2));
		MycenahousepillargenProcedure.execute(world, (x - 2), (y - 1), (z + 2));
		if (Math.random() < 0.14) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mycena_farm_house_north"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 5, y, z - 5), new BlockPos(x - 5, y, z - 5),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MycenashroomvillagerfarmerEntity(ElementureModEntities.MYCENASHROOMVILLAGERFARMER.get(), _level);
				entityToSpawn.moveTo(x, (y + 2), (z + 2), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (Math.random() < 0.28 && Math.random() > 0.14) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mycena_leatherworker_house_north"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 5, y, z - 5), new BlockPos(x - 5, y, z - 5),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MycenashroomvillagerleatherworkerEntity(ElementureModEntities.MYCENASHROOMVILLAGERLEATHERWORKER.get(),
						_level);
				entityToSpawn.moveTo(x, (y + 2), (z + 2), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (Math.random() < 0.42 && Math.random() > 0.28) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mycena_librarian_house_north"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 5, y, z - 5), new BlockPos(x - 5, y, z - 5),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MycenashroomvillagerlibrarianEntity(ElementureModEntities.MYCENASHROOMVILLAGERLIBRARIAN.get(), _level);
				entityToSpawn.moveTo(x, (y + 2), (z + 2), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (Math.random() < 0.56 && Math.random() > 0.42) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mycena_priest_house_north"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 5, y, z - 5), new BlockPos(x - 5, y, z - 5),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MycenashroomvillagerpriestEntity(ElementureModEntities.MYCENASHROOMVILLAGERPRIEST.get(), _level);
				entityToSpawn.moveTo(x, (y + 2), (z + 2), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (Math.random() < 0.7 && Math.random() > 0.56) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mycena_regular_house_north"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 5, y, z - 5), new BlockPos(x - 5, y, z - 5),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MycenashroomvillagerNitwitEntity(ElementureModEntities.MYCENASHROOMVILLAGER_NITWIT.get(), _level);
				entityToSpawn.moveTo(x, (y + 2), (z + 2), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (Math.random() < 0.84 && Math.random() > 0.7) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mycena_fisherman_north"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 5, y, z - 5), new BlockPos(x - 5, y, z - 5),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MycenashroomvillagerFishermanEntity(ElementureModEntities.MYCENASHROOMVILLAGER_FISHERMAN.get(), _level);
				entityToSpawn.moveTo(x, (y + 2), (z + 2), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mycena_smith_house_north"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 5, y, z - 5), new BlockPos(x - 5, y, z - 5),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MycenashroomvillagerblacksmithEntity(ElementureModEntities.MYCENASHROOMVILLAGERBLACKSMITH.get(), _level);
				entityToSpawn.moveTo(x, (y + 2), (z + 2), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
