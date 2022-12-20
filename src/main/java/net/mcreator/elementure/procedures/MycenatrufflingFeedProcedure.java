package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.MycenatruffloonEntity;

public class MycenatrufflingFeedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == ElementureModItems.MYCENASHROOMITEM.get() && entity.getPersistentData().getDouble("growth") >= 8) {
			if (!entity.level.isClientSide())
				entity.discard();
			for (int index0 = 0; index0 < (int) (6); index0++) {
				MycenashroomcloudProcedure.execute(world, (entity.getX()), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z()));
			}
			(itemstack).shrink(1);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MycenatruffloonEntity(ElementureModEntities.MYCENATRUFFLOON.get(), _level);
				entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (itemstack.getItem() == ElementureModItems.MYCENASHROOMITEM.get() && entity.getPersistentData().getDouble("growth") < 8) {
			(itemstack).shrink(1);
			entity.getPersistentData().putDouble("growth", (entity.getPersistentData().getDouble("growth") + 2 - Math.random()));
		}
	}
}
