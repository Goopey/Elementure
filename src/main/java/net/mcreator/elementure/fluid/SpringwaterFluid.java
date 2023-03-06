
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

public abstract class SpringwaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ElementureModFluidTypes.SPRINGWATER_TYPE.get(), () -> ElementureModFluids.SPRINGWATER.get(), () -> ElementureModFluids.FLOWING_SPRINGWATER.get())
			.explosionResistance(100f).bucket(() -> ElementureModItems.SPRINGWATER_BUCKET.get()).block(() -> (LiquidBlock) ElementureModBlocks.SPRINGWATER.get());

	private SpringwaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SpringwaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SpringwaterFluid {
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
