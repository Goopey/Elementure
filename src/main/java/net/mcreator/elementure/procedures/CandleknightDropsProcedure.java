package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModItems;

public class CandleknightDropsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.15) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
						new ItemStack(ElementureModItems.CANDLESTICK.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		for (int index0 = 0; index0 < (int) (12 + Math.floor(Math.random() * 8)); index0++) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.IRON_INGOT));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		for (int index1 = 0; index1 < (int) (12 + Math.floor(Math.random() * 8)); index1++) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.GOLD_INGOT));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (world instanceof Level _level && !_level.isClientSide()) {
			ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
					new ItemStack(ElementureModItems.ORANGEBARRIERKEY.get()));
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
		world.setBlock(new BlockPos(x, y + 6, z + 1), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 7, z + 1), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 6, z - 1), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 7, z - 1), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + 6, z), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + 7, z), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + 6, z), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + 7, z), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z), Blocks.LADDER.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z), Blocks.LADDER.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 2, z), Blocks.LADDER.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 3, z), Blocks.LADDER.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 4, z), Blocks.LADDER.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 5, z), Blocks.LADDER.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 6, z), Blocks.LADDER.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 7, z), Blocks.LADDER.defaultBlockState(), 3);
	}
}
