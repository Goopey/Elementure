package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;

public class DirectionalDodgeOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.isInWaterOrBubble() && !((world.getBlockState(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.LADDER) && (entity instanceof LivingEntity _livEnt ? _livEnt.isBlocking() : false)
				&& entity.getDeltaMovement().y() >= 0) {
			if (0 >= (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).dodgeCooldown) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (-1), (entity.getDeltaMovement().z())));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_chain")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_chain")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity.getDeltaMovement().x() > 0.015) {
					entity.setDeltaMovement(new Vec3(1, (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
				}
				if (entity.getDeltaMovement().x() < -0.015) {
					entity.setDeltaMovement(new Vec3((-1), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
				}
				if (entity.getDeltaMovement().z() > 0.015) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), 1));
				}
				if (entity.getDeltaMovement().z() < -0.015) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (-1)));
				}
				{
					double _setval = 30;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.dodgeCooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
