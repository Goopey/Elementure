
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.elementure.world.inventory.WeaponaltarGUIMenu;
import net.mcreator.elementure.world.inventory.SuitcaseGUIMenu;
import net.mcreator.elementure.world.inventory.SoulforgeGUIMenu;
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
import net.mcreator.elementure.world.inventory.FishingrecordDiseased1Menu;
import net.mcreator.elementure.world.inventory.Fishingrecord1Menu;
import net.mcreator.elementure.world.inventory.DemonheartGUIMenu;
import net.mcreator.elementure.world.inventory.CustomfishingrodInventoryMenu;
import net.mcreator.elementure.world.inventory.CreditsMusicGUIMenu;
import net.mcreator.elementure.world.inventory.CreditsMusicGUI2Menu;
import net.mcreator.elementure.world.inventory.CrabpotGUIMenu;
import net.mcreator.elementure.world.inventory.BirthingmoduleGUIMenu;
import net.mcreator.elementure.world.inventory.BeltpouchGUIMenu;
import net.mcreator.elementure.world.inventory.AgedrosaryGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElementureModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<DemonheartGUIMenu> DEMONHEART_GUI = register("demonheart_gui",
			(id, inv, extraData) -> new DemonheartGUIMenu(id, inv, extraData));
	public static final MenuType<MycenashroomvillagerGUIMenu> MYCENASHROOMVILLAGER_GUI = register("mycenashroomvillager_gui",
			(id, inv, extraData) -> new MycenashroomvillagerGUIMenu(id, inv, extraData));
	public static final MenuType<MycenashroomvillagerGUI2Menu> MYCENASHROOMVILLAGER_GUI_2 = register("mycenashroomvillager_gui_2",
			(id, inv, extraData) -> new MycenashroomvillagerGUI2Menu(id, inv, extraData));
	public static final MenuType<RelicinventoryMenu> RELICINVENTORY = register("relicinventory",
			(id, inv, extraData) -> new RelicinventoryMenu(id, inv, extraData));
	public static final MenuType<AgedrosaryGUIMenu> AGEDROSARY_GUI = register("agedrosary_gui",
			(id, inv, extraData) -> new AgedrosaryGUIMenu(id, inv, extraData));
	public static final MenuType<SuitcaseGUIMenu> SUITCASE_GUI = register("suitcase_gui",
			(id, inv, extraData) -> new SuitcaseGUIMenu(id, inv, extraData));
	public static final MenuType<PouchGUIMenu> POUCH_GUI = register("pouch_gui", (id, inv, extraData) -> new PouchGUIMenu(id, inv, extraData));
	public static final MenuType<MemorymatrixGuiMenu> MEMORYMATRIX_GUI = register("memorymatrix_gui",
			(id, inv, extraData) -> new MemorymatrixGuiMenu(id, inv, extraData));
	public static final MenuType<BirthingmoduleGUIMenu> BIRTHINGMODULE_GUI = register("birthingmodule_gui",
			(id, inv, extraData) -> new BirthingmoduleGUIMenu(id, inv, extraData));
	public static final MenuType<CustomfishingrodInventoryMenu> CUSTOMFISHINGROD_INVENTORY = register("customfishingrod_inventory",
			(id, inv, extraData) -> new CustomfishingrodInventoryMenu(id, inv, extraData));
	public static final MenuType<SoulforgeGUIMenu> SOULFORGE_GUI = register("soulforge_gui",
			(id, inv, extraData) -> new SoulforgeGUIMenu(id, inv, extraData));
	public static final MenuType<Fishingrecord1Menu> FISHINGRECORD_1 = register("fishingrecord_1",
			(id, inv, extraData) -> new Fishingrecord1Menu(id, inv, extraData));
	public static final MenuType<FishingrecordRegular1Menu> FISHINGRECORD_REGULAR_1 = register("fishingrecord_regular_1",
			(id, inv, extraData) -> new FishingrecordRegular1Menu(id, inv, extraData));
	public static final MenuType<FishingrecordLegendary1Menu> FISHINGRECORD_LEGENDARY_1 = register("fishingrecord_legendary_1",
			(id, inv, extraData) -> new FishingrecordLegendary1Menu(id, inv, extraData));
	public static final MenuType<FishingrecordRegular2Menu> FISHINGRECORD_REGULAR_2 = register("fishingrecord_regular_2",
			(id, inv, extraData) -> new FishingrecordRegular2Menu(id, inv, extraData));
	public static final MenuType<FishingrecordLava1Menu> FISHINGRECORD_LAVA_1 = register("fishingrecord_lava_1",
			(id, inv, extraData) -> new FishingrecordLava1Menu(id, inv, extraData));
	public static final MenuType<FishingrecordDiseased1Menu> FISHINGRECORD_DISEASED_1 = register("fishingrecord_diseased_1",
			(id, inv, extraData) -> new FishingrecordDiseased1Menu(id, inv, extraData));
	public static final MenuType<FishingrecordVoid1Menu> FISHINGRECORD_VOID_1 = register("fishingrecord_void_1",
			(id, inv, extraData) -> new FishingrecordVoid1Menu(id, inv, extraData));
	public static final MenuType<FishingrecordMycena1Menu> FISHINGRECORD_MYCENA_1 = register("fishingrecord_mycena_1",
			(id, inv, extraData) -> new FishingrecordMycena1Menu(id, inv, extraData));
	public static final MenuType<FishingrecordNetherStar1Menu> FISHINGRECORD_NETHER_STAR_1 = register("fishingrecord_nether_star_1",
			(id, inv, extraData) -> new FishingrecordNetherStar1Menu(id, inv, extraData));
	public static final MenuType<MusicplayerGUIMenu> MUSICPLAYER_GUI = register("musicplayer_gui",
			(id, inv, extraData) -> new MusicplayerGUIMenu(id, inv, extraData));
	public static final MenuType<MusicplayerGUI2Menu> MUSICPLAYER_GUI_2 = register("musicplayer_gui_2",
			(id, inv, extraData) -> new MusicplayerGUI2Menu(id, inv, extraData));
	public static final MenuType<CreditsMusicGUIMenu> CREDITS_MUSIC_GUI = register("credits_music_gui",
			(id, inv, extraData) -> new CreditsMusicGUIMenu(id, inv, extraData));
	public static final MenuType<FishingrecordJellyPools1Menu> FISHINGRECORD_JELLY_POOLS_1 = register("fishingrecord_jelly_pools_1",
			(id, inv, extraData) -> new FishingrecordJellyPools1Menu(id, inv, extraData));
	public static final MenuType<BeltpouchGUIMenu> BELTPOUCH_GUI = register("beltpouch_gui",
			(id, inv, extraData) -> new BeltpouchGUIMenu(id, inv, extraData));
	public static final MenuType<WeaponaltarGUIMenu> WEAPONALTAR_GUI = register("weaponaltar_gui",
			(id, inv, extraData) -> new WeaponaltarGUIMenu(id, inv, extraData));
	public static final MenuType<GlasslightbrewerGUIMenu> GLASSLIGHTBREWER_GUI = register("glasslightbrewer_gui",
			(id, inv, extraData) -> new GlasslightbrewerGUIMenu(id, inv, extraData));
	public static final MenuType<GlassbellboatGUIMenu> GLASSBELLBOAT_GUI = register("glassbellboat_gui",
			(id, inv, extraData) -> new GlassbellboatGUIMenu(id, inv, extraData));
	public static final MenuType<CreditsMusicGUI2Menu> CREDITS_MUSIC_GUI_2 = register("credits_music_gui_2",
			(id, inv, extraData) -> new CreditsMusicGUI2Menu(id, inv, extraData));
	public static final MenuType<FishingrecordShellfishMenu> FISHINGRECORD_SHELLFISH = register("fishingrecord_shellfish",
			(id, inv, extraData) -> new FishingrecordShellfishMenu(id, inv, extraData));
	public static final MenuType<FishingrecordDungeonwaterMenu> FISHINGRECORD_DUNGEONWATER = register("fishingrecord_dungeonwater",
			(id, inv, extraData) -> new FishingrecordDungeonwaterMenu(id, inv, extraData));
	public static final MenuType<CrabpotGUIMenu> CRABPOT_GUI = register("crabpot_gui",
			(id, inv, extraData) -> new CrabpotGUIMenu(id, inv, extraData));
	public static final MenuType<NanoshrimpGUIMenu> NANOSHRIMP_GUI = register("nanoshrimp_gui",
			(id, inv, extraData) -> new NanoshrimpGUIMenu(id, inv, extraData));
	public static final MenuType<MusicplayerGUI3Menu> MUSICPLAYER_GUI_3 = register("musicplayer_gui_3",
			(id, inv, extraData) -> new MusicplayerGUI3Menu(id, inv, extraData));
	public static final MenuType<FishingrecordWindyshoresMenu> FISHINGRECORD_WINDYSHORES = register("fishingrecord_windyshores",
			(id, inv, extraData) -> new FishingrecordWindyshoresMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
