
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class ElementureModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == ElementureModBlocks.SHARDLESSMAELSTROMLOG.get().asItem())
			event.setBurnTime(3200);
		else if (itemstack.getItem() == ElementureModItems.TROUISH.get())
			event.setBurnTime(2400);
		else if (itemstack.getItem() == ElementureModItems.PACU.get())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == ElementureModItems.PRISMITESHARD.get())
			event.setBurnTime(3200);
		else if (itemstack.getItem() == ElementureModBlocks.FLUFFLOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.FLUFFLOGFULL.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.STRIPPED_FLUFFLOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.STRIPPED_FLUFFLOGFULL.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.FLUFFPLANKS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.FLUFFSLABPLANKS.get().asItem())
			event.setBurnTime(150);
		else if (itemstack.getItem() == ElementureModBlocks.FLUFFSTAIRPLANKS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.FLUFFPLANKFENCE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.FLUFFGATEPLANKS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.FLUFFPLANKTRAPDOOR.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.FLUFFPLANKDOOR.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.FLUFFPLANKBUTTON.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.FLUFFPLANKPRESSUREPLATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.WORTASHROOTS.get().asItem())
			event.setBurnTime(450);
		else if (itemstack.getItem() == ElementureModBlocks.FLUFFSAPLING.get().asItem())
			event.setBurnTime(150);
		else if (itemstack.getItem() == ElementureModBlocks.WORTASHSAPLING.get().asItem())
			event.setBurnTime(150);
		else if (itemstack.getItem() == ElementureModBlocks.BLUETHORNSAPLING.get().asItem())
			event.setBurnTime(150);
		else if (itemstack.getItem() == ElementureModBlocks.LILYPADPLANKS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.STRIPPEDLILYPADLOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.LILYPADLOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.LILYPADLOG_FULL.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.LILYPADSAPLING.get().asItem())
			event.setBurnTime(150);
		else if (itemstack.getItem() == ElementureModBlocks.LILYPADPLANK_STAIRS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.LILYPADPLANKSLABS.get().asItem())
			event.setBurnTime(150);
		else if (itemstack.getItem() == ElementureModBlocks.LILYPADPLANKS_GATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.LILYPADPLANKS_FENCE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.LILYPADPLANKS_BUTTON.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.LILYPADPLANKS_PRESSUREPLATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.LILYPADPLANKS_DOOR.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ElementureModBlocks.LILYPADPLANKS_TRAPDOOR.get().asItem())
			event.setBurnTime(300);
	}
}
