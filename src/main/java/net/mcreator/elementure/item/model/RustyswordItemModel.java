package net.mcreator.elementure.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.elementure.item.RustyswordItem;

public class RustyswordItemModel extends AnimatedGeoModel<RustyswordItem> {
	@Override
	public ResourceLocation getAnimationResource(RustyswordItem animatable) {
		return new ResourceLocation("elementure", "animations/sworditem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RustyswordItem animatable) {
		return new ResourceLocation("elementure", "geo/sworditem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RustyswordItem animatable) {
		return new ResourceLocation("elementure", "textures/items/rustyironsword.png");
	}
}
