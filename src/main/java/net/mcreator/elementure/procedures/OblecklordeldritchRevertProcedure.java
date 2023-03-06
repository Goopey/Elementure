package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.OblecklordEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class OblecklordeldritchRevertProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getBlockState(new BlockPos(x, y, z)).canOcclude() && world.getBlockState(new BlockPos(x, y - 1, z)).canOcclude()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new OblecklordEntity(ElementureModEntities.OBLECKLORD.get(), _level);
				entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof OblecklordEntity) {
						if (entityiterator instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				}
			}
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
