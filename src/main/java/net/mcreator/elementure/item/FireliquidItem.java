
package net.mcreator.elementure.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.elementure.init.ElementureModFluids;

public class FireliquidItem extends BucketItem {
	public FireliquidItem() {
		super(ElementureModFluids.FIRELIQUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
