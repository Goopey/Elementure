
package net.mcreator.elementure.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.elementure.init.ElementureModFluids;

public class EarthelementliquidBlock extends LiquidBlock {
	public EarthelementliquidBlock() {
		super(() -> (FlowingFluid) ElementureModFluids.EARTHELEMENTLIQUID.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
