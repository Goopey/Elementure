package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModBlocks;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class DungeonwaterFishingpoolProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "overworldDungeon";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.fishBiome = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:fishingbobberentity")))
						&& (entityiterator.getPersistentData().getString("playerName")).equals(entity.getDisplayName().getString())) {
					if ((world.getBlockState(new BlockPos(entityiterator.getX(), entityiterator.getY() - 1.5, entityiterator.getZ()))).getBlock() == Blocks.SAND) {
						GrayskullFishingPoolProcedure.execute(entity);
					} else if ((world.getBlockState(new BlockPos(entityiterator.getX(), entityiterator.getY() - 1.5, entityiterator.getZ()))).getBlock() == ElementureModBlocks.CLOUDSAND.get()) {
						WindyshoresFishingPoolProcedure.execute(world, entity);
					} else if ((world.getBlockState(new BlockPos(entityiterator.getX(), entityiterator.getY() - 1.5, entityiterator.getZ()))).getBlock() == Blocks.LIME_TERRACOTTA) {
						FungalpitFishingpoolProcedure.execute(world, entity);
					}
				}
			}
		}
	}
}
