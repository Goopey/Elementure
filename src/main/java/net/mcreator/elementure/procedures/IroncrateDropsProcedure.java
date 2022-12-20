package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

public class IroncrateDropsProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		(itemstack).shrink(1);
		if (Math.random() < 0.1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.LUCK)
				? _livEnt.getEffect(MobEffects.LUCK).getAmplifier()
				: 0) / 10) {
			if (Math.random() < 0.25) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(ElementureModItems.OBSIDIANBOBBER.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() < 0.33) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(ElementureModItems.SHARPENINGCHARM.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() > 0.67) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(ElementureModItems.BUCKLERCHARM.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(ElementureModItems.SWORDCHARM.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else {
			if (Math.random() < 0.05) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.BELL));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() < 0.1) {
				if (Math.random() < 0.33) {
					for (int index0 = 0; index0 < (int) (Math.random() * 2 + 1); index0++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.FERZIUMINGOT.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() < 0.33) {
					for (int index1 = 0; index1 < (int) (Math.random() * 2 + 1); index1++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.VAMITEINGOT.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() < 0.33) {
					for (int index2 = 0; index2 < (int) (Math.random() * 2 + 1); index2++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.FLUTANITEINGOT.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() < 0.33) {
					for (int index3 = 0; index3 < (int) (Math.random() * 2 + 1); index3++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.NOOBIUMINGOT.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() < 0.33) {
					for (int index4 = 0; index4 < (int) (Math.random() * 2 + 1); index4++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.MERTHIUMINGOT.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (Math.random() >= 0.1 && Math.random() < 0.2) {
				for (int index5 = 0; index5 < (int) (Math.random() * 12 + 8); index5++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(ElementureModItems.MAGNETICBAIT.get()));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() >= 0.2 && Math.random() < 0.3) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(Blocks.LODESTONE));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() >= 0.3 && Math.random() < 0.55) {
				if (ElementureModVariables.MapVariables.get(world).isHalloween) {
					for (int index6 = 0; index6 < (int) (Math.random() * 6 + 4); index6++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(Items.PUMPKIN_PIE));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					for (int index7 = 0; index7 < (int) (Math.random() * 6 + 4); index7++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(Items.COOKED_BEEF));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (Math.random() >= 0.55 && Math.random() < 0.65) {
				for (int index8 = 0; index8 < (int) (Math.random() * 2 + 1); index8++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Items.IRON_SWORD));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() >= 0.65 && Math.random() < 0.75) {
				if (Math.random() < 0.8) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(ElementureModItems.REINFORCEDFISHINGROD.get()));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(ElementureModItems.IRONBOBBER.get()));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() >= 0.75 && Math.random() < 0.8) {
				for (int index9 = 0; index9 < (int) (Math.random() * 3 + 1); index9++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Items.ENDER_PEARL));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				for (int index10 = 0; index10 < (int) (Math.random() * 3 + 1); index10++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Blocks.IRON_BLOCK));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
