package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModMobEffects;
import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FortunecookieEffectProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		ItemStack relic_item = ItemStack.EMPTY;
		double rnd = 0;
		relic_item = new ItemStack(ElementureModItems.FORTUNECOOKIE.get());
		if (((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getItem() == relic_item.getItem()
				|| ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getItem() == relic_item.getItem()
				|| ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getItem() == relic_item.getItem()
				|| ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getItem() == relic_item.getItem()
				|| ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getItem() == relic_item.getItem()
				|| ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getItem() == relic_item.getItem()) {
			if (Math.random() < 0.2) {
				rnd = Math.round(Math.random() * 12);
				if (rnd == 0) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 0));
				} else if (rnd == 1) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 0));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 0));
				} else if (rnd == 2) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 160, 0));
				} else if (rnd == 3) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.STARBURNS.get(), 240, 0));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, (entity.getX()), (entity.getY()), (entity.getZ()), 50, 0.6, 0.6, 0.6, 0.06);
				} else if (rnd == 4) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.LARGE_SMOKE, (entity.getX()), (entity.getY()), (entity.getZ()), 50, 0.6, 0.6, 0.6, 0.06);
				} else if (rnd == 5) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 0));
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 3));
				} else if (rnd == 6) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.MYCENANSPORES.get(), 200, 0));
				} else if (rnd == 7) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 6));
				} else if (rnd == 8) {
					entity.setDeltaMovement(new Vec3(0, 0.2, 0));
				} else if (rnd == 9) {
					entity.setSecondsOnFire(10);
				} else if (rnd == 10) {
					entity.setDeltaMovement(new Vec3((Math.random() - 0.5), 0, (Math.random() - 0.5)));
				} else if (rnd == 11) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PrimedTnt(EntityType.TNT, _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else {
					entity.hurt(DamageSource.GENERIC, 12);
				}
			}
		}
	}
}
