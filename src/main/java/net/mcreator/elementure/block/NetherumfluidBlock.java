
package net.mcreator.elementure.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModFluids;

public class NetherumfluidBlock extends LiquidBlock {
	public NetherumfluidBlock() {
		super(() -> ElementureModFluids.NETHERUMFLUID.get(),
				BlockBehaviour.Properties.of(Material.LAVA, MaterialColor.WOOL).strength(2000f).lightLevel(s -> 15).noCollission().noLootTable());
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
