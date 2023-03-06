package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.init.ElementureModBlocks;
import net.mcreator.elementure.entity.SirenqueenEntity;
import net.mcreator.elementure.entity.SirenlingEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class SirenheartSirenqueenSummonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.TRIGGEREDSIRENHEART.get().defaultBlockState(), 3);
		if ((world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == ElementureModBlocks.DIVINGVINE.get() || (world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == ElementureModBlocks.DIVINGVINE_BEARING.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new SirenqueenEntity(ElementureModEntities.SIRENQUEEN.get(), _level);
				entityToSpawn.moveTo(x, (y + 2), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(256 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
						StandatmithrillhallPlayProcedure.execute(entityiterator);
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof SirenlingEntity) {
						if (!entityiterator.level.isClientSide())
							entityiterator.discard();
					}
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Not enough space"), (true));
		}
	}
}
