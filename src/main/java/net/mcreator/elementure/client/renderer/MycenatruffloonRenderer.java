
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenatruffloonEntity;
import net.mcreator.elementure.client.model.Modelmycena_truffloon;

public class MycenatruffloonRenderer extends MobRenderer<MycenatruffloonEntity, Modelmycena_truffloon<MycenatruffloonEntity>> {
	public MycenatruffloonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_truffloon(context.bakeLayer(Modelmycena_truffloon.LAYER_LOCATION)), 0.7f);
		this.addLayer(new EyesLayer<MycenatruffloonEntity, Modelmycena_truffloon<MycenatruffloonEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_truffloon_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenatruffloonEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_truffloon_texturemap.png");
	}
}
