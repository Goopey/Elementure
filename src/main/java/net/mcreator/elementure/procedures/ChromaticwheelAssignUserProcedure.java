package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.Comparator;

public class ChromaticwheelAssignUserProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world
				.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 0.1, 0.1, 0.1), e -> true)
				.isEmpty()) {
			entity.getPersistentData().putString("playerName",
					(((Entity) world.getEntitiesOfClass(Player.class,
							AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 0.1, 0.1, 0.1), e -> true).stream()
							.sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf((entity.getX()), (entity.getY()), (entity.getZ()))).findFirst().orElse(null)).getDisplayName()
							.getString()));
		} else if (!world.getEntitiesOfClass(ServerPlayer.class,
				AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 0.1, 0.1, 0.1), e -> true).isEmpty()) {
			entity.getPersistentData().putString("playerName",
					(((Entity) world
							.getEntitiesOfClass(ServerPlayer.class,
									AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 0.1, 0.1, 0.1), e -> true)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf((entity.getX()), (entity.getY()), (entity.getZ()))).findFirst().orElse(null)).getDisplayName()
							.getString()));
		}
	}
}
