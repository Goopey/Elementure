package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.elementure.entity.MycenashroomlordEntity;
import net.mcreator.elementure.entity.MycenafumoonshroomlordEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class MycenafumoonsporeSpecialBehaviorProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("isDropBomb")) {
			entity.setDeltaMovement(new Vec3(0, (-0.75), 0));
			if (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ())).canOcclude()) {
				if (!entity.level.isClientSide())
					entity.discard();
				MycenashroomcloudProcedure.execute(world, x, y, z);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), 1, Explosion.BlockInteraction.BREAK);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getY()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level,
									4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/effect give @e[distance=0.1..4] minecraft_worlds:mycenanspores 6 0");
			}
		}
		if (entity.getPersistentData().getBoolean("isHealer")) {
			if (entity.getPersistentData().getDouble("healWait") == 40) {
				entity.getPersistentData().putDouble("healWait", 0);
				{
					final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof MycenashroomlordEntity) {
							if (entityiterator instanceof LivingEntity _entity)
								_entity.setHealth((float) ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 15));
						}
						if (entityiterator instanceof MycenafumoonshroomlordEntity) {
							if (entityiterator instanceof LivingEntity _entity)
								_entity.setHealth((float) ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 20));
						}
					}
				}
			} else {
				entity.getPersistentData().putDouble("healWait", (entity.getPersistentData().getDouble("healWait") + 1));
			}
		}
	}
}
