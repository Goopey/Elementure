
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.elementure.world.inventory.WeaponaltarGUIMenu;
import net.mcreator.elementure.world.inventory.SuitcaseGUIMenu;
import net.mcreator.elementure.world.inventory.SoulforgeGUIMenu;
import net.mcreator.elementure.world.inventory.ScribingStationGUIMenu;
import net.mcreator.elementure.world.inventory.RelicinventoryMenu;
import net.mcreator.elementure.world.inventory.PouchGUIMenu;
import net.mcreator.elementure.world.inventory.NanoshrimpGUIMenu;
import net.mcreator.elementure.world.inventory.MycenashroomvillagerGUIMenu;
import net.mcreator.elementure.world.inventory.MycenashroomvillagerGUI2Menu;
import net.mcreator.elementure.world.inventory.MusicplayerGUIMenu;
import net.mcreator.elementure.world.inventory.MusicplayerGUI3Menu;
import net.mcreator.elementure.world.inventory.MusicplayerGUI2Menu;
import net.mcreator.elementure.world.inventory.MemorymatrixGuiMenu;
import net.mcreator.elementure.world.inventory.GlasslightbrewerGUIMenu;
import net.mcreator.elementure.world.inventory.GlassbellboatGUIMenu;
import net.mcreator.elementure.world.inventory.FishingrecordWindyshoresMenu;
import net.mcreator.elementure.world.inventory.FishingrecordVoid1Menu;
import net.mcreator.elementure.world.inventory.FishingrecordShellfishMenu;
import net.mcreator.elementure.world.inventory.FishingrecordRegular2Menu;
import net.mcreator.elementure.world.inventory.FishingrecordRegular1Menu;
import net.mcreator.elementure.world.inventory.FishingrecordNetherStar1Menu;
import net.mcreator.elementure.world.inventory.FishingrecordMycena1Menu;
import net.mcreator.elementure.world.inventory.FishingrecordLegendary1Menu;
import net.mcreator.elementure.world.inventory.FishingrecordLava1Menu;
import net.mcreator.elementure.world.inventory.FishingrecordJellyPools1Menu;
import net.mcreator.elementure.world.inventory.FishingrecordDungeonwaterMenu;
import net.mcreator.elementure.world.inventory.FishingrecordDiverscrownMenu;
import net.mcreator.elementure.world.inventory.FishingrecordDiseased1Menu;
import net.mcreator.elementure.world.inventory.Fishingrecord2Menu;
import net.mcreator.elementure.world.inventory.Fishingrecord1Menu;
import net.mcreator.elementure.world.inventory.DemonheartGUIMenu;
import net.mcreator.elementure.world.inventory.CustomfishingrodInventoryMenu;
import net.mcreator.elementure.world.inventory.CreditsMusicGUIMenu;
import net.mcreator.elementure.world.inventory.CreditsMusicGUI2Menu;
import net.mcreator.elementure.world.inventory.CrabpotGUIMenu;
import net.mcreator.elementure.world.inventory.BirthingmoduleGUIMenu;
import net.mcreator.elementure.world.inventory.BeltpouchGUIMenu;
import net.mcreator.elementure.world.inventory.AgedrosaryGUIMenu;
import net.mcreator.elementure.ElementureMod;

