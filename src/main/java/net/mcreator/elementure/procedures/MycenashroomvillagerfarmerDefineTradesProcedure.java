package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class MycenashroomvillagerfarmerDefineTradesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("trades", Math.round(Math.random() * 4));
		entity.getPersistentData().putDouble("tradeAmount", Math.round(Math.random() * 10));
	}
}
