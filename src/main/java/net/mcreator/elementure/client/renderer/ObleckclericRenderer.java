
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.ObleckclericEntity;
import net.mcreator.elementure.client.model.Modelobleck_cleric;

public class ObleckclericRenderer extends MobRenderer<ObleckclericEntity, Modelobleck_cleric<ObleckclericEntity>> {
	public ObleckclericRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelobleck_cleric(context.bakeLayer(Modelobleck_cleric.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ObleckclericEntity entity) {
		return new ResourceLocation("elementure:textures/entities/obleck_cleric_texturemap.png");
	}
}
