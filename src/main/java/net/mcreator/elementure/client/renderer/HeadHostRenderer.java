
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.HeadHostEntity;
import net.mcreator.elementure.client.model.ModelheadHost;

public class HeadHostRenderer extends MobRenderer<HeadHostEntity, ModelheadHost<HeadHostEntity>> {
	public HeadHostRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelheadHost(context.bakeLayer(ModelheadHost.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<HeadHostEntity, ModelheadHost<HeadHostEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/head_host_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(HeadHostEntity entity) {
		return new ResourceLocation("elementure:textures/entities/head_host_texturemap.png");
	}
}
