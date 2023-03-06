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
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.SpiderlingEntity;
import net.mcreator.elementure.entity.HeadHostEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class SpidernestSpawnSpiderlingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean canSpawn = false;
		double locZ = 0;
		double locX = 0;
		double locY = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if ((entityiterator instanceof SpiderlingEntity || entityiterator instanceof HeadHostEntity) && (entityiterator.getPersistentData().getString("spiderling_id")).equals((x + "" + y) + "" + z)) {
					canSpawn = true;
				}
			}
		}
		if (!canSpawn && !world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 24, 24, 24), e -> true).isEmpty()
				&& !(((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 24, 24, 24), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			for (int index0 = 0; index0 < (int) (2); index0++) {
				if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
					locY = 1.1;
					locX = 0.5;
					locZ = 0.5;
				} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
					locY = -1.1;
					locX = 0.5;
					locZ = 0.5;
				} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.AIR) {
					locX = 1.1;
				} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.AIR) {
					locX = -1.1;
				} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR) {
					locZ = 1.1;
				} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.AIR) {
					locZ = -1.1;
				}
				if (Math.random() < 0.8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new SpiderlingEntity(ElementureModEntities.SPIDERLING.get(), _level);
						entityToSpawn.moveTo((x + locX), (y + locY), (z + locZ), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new HeadHostEntity(ElementureModEntities.HEAD_HOST.get(), _level);
						entityToSpawn.moveTo((x + locX), (y + locY), (z + locZ), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
				{
					final Vec3 _center = new Vec3((x + locX), (y + locY), (z + locZ));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof SpiderlingEntity || entityiterator instanceof HeadHostEntity) {
							entityiterator.getPersistentData().putString("spiderling_id", ((x + "" + y) + "" + z));
						}
					}
				}
			}
		}
	}
}
