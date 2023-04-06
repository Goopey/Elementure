
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.elementure.client.gui.WeaponaltarGUIScreen;
import net.mcreator.elementure.client.gui.SuitcaseGUIScreen;
import net.mcreator.elementure.client.gui.SoulforgeGUIScreen;
import net.mcreator.elementure.client.gui.ScribingStationGUIScreen;
import net.mcreator.elementure.client.gui.RelicinventoryScreen;
import net.mcreator.elementure.client.gui.PouchGUIScreen;
import net.mcreator.elementure.client.gui.NanoshrimpGUIScreen;
import net.mcreator.elementure.client.gui.MycenashroomvillagerGUIScreen;
import net.mcreator.elementure.client.gui.MycenashroomvillagerGUI2Screen;
import net.mcreator.elementure.client.gui.MusicplayerGUIScreen;
import net.mcreator.elementure.client.gui.MusicplayerGUI3Screen;
import net.mcreator.elementure.client.gui.MusicplayerGUI2Screen;
import net.mcreator.elementure.client.gui.MemorymatrixGuiScreen;
import net.mcreator.elementure.client.gui.GlasslightbrewerGUIScreen;
import net.mcreator.elementure.client.gui.GlassbellboatGUIScreen;
import net.mcreator.elementure.client.gui.FishingrecordWindyshoresScreen;
import net.mcreator.elementure.client.gui.FishingrecordVoid1Screen;
import net.mcreator.elementure.client.gui.FishingrecordShellfishScreen;
import net.mcreator.elementure.client.gui.FishingrecordRegular2Screen;
import net.mcreator.elementure.client.gui.FishingrecordRegular1Screen;
import net.mcreator.elementure.client.gui.FishingrecordNetherStar1Screen;
import net.mcreator.elementure.client.gui.FishingrecordMycena1Screen;
import net.mcreator.elementure.client.gui.FishingrecordLegendary1Screen;
import net.mcreator.elementure.client.gui.FishingrecordLava1Screen;
import net.mcreator.elementure.client.gui.FishingrecordJellyPools1Screen;
import net.mcreator.elementure.client.gui.FishingrecordDungeonwaterScreen;
import net.mcreator.elementure.client.gui.FishingrecordDiverscrownScreen;
import net.mcreator.elementure.client.gui.FishingrecordDiseased1Screen;
import net.mcreator.elementure.client.gui.Fishingrecord2Screen;
import net.mcreator.elementure.client.gui.Fishingrecord1Screen;
import net.mcreator.elementure.client.gui.DemonheartGUIScreen;
import net.mcreator.elementure.client.gui.CustomfishingrodInventoryScreen;
import net.mcreator.elementure.client.gui.CreditsMusicGUIScreen;
import net.mcreator.elementure.client.gui.CreditsMusicGUI2Screen;
import net.mcreator.elementure.client.gui.CrabpotGUIScreen;
import net.mcreator.elementure.client.gui.BirthingmoduleGUIScreen;
import net.mcreator.elementure.client.gui.BeltpouchGUIScreen;
import net.mcreator.elementure.client.gui.AgedrosaryGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ElementureModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ElementureModMenus.DEMONHEART_GUI.get(), DemonheartGUIScreen::new);
			MenuScreens.register(ElementureModMenus.MYCENASHROOMVILLAGER_GUI.get(), MycenashroomvillagerGUIScreen::new);
			MenuScreens.register(ElementureModMenus.MYCENASHROOMVILLAGER_GUI_2.get(), MycenashroomvillagerGUI2Screen::new);
			MenuScreens.register(ElementureModMenus.RELICINVENTORY.get(), RelicinventoryScreen::new);
			MenuScreens.register(ElementureModMenus.AGEDROSARY_GUI.get(), AgedrosaryGUIScreen::new);
			MenuScreens.register(ElementureModMenus.SUITCASE_GUI.get(), SuitcaseGUIScreen::new);
			MenuScreens.register(ElementureModMenus.POUCH_GUI.get(), PouchGUIScreen::new);
			MenuScreens.register(ElementureModMenus.MEMORYMATRIX_GUI.get(), MemorymatrixGuiScreen::new);
			MenuScreens.register(ElementureModMenus.BIRTHINGMODULE_GUI.get(), BirthingmoduleGUIScreen::new);
			MenuScreens.register(ElementureModMenus.CUSTOMFISHINGROD_INVENTORY.get(), CustomfishingrodInventoryScreen::new);
			MenuScreens.register(ElementureModMenus.SOULFORGE_GUI.get(), SoulforgeGUIScreen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_1.get(), Fishingrecord1Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_REGULAR_1.get(), FishingrecordRegular1Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_LEGENDARY_1.get(), FishingrecordLegendary1Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_REGULAR_2.get(), FishingrecordRegular2Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_LAVA_1.get(), FishingrecordLava1Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_DISEASED_1.get(), FishingrecordDiseased1Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_VOID_1.get(), FishingrecordVoid1Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_MYCENA_1.get(), FishingrecordMycena1Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_NETHER_STAR_1.get(), FishingrecordNetherStar1Screen::new);
			MenuScreens.register(ElementureModMenus.MUSICPLAYER_GUI.get(), MusicplayerGUIScreen::new);
			MenuScreens.register(ElementureModMenus.MUSICPLAYER_GUI_2.get(), MusicplayerGUI2Screen::new);
			MenuScreens.register(ElementureModMenus.CREDITS_MUSIC_GUI.get(), CreditsMusicGUIScreen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_JELLY_POOLS_1.get(), FishingrecordJellyPools1Screen::new);
			MenuScreens.register(ElementureModMenus.BELTPOUCH_GUI.get(), BeltpouchGUIScreen::new);
			MenuScreens.register(ElementureModMenus.WEAPONALTAR_GUI.get(), WeaponaltarGUIScreen::new);
			MenuScreens.register(ElementureModMenus.GLASSLIGHTBREWER_GUI.get(), GlasslightbrewerGUIScreen::new);
			MenuScreens.register(ElementureModMenus.GLASSBELLBOAT_GUI.get(), GlassbellboatGUIScreen::new);
			MenuScreens.register(ElementureModMenus.CREDITS_MUSIC_GUI_2.get(), CreditsMusicGUI2Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_SHELLFISH.get(), FishingrecordShellfishScreen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_DUNGEONWATER.get(), FishingrecordDungeonwaterScreen::new);
			MenuScreens.register(ElementureModMenus.CRABPOT_GUI.get(), CrabpotGUIScreen::new);
			MenuScreens.register(ElementureModMenus.NANOSHRIMP_GUI.get(), NanoshrimpGUIScreen::new);
			MenuScreens.register(ElementureModMenus.MUSICPLAYER_GUI_3.get(), MusicplayerGUI3Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_WINDYSHORES.get(), FishingrecordWindyshoresScreen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_2.get(), Fishingrecord2Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_DIVERSCROWN.get(), FishingrecordDiverscrownScreen::new);
			MenuScreens.register(ElementureModMenus.SCRIBING_STATION_GUI.get(), ScribingStationGUIScreen::new);
		});
	}
}
