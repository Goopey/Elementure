package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModBlocks;

public class DarkbumgoldenrevertProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ElementureModVariables.WorldVariables.get(world).dbumGApple = ElementureModVariables.WorldVariables.get(world).dbumGApple + 1;
		ElementureModVariables.WorldVariables.get(world).syncData(world);
		if (ElementureModVariables.WorldVariables.get(world).dbumGApple < 6) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.DARKBUM.get().defaultBlockState(), 3);
		} else {
			ElementureModVariables.WorldVariables.get(world).dbumGApple = 0;
			ElementureModVariables.WorldVariables.get(world).syncData(world);
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.DARKBUMGIVE.get().defaultBlockState(), 3);
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
