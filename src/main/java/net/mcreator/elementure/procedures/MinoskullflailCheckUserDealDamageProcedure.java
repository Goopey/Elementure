package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.entity.MinoskullflaibulletEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class MinoskullflailCheckUserDealDamageProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean staySpawned = false;
		double dist = 0;
		double playX = 0;
		double playY = 0;
		double playZ = 0;
		double yaw = 0;
		double yaw2 = 0;
		double pitch = 0;
		double pitch2 = 0;
		staySpawned = false;
		dist = 1;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.5 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator instanceof MinoskullflaibulletEntity)
						&& !(entityiterator.getDisplayName().getString()).equals(entity.getPersistentData().getString("playerName"))
						&& !(entityiterator instanceof ItemEntity) && !(entityiterator instanceof ItemFrame)) {
					entityiterator.hurt(DamageSource.GENERIC,
							(float) (8 / (Math.floor((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) / 3) + 1)));
				}
			}
		}
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
					if ((entityiterator.getDisplayName().getString()).equals(entity.getPersistentData().getString("playerName"))
							&& ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
									.getItem() == ElementureModItems.MINOSKULLSTICK.get()
									|| (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
											.getItem() == ElementureModItems.MINOSKULLSTICK.get())) {
						staySpawned = true;
						playX = entityiterator.getX();
						playY = entityiterator.getY() + 1.2;
						playZ = entityiterator.getZ();
					}
				}
			}
		}
		if (!staySpawned) {
			if (!entity.level.isClientSide())
				entity.discard();
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					entityiterator.getPersistentData().putDouble("flailwait", 0);
				}
			}
		}
		for (int index0 = 0; index0 < (int) (15); index0++) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.MINOSKULLFLAIL_PARTICLE.get()),
						(entity.getX() + (dist * (entity.getX() - playX)) / (-15)), (entity.getY() + (dist * (entity.getY() - playY)) / (-15)),
						(entity.getZ() + (dist * (entity.getZ() - playZ)) / (-15)), 1, 0, 0, 0, 0);
			dist = dist + 1;
		}
	}
}
