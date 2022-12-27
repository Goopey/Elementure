package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.ArachneelEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class SpiderboreSpawnArachneelProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean canSpawn = false;
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(18 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ArachneelEntity
						&& (entityiterator.getPersistentData().getString("arachneel_id")).equals((x + "" + y) + "" + z)) {
					canSpawn = true;
				}
			}
		}
		if (!canSpawn && !world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 18, 18, 18), e -> true).isEmpty() && !(((Entity) world
				.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 18, 18, 18), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "spawningTimer") <= 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("spawningTimer", 40);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
					locY = 1.1;
				} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
					locY = -1.1;
				} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.AIR) {
					locX = 1.1;
				} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.AIR) {
					locX = -1.1;
				} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR) {
					locZ = 1.1;
				} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.AIR) {
					locZ = -1.1;
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ArachneelEntity(ElementureModEntities.ARACHNEEL.get(), _level);
					entityToSpawn.moveTo((x + locX), (y + locY), (z + locZ), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				{
					final Vec3 _center = new Vec3((x + locX), (y + locY), (z + locZ));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.1 / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof ArachneelEntity) {
							entityiterator.getPersistentData().putString("arachneel_id", ((x + "" + y) + "" + z));
							if (new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x, y, z), "secondArachneel")) {
								entityiterator.getPersistentData().putBoolean("noArachneelDrops", (true));
							}
						}
					}
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putBoolean("secondArachneel", (true));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("spawningTimer", ((new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
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
