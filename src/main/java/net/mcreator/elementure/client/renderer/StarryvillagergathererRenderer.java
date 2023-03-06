
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.StarryvillagergathererEntity;
import net.mcreator.elementure.client.model.Modelstarryvillagergatherer;

public class StarryvillagergathererRenderer extends MobRenderer<StarryvillagergathererEntity, Modelstarryvillagergatherer<StarryvillagergathererEntity>> {
	public StarryvillagergathererRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstarryvillagergatherer(context.bakeLayer(Modelstarryvillagergatherer.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StarryvillagergathererEntity entity) {
		return new ResourceLocation("elementure:textures/entities/starryvillagergatherer_texturemap.png");
	}
}
