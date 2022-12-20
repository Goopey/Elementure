
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenafumoonEntity;
import net.mcreator.elementure.client.model.Modelmycena_fumoon;

public class MycenafumoonRenderer extends MobRenderer<MycenafumoonEntity, Modelmycena_fumoon<MycenafumoonEntity>> {
	public MycenafumoonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_fumoon(context.bakeLayer(Modelmycena_fumoon.LAYER_LOCATION)), 0.7000000000000001f);
		this.addLayer(new EyesLayer<MycenafumoonEntity, Modelmycena_fumoon<MycenafumoonEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_fumoon_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenafumoonEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_fumoon_texturemap.png");
	}
}
