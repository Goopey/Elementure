package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class StarguardianstandChecksProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean isTamed = false;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.WHITE_ASH, (entity.getX()), (entity.getY() + 0.7), (entity.getZ()), 3, 0.2, 0.2, 0.2, 0.05);
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if ((entityiterator instanceof Player || entityiterator instanceof ServerPlayer) && (entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
					isTamed = true;
				}
			}
		}
		if (!isTamed) {
			if (entity.getPersistentData().getDouble("familiartime") < -3) {
				if (!entity.level.isClientSide())
					entity.discard();
			} else {
				entity.getPersistentData().putDouble("familiartime", (entity.getPersistentData().getDouble("familiartime") - 1));
			}
		} else if (entity.getPersistentData().getDouble("familiartime") <= 10) {
			entity.getPersistentData().putDouble("familiartime", (entity.getPersistentData().getDouble("familiartime") + 1));
		}
	}
}
