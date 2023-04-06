package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.ElementureMod;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class WeaponReplaceAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		ItemStack weaponArtitem = ItemStack.EMPTY;
		String hitbox_type = "";
		double hitbox_size = 0;
		double hitbox_distance = 0;
		double hitbox_delay = 0;
		if (sourceentity instanceof Player) {
			weaponArtitem = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
			if (weaponArtitem.is(ItemTags.create(new ResourceLocation("elementure:weaponartitems")))) {
				hitbox_type = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).hitbox_type;
				if ((hitbox_type).equals("bash")) {
					ElementureMod.queueServerWork((int) (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).hitbox_delay, () -> {
						{
							final Vec3 _center = new Vec3((sourceentity.getLookAngle().x * (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).hitbox_distance),
									(sourceentity.getLookAngle().y * (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).hitbox_distance),
									(sourceentity.getLookAngle().z * (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).hitbox_distance));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class,
									new AABB(_center, _center).inflate((1.2 * (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).hitbox_size) / 2d), e -> true)
									.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								entity.hurt(DamageSource.GENERIC, (float) amount);
							}
						}
					});
				}
			}
		}
	}
}
