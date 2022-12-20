package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class TarspiritDespawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("tarspiritDespawnTime") > 480) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.TARFLAME_PARTICLE.get()), (entity.getX()), (entity.getY()),
						(entity.getZ()), 28, 0.3, 0.3, 0.3, 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.silverfish.ambient")), SoundSource.PLAYERS, 1,
							(float) 0.1);
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.silverfish.ambient")), SoundSource.PLAYERS, 1,
							(float) 0.1, false);
				}
			}
			if (entity.getPersistentData().getBoolean("tarSpiritExplodey")) {
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.conduit.ambient.short")),
										SoundSource.PLAYERS, 1, (float) 0.2);
							} else {
								_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.conduit.ambient.short")),
										SoundSource.PLAYERS, 1, (float) 0.2, false);
							}
						}
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), (float) 1.2, Explosion.BlockInteraction.NONE);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 2);
			}
			if (!entity.level.isClientSide())
				entity.discard();
		} else {
			if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
				entity.getPersistentData().putDouble("tarspiritDespawnTime", (entity.getPersistentData().getDouble("tarspiritDespawnTime") + 4));
			} else {
				entity.getPersistentData().putDouble("tarspiritDespawnTime", (entity.getPersistentData().getDouble("tarspiritDespawnTime") + 1));
			}
		}
		entity.setDeltaMovement(
				new Vec3((entity.getDeltaMovement().x() * 1.05), (entity.getDeltaMovement().y() * 1.05), (entity.getDeltaMovement().z() * 1.05)));
	}
}
