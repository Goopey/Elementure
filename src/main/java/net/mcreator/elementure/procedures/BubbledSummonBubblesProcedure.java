package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModMobEffects;
import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.BubbleEntity;

public class BubbledSummonBubblesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.dayTime()
				% Math.max(100 - (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.BUBBLED_EFFECT.get())
						? _livEnt.getEffect(ElementureModMobEffects.BUBBLED_EFFECT.get()).getAmplifier()
						: 0), 20) == 0
				&& Math.random() < 0.5) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new BubbleEntity(ElementureModEntities.BUBBLE.get(), _level);
				entityToSpawn.moveTo((entity.getX()), (entity.getY() + 1.3), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
