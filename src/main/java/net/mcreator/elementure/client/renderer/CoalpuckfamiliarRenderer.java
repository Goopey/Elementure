
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.CoalpuckfamiliarEntity;
import net.mcreator.elementure.client.model.Modelcoal_puck;

public class CoalpuckfamiliarRenderer extends MobRenderer<CoalpuckfamiliarEntity, Modelcoal_puck<CoalpuckfamiliarEntity>> {
	public CoalpuckfamiliarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcoal_puck(context.bakeLayer(Modelcoal_puck.LAYER_LOCATION)), 0.30000000000000004f);
	}

	@Override
	public ResourceLocation getTextureLocation(CoalpuckfamiliarEntity entity) {
		return new ResourceLocation("elementure:textures/entities/coal_puck_texturemap.png");
	}
}
