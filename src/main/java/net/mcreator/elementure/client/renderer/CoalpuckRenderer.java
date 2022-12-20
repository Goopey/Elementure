
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.CoalpuckEntity;
import net.mcreator.elementure.client.model.Modelcoal_puck;

public class CoalpuckRenderer extends MobRenderer<CoalpuckEntity, Modelcoal_puck<CoalpuckEntity>> {
	public CoalpuckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcoal_puck(context.bakeLayer(Modelcoal_puck.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CoalpuckEntity entity) {
		return new ResourceLocation("elementure:textures/entities/coal_puck_texturemap.png");
	}
}
