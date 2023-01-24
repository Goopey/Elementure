package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
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

public class SpiderqueenDamageProcedure {
	public static void execute(LevelAccessor world, Entity sourceentity) {
		if (sourceentity == null)
			return;
		double poisonDamage = 0;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double yaw = 0;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.POISON) : false)
				&& !sourceentity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
				&& !sourceentity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))
				&& world.dayTime() % 10 == 0) {
			poisonDamage = ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON)
					? _livEnt.getEffect(MobEffects.POISON).getAmplifier()
					: 0) + 1)
					* 0.8
					* (sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON)
							? _livEnt.getEffect(MobEffects.POISON).getDuration()
							: 0)
					* 0.05;
			if (sourceentity instanceof LivingEntity _entity)
				_entity.setHealth((float) Math.max(1,
						(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - Math.round(poisonDamage * 0.4)));
			if (sourceentity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.POISON);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ()),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.egg_crack")), SoundSource.NEUTRAL, (float) 1.1,
							(float) 0.75);
				} else {
					_level.playLocalSound((sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ()),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.egg_crack")), SoundSource.NEUTRAL, (float) 1.1,
							(float) 0.75, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.WORTASHMOSS.get()), (sourceentity.getX()),
						(sourceentity.getY() + 1), (sourceentity.getZ()), 12, 0.2, 0.2, 0.2, 0.01);
			pitch = Math.cos(sourceentity.getXRot() / ((-180) / Math.PI));
			pitch2 = Math.sin(sourceentity.getXRot() / ((-180) / Math.PI));
			yaw = Math.sin(sourceentity.getYRot() / ((-180) / Math.PI));
			yaw2 = Math.cos(sourceentity.getYRot() / ((-180) / Math.PI));
			sourceentity.setDeltaMovement(new Vec3(((yaw * pitch) / 4), (pitch2 / 4), ((yaw2 * pitch) / 4)));
		} else {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 0));
		}
	}
}
