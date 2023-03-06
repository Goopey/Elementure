package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;

import java.util.ArrayList;

public class LargejellyAttackMasterProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double shieldLvl = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) < 0.25 && !entity.getPersistentData().getBoolean("3rdinchUsed")) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				shieldLvl = shieldLvl + 1;
			}
			entity.getPersistentData().putBoolean("3rdinchUsed", (true));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 6000, (int) (shieldLvl * 8)));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) < 0.5 && !entity.getPersistentData().getBoolean("2ndinchUsed")) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				shieldLvl = shieldLvl + 1;
			}
			entity.getPersistentData().putBoolean("2ndinchUsed", (true));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 6000, (int) (shieldLvl * 6)));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) < 0.75 && !entity.getPersistentData().getBoolean("1stinchUsed")) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				shieldLvl = shieldLvl + 1;
			}
			entity.getPersistentData().putBoolean("1stinchUsed", (true));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 6000, (int) (shieldLvl * 4)));
		}
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof ServerPlayer) {
			if (entity.getPersistentData().getDouble("attackCooldown") == 90) {
				if (Math.random() < 0.5) {
					LargejellySuckAttackProcedure.execute(world, entity);
					entity.getPersistentData().putDouble("attackCooldown", 0);
				} else if (Math.random() < 0.9) {
					LargejellyAOEAttackProcedure.execute(world, entity);
					entity.getPersistentData().putDouble("attackCooldown", 0);
				}
			} else if (entity.getPersistentData().getDouble("attackCooldown") >= 145) {
				JellySummonProcedure.execute(world, entity);
				entity.getPersistentData().putDouble("attackCooldown", 0);
			} else {
				if (Math.random() < 0.5) {
					entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
				} else {
					entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 0.75));
				}
			}
		}
	}
}
