
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

public abstract class LightningelementliquidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(ElementureModFluids.LIGHTNINGELEMENTLIQUID,
			ElementureModFluids.FLOWING_LIGHTNINGELEMENTLIQUID,
			FluidAttributes.builder(new ResourceLocation("elementure:blocks/lightningelementliquid"),
					new ResourceLocation("elementure:blocks/lightningelementliquid")).luminosity(8).density(328).viscosity(480)

	).explosionResistance(100f)

			.bucket(ElementureModItems.LIGHTNINGELEMENTLIQUID_BUCKET).block(() -> (LiquidBlock) ElementureModBlocks.LIGHTNINGELEMENTLIQUID.get());

	private LightningelementliquidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LightningelementliquidFluid {
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

	public static class Flowing extends LightningelementliquidFluid {
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
