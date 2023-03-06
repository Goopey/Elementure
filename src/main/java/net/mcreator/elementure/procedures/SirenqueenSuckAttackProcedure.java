package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.entity.SirenqueenEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class SirenqueenSuckAttackProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.HOSTILE, (float) 1.2, (float) 0.6);
			} else {
				_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.HOSTILE, (float) 1.2, (float) 0.6, false);
			}
		}
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator instanceof SirenqueenEntity) && !(entityiterator instanceof SirenqueenEntity) && !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
					entityiterator.setDeltaMovement(new Vec3(((entity.getX() - entityiterator.getX()) / 7), 0.1, ((entity.getZ() - entityiterator.getZ()) / 7)));
					if (entityiterator instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 120, 1));
				}
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.JELLYBUBBLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 40, 0.5, 0.5, 0.5, 0.03);
	}
}
