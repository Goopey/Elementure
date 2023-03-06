package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Registry;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class ForceblastinterfaceEffectProcedure {
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
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double yaw = 0;
		relic_item = new ItemStack(ElementureModItems.FORCEBLASTINTERFACE.get());
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getItem() == relic_item.getItem()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getItem() == relic_item.getItem()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getItem() == relic_item.getItem()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getItem() == relic_item.getItem()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getItem() == relic_item.getItem()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getItem() == relic_item.getItem()) {
			if (Math.random() < 0.02) {
				pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
				pitch2 = Math.sin(entity.getXRot() / ((-180) / Math.PI));
				yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
				yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLAME, (entity.getX() + 0.85 * yaw * pitch), (entity.getY() + 1 + 0.85 * pitch2), (entity.getZ() + 0.85 * yaw2 * pitch), 20, 0.6, 0.6, 0.6, 0.01);
				{
					final Vec3 _center = new Vec3((entity.getX() + 0.85 * yaw * pitch), (entity.getY() + 1.633 + 0.85 * pitch2), (entity.getZ() + 0.85 * yaw2 * pitch));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity) && !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
								&& !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
							if (!entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:force_mobs")))) {
								entityiterator.hurt(DamageSource.GENERIC, 2);
							}
							entityiterator.setDeltaMovement(new Vec3((0.85 * yaw * pitch), (0.85 * pitch2), (0.85 * yaw2 * pitch)));
						}
					}
				}
			}
		}
	}
}
