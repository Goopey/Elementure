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
import net.mcreator.elementure.entity.SlumberingGeneralEntity;

public class SpidernestcryptBossRoomGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager()
					.getOrCreate(new ResourceLocation("elementure", "spidernest_cryptroom_boss"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 9, y - 6, z - 9), new BlockPos(x - 9, y - 6, z - 9),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new SlumberingGeneralEntity(ElementureModEntities.SLUMBERING_GENERAL.get(), _level);
			entityToSpawn.moveTo((x + 0.5), (y - 4.5), (z + 6.5), 180, 0);
			entityToSpawn.setYBodyRot(180);
			entityToSpawn.setYHeadRot(180);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
	}
}
