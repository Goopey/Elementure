
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.ObleckEntity;
import net.mcreator.elementure.client.model.Modelobleck;

public class ObleckRenderer extends MobRenderer<ObleckEntity, Modelobleck<ObleckEntity>> {
	public ObleckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelobleck(context.bakeLayer(Modelobleck.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(ObleckEntity entity) {
		return new ResourceLocation("elementure:textures/entities/obleck_texturemap.png");
	}
}
