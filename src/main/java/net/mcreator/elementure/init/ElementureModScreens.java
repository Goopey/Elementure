
/*
 *    MCreator note: This file will be REGENERATED on each build.
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
import net.mcreator.elementure.client.gui.FishingrecordDiseased1Screen;
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
			MenuScreens.register(ElementureModMenus.DEMONHEART_GUI, DemonheartGUIScreen::new);
			MenuScreens.register(ElementureModMenus.MYCENASHROOMVILLAGER_GUI, MycenashroomvillagerGUIScreen::new);
			MenuScreens.register(ElementureModMenus.MYCENASHROOMVILLAGER_GUI_2, MycenashroomvillagerGUI2Screen::new);
			MenuScreens.register(ElementureModMenus.RELICINVENTORY, RelicinventoryScreen::new);
			MenuScreens.register(ElementureModMenus.AGEDROSARY_GUI, AgedrosaryGUIScreen::new);
			MenuScreens.register(ElementureModMenus.SUITCASE_GUI, SuitcaseGUIScreen::new);
			MenuScreens.register(ElementureModMenus.POUCH_GUI, PouchGUIScreen::new);
			MenuScreens.register(ElementureModMenus.MEMORYMATRIX_GUI, MemorymatrixGuiScreen::new);
			MenuScreens.register(ElementureModMenus.BIRTHINGMODULE_GUI, BirthingmoduleGUIScreen::new);
			MenuScreens.register(ElementureModMenus.CUSTOMFISHINGROD_INVENTORY, CustomfishingrodInventoryScreen::new);
			MenuScreens.register(ElementureModMenus.SOULFORGE_GUI, SoulforgeGUIScreen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_1, Fishingrecord1Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_REGULAR_1, FishingrecordRegular1Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_LEGENDARY_1, FishingrecordLegendary1Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_REGULAR_2, FishingrecordRegular2Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_LAVA_1, FishingrecordLava1Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_DISEASED_1, FishingrecordDiseased1Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_VOID_1, FishingrecordVoid1Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_MYCENA_1, FishingrecordMycena1Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_NETHER_STAR_1, FishingrecordNetherStar1Screen::new);
			MenuScreens.register(ElementureModMenus.MUSICPLAYER_GUI, MusicplayerGUIScreen::new);
			MenuScreens.register(ElementureModMenus.MUSICPLAYER_GUI_2, MusicplayerGUI2Screen::new);
			MenuScreens.register(ElementureModMenus.CREDITS_MUSIC_GUI, CreditsMusicGUIScreen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_JELLY_POOLS_1, FishingrecordJellyPools1Screen::new);
			MenuScreens.register(ElementureModMenus.BELTPOUCH_GUI, BeltpouchGUIScreen::new);
			MenuScreens.register(ElementureModMenus.WEAPONALTAR_GUI, WeaponaltarGUIScreen::new);
			MenuScreens.register(ElementureModMenus.GLASSLIGHTBREWER_GUI, GlasslightbrewerGUIScreen::new);
			MenuScreens.register(ElementureModMenus.GLASSBELLBOAT_GUI, GlassbellboatGUIScreen::new);
			MenuScreens.register(ElementureModMenus.CREDITS_MUSIC_GUI_2, CreditsMusicGUI2Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_SHELLFISH, FishingrecordShellfishScreen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_DUNGEONWATER, FishingrecordDungeonwaterScreen::new);
			MenuScreens.register(ElementureModMenus.CRABPOT_GUI, CrabpotGUIScreen::new);
			MenuScreens.register(ElementureModMenus.NANOSHRIMP_GUI, NanoshrimpGUIScreen::new);
			MenuScreens.register(ElementureModMenus.MUSICPLAYER_GUI_3, MusicplayerGUI3Screen::new);
			MenuScreens.register(ElementureModMenus.FISHINGRECORD_WINDYSHORES, FishingrecordWindyshoresScreen::new);
		});
	}
}
