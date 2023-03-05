package net.mcreator.elementure.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.elementure.item.WeaponArtItemItem;

public class WeaponArtItemItemModel extends AnimatedGeoModel<WeaponArtItemItem> {
	@Override
	public ResourceLocation getAnimationResource(WeaponArtItemItem animatable) {
		return new ResourceLocation("elementure", "animations/weaponartitem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WeaponArtItemItem animatable) {
		return new ResourceLocation("elementure", "geo/weaponartitem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WeaponArtItemItem animatable) {
		return new ResourceLocation("elementure", "textures/items/weaponartitemtexturemap.png");
	}
}
