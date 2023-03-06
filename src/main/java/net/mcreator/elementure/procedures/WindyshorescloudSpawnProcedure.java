package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.entity.WindyshoresCloudEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class WindyshorescloudSpawnProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean retval = false;
		if (y < 66) {
			return false;
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, -64, z), "windyshoresUsed"))) {
			return false;
		}
		retval = true;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(48 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof WindyshoresCloudEntity) {
					retval = false;
					break;
				}
			}
		}
		return retval;
	}
}
