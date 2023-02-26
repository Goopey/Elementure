package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.init.ElementureModBlocks;
import net.mcreator.elementure.entity.ScrapguardianEntity;
import net.mcreator.elementure.ElementureMod;

public class NetherstarBiomeOmeganGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double numBlazingStars = 0;
		if (world instanceof ServerLevel _origLevel) {
			LevelAccessor _worldorig = world;
			world = _origLevel.getServer().getLevel(Level.NETHER);
			if (world != null) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
							_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "forceload add ~ ~");
				ElementureMod.queueServerWork(360, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"forceload remove all");
				});
			}
			world = _worldorig;
		}
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "netherstarOGenRole") == 0) {
			NetherstarGenerateBigCrustProcedure.execute(world, x, y, z);
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "netherstarOGenRole") == 1) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 8, z), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y - 8, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 5);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			world.setBlock(new BlockPos(x, y - 43, z), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
			NetherstarOutskirtsPlaceProcedure.execute(world, x, y, z);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y - 43, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("netherstarOGenRole", 2);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"kill @e[type=minecraft:item, distance=0..84]");
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "netherstarOGenRole") == 2) {
			NetherstarFluidLakeRingGenProcedure.execute(world, x, y, z);
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "netherstarOGenRole") == 3) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			NetherstaroutskirtsGenProcedure.execute(world, x, z);
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "netherstarOGenRole") == 4) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			ElementureMod.queueServerWork(60, () -> {
				StarryplainsFloorGenProcedure.execute(world, x, y, z);
			});
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "netherstarOGenRole") == 5) {
			numBlazingStars = 6 + Math.round(Math.random() * 4);
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "abandonned_farm"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 9, y - 9, z - 9), new BlockPos(x - 9, y - 9, z - 9),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			for (int index0 = 0; index0 < (int) (numBlazingStars); index0++) {
				SummonblazingballsFlameDrillProcedure.execute(world, x, (y - 1), z);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new ScrapguardianEntity(ElementureModEntities.SCRAPGUARDIAN.get(), _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
