package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModParticleTypes;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class ObleckExplodeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("isBomb")) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.SOULFLAME.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 30, 1, 1, 1, (-0.1));
			entity.getPersistentData().putDouble("bombWait", (entity.getPersistentData().getDouble("bombWait") + 1));
			if (entity.getPersistentData().getDouble("bombWait") >= 40) {
				{
					final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
							entityiterator.hurt(DamageSource.STARVE, 5);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.snow.fall")), SoundSource.NEUTRAL, 1, (float) 0.2);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.snow.fall")), SoundSource.NEUTRAL, 1, (float) 0.2, false);
								}
							}
						}
					}
				}
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
		ObleckDashProcedure.execute(world, entity);
	}
}
