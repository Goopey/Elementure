
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.UmbrasylSegmentEntity;
import net.mcreator.elementure.client.model.Modelumbrasyl_segment;

public class UmbrasylSegmentRenderer extends MobRenderer<UmbrasylSegmentEntity, Modelumbrasyl_segment<UmbrasylSegmentEntity>> {
	public UmbrasylSegmentRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelumbrasyl_segment(context.bakeLayer(Modelumbrasyl_segment.LAYER_LOCATION)), 0.6f);
		this.addLayer(new EyesLayer<UmbrasylSegmentEntity, Modelumbrasyl_segment<UmbrasylSegmentEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/umbrasyl_segment_2_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(UmbrasylSegmentEntity entity) {
		return entity.getLayer();
	}
}
