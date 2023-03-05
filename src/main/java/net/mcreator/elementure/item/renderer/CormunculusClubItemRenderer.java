package net.mcreator.elementure.item.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.elementure.item.model.CormunculusClubItemModel;
import net.mcreator.elementure.item.CormunculusClubItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CormunculusClubItemRenderer extends GeoItemRenderer<CormunculusClubItem> {
	public CormunculusClubItemRenderer() {
		super(new CormunculusClubItemModel());
	}

	@Override
	public RenderType getRenderType(CormunculusClubItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource,
			VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
