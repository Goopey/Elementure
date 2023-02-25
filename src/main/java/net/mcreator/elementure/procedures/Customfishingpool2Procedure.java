package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class Customfishingpool2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:fishingbobberentity")))
						&& (entityiterator.getPersistentData().getString("playerName")).equals(entity.getDisplayName().getString())) {
					if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.NETHER)
							&& (world.getBlockState(new BlockPos(entityiterator.getX(), entityiterator.getY() - 0.5, entityiterator.getZ())))
									.is(BlockTags.create(new ResourceLocation("forge:lavafishingblocks")))) {
						NetherfishingpoolProcedure.execute(entity);
					} else if (new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(entityiterator.getX(), -64, entityiterator.getZ()), "mycenaUsed")) {
						MycenafishingpoolProcedure.execute(world, entity);
					} else if (new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(entityiterator.getX(), -64, entityiterator.getZ()), "windyshoresUsed")) {
						WindyshoreFishingPoolProcedure.execute(entity);
					} else if (new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(entityiterator.getX(), -64, entityiterator.getZ()), "jellyfloatUsed")) {
						JellypoolsFishingPoolProcedure.execute(world, entity);
					} else if (new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(entityiterator.getX(), -64, entityiterator.getZ()), "diverscrownUsed")) {
						DiverscrownFishingPoolProcedure.execute(entity);
					} else if ((world.getBlockState(new BlockPos(entityiterator.getX(), entityiterator.getY() - 0.5, entityiterator.getZ())))
							.is(BlockTags.create(new ResourceLocation("forge:lavafishingblocks")))) {
						LavafishingpoolProcedure.execute(entity);
					} else {
						Customfishingpool3Procedure.execute(world, entity);
					}
				}
			}
		}
	}
}
