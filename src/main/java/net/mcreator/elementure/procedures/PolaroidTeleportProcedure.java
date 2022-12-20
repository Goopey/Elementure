package net.mcreator.elementure.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class PolaroidTeleportProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("allow_teleport")) {
			if (itemstack.getOrCreateTag().getDouble("dimension_id") == new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert("" + (world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD))) {
				entity.getPersistentData().putBoolean("memory_teleporting", (true));
				entity.getPersistentData().putDouble("memory_teleporting_x", (itemstack.getOrCreateTag().getDouble("teleport_x")));
				entity.getPersistentData().putDouble("memory_teleporting_y", (itemstack.getOrCreateTag().getDouble("teleport_y")));
				entity.getPersistentData().putDouble("memory_teleporting_z", (itemstack.getOrCreateTag().getDouble("teleport_z")));
				entity.getPersistentData().putString("memorial_type", (itemstack.getOrCreateTag().getString("memorial_teleport_type")));
				(itemstack).shrink(1);
			} else {
				if (world.isClientSide()) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("This isn't the right dimension."), (true));
				}
			}
		}
	}
}
