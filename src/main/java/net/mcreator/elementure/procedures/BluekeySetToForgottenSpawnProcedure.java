package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.init.ElementureModBlocks;

public class BluekeySetToForgottenSpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		BlockState bedBlock = Blocks.AIR.defaultBlockState();
		double locY = 0;
		double i = 0;
		double tpHeight = 0;
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.ADVENTURE);
		}
		if (world instanceof ServerLevel _origLevel) {
			LevelAccessor _worldorig = world;
			world = _origLevel.getServer().getLevel(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("elementure:forgotten_1")));
			if (world != null) {
				while (!world.getBlockState(new BlockPos(0, 320 - i, 0)).canOcclude()) {
					i = i + 1;
				}
				locY = 320 - i;
				bedBlock = (world.getBlockState(new BlockPos(0, 0, 0)));
				if (!(bedBlock.getBlock() == ElementureModBlocks.PERVADEDBEDROCK.get())) {
					world.setBlock(new BlockPos(0, 0, 0), ElementureModBlocks.PERVADEDBEDROCK.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(0, locY, 0), ElementureModBlocks.FORGOTTEN_OMEGAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(0, locY, 0);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("forgottenOmeganRole", 1);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "bluedoorexitframe"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(-1, locY + 1, -1), new BlockPos(-1, locY + 1, -1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			}
			world = _worldorig;
		}
	}
}
