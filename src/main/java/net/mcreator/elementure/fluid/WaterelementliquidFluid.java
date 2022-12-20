
package net.mcreator.elementure.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModFluids;
import net.mcreator.elementure.init.ElementureModBlocks;

public abstract class WaterelementliquidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(ElementureModFluids.WATERELEMENTLIQUID,
			ElementureModFluids.FLOWING_WATERELEMENTLIQUID, FluidAttributes.builder(new ResourceLocation("elementure:blocks/waterelementliquid"),
					new ResourceLocation("elementure:blocks/waterelementliquid")).luminosity(8).density(980).viscosity(960)

	).explosionResistance(100f)

			.bucket(ElementureModItems.WATERELEMENTLIQUID_BUCKET).block(() -> (LiquidBlock) ElementureModBlocks.WATERELEMENTLIQUID.get());

	private WaterelementliquidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends WaterelementliquidFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends WaterelementliquidFluid {
		public Flowing() {
			super();
		}

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
