
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenashroomlordEntity;
import net.mcreator.elementure.client.model.Modelmycena_shroomlord;

public class MycenashroomlordRenderer extends MobRenderer<MycenashroomlordEntity, Modelmycena_shroomlord<MycenashroomlordEntity>> {
	public MycenashroomlordRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_shroomlord(context.bakeLayer(Modelmycena_shroomlord.LAYER_LOCATION)), 0.8f);
		this.addLayer(new EyesLayer<MycenashroomlordEntity, Modelmycena_shroomlord<MycenashroomlordEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_shroomlord_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenashroomlordEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_shroomlord_texturemap.png");
	}
}
