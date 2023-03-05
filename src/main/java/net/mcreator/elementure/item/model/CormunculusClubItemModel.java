package net.mcreator.elementure.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.elementure.item.CormunculusClubItem;

public class CormunculusClubItemModel extends AnimatedGeoModel<CormunculusClubItem> {
	@Override
	public ResourceLocation getAnimationResource(CormunculusClubItem animatable) {
		return new ResourceLocation("elementure", "animations/weaponartitem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CormunculusClubItem animatable) {
		return new ResourceLocation("elementure", "geo/cormunculus_club.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CormunculusClubItem animatable) {
		return new ResourceLocation("elementure", "textures/items/cormunculus_club_texturemap.png");
	}
}
