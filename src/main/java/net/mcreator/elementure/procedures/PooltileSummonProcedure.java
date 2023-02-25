package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.LargejellyEntity;

public class PooltileSummonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(!world.getEntitiesOfClass(LargejellyEntity.class, AABB.ofSize(new Vec3(x, y, z), 64, 64, 64), e -> true).isEmpty())) {
			if (Math.random() < 0.25 && world.isEmptyBlock(new BlockPos(x - 4, y, z))) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new LargejellyEntity(ElementureModEntities.LARGEJELLY.get(), _level);
					entityToSpawn.moveTo((x - 4), y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() < 0.33 && world.isEmptyBlock(new BlockPos(x + 4, y, z))) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new LargejellyEntity(ElementureModEntities.LARGEJELLY.get(), _level);
					entityToSpawn.moveTo((x + 4), y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() < 0.5 && world.isEmptyBlock(new BlockPos(x, y, z - 4))) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new LargejellyEntity(ElementureModEntities.LARGEJELLY.get(), _level);
					entityToSpawn.moveTo(x, y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (world.isEmptyBlock(new BlockPos(x, y, z + 4))) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new LargejellyEntity(ElementureModEntities.LARGEJELLY.get(), _level);
					entityToSpawn.moveTo(x, y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Not enough space to summon the boss"), (true));
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You cannot summon two bosses at once."), (true));
		}
	}
}
