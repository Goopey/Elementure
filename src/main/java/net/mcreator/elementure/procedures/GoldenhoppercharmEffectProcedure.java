package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class GoldenhoppercharmEffectProcedure {
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
		BlockState block = Blocks.AIR.defaultBlockState();
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getItem() == ElementureModItems.GOLDENHOPPERCHARM.get()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getItem() == ElementureModItems.GOLDENHOPPERCHARM.get()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getItem() == ElementureModItems.GOLDENHOPPERCHARM.get()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getItem() == ElementureModItems.GOLDENHOPPERCHARM.get()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getItem() == ElementureModItems.GOLDENHOPPERCHARM.get()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getItem() == ElementureModItems.GOLDENHOPPERCHARM.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 120, 2, (false), (false)));
			if (entity.isShiftKeyDown()) {
				block = (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 0.1, entity.getZ())));
				if (entity.getDeltaMovement().y() > -2) {
					entity.setDeltaMovement(new Vec3(0, (-2), 0));
				}
				if (entity.getDeltaMovement().y() < -0.5 && (block.getBlock() instanceof LiquidBlock || block.getFluidState().isSource() || block.getBlock() == Blocks.AIR)) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ENCHANT, (entity.getX()), (entity.getY()), (entity.getZ()), (int) Math.round(Math.abs(entity.getDeltaMovement().y() * 30)), 0.6, 0.6, 0.6, 0.05);
					{
						final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities"))) && !(entityiterator == entity)) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.riptide_1")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.riptide_1")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								entityiterator.hurt(DamageSource.ANVIL, Math.round(Math.abs(entity.getDeltaMovement().y())));
								entityiterator.setDeltaMovement(new Vec3((entityiterator.getX() - entity.getX()), (entityiterator.getDeltaMovement().y() / 4), (entityiterator.getZ() - entity.getZ())));
							}
						}
					}
				}
			}
		}
	}
}
