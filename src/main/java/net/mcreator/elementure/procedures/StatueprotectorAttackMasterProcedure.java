package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.StatuewraithEntity;
import net.mcreator.elementure.entity.StatueprotectorEntity;
import net.mcreator.elementure.entity.NoobiumchannelerEntity;
import net.mcreator.elementure.entity.AndesiteelementalEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class StatueprotectorAttackMasterProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double moveX = 0;
		double moveZ = 0;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.MOVEMENT_SLOWDOWN) : false) {
			entity.getPersistentData().putDouble("attackWait", (entity.getPersistentData().getDouble("attackWait") + 1));
		} else {
			entity.getPersistentData().putDouble("attackWait", (entity.getPersistentData().getDouble("attackWait") + 2));
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DAMAGE_RESISTANCE) : false) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.SOULFLAME.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 8, 0.1, 0.1, 0.1, 0.1);
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) : false) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FALLING_LAVA, (entity.getX()), (entity.getY()), (entity.getZ()), 8, 0.1, 0.1, 0.1, 0.1);
		}
		if (entity.getPersistentData().getDouble("attackWait") == 400 && Math.random() < 0.5) {
			if (Math.random() < 0.5) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200, 0, (false), (false)));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.elder_guardian.curse")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.elder_guardian.curse")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 2, (false), (false)));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:dungeon_breath")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:dungeon_breath")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.chorus_flower.death")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.chorus_flower.death")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			entity.getPersistentData().putDouble("attackWait", 0);
		} else if (entity.getPersistentData().getDouble("attackWait") >= 600) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, (entity.getX()), (entity.getY()), (entity.getZ()), 2, 0.1, 0.1, 0.1, 0.1);
			if (Math.random() < 0.5 && entity.getPersistentData().getBoolean("summonedMinions") == false) {
				for (int index0 = 0; index0 < (int) (Math.random() * 2 + 2); index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new StatuewraithEntity(ElementureModEntities.STATUEWRAITH.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
				entity.getPersistentData().putBoolean("summonedMinions", (true));
			} else {
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new NoobiumchannelerEntity(ElementureModEntities.NOOBIUMCHANNELER.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 3, 3);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			}
			entity.getPersistentData().putDouble("attackWait", 0);
		}
		if (!world.getEntitiesOfClass(AndesiteelementalEntity.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty() || !world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty()) {
			if (entity.getPersistentData().getDouble("playerProxTime") < -300) {
				entity.getPersistentData().putDouble("playerProxTime", (-150));
			}
			entity.getPersistentData().putDouble("playerProxTime", (entity.getPersistentData().getDouble("playerProxTime") + 1));
		} else {
			if (entity.getPersistentData().getDouble("playerProxTime") > 300) {
				entity.getPersistentData().putDouble("playerProxTime", 150);
			}
			entity.getPersistentData().putDouble("playerProxTime", (entity.getPersistentData().getDouble("playerProxTime") - 1));
		}
		if (entity.getPersistentData().getDouble("playerProxTime") > 300) {
			if (entity.getPersistentData().getDouble("playerProxTime") < 320) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, (entity.getX()), (entity.getY()), (entity.getZ()), 10, 1.8, 1.8, 1.8, 0.1);
			} else {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.WHITE_ASH, (entity.getX()), (entity.getY()), (entity.getZ()), 25, 1.8, 1.8, 1.8, 0.1);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(24 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator instanceof StatueprotectorEntity) && !(entityiterator instanceof StatuewraithEntity)) {
							entityiterator.setDeltaMovement(new Vec3((entityiterator.getX() - entity.getX()), 0.2, (entityiterator.getZ() - entity.getZ())));
						}
					}
				}
				entity.getPersistentData().putDouble("playerProxTime", 0);
			}
		} else if (entity.getPersistentData().getDouble("playerProxTime") < -300) {
			if (entity.getPersistentData().getDouble("playerProxTime") > -320) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, (entity.getX()), (entity.getY()), (entity.getZ()), 10, 1.8, 1.8, 1.8, 0.1);
			} else {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.WHITE_ASH, (entity.getX()), (entity.getY()), (entity.getZ()), 25, 1.8, 1.8, 1.8, 0.1);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(24 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator instanceof StatueprotectorEntity) && !(entityiterator instanceof StatuewraithEntity)) {
							entityiterator.setDeltaMovement(new Vec3((entityiterator.getX() - entity.getX()), 0.2, (entityiterator.getZ() - entity.getZ())));
						}
					}
				}
				entity.getPersistentData().putDouble("playerProxTime", 0);
			}
		}
	}
}
