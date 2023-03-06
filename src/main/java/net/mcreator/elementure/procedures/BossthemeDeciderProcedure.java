package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.entity.UmbrasylEntity;
import net.mcreator.elementure.entity.SirenqueenEntity;

public class BossthemeDeciderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(UmbrasylEntity.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 256, 256, 256), e -> true).isEmpty()) {
			{
				String _setval = "umbrasyl";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.musicName = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (!world.getEntitiesOfClass(SirenqueenEntity.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 256, 256, 256), e -> true).isEmpty()) {
			{
				String _setval = "sirenqueen";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.musicName = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (Math.random() < 0.75) {
			BiomethemeDeciderProcedure.execute(world, x, y, z, entity);
		} else {
			{
				String _setval = "";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.musicName = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