public class ElementureModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ElementureMod.MODID);
	public static final RegistryObject<MenuType<DemonheartGUIMenu>> DEMONHEART_GUI = REGISTRY.register("demonheart_gui", () -> IForgeMenuType.create(DemonheartGUIMenu::new));
	public static final RegistryObject<MenuType<MycenashroomvillagerGUIMenu>> MYCENASHROOMVILLAGER_GUI = REGISTRY.register("mycenashroomvillager_gui", () -> IForgeMenuType.create(MycenashroomvillagerGUIMenu::new));
	public static final RegistryObject<MenuType<MycenashroomvillagerGUI2Menu>> MYCENASHROOMVILLAGER_GUI_2 = REGISTRY.register("mycenashroomvillager_gui_2", () -> IForgeMenuType.create(MycenashroomvillagerGUI2Menu::new));
	public static final RegistryObject<MenuType<RelicinventoryMenu>> RELICINVENTORY = REGISTRY.register("relicinventory", () -> IForgeMenuType.create(RelicinventoryMenu::new));
	public static final RegistryObject<MenuType<AgedrosaryGUIMenu>> AGEDROSARY_GUI = REGISTRY.register("agedrosary_gui", () -> IForgeMenuType.create(AgedrosaryGUIMenu::new));
	public static final RegistryObject<MenuType<SuitcaseGUIMenu>> SUITCASE_GUI = REGISTRY.register("suitcase_gui", () -> IForgeMenuType.create(SuitcaseGUIMenu::new));
	public static final RegistryObject<MenuType<PouchGUIMenu>> POUCH_GUI = REGISTRY.register("pouch_gui", () -> IForgeMenuType.create(PouchGUIMenu::new));
	public static final RegistryObject<MenuType<MemorymatrixGuiMenu>> MEMORYMATRIX_GUI = REGISTRY.register("memorymatrix_gui", () -> IForgeMenuType.create(MemorymatrixGuiMenu::new));
	public static final RegistryObject<MenuType<BirthingmoduleGUIMenu>> BIRTHINGMODULE_GUI = REGISTRY.register("birthingmodule_gui", () -> IForgeMenuType.create(BirthingmoduleGUIMenu::new));
	public static final RegistryObject<MenuType<CustomfishingrodInventoryMenu>> CUSTOMFISHINGROD_INVENTORY = REGISTRY.register("customfishingrod_inventory", () -> IForgeMenuType.create(CustomfishingrodInventoryMenu::new));
	public static final RegistryObject<MenuType<SoulforgeGUIMenu>> SOULFORGE_GUI = REGISTRY.register("soulforge_gui", () -> IForgeMenuType.create(SoulforgeGUIMenu::new));
	public static final RegistryObject<MenuType<Fishingrecord1Menu>> FISHINGRECORD_1 = REGISTRY.register("fishingrecord_1", () -> IForgeMenuType.create(Fishingrecord1Menu::new));
	public static final RegistryObject<MenuType<FishingrecordRegular1Menu>> FISHINGRECORD_REGULAR_1 = REGISTRY.register("fishingrecord_regular_1", () -> IForgeMenuType.create(FishingrecordRegular1Menu::new));
	public static final RegistryObject<MenuType<FishingrecordLegendary1Menu>> FISHINGRECORD_LEGENDARY_1 = REGISTRY.register("fishingrecord_legendary_1", () -> IForgeMenuType.create(FishingrecordLegendary1Menu::new));
	public static final RegistryObject<MenuType<FishingrecordRegular2Menu>> FISHINGRECORD_REGULAR_2 = REGISTRY.register("fishingrecord_regular_2", () -> IForgeMenuType.create(FishingrecordRegular2Menu::new));
	public static final RegistryObject<MenuType<FishingrecordLava1Menu>> FISHINGRECORD_LAVA_1 = REGISTRY.register("fishingrecord_lava_1", () -> IForgeMenuType.create(FishingrecordLava1Menu::new));
	public static final RegistryObject<MenuType<FishingrecordDiseased1Menu>> FISHINGRECORD_DISEASED_1 = REGISTRY.register("fishingrecord_diseased_1", () -> IForgeMenuType.create(FishingrecordDiseased1Menu::new));
	public static final RegistryObject<MenuType<FishingrecordVoid1Menu>> FISHINGRECORD_VOID_1 = REGISTRY.register("fishingrecord_void_1", () -> IForgeMenuType.create(FishingrecordVoid1Menu::new));
	public static final RegistryObject<MenuType<FishingrecordMycena1Menu>> FISHINGRECORD_MYCENA_1 = REGISTRY.register("fishingrecord_mycena_1", () -> IForgeMenuType.create(FishingrecordMycena1Menu::new));
	public static final RegistryObject<MenuType<FishingrecordNetherStar1Menu>> FISHINGRECORD_NETHER_STAR_1 = REGISTRY.register("fishingrecord_nether_star_1", () -> IForgeMenuType.create(FishingrecordNetherStar1Menu::new));
	public static final RegistryObject<MenuType<MusicplayerGUIMenu>> MUSICPLAYER_GUI = REGISTRY.register("musicplayer_gui", () -> IForgeMenuType.create(MusicplayerGUIMenu::new));
	public static final RegistryObject<MenuType<MusicplayerGUI2Menu>> MUSICPLAYER_GUI_2 = REGISTRY.register("musicplayer_gui_2", () -> IForgeMenuType.create(MusicplayerGUI2Menu::new));
	public static final RegistryObject<MenuType<CreditsMusicGUIMenu>> CREDITS_MUSIC_GUI = REGISTRY.register("credits_music_gui", () -> IForgeMenuType.create(CreditsMusicGUIMenu::new));
	public static final RegistryObject<MenuType<FishingrecordJellyPools1Menu>> FISHINGRECORD_JELLY_POOLS_1 = REGISTRY.register("fishingrecord_jelly_pools_1", () -> IForgeMenuType.create(FishingrecordJellyPools1Menu::new));
	public static final RegistryObject<MenuType<BeltpouchGUIMenu>> BELTPOUCH_GUI = REGISTRY.register("beltpouch_gui", () -> IForgeMenuType.create(BeltpouchGUIMenu::new));
	public static final RegistryObject<MenuType<WeaponaltarGUIMenu>> WEAPONALTAR_GUI = REGISTRY.register("weaponaltar_gui", () -> IForgeMenuType.create(WeaponaltarGUIMenu::new));
	public static final RegistryObject<MenuType<GlasslightbrewerGUIMenu>> GLASSLIGHTBREWER_GUI = REGISTRY.register("glasslightbrewer_gui", () -> IForgeMenuType.create(GlasslightbrewerGUIMenu::new));
	public static final RegistryObject<MenuType<GlassbellboatGUIMenu>> GLASSBELLBOAT_GUI = REGISTRY.register("glassbellboat_gui", () -> IForgeMenuType.create(GlassbellboatGUIMenu::new));
	public static final RegistryObject<MenuType<CreditsMusicGUI2Menu>> CREDITS_MUSIC_GUI_2 = REGISTRY.register("credits_music_gui_2", () -> IForgeMenuType.create(CreditsMusicGUI2Menu::new));
	public static final RegistryObject<MenuType<FishingrecordShellfishMenu>> FISHINGRECORD_SHELLFISH = REGISTRY.register("fishingrecord_shellfish", () -> IForgeMenuType.create(FishingrecordShellfishMenu::new));
	public static final RegistryObject<MenuType<FishingrecordDungeonwaterMenu>> FISHINGRECORD_DUNGEONWATER = REGISTRY.register("fishingrecord_dungeonwater", () -> IForgeMenuType.create(FishingrecordDungeonwaterMenu::new));
	public static final RegistryObject<MenuType<CrabpotGUIMenu>> CRABPOT_GUI = REGISTRY.register("crabpot_gui", () -> IForgeMenuType.create(CrabpotGUIMenu::new));
	public static final RegistryObject<MenuType<NanoshrimpGUIMenu>> NANOSHRIMP_GUI = REGISTRY.register("nanoshrimp_gui", () -> IForgeMenuType.create(NanoshrimpGUIMenu::new));
	public static final RegistryObject<MenuType<MusicplayerGUI3Menu>> MUSICPLAYER_GUI_3 = REGISTRY.register("musicplayer_gui_3", () -> IForgeMenuType.create(MusicplayerGUI3Menu::new));
	public static final RegistryObject<MenuType<FishingrecordWindyshoresMenu>> FISHINGRECORD_WINDYSHORES = REGISTRY.register("fishingrecord_windyshores", () -> IForgeMenuType.create(FishingrecordWindyshoresMenu::new));
	public static final RegistryObject<MenuType<Fishingrecord2Menu>> FISHINGRECORD_2 = REGISTRY.register("fishingrecord_2", () -> IForgeMenuType.create(Fishingrecord2Menu::new));
	public static final RegistryObject<MenuType<FishingrecordDiverscrownMenu>> FISHINGRECORD_DIVERSCROWN = REGISTRY.register("fishingrecord_diverscrown", () -> IForgeMenuType.create(FishingrecordDiverscrownMenu::new));
	public static final RegistryObject<MenuType<ScribingStationGUIMenu>> SCRIBING_STATION_GUI = REGISTRY.register("scribing_station_gui", () -> IForgeMenuType.create(ScribingStationGUIMenu::new));
}
