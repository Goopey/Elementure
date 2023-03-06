package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.RedsunpillarEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class RedsunSwingProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double pitch = 0;
		double pitch2 = 0;
		double yaw = 0;
		double yaw2 = 0;
		double yaw3 = 0;
		double yaw4 = 0;
		double yaw5 = 0;
		double yaw6 = 0;
		double yaw7 = 0;
		double yaw8 = 0;
		double yaw9 = 0;
		double yaw10 = 0;
		double swordDmg = 0;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 0));
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
		if (itemstack.getOrCreateTag().getBoolean("redSunActive")) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:redsun_super_swing")), SoundSource.PLAYERS, (float) 0.8, (float) 0.6);
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:redsun_super_swing")), SoundSource.PLAYERS, (float) 0.8, (float) 0.6, false);
				}
			}
			if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack) != 0) {
				swordDmg = 1;
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) : false) {
				swordDmg = swordDmg + 3;
			}
			swordDmg = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack)
					+ 3 * (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0);
			{
				double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence - 16;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fire_essence = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
			pitch2 = Math.sin(entity.getXRot() / ((-180) / Math.PI));
			yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
			yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
			yaw3 = Math.sin(entity.getYRot() / ((-180) / Math.PI) + 0.13 * Math.PI);
			yaw4 = Math.cos(entity.getYRot() / ((-180) / Math.PI) + 0.13 * Math.PI);
			yaw5 = Math.sin(entity.getYRot() / ((-180) / Math.PI) - 0.13 * Math.PI);
			yaw6 = Math.cos(entity.getYRot() / ((-180) / Math.PI) - 0.13 * Math.PI);
			yaw7 = Math.sin(entity.getYRot() / ((-180) / Math.PI) + 0.26 * Math.PI);
			yaw8 = Math.cos(entity.getYRot() / ((-180) / Math.PI) + 0.26 * Math.PI);
			yaw9 = Math.sin(entity.getYRot() / ((-180) / Math.PI) - 0.26 * Math.PI);
			yaw10 = Math.cos(entity.getYRot() / ((-180) / Math.PI) - 0.26 * Math.PI);
			world.addParticle((SimpleParticleType) (ElementureModParticleTypes.REDSUN_SWIPE.get()), (entity.getX() + 1.5 * yaw * pitch), (entity.getY() + 1.22 + 1.5 * pitch2), (entity.getZ() + 1.5 * yaw2 * pitch), 0, 0, 0);
			for (int index0 = 0; index0 < (int) (8); index0++) {
				world.addParticle(ParticleTypes.FLAME, (entity.getX() + 1 * yaw * pitch), (entity.getY() + 1.633 + 0.85 * pitch2), (entity.getZ() + 1 * yaw2 * pitch), ((Math.random() - 0.5) / 4), ((Math.random() - 0.5) / 4),
						((Math.random() - 0.5) / 4));
			}
			for (int index1 = 0; index1 < (int) (4); index1++) {
				world.addParticle(ParticleTypes.FLAME, (entity.getX() + 1.15 * yaw3 * pitch), (entity.getY() + 1.633 + 0.85 * pitch2), (entity.getZ() + 1.15 * yaw4 * pitch), ((Math.random() - 0.5) / 16), ((Math.random() - 0.5) / 16),
						((Math.random() - 0.5) / 16));
				world.addParticle(ParticleTypes.FLAME, (entity.getX() + 1.15 * yaw5 * pitch), (entity.getY() + 1.633 + 0.85 * pitch2), (entity.getZ() + 1.15 * yaw6 * pitch), ((Math.random() - 0.5) / 16), ((Math.random() - 0.5) / 16),
						((Math.random() - 0.5) / 16));
				world.addParticle(ParticleTypes.FLAME, (entity.getX() + 1.45 * yaw7 * pitch), (entity.getY() + 1.633 + 0.85 * pitch2), (entity.getZ() + 1.45 * yaw8 * pitch), ((Math.random() - 0.5) / 16), ((Math.random() - 0.5) / 16),
						((Math.random() - 0.5) / 16));
				world.addParticle(ParticleTypes.FLAME, (entity.getX() + 1.45 * yaw9 * pitch), (entity.getY() + 1.633 + 0.85 * pitch2), (entity.getZ() + 1.45 * yaw10 * pitch), ((Math.random() - 0.5) / 16), ((Math.random() - 0.5) / 16),
						((Math.random() - 0.5) / 16));
			}
			{
				final Vec3 _center = new Vec3((entity.getX() + 0.85 * yaw * pitch), (entity.getY() + 1.633 + 0.85 * pitch2), (entity.getZ() + 0.85 * yaw2 * pitch));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						entityiterator.hurt(DamageSource.IN_FIRE, (float) (20 + swordDmg));
					}
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("redSunOverload") > 0) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:redsun_super_swing")), SoundSource.PLAYERS, (float) 0.6, (float) 0.4);
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:redsun_super_swing")), SoundSource.PLAYERS, (float) 0.6, (float) 0.4, false);
				}
			}
			if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack) != 0) {
				swordDmg = 1;
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) : false) {
				swordDmg = swordDmg + 3;
			}
			swordDmg = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack)
					+ 3 * (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0);
			{
				double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence - 31;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fire_essence = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
			pitch2 = Math.sin(entity.getXRot() / ((-180) / Math.PI));
			yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
			yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
			for (int index2 = 0; index2 < (int) (8); index2++) {
				world.addParticle(ParticleTypes.FLAME, (entity.getX() + 0.85 * yaw * pitch), (entity.getY() + 1.633 + 0.85 * pitch2), (entity.getZ() + 0.85 * yaw2 * pitch), ((Math.random() - 0.5) / 2), ((Math.random() - 0.5) / 2),
						((Math.random() - 0.5) / 2));
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new RedsunpillarEntity(ElementureModEntities.REDSUNPILLAR.get(), _level);
				entityToSpawn.moveTo((entity.getX() + (2 + Math.random()) * yaw * pitch), (entity.getY() + 0.6 + (2 + Math.random()) * pitch2), (entity.getZ() + (2 + Math.random()) * yaw2 * pitch), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			{
				final Vec3 _center = new Vec3((entity.getX() + 0.85 * yaw * pitch), (entity.getY() + 1.633 + 0.85 * pitch2), (entity.getZ() + 0.85 * yaw2 * pitch));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						entityiterator.hurt(DamageSource.IN_FIRE, (float) (28 + swordDmg));
					}
				}
			}
			world.addParticle((SimpleParticleType) (ElementureModParticleTypes.REDSUN_SWIPE.get()), (entity.getX() + 1.5 * yaw * pitch), (entity.getY() + 1.22 + 1.5 * pitch2), (entity.getZ() + 1.5 * yaw2 * pitch), 0, 0, 0);
		} else {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:redsun_swing")), SoundSource.PLAYERS, (float) 0.6, (float) 0.4);
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:redsun_swing")), SoundSource.PLAYERS, (float) 0.6, (float) 0.4, false);
				}
			}
		}
	}
}
