package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.elementure.network.ElementureModVariables;

import java.util.Comparator;

public class ForgottenwatchertransparentProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 16, 16, 16), e -> true)
				.isEmpty()) {
			if ((((Entity) world
					.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 16, 16, 16), e -> true)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf((entity.getX()), (entity.getY()), (entity.getZ()))).findFirst().orElse(null))
					.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).sanity < 500) {
				return false;
			}
		} else if (!world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 16, 16, 16),
				e -> true).isEmpty()) {
			if ((((Entity) world.getEntitiesOfClass(ServerPlayer.class,
					AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 16, 16, 16), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf((entity.getX()), (entity.getY()), (entity.getZ()))).findFirst().orElse(null))
					.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).sanity < 500) {
				return false;
			}
		}
		return true;
	}
}
