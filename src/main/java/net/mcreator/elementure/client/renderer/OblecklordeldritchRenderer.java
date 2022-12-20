
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.OblecklordeldritchEntity;
import net.mcreator.elementure.client.model.Modelobleck_lord_eldritch;

public class OblecklordeldritchRenderer extends MobRenderer<OblecklordeldritchEntity, Modelobleck_lord_eldritch<OblecklordeldritchEntity>> {
	public OblecklordeldritchRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelobleck_lord_eldritch(context.bakeLayer(Modelobleck_lord_eldritch.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OblecklordeldritchEntity entity) {
		return new ResourceLocation("elementure:textures/entities/obleck_lord_eldritch_texturemap.png");
	}
}
