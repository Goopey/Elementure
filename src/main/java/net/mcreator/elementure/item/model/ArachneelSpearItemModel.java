package net.mcreator.elementure.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.elementure.item.ArachneelSpearItem;

public class ArachneelSpearItemModel extends AnimatedGeoModel<ArachneelSpearItem> {
	@Override
	public ResourceLocation getAnimationResource(ArachneelSpearItem animatable) {
		return new ResourceLocation("elementure", "animations/sworditem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArachneelSpearItem animatable) {
		return new ResourceLocation("elementure", "geo/sworditem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArachneelSpearItem animatable) {
		return new ResourceLocation("elementure", "textures/items/arachneel_spear.png");
	}
}
