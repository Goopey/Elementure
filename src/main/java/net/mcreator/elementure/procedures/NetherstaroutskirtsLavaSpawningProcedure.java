package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.entity.OctolankEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class NetherstaroutskirtsLavaSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		double lavaSurround = 0;
		boolean shouldSpawn = false;
		boolean noOtherOctolanks = false;
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.NETHER)) {
			locX = -2;
			locY = -2;
			locZ = -2;
			noOtherOctolanks = true;
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof OctolankEntity) {
						noOtherOctolanks = false;
					}
				}
			}
			for (int index0 = 0; index0 < (int) (125); index0++) {
				if ((world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).is(BlockTags.create(new ResourceLocation("elementure:netherstarblocks")))) {
					if (!(new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(x + locX, 0, z + locZ), "netherstarUsed"))) {
						shouldSpawn = true;
					}
				} else if ((world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).getBlock() == Blocks.LAVA) {
					lavaSurround = lavaSurround + 1;
				}
				locX = locX + 1;
				if (locX >= 2) {
					locX = -2;
					locZ = locZ + 1;
					if (locZ >= 2) {
						locX = -2;
						locY = locY + 1;
						locZ = -2;
						if (locY >= 2) {
							locX = -2;
							locY = -2;
							locZ = -2;
						}
					}
				}
			}
		} else {
			return false;
		}
		return shouldSpawn && noOtherOctolanks && lavaSurround > 60;
	}
}
