package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class BubbleexplodeTimerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("bubbleExplosionTimer") > Math.max(entity.getPersistentData().getDouble("bubbleExplosionAge"), 60)) {
			entity.hurt(DamageSource.GENERIC, 1024);
		} else {
			entity.getPersistentData().putDouble("bubbleExplosionTimer", (entity.getPersistentData().getDouble("bubbleExplosionTimer") + 1));
		}
	}
}
