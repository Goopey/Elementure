package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class CorruptorDropProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.4 + EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING,
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) / 10) {
			if ((EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING,
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) - 2) / 10 < Math.random()) {
				AbyssallootbagLootProcedureProcedure.execute(world, x, y, z, entity);
				AbyssallootbagLootProcedureProcedure.execute(world, x, y, z, entity);
			} else {
				AbyssallootbagLootProcedureProcedure.execute(world, x, y, z, entity);
			}
		}
	}
}
