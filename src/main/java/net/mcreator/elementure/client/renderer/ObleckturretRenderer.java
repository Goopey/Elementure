
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.ObleckturretEntity;
import net.mcreator.elementure.client.model.Modelobleck_turret;

public class ObleckturretRenderer extends MobRenderer<ObleckturretEntity, Modelobleck_turret<ObleckturretEntity>> {
	public ObleckturretRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelobleck_turret(context.bakeLayer(Modelobleck_turret.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ObleckturretEntity entity) {
		return new ResourceLocation("elementure:textures/entities/obleck_lord_eldritch_texturemap.png");
	}
}
