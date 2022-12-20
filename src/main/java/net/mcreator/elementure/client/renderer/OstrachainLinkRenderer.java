
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.OstrachainLinkEntity;
import net.mcreator.elementure.client.model.Modelostrachainlink;

public class OstrachainLinkRenderer extends MobRenderer<OstrachainLinkEntity, Modelostrachainlink<OstrachainLinkEntity>> {
	public OstrachainLinkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelostrachainlink(context.bakeLayer(Modelostrachainlink.LAYER_LOCATION)), 0f);
		this.addLayer(new EyesLayer<OstrachainLinkEntity, Modelostrachainlink<OstrachainLinkEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/ostrachain_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(OstrachainLinkEntity entity) {
		return new ResourceLocation("elementure:textures/ostrachain_texturemap.png");

	}
}
