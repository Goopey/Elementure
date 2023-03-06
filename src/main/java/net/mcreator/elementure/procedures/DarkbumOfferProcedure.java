package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DarkbumOfferProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.APPLE) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.APPLE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.DARKBUMREDAPPLE.get().defaultBlockState(), 3);
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GOLDEN_APPLE) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.GOLDEN_APPLE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.DARKBUMGOLDENAPPLE.get().defaultBlockState(), 3);
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.ENCHANTED_GOLDEN_APPLE) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.DARKBUMGIVE.get().defaultBlockState(), 3);
		}
	}
}
