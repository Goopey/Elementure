package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class SmallobleckAttackexpireProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			if (Math.random() < 0.5 && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == sourceentity && !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player)
					&& !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof ServerPlayer)) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}
