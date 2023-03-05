package net.mcreator.elementure.item.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.elementure.item.model.WeaponArtItemItemModel;
import net.mcreator.elementure.item.WeaponArtItemItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WeaponArtItemItemRenderer extends GeoItemRenderer<WeaponArtItemItem> {
	public WeaponArtItemItemRenderer() {
		super(new WeaponArtItemItemModel());
	}

	@Override
	public RenderType getRenderType(WeaponArtItemItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource,
			VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
