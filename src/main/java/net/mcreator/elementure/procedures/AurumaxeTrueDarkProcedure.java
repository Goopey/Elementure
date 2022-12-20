package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;

public class AurumaxeTrueDarkProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ElementureModItems.AURUMAXE.get()) {
			entity.getPersistentData().putBoolean("darkACTIVE", (true));
			AurumheldParticlesProcedure.execute(world, entity);
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ElementureModItems.AURUMAXE
				.get()) {
			AurumheldParticlesProcedure.execute(world, entity);
		}
	}
}
