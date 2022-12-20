
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenashroomalEntity;
import net.mcreator.elementure.client.model.Modelmycena_shroomal;

public class MycenashroomalRenderer extends MobRenderer<MycenashroomalEntity, Modelmycena_shroomal<MycenashroomalEntity>> {
	public MycenashroomalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_shroomal(context.bakeLayer(Modelmycena_shroomal.LAYER_LOCATION)), 0.7f);
		this.addLayer(new EyesLayer<MycenashroomalEntity, Modelmycena_shroomal<MycenashroomalEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_shroomal_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenashroomalEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_shroomal_texturemap.png");
	}
}
