package net.mcreator.elementure.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

public class MemorialtypeteleportMasterProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getPersistentData().getString("memorial_type")).equals("multi_ender_memorial")) {
			entity.getPersistentData().putDouble("ender_memorial_curse", (entity.getPersistentData().getDouble("ender_memorial_curse") + Math.random() + 2 + 0.5));
			if (Math.random() >= 0.25 && entity.getPersistentData().getDouble("ender_memorial_curse") >= 20) {
				entity.hurt(DamageSource.OUT_OF_WORLD, 6);
			} else if (entity.getPersistentData().getDouble("ender_memorial_curse") >= 30) {
				if (entity instanceof ServerPlayer _player && !_player.level.isClientSide()) {
					ResourceKey<Level> destinationType = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("elementure:thepitlands"));
					if (_player.level.dimension() == destinationType)
						return;
					ServerLevel nextLevel = _player.server.getLevel(destinationType);
					if (nextLevel != null) {
						_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
						_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
						_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
						for (MobEffectInstance _effectinstance : _player.getActiveEffects())
							_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
						_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
			}
		}
	}
}
