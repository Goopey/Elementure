
package net.mcreator.elementure.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.procedures.PoisonprocedureProcedure;
import net.mcreator.elementure.init.ElementureModFluids;

public class CorruptdewBlock extends LiquidBlock {
	public CorruptdewBlock() {
		super(() -> (FlowingFluid) ElementureModFluids.CORRUPTDEW.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f)

		);
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		PoisonprocedureProcedure.execute(entity);
	}
}
