package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class ElevatorElevateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double TELEPORT_DISTANCE = 0;
		double locZ = 0;
		double locX = 0;
		double locY = 0;
		TELEPORT_DISTANCE = 0.15;
		if ((entity.getPersistentData().getString("direction")).equals("" + Direction.NORTH)) {
			locZ = -1;
		} else if ((entity.getPersistentData().getString("direction")).equals("" + Direction.SOUTH)) {
			locZ = 1;
		} else if ((entity.getPersistentData().getString("direction")).equals("" + Direction.WEST)) {
			locX = -1;
		} else if ((entity.getPersistentData().getString("direction")).equals("" + Direction.EAST)) {
			locX = 1;
		} else if ((entity.getPersistentData().getString("direction")).equals("" + Direction.UP)) {
			locY = 1;
		} else if ((entity.getPersistentData().getString("direction")).equals("" + Direction.DOWN)) {
			locY = -1;
		}
		entity.setDeltaMovement(new Vec3((TELEPORT_DISTANCE * locX), (TELEPORT_DISTANCE * locY), (TELEPORT_DISTANCE * locZ)));
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("elementure:elevator_entities")))) {
					entityiterator.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x() + TELEPORT_DISTANCE * locX),
							((entity.getPersistentData().getString("direction")).equals("" + Direction.UP) ? TELEPORT_DISTANCE : entity.getDeltaMovement().y()), (entityiterator.getDeltaMovement().z() + TELEPORT_DISTANCE * locZ)));
				}
			}
		}
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("elementure:elevator_entities")))) {
					entityiterator.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x() + TELEPORT_DISTANCE * locX),
							((entity.getPersistentData().getString("direction")).equals("" + Direction.UP) ? TELEPORT_DISTANCE : entity.getDeltaMovement().y()), (entityiterator.getDeltaMovement().z() + TELEPORT_DISTANCE * locZ)));
				}
			}
		}
		if ((world.getBlockState(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))).is(BlockTags.create(new ResourceLocation("elementure:neutral_elevator_controllers")))) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(entity.getX(), entity.getY(), entity.getZ());
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("direction", (entity.getPersistentData().getString("direction")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(entity.getX(), entity.getY(), entity.getZ());
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("previousX", (entity.getPersistentData().getDouble("nextX")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(entity.getX(), entity.getY(), entity.getZ());
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("previousY", (entity.getPersistentData().getDouble("nextY")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(entity.getX(), entity.getY(), entity.getZ());
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("previousZ", (entity.getPersistentData().getDouble("nextZ")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (Math.floor(entity.getX()) == entity.getPersistentData().getDouble("nextX") && Math.floor(entity.getY()) == entity.getPersistentData().getDouble("nextY") && Math.floor(entity.getZ()) == entity.getPersistentData().getDouble("nextZ")) {
			world.setBlock(new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
					ForgeRegistries.BLOCKS.getValue(new ResourceLocation(((entity.getPersistentData().getString("blockType"))).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState(), 3);
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
