package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NetherdwellerswingsEffectProcedure {
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
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getItem() == ElementureModItems.NETHERDWELLERSWINGS.get()) {
			if (entity.isSprinting() && (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence >= 10
					&& ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getOrCreateTag().getDouble("sprint") >= 21) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.35, (entity.getDeltaMovement().z())));
				{
					double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence - 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fire_essence = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				world.addParticle(ParticleTypes.FLAME, (entity.getX()), (entity.getY()), (entity.getZ()), ((Math.random() - 0.5) / 5), ((Math.random() - 0.5) / 5), ((Math.random() - 0.5) / 5));
				world.addParticle(ParticleTypes.FLAME, (entity.getX()), (entity.getY()), (entity.getZ()), ((Math.random() - 0.5) / 5), ((Math.random() - 0.5) / 5), ((Math.random() - 0.5) / 5));
				world.addParticle(ParticleTypes.FLAME, (entity.getX()), (entity.getY()), (entity.getZ()), ((Math.random() - 0.5) / 5), ((Math.random() - 0.5) / 5), ((Math.random() - 0.5) / 5));
				world.addParticle(ParticleTypes.FLAME, (entity.getX()), (entity.getY()), (entity.getZ()), ((Math.random() - 0.5) / 5), ((Math.random() - 0.5) / 5), ((Math.random() - 0.5) / 5));
			} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getOrCreateTag().getDouble("sprint") == 20
					&& entity.isSprinting() && (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence >= 10) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + (entity.getDeltaMovement().x() / Math.abs(entity.getDeltaMovement().x())) * 1.4), 0.35,
						(entity.getDeltaMovement().z() + (entity.getDeltaMovement().z() / Math.abs(entity.getDeltaMovement().z())) * 1.4)));
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getOrCreateTag().putDouble("sprint",
						(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getOrCreateTag().getDouble("sprint") + 1));
			} else if (entity.isSprinting()) {
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getOrCreateTag().putDouble("sprint",
						(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getOrCreateTag().getDouble("sprint") + 1));
			} else {
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getOrCreateTag().putDouble("sprint", 0);
			}
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence >= 0) {
				entity.fallDistance = 0;
			}
			if (Math.random() < 0.007) {
				{
					double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence + 2;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fire_essence = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getItem() == ElementureModItems.NETHERDWELLERSWINGS.get()) {
			if (entity.isSprinting() && (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence >= 10
					&& ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getOrCreateTag().getDouble("sprint") >= 21) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.35, (entity.getDeltaMovement().z())));
				{
					double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence - 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fire_essence = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				world.addParticle(ParticleTypes.FLAME, (entity.getX()), (entity.getY()), (entity.getZ()), ((Math.random() - 0.5) / 5), ((Math.random() - 0.5) / 5), ((Math.random() - 0.5) / 5));
				world.addParticle(ParticleTypes.FLAME, (entity.getX()), (entity.getY()), (entity.getZ()), ((Math.random() - 0.5) / 5), ((Math.random() - 0.5) / 5), ((Math.random() - 0.5) / 5));
				world.addParticle(ParticleTypes.FLAME, (entity.getX()), (entity.getY()), (entity.getZ()), ((Math.random() - 0.5) / 5), ((Math.random() - 0.5) / 5), ((Math.random() - 0.5) / 5));
				world.addParticle(ParticleTypes.FLAME, (entity.getX()), (entity.getY()), (entity.getZ()), ((Math.random() - 0.5) / 5), ((Math.random() - 0.5) / 5), ((Math.random() - 0.5) / 5));
			} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getOrCreateTag().getDouble("sprint") == 20
					&& entity.isSprinting() && (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence >= 10) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + (entity.getDeltaMovement().x() / Math.abs(entity.getDeltaMovement().x())) * 1.4), 0.35,
						(entity.getDeltaMovement().z() + (entity.getDeltaMovement().z() / Math.abs(entity.getDeltaMovement().z())) * 1.4)));
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getOrCreateTag().putDouble("sprint",
						(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getOrCreateTag().getDouble("sprint") + 1));
			} else if (entity.isSprinting()) {
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getOrCreateTag().putDouble("sprint",
						(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getOrCreateTag().getDouble("sprint") + 1));
			} else {
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getOrCreateTag().putDouble("sprint", 0);
			}
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence >= 0) {
				entity.fallDistance = 0;
			}
			if (Math.random() < 0.007) {
				{
					double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence + 2;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fire_essence = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
