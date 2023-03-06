package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class TarwormChargeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * 0.88), (entity.getDeltaMovement().y() * 0.88), (entity.getDeltaMovement().z() * 0.88)));
		}
	}
}
