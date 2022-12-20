package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class MycenashroomvillagerpriestDefineTradesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("trades", Math.ceil(Math.random() * 4));
		entity.getPersistentData().putDouble("tradeAmount", Math.ceil(Math.random() * 10));
		entity.getPersistentData().putDouble("rareTrade", Math.ceil(Math.random() * 20));
	}
}
