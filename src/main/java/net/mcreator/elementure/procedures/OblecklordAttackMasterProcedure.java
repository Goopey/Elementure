package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
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
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.OblecklordeldritchEntity;
import net.mcreator.elementure.entity.ObleckEntity;
import net.mcreator.elementure.entity.MerthiumchannelerEntity;
import net.mcreator.elementure.ElementureMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class OblecklordAttackMasterProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("shields") >= 1) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 120, 5));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SQUID_INK, (entity.getX()), (entity.getY()), (entity.getZ()), 12, 0, 0, 0, 0);
		}
		if (entity.getPersistentData().getBoolean("attackongoing")) {
			entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y()), 0));
		}
		if (!entity.getPersistentData().getBoolean("attackongoing")) {
			if (entity.getPersistentData().getDouble("attackWait") >= 60 && entity.getPersistentData().getDouble("attackWait") <= 64) {
				if ((!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 2, 2, 2),
						e -> true).isEmpty()
						|| !world.getEntitiesOfClass(ServerPlayer.class,
								AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 2, 2, 2), e -> true).isEmpty())
						&& Math.random() < 0.75) {
					OblecklordSideSwipeProcedure.execute(world, entity);
					entity.getPersistentData().putBoolean("attackongoing", (true));
					entity.getPersistentData().putBoolean("slice", (true));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, 1,
									false);
						}
					}
					ElementureMod.queueServerWork(15, () -> {
						entity.getPersistentData().putBoolean("attackongoing", (false));
						entity.getPersistentData().putBoolean("slice", (false));
					});
				} else if (Math.random() < 0.3) {
					entity.getPersistentData().putBoolean("shootingbullet", (true));
					entity.getPersistentData().putBoolean("attackongoing", (true));
					entity.getPersistentData().putDouble("attackType", 2);
				} else if (Math.random() >= 0.9) {
					for (int index0 = 0; index0 < (int) (3); index0++) {
						OblecklordbombProcedure.execute(world, (x + Math.random() * 12 - 6), y, (z + Math.random() * 12 - 6));
					}
				} else {
					OblecklordAdaptOvercomeProcedure.execute(world, entity);
				}
				entity.getPersistentData().putDouble("attackWait", 0);
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new ObleckEntity(ElementureModEntities.OBLECK.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getPersistentData().getDouble("attackWait") >= 80) {
				if (Math.random() < 0.33) {
					OblecklordLaserProcedure.execute(world, entity);
					entity.getPersistentData().putDouble("attackType", 1);
					entity.getPersistentData().putBoolean("attackongoing", (true));
				} else if (Math.random() >= 0.66 && Math.random() < 0.9 && entity.getPersistentData().getDouble("shields") <= 0) {
					entity.getPersistentData().putDouble("shields", 1);
				} else if (Math.random() >= 0.9) {
					OblecklordAdaptOvercomeProcedure.execute(world, entity);
					entity.getPersistentData().putBoolean("chaosSpeed", (true));
					ElementureMod.queueServerWork(240, () -> {
						entity.getPersistentData().putBoolean("chaosSpeed", (false));
					});
				} else {
					for (int index1 = 0; index1 < (int) (5); index1++) {
						OblecklordbombProcedure.execute(world, (x + Math.random() * 12 - 6), y, (z + Math.random() * 12 - 6));
					}
				}
				entity.getPersistentData().putDouble("attackWait", 0);
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new ObleckEntity(ElementureModEntities.OBLECK.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (Math.random() < 0.33) {
					entity.getPersistentData().putDouble("attackWait", (entity.getPersistentData().getDouble("attackWait") + 1));
				} else if (Math.random() >= 0.33 && Math.random() < 0.66) {
					entity.getPersistentData().putDouble("attackWait", (entity.getPersistentData().getDouble("attackWait") + 2));
				} else if (Math.random() >= 0.66) {
					entity.getPersistentData().putDouble("attackWait", (entity.getPersistentData().getDouble("attackWait") + 6));
				} else if (entity.getPersistentData().getBoolean("chaosSpeed")) {
					entity.getPersistentData().putDouble("attackWait", (entity.getPersistentData().getDouble("attackWait") + 8));
				} else {
					entity.getPersistentData().putDouble("attackWait", (entity.getPersistentData().getDouble("attackWait") + 2));
				}
			}
		} else {
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 12, 12, 12), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 12, 12, 12), e -> true).isEmpty()) {
				entity.getPersistentData().putDouble("playerProxTime", (entity.getPersistentData().getDouble("playerProxTime") + 1));
			} else {
				entity.getPersistentData().putDouble("playerProxTime", (entity.getPersistentData().getDouble("playerProxTime") - 1));
			}
			if (entity.getPersistentData().getDouble("playerProxTime") < -120) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new OblecklordeldritchEntity(ElementureModEntities.OBLECKLORDELDRITCH.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				{
					final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof OblecklordeldritchEntity) {
							if (entityiterator instanceof LivingEntity _entity)
								_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						}
					}
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity.getPersistentData().getDouble("playerProxTime") > 120) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new OblecklordeldritchEntity(ElementureModEntities.OBLECKLORDELDRITCH.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				{
					final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof OblecklordeldritchEntity) {
							if (entityiterator instanceof LivingEntity _entity)
								_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						}
					}
				}
				if (!entity.level.isClientSide())
					entity.discard();
			}
			if (entity.getPersistentData().getDouble("attackType") == 1) {
				OblecklordLaserProcedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("attackType") == 2) {
				if (entity.getPersistentData().getDouble("blastWait") >= 70) {
					entity.getPersistentData().putDouble("attackType", 0);
					entity.getPersistentData().putBoolean("shootingbullet", (false));
					entity.getPersistentData().putBoolean("attackongoing", (false));
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level;
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new MerthiumchannelerEntity(ElementureModEntities.MERTHIUMCHANNELER.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 3, 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 0.7,
									0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					entity.getPersistentData().putDouble("blastWait", 0);
				} else if (entity.getPersistentData().getDouble("blastWait") == 30 || entity.getPersistentData().getDouble("blastWait") == 50) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level;
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new MerthiumchannelerEntity(ElementureModEntities.MERTHIUMCHANNELER.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 3, 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 0.7,
									0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					entity.getPersistentData().putDouble("blastWait", (entity.getPersistentData().getDouble("blastWait") + 1));
				} else {
					entity.getPersistentData().putDouble("blastWait", (entity.getPersistentData().getDouble("blastWait") + 1));
				}
			}
		}
	}
}
