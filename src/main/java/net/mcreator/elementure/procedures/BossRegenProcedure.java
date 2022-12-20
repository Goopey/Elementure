package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import javax.annotation.Nullable;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class BossRegenProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
		execute(event, event.getEntityLiving().level, event.getEntityLiving());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double bossLvl = 0;
		if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("elementure:resistboss")))) {
			{
				List<? extends Player> _players = new ArrayList<>(world.players());
				for (Entity entityiterator : _players) {
					bossLvl = bossLvl + 1;
				}
			}
			if (bossLvl >= 2) {
				bossLvl = bossLvl - 2;
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.REGENERATION) : false)) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 300, (int) bossLvl));
				}
				if (bossLvl >= 1) {
					if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DAMAGE_RESISTANCE) : false)) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300,
									(int) (Math.floor(bossLvl / 2) <= 3 ? Math.floor(bossLvl / 2) : 3)));
					}
				}
			}
		}
	}
}
