package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class Customfishingpool3Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:fishingbobberentity")))
						&& (entityiterator.getPersistentData().getString("playerName")).equals(entity.getDisplayName().getString())) {
					if (entityiterator.getY() < 40) {
						CavefishingPoolProcedure.execute(entity);
					} else if (entityiterator.getY() < -10) {
						DeepcavefishingPoolProcedure.execute(entity);
					} else if (world.getBiome(new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())).is(new ResourceLocation("ocean"))
							|| world.getBiome(new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())).is(new ResourceLocation("lukewarm_ocean"))
							|| world.getBiome(new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())).is(new ResourceLocation("warm_ocean"))
							|| world.getBiome(new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())).is(new ResourceLocation("frozen_ocean"))
							|| world.getBiome(new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())).is(new ResourceLocation("cold_ocean"))) {
						OceanfishingpoolProcedure.execute(world, entity);
					} else if (world.getBiome(new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())).is(new ResourceLocation("deep_ocean"))
							|| world.getBiome(new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())).is(new ResourceLocation("deep_lukewarm_ocean"))
							|| world.getBiome(new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())).is(new ResourceLocation("warm_ocean"))
							|| world.getBiome(new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())).is(new ResourceLocation("deep_frozen_ocean"))
							|| world.getBiome(new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())).is(new ResourceLocation("deep_cold_ocean"))) {
						DeepOceanfishingpoolProcedure.execute(world, entity);
					} else {
						RiverFishingPoolProcedure.execute(world, entity);
					}
				}
			}
		}
	}
}
