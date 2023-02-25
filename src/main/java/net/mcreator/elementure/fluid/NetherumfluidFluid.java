
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

public abstract class NetherumfluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> ElementureModFluidTypes.NETHERUMFLUID_TYPE.get(), () -> ElementureModFluids.NETHERUMFLUID.get(),
			() -> ElementureModFluids.FLOWING_NETHERUMFLUID.get()).explosionResistance(2000f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(() -> ElementureModItems.NETHERUMFLUID_BUCKET.get()).block(() -> (LiquidBlock) ElementureModBlocks.NETHERUMFLUID.get());

	private NetherumfluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends NetherumfluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NetherumfluidFluid {
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
