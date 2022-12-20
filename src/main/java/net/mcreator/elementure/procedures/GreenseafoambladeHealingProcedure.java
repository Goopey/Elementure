package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class GreenseafoambladeHealingProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("previousHealth") < (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 1));
			itemstack.getOrCreateTag().putDouble("previousHealth", (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1));
		} else if (itemstack.getOrCreateTag().getDouble("previousHealth") != (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
			itemstack.getOrCreateTag().putDouble("previousHealth", (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1));
		}
	}
}
