package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BiomeNewZoneProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, -64, z), "mycenaUsed") && y < 0) {
			if (!((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).zonenamelingering).equals("fungalPit")) {
				{
					String _setval = "fungalPit";
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
		}.getValue(world, new BlockPos(x, -64, z), "mycenaUsed") && y < 64) {
			if (!((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).zonenamelingering).equals("mycenaDepths")) {
				{
					String _setval = "mycenaDepths";
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
		}.getValue(world, new BlockPos(x, -64, z), "mycenaUsed")) {
			if (!((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).zonenamelingering).equals("mycena")) {
				{
					String _setval = "mycena";
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
		}.getValue(world, new BlockPos(x, 0, z), "netherstarOutsideUsed") && y > 127) {
			if (!((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).zonenamelingering).equals("netherstarSurface")) {
				{
					String _setval = "netherstarSurface";
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
		}.getValue(world, new BlockPos(x, 0, z), "netherstarOutsideUsed")) {
			if (!((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).zonenamelingering).equals("netherstarOutside")) {
				{
					String _setval = "netherstarOutside";
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
		}.getValue(world, new BlockPos(x, 0, z), "netherstarUsed") && y < 60) {
			if (!((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).zonenamelingering).equals("netherstarPrismaticbed")) {
				{
					String _setval = "netherstarPrismaticbed";
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
		}.getValue(world, new BlockPos(x, 0, z), "netherstarUsed")) {
			if (!((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).zonenamelingering).equals("netherstar")) {
				{
					String _setval = "netherstar";
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
		}.getValue(world, new BlockPos(x, -64, z), "jellyfloatUsed")) {
			if (!((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).zonenamelingering).equals("jellyfloat")) {
				{
					String _setval = "jellyfloat";
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
		}.getValue(world, new BlockPos(x, -64, z), "grayskullLake")) {
			if (!((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).zonenamelingering).equals("grayskullLake")) {
				{
					String _setval = "grayskullLake";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.zonename = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else {
			BiomeNewZone2Procedure.execute(world, x, y, z, entity);
		}
	}
}
