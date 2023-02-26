
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.RocketwormEntity;
import net.mcreator.elementure.client.model.ModelrocketWormBody;

public class RocketwormRenderer extends MobRenderer<RocketwormEntity, ModelrocketWormBody<RocketwormEntity>> {
	public RocketwormRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelrocketWormBody(context.bakeLayer(ModelrocketWormBody.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<RocketwormEntity, ModelrocketWormBody<RocketwormEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/rocketwormhead_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(RocketwormEntity entity) {
		return new ResourceLocation("elementure:textures/entities/rocketwormhead_texturemap.png");
	}
}
