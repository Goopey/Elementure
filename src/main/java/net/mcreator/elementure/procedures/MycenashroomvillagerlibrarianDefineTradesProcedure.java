package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class MycenashroomvillagerlibrarianDefineTradesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("trades", Math.ceil(Math.random() * 4));
		entity.getPersistentData().putDouble("tradeAmount", Math.ceil(Math.random() * 10));
		entity.getPersistentData().putDouble("enchantType", Math.ceil(Math.random() * 38));
		entity.getPersistentData().putDouble("enchantLevel2", (1 + Math.ceil(Math.random())));
		entity.getPersistentData().putDouble("enchantLevel3", (1 + Math.ceil(Math.random() * 2)));
		entity.getPersistentData().putDouble("enchantLevel4", (1 + Math.ceil(Math.random() * 3)));
		entity.getPersistentData().putDouble("enchantLevel5", (1 + Math.ceil(Math.random() * 4)));
	}
}
