
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.SkeletalHeadHostEntity;
import net.mcreator.elementure.client.model.ModelskeletalHeadHost;

public class SkeletalHeadHostRenderer extends MobRenderer<SkeletalHeadHostEntity, ModelskeletalHeadHost<SkeletalHeadHostEntity>> {
	public SkeletalHeadHostRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelskeletalHeadHost(context.bakeLayer(ModelskeletalHeadHost.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<SkeletalHeadHostEntity, ModelskeletalHeadHost<SkeletalHeadHostEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/head_host_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SkeletalHeadHostEntity entity) {
		return new ResourceLocation("elementure:textures/entities/head_host_texturemap.png");
	}
}
