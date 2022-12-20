package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class NetherumleaperTeleportProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double tpX = 0;
		double tpZ = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) && Math.random() < 0.005) {
			tpX = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() + Math.random() * 2 - 1;
			tpZ = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() + Math.random() * 2 - 1;
			{
				Entity _ent = entity;
				_ent.teleportTo(tpX, ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()), tpZ);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(tpX, ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()), tpZ,
							_ent.getYRot(), _ent.getXRot());
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.SOULFLAME.get()), tpX,
						((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()), tpZ, 25, 0.3, 0.3, 0.3, 0.01);
		}
	}
}
