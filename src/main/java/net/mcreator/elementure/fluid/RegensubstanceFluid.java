
package net.mcreator.elementure.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModFluids;
import net.mcreator.elementure.init.ElementureModFluidTypes;
import net.mcreator.elementure.init.ElementureModBlocks;

public abstract class RegensubstanceFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ElementureModFluidTypes.REGENSUBSTANCE_TYPE.get(), () -> ElementureModFluids.REGENSUBSTANCE.get(),
			() -> ElementureModFluids.FLOWING_REGENSUBSTANCE.get()).explosionResistance(100f).bucket(() -> ElementureModItems.REGENSUBSTANCE_BUCKET.get()).block(() -> (LiquidBlock) ElementureModBlocks.REGENSUBSTANCE.get());

	private RegensubstanceFluid() {
		super(PROPERTIES);
	}

	public static class Source extends RegensubstanceFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends RegensubstanceFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
