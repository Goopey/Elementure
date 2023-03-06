package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.elementure.init.ElementureModBlocks;

public class NetherstarOutskirtsPlaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x + 23, 0, z + 68), "netherstarUsed"))) {
			world.setBlock(new BlockPos(x + 23, y, z + 68), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x + 23, y, z + 68);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 23), y, (z + 68)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~");
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x + 23, 0, z - 68), "netherstarUsed"))) {
			world.setBlock(new BlockPos(x + 23, y, z - 68), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x + 23, y, z - 68);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 23), y, (z - 68)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~");
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x - 23, 0, z + 68), "netherstarUsed"))) {
			world.setBlock(new BlockPos(x - 23, y, z + 68), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x - 23, y, z + 68);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 23), y, (z + 68)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~");
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x - 23, 0, z - 68), "netherstarUsed"))) {
			world.setBlock(new BlockPos(x - 23, y, z - 68), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x - 23, y, z - 68);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 23), y, (z - 68)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~");
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x + 68, 0, z + 23), "netherstarUsed"))) {
			world.setBlock(new BlockPos(x + 68, y, z + 23), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x + 68, y, z + 23);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 68), y, (z + 23)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~");
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x + 68, 0, z - 23), "netherstarUsed"))) {
			world.setBlock(new BlockPos(x + 68, y, z - 23), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x + 68, y, z - 23);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 68), y, (z - 23)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~");
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x - 68, 0, z - 23), "netherstarUsed"))) {
			world.setBlock(new BlockPos(x - 68, y, z - 23), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x - 68, y, z - 23);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 68), y, (z - 23)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~");
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x - 68, 0, z + 23), "netherstarUsed"))) {
			world.setBlock(new BlockPos(x - 68, y, z + 23), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x - 68, y, z + 23);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 68), y, (z + 23)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~");
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x + 51, 0, z + 51), "netherstarUsed"))) {
			world.setBlock(new BlockPos(x + 51, y, z + 51), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x + 51, y, z + 51);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 51), y, (z + 51)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~");
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x + 51, 0, z - 51), "netherstarUsed"))) {
			world.setBlock(new BlockPos(x + 51, y, z - 51), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x + 51, y, z - 51);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 51), y, (z - 51)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~");
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x - 51, 0, z + 51), "netherstarUsed"))) {
			world.setBlock(new BlockPos(x - 51, y, z + 51), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x - 51, y, z + 51);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 51), y, (z + 51)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~");
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x - 51, 0, z - 51), "netherstarUsed"))) {
			world.setBlock(new BlockPos(x - 51, y, z - 51), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x - 51, y, z - 51);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 51), y, (z - 51)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~");
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x + 72, 0, z), "netherstarUsed"))) {
			world.setBlock(new BlockPos(x + 72, y, z), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x + 72, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 72), y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~");
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x - 72, 0, z), "netherstarUsed"))) {
			world.setBlock(new BlockPos(x - 72, y, z), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x - 72, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 72), y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~");
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, 0, z + 72), "netherstarUsed"))) {
			world.setBlock(new BlockPos(x, y, z + 72), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z + 72);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, (z + 72)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~");
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, 0, z - 72), "netherstarUsed"))) {
			world.setBlock(new BlockPos(x, y, z - 72), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z - 72);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, (z - 72)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~");
		}
	}
}
