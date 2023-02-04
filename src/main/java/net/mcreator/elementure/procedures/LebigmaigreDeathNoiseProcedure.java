package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class LebigmaigreDeathNoiseProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("Lebigmaigre")) {
			if (Math.random() < 0.5) {
				{
					List<? extends Player> _players = new ArrayList<>(world.players());
					for (Entity entityiterator : _players) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death")), SoundSource.NEUTRAL,
										(float) 1.8, (float) 0.8);
							} else {
								_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death")), SoundSource.NEUTRAL,
										(float) 1.8, (float) 0.8, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death")), SoundSource.NEUTRAL,
										(float) 1.8, (float) 0.4);
							} else {
								_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death")), SoundSource.NEUTRAL,
										(float) 1.8, (float) 0.4, false);
							}
						}
					}
				}
			} else {
				{
					List<? extends Player> _players = new ArrayList<>(world.players());
					for (Entity entityiterator : _players) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.donkey.death")), SoundSource.NEUTRAL,
										(float) 1.8, (float) 0.8);
							} else {
								_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.donkey.death")), SoundSource.NEUTRAL,
										(float) 1.8, (float) 0.8, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.donkey.death")), SoundSource.NEUTRAL,
										(float) 1.8, (float) 0.4);
							} else {
								_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.donkey.death")), SoundSource.NEUTRAL,
										(float) 1.8, (float) 0.4, false);
							}
						}
					}
				}
			}
		}
	}
}
