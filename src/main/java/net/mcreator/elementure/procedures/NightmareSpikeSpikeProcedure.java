package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.entity.SlumberingGeneralEntity;
import net.mcreator.elementure.entity.SlumberinGeneralOrbEntity;
import net.mcreator.elementure.entity.NightmareSpikeEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class NightmareSpikeSpikeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("ageInTicks") > 15) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.SHADOWPARTICLE_1.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0.4, 0.4, 0.4, 0);
		}
		if (entity.getPersistentData().getDouble("ageInTicks") > 80) {
			if (!entity.level.isClientSide())
				entity.discard();
		} else if (entity.getPersistentData().getDouble("ageInTicks") > 20) {
			if (world.dayTime() % 10 == 0) {
				{
					final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator instanceof NightmareSpikeEntity) && !(entityiterator instanceof SlumberingGeneralEntity) && !(entityiterator instanceof SlumberinGeneralOrbEntity)
								&& !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
								&& !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
							entityiterator.hurt(DamageSource.GENERIC, 1);
						}
					}
				}
			}
		} else if (entity.getPersistentData().getDouble("ageInTicks") == 20) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.azalea_leaves.break")), SoundSource.HOSTILE, (float) 0.25, (float) 0.4);
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.azalea_leaves.break")), SoundSource.HOSTILE, (float) 0.25, (float) 0.4, false);
				}
			}
		} else if (entity.getPersistentData().getDouble("ageInTicks") > 15) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.TELEPORTPARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 5, 0.4, 0.4, 0.4, 0);
		}
		entity.getPersistentData().putDouble("ageInTicks", (entity.getPersistentData().getDouble("ageInTicks") + 1));
	}
}
