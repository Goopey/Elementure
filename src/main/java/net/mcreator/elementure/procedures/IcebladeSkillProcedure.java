package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModBlocks;

public class IcebladeSkillProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).water_essence >= 33
				&& (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).air_essence >= 33) {
			{
				double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).air_essence - 33;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.air_essence = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).water_essence - 33;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.water_essence = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (Math.random() < 0.25) {
				world.setBlock(new BlockPos(entity.getX() + 2, entity.getY(), entity.getZ()), ElementureModBlocks.ICEMINE.get().defaultBlockState(),
						3);
			} else if (Math.random() < 0.5 && Math.random() > 0.25) {
				world.setBlock(new BlockPos(entity.getX() - 2, entity.getY(), entity.getZ()), ElementureModBlocks.ICEMINE.get().defaultBlockState(),
						3);
			} else if (Math.random() < 0.75 && Math.random() > 0.5) {
				world.setBlock(new BlockPos(entity.getX(), entity.getY(), entity.getZ() - 2), ElementureModBlocks.ICEMINE.get().defaultBlockState(),
						3);
			} else {
				world.setBlock(new BlockPos(entity.getX(), entity.getY(), entity.getZ() + 2), ElementureModBlocks.ICEMINE.get().defaultBlockState(),
						3);
			}
		}
	}
}
