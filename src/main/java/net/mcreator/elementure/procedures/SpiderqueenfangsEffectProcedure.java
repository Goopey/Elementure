package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class SpiderqueenfangsEffectProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ItemStack relic_item = ItemStack.EMPTY;
		double poisonDamage = 0;
		relic_item = new ItemStack(ElementureModItems.SPIDERQUEENFANGS.get());
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getItem() == relic_item.getItem()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getItem() == relic_item.getItem()) {
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.POISON) : false)
							&& (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > 1
							&& !entityiterator.getType()
									.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
							&& !entityiterator.getType()
									.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
						poisonDamage = ((entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON)
								? _livEnt.getEffect(MobEffects.POISON).getAmplifier()
								: 0) + 1)
								* 0.8
								* (entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON)
										? _livEnt.getEffect(MobEffects.POISON).getDuration()
										: 0)
								* 0.05;
						if (entityiterator instanceof LivingEntity _entity)
							_entity.setHealth((float) Math.max(1,
									(entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - Math.round(poisonDamage * 0.25)));
						if (entityiterator instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.POISON);
					}
				}
			}
		}
	}
}
