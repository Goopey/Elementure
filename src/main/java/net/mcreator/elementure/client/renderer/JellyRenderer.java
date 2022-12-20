
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.JellyEntity;
import net.mcreator.elementure.client.model.Modeljellyfloat;

public class JellyRenderer extends MobRenderer<JellyEntity, Modeljellyfloat<JellyEntity>> {
	public JellyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljellyfloat(context.bakeLayer(Modeljellyfloat.LAYER_LOCATION)), 0f);
		this.addLayer(new EyesLayer<JellyEntity, Modeljellyfloat<JellyEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/jellyfloat_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(JellyEntity entity) {
		return new ResourceLocation("elementure:textures/entities/jellyfloat.png");
	}
}
