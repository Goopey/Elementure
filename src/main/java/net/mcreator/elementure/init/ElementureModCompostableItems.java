
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElementureModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(ElementureModBlocks.FLUFFSAPLING.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(ElementureModBlocks.WORTASHSAPLING.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(ElementureModBlocks.BLUETHORNSAPLING.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(ElementureModBlocks.LILYPADSAPLING.get().asItem(), 0.3f);
	}
}
