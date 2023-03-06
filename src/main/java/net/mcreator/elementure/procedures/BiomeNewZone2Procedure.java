package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;

public class BiomeNewZone2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, -64, z), "windyshoresUsed") && y > 270) {
			if (!((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).zonenamelingering).equals("starryIsland")) {
				{
					String _setval = "starryIsland";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.zonename = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, -64, z), "windyshoresUsed") && y > 40) {
			if (!((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).zonenamelingering).equals("windyShores")) {
				{
					String _setval = "windyShores";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.zonename = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, -64, z), "diverscrownUsed") && y > 0) {
			if (!((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).zonenamelingering).equals("diversCrown")) {
				{
					String _setval = "diversCrown";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.zonename = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, -64, z), "diverscrownUsed")) {
			if (!((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).zonenamelingering).equals("bedOfChaos")) {
				{
					String _setval = "bedOfChaos";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.zonename = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (Math.random() < 0.005) {
			{
				String _setval = "";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.zonename = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.zonenamelingering = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
