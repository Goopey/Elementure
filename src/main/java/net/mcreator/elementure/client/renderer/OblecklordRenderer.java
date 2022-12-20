
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.OblecklordEntity;
import net.mcreator.elementure.client.model.Modelobleck_lord;

public class OblecklordRenderer extends MobRenderer<OblecklordEntity, Modelobleck_lord<OblecklordEntity>> {
	public OblecklordRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelobleck_lord(context.bakeLayer(Modelobleck_lord.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(OblecklordEntity entity) {
		return new ResourceLocation("elementure:textures/entities/obleck_lord_texturemap.png");
	}
}
