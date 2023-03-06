package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class MycenaadultmobsquickDespawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("lifetime") < 900) {
			entity.getPersistentData().putDouble("lifetime", (entity.getPersistentData().getDouble("lifetime") + 1));
		} else {
			entity.getPersistentData().putDouble("lifetime", 0);
			if (Math.random() < 0.25) {
				if (!(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 32, 32, 32), e -> true).isEmpty())
						&& !(!world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 32, 32, 32), e -> true).isEmpty())) {
					if (!entity.level.isClientSide())
						entity.discard();
				}
			}
		}
	}
}
