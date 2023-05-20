package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class WeaponArtIsWeaponForWeaponArtProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		ItemStack weaponArtitem = ItemStack.EMPTY;
		weaponArtitem = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		return weaponArtitem.is(ItemTags.create(new ResourceLocation("elementure:broadsword_weapons"))) || weaponArtitem.is(ItemTags.create(new ResourceLocation("elementure:spear_weapons")));
	}
}
