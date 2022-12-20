
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.SkeletalHostEntity;
import net.mcreator.elementure.client.model.ModelskeletalHost;

public class SkeletalHostRenderer extends MobRenderer<SkeletalHostEntity, ModelskeletalHost<SkeletalHostEntity>> {
	public SkeletalHostRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelskeletalHost(context.bakeLayer(ModelskeletalHost.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<SkeletalHostEntity, ModelskeletalHost<SkeletalHostEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/host_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SkeletalHostEntity entity) {
		return new ResourceLocation("elementure:textures/entities/host_texturemap.png");
	}
}
