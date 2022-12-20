
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.LargejellyEntity;
import net.mcreator.elementure.client.model.Modellargejellyfloat;

public class LargejellyRenderer extends MobRenderer<LargejellyEntity, Modellargejellyfloat<LargejellyEntity>> {
	public LargejellyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellargejellyfloat(context.bakeLayer(Modellargejellyfloat.LAYER_LOCATION)), 0f);
		this.addLayer(new EyesLayer<LargejellyEntity, Modellargejellyfloat<LargejellyEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/jellyfloat_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LargejellyEntity entity) {
		return new ResourceLocation("elementure:textures/entities/largejellyfloat.png");
	}
}
