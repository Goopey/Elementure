package net.mcreator.elementure.world.features.treedecorators;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.levelgen.feature.treedecorators.TrunkVineDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.core.BlockPos;

public class Familiar12TrunkDecorator extends TrunkVineDecorator {
	public static final Familiar12TrunkDecorator INSTANCE = new Familiar12TrunkDecorator();
	public static com.mojang.serialization.Codec<Familiar12TrunkDecorator> codec;
	public static TreeDecoratorType<?> tdt;
	static {
		codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		tdt = new TreeDecoratorType<>(codec);
		ForgeRegistries.TREE_DECORATOR_TYPES.register("familiar_12_tree_trunk_decorator", tdt);
	}

	@Override
	protected TreeDecoratorType<?> type() {
		return tdt;
	}

	@Override
	public void place(TreeDecorator.Context context) {
		context.logs().forEach(blockpos -> {
			if (context.random().nextInt(3) > 0) {
				BlockPos pos = blockpos.west();
				if (context.isAir(pos)) {
					context.setBlock(pos, Blocks.AIR.defaultBlockState());
				}
			}
			if (context.random().nextInt(3) > 0) {
				BlockPos pos = blockpos.east();
				if (context.isAir(pos)) {
					context.setBlock(pos, Blocks.AIR.defaultBlockState());
				}
			}
			if (context.random().nextInt(3) > 0) {
				BlockPos pos = blockpos.north();
				if (context.isAir(pos)) {
					context.setBlock(pos, Blocks.AIR.defaultBlockState());
				}
			}
			if (context.random().nextInt(3) > 0) {
				BlockPos pos = blockpos.south();
				if (context.isAir(pos)) {
					context.setBlock(pos, Blocks.AIR.defaultBlockState());
				}
			}
		});
	}
}
