package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.ChromaticwheelBulletEntity;

public class ChromaticchannelerSendDiscProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double pitch = 0;
		double pitch2 = 0;
		double yaw = 0;
		double yaw2 = 0;
		pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
		pitch2 = Math.sin(entity.getXRot() / ((-180) / Math.PI));
		yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
		yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
		if (ChromaticchannelerCanShootProcedure.execute(entity)) {
			if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == ElementureModItems.RAINBOWARMOR_HELMET.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == ElementureModItems.RAINBOWARMOR_CHESTPLATE.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == ElementureModItems.RAINBOWARMOR_LEGGINGS.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ElementureModItems.RAINBOWARMOR_BOOTS.get())) {
				{
					double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).light_essence - 12;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.light_essence = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 5);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ChromaticwheelBulletEntity(ElementureModEntities.CHROMATICWHEEL_BULLET.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (1.2 + entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setDeltaMovement((2.2 * yaw * pitch), (2.2 * pitch2), (2.2 * yaw2 * pitch));
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			} else {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 8);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ChromaticwheelBulletEntity(ElementureModEntities.CHROMATICWHEEL_BULLET.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (1.2 + entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setDeltaMovement((3.3 * yaw * pitch), (3.3 * pitch2), (3.3 * yaw2 * pitch));
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
		}
	}
}
