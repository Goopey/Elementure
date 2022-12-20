package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.elementure.init.ElementureModItems;

public class MycenanarmorFullSetAbilityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == ElementureModItems.MYCENANARMOR_HELMET.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == ElementureModItems.MYCENANARMOR_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == ElementureModItems.MYCENANARMOR_BOOTS.get()) {
			if (entity.getPersistentData().getDouble("previousHealth") > (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 16
					&& Math.random() < 0.2 + ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.LUCK)
							? _livEnt.getEffect(MobEffects.LUCK).getAmplifier()
							: 0) + 1) / 20) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 2));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 1), (z + 0.5), 60, 0.7, 0.7, 0.7, 0.1);
				for (int index0 = 0; index0 < (int) (3); index0++) {
					MycenashroomcloudProcedure.execute(world, x, y, z);
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
											_level.getServer(), null).withSuppressedOutput(),
									"effect give @e[distance=0.1..4] elementure:mycenanspores 4 1");
			}
			entity.getPersistentData().putDouble("previousHealth", (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1));
		}
	}
}
