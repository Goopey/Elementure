package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class MycenashroomvillagerblacksmithDefineTradesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("trades", Math.ceil(Math.random() * 4));
		entity.getPersistentData().putDouble("tradeAmount", Math.ceil(Math.random() * 10));
		entity.getPersistentData().putDouble("setTrade", Math.ceil(Math.random() * 20));
	}
}
