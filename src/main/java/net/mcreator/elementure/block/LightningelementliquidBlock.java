
package net.mcreator.elementure.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.elementure.init.ElementureModFluids;

public class LightningelementliquidBlock extends LiquidBlock {
	public LightningelementliquidBlock() {
		super(() -> ElementureModFluids.LIGHTNINGELEMENTLIQUID.get(),
				BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
