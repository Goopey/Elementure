package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.init.ElementureModBlocks;

public class Netherfruitplant1BonemealProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
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
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5), (z + 0.5), 9, 0.11, 0.11, 0.11, 0.05);
			if (Math.random() < 0.9) {
				if (Math.random() < 0.1) {
					world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.NETHERFRUITPLANT_4.get().defaultBlockState(), 3);
				} else if (Math.random() < 0.33) {
					world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.NETHERFRUITPLANT_3.get().defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.NETHERFRUITPLANT_2.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
