package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.elementure.entity.TarspiritEntity;

public class TarspiritSpecialTargetingProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)
				&& !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof TarspiritEntity)) {
			if (TarspiritIsOwnedProcedure.execute(entity)) {
				return !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player)
						&& !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof ServerPlayer);
			}
			return (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player
					|| (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof ServerPlayer;
		}
		return false;
	}
}
