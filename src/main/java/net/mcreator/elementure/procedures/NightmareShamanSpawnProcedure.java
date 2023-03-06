package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.NightmareSpikeEntity;
import net.mcreator.elementure.entity.NightmareMassEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class NightmareShamanSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean canSpawn = false;
		double locZ = 0;
		double locX = 0;
		double locY = 0;
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 18, 18, 18), e -> true).isEmpty()
				&& !(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 18, 18, 18), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (Math.random() < 0.13) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(9 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player) {
							locX = entityiterator.getX();
							locY = entityiterator.getY();
							locZ = entityiterator.getZ();
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareSpikeEntity(ElementureModEntities.NIGHTMARE_SPIKE.get(), _level);
								entityToSpawn.moveTo(locX, locY, locZ, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
				for (int index0 = 0; index0 < (int) (12); index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new NightmareSpikeEntity(ElementureModEntities.NIGHTMARE_SPIKE.get(), _level);
						entityToSpawn.moveTo((x + Math.random() * 8 - 4), locY, (z + Math.random() * 8 - 4), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "spawningTimer") <= 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("spawningTimer", 7);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				locX = 0;
				locZ = 0;
				for (int index1 = 0; index1 < (int) (1 + Math.round(Math.random())); index1++) {
					if (Math.random() < 0.5) {
						locX = 1;
					} else {
						locX = -1;
					}
					if (Math.random() < 0.5) {
						locZ = 1;
					} else {
						locZ = -1;
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new NightmareMassEntity(ElementureModEntities.NIGHTMARE_MASS.get(), _level);
						entityToSpawn.moveTo((x + locX), y, (z + locZ), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("spawningTimer", ((new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "spawningTimer")) - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
	}
}
