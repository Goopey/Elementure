package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.TarspiritEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class TarspiritstaffSummonProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (TarspiritstaffGlowProcedure.execute(entity)) {
			{
				double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).dark_essence - 33;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.dark_essence = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			for (int index0 = 0; index0 < (int) (2 + Math.round((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).dark_essence / 33)); index0++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new TarspiritEntity(ElementureModEntities.TARSPIRIT.get(), _level);
					entityToSpawn.moveTo((entity.getX() - 2 + Math.round(Math.random() * 4)), (entity.getY() + 2 + Math.round(Math.random() * 2)),
							(entity.getZ() - 2 + Math.round(Math.random() * 4)), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				{
					final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 2), (entity.getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof TarspiritEntity) {
							if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
								_toTame.tame(_owner);
						}
					}
				}
			}
		}
	}
}
