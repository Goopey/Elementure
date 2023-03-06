package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DustfluxarmorHitEffectProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == ElementureModItems.DUSTFLUXARMOR_HELMET.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == ElementureModItems.DUSTFLUXARMOR_CHESTPLATE.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == ElementureModItems.DUSTFLUXARMOR_LEGGINGS.get()) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ElementureModItems.DUSTFLUXARMOR_BOOTS.get()) {
						if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("dodgeTime") >= 0
								&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("dodge") / 10 >= Math.random()) {
							(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().putDouble("dodgeTime", 0);
							(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().putDouble("dodge", 0);
							{
								Entity _ent = entity;
								_ent.teleportTo((entity.getX() + Math.random() * 4 - 2), (entity.getY() + Math.random() * 2), (entity.getZ() + Math.random() * 4 - 2));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport((entity.getX() + Math.random() * 4 - 2), (entity.getY() + Math.random() * 2), (entity.getZ() + Math.random() * 4 - 2), _ent.getYRot(), _ent.getXRot());
							}
							if (event != null && event.isCancelable()) {
								event.setCanceled(true);
							}
						}
					}
				}
			}
		}
	}
}
