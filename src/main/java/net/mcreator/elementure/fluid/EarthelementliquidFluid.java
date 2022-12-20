
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

public abstract class EarthelementliquidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(ElementureModFluids.EARTHELEMENTLIQUID,
			ElementureModFluids.FLOWING_EARTHELEMENTLIQUID, FluidAttributes.builder(new ResourceLocation("elementure:blocks/earthelementliquid"),
					new ResourceLocation("elementure:blocks/earthelementliquid")).luminosity(8).density(780).viscosity(980)

	).explosionResistance(100f)

			.bucket(ElementureModItems.EARTHELEMENTLIQUID_BUCKET).block(() -> (LiquidBlock) ElementureModBlocks.EARTHELEMENTLIQUID.get());

	private EarthelementliquidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends EarthelementliquidFluid {
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

	public static class Flowing extends EarthelementliquidFluid {
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
