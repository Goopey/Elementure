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

public class OakcrateDropsProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double rndNum = 0;
		(itemstack).shrink(1);
		if (Math.random() < 0.1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.LUCK)
				? _livEnt.getEffect(MobEffects.LUCK).getAmplifier()
				: 0) / 10) {
			if (Math.random() < 0.7) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(ElementureModItems.POUCH.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(ElementureModItems.SUITCASE.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else {
			rndNum = Math.random();
			if (rndNum < 0.1) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(ElementureModItems.SMALLOAKENBLESSING.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (rndNum < 0.2) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(Items.FISHING_ROD));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (rndNum < 0.35) {
				for (int index0 = 0; index0 < (int) (Math.random() * 6 + 4); index0++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Blocks.SCAFFOLDING));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (rndNum < 0.55) {
				if (ElementureModVariables.MapVariables.get(world).isHalloween) {
					for (int index1 = 0; index1 < (int) (Math.random() * 6 + 4); index1++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(Items.POISONOUS_POTATO));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.random() < 0.45) {
					rndNum = Math.round(Math.random() * 10);
					if (rndNum == 0) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.JUNGLEBOX.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (rndNum == 1) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.SANDYBOX.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (rndNum == 2) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.MUSHROOMBOX.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (rndNum == 3) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.PLAINSBOX.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (rndNum == 4) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.FORESTBOX.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (rndNum == 5) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.EMERALDBOX.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (rndNum == 6) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.DARKFORESTBOX.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (rndNum == 7) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.SWAMPBOX.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (rndNum == 8) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.STONEBOX.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (rndNum == 9) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.MOUNTAINBOX.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.OCEANBOX.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.random() < 0.2) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Items.HONEY_BOTTLE));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					for (int index2 = 0; index2 < (int) (Math.random() * 6 + 4); index2++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(Items.BREAD));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (rndNum < 0.65) {
				for (int index3 = 0; index3 < (int) (Math.random() * 2 + 1); index3++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(ElementureModItems.RUSTYSWORD.get()));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (rndNum < 0.75) {
				if (Math.random() < 0.7) {
					for (int index4 = 0; index4 < (int) (Math.random() * 12 + 6); index4++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									new ItemStack(ElementureModItems.COCOABAIT.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(ElementureModItems.STRINGLINE.get()));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				for (int index5 = 0; index5 < (int) (Math.random() * 12 + 6); index5++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Blocks.OAK_LOG));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
