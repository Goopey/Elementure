package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.init.ElementureModBlocks;

public class ScrapsaplingMealProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double height = 0;
		double randomheight = 0;
		boolean shouldgenerate = false;
		randomheight = Math.round(Math.random() * 2);
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL && Math.random() < 0.15) {
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
			}
			shouldgenerate = true;
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "nether_scrap_tree_base"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 3, y + randomheight, z - 3), new BlockPos(x - 3, y + randomheight, z - 3),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL && !(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
		}
		for (int index0 = 0; index0 < (int) (randomheight + 1); index0++) {
			if (shouldgenerate) {
				world.setBlock(new BlockPos(x - 1, y + height, z), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x + 1, y + height, z), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + height, z + 1), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + height, z - 1), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + height, z), ElementureModBlocks.NETHERLOG.get().defaultBlockState(), 3);
				height = height + 1;
			}
		}
	}
}
