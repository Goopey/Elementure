
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ElementureModTabs {
	public static CreativeModeTab TAB_TABMODDEDARMOR;
	public static CreativeModeTab TAB_TABMODDEDSWORDS;
	public static CreativeModeTab TAB_TABMODDEDTOOLS;
	public static CreativeModeTab TAB_TABMODDEDORE;
	public static CreativeModeTab TAB_TABMODDEDITEMS;
	public static CreativeModeTab TAB_TABMODDDEDFOOD;
	public static CreativeModeTab TAB_TABMODDEDBLOCKS;
	public static CreativeModeTab TAB_TABMODDEDBOSS;
	public static CreativeModeTab TAB_SKILLWINDOW;
	public static CreativeModeTab TAB_FISHINGTAB;
	public static CreativeModeTab TAB_FORGOTTENBLOCKS_TAB;
	public static CreativeModeTab TAB_FORGOTTEN_ITEMS_TAB;
	public static CreativeModeTab TAB_FORGOTTENSPECIALITEMS_TAB;

	public static void load() {
		TAB_TABMODDEDARMOR = new CreativeModeTab("tabtabmoddedarmor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElementureModItems.KNIGHTMASTERARMOR_CHESTPLATE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TABMODDEDSWORDS = new CreativeModeTab("tabtabmoddedswords") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElementureModItems.DARKGEMSWORD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TABMODDEDTOOLS = new CreativeModeTab("tabtabmoddedtools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElementureModItems.DIVERSALLOYPICKAXE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TABMODDEDORE = new CreativeModeTab("tabtabmoddedore") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElementureModItems.FLUTANITEINGOT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TABMODDEDITEMS = new CreativeModeTab("tabtabmoddeditems") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElementureModItems.DIVERSBEACON.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TABMODDDEDFOOD = new CreativeModeTab("tabtabmodddedfood") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElementureModItems.HONEYBERRYJAM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TABMODDEDBLOCKS = new CreativeModeTab("tabtabmoddedblocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElementureModBlocks.NETHERUMDUST_NEBULATURFBLOCK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TABMODDEDBOSS = new CreativeModeTab("tabtabmoddedboss") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElementureModItems.SIRENQUEEN_EVIL_EYE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SKILLWINDOW = new CreativeModeTab("tabskillwindow") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElementureModItems.RIMECORMUNCULUS_CHANNELER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FISHINGTAB = new CreativeModeTab("tabfishingtab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElementureModItems.CHUB.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_FORGOTTENBLOCKS_TAB = new CreativeModeTab("tabforgottenblocks_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElementureModBlocks.OLDBRICKS.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FORGOTTEN_ITEMS_TAB = new CreativeModeTab("tabforgotten_items_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElementureModItems.OLDDOWSINGSTICK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FORGOTTENSPECIALITEMS_TAB = new CreativeModeTab("tabforgottenspecialitems_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElementureModItems.MEMORY_EYE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
