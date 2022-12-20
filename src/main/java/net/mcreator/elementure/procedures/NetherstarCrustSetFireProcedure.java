package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.elementure.init.ElementureModMobEffects;

public class NetherstarCrustSetFireProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:netherstarfireimmune")))
				&& !entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))
				&& !(entity instanceof ItemEntity) && !(entity instanceof ItemFrame)
				&& !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(ElementureModMobEffects.HEATRESISTANCE.get()) : false)) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.FIRE_RESISTANCE) : false)) {
				entity.setSecondsOnFire(15);
			} else {
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation(0);
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(ElementureModMobEffects.STARBURNS.get()) : false)) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.STARBURNS.get(), 120, 0));
				}
			}
		}
	}
}
