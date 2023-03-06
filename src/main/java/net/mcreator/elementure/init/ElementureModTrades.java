
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.elementure.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ElementureModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 20),

				new ItemStack(ElementureModItems.RAINPOLE.get()), 1, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 20),

				new ItemStack(ElementureModItems.THUNDERPOLE.get()), 1, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 20),

				new ItemStack(ElementureModItems.CLEARPOLE.get()), 1, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 6),

				new ItemStack(ElementureModBlocks.PURPLEMUSHROOMS.get(), 3), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 8),

				new ItemStack(ElementureModItems.STRONGKEY.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 32),

				new ItemStack(ElementureModItems.MASTERKEY.get()), 10, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 16), new ItemStack(Blocks.OBSIDIAN, 4), new ItemStack(ElementureModItems.OBSIDIANBOBBER.get()), 1, 20, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ElementureModItems.IRONBOBBER.get()), 2, 12, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 16), new ItemStack(Blocks.OBSIDIAN, 4), new ItemStack(ElementureModItems.OBSIDIANBOBBER.get()), 1, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(ElementureModItems.PIP.get(), 4), new ItemStack(ElementureModItems.CRABBOBBER.get()), 2, 12, 0.05f));
		}
	}
}
