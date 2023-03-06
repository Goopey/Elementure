
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.StarryvillagerblacksmithEntity;
import net.mcreator.elementure.client.model.Modelstarryvillagersmith;

public class StarryvillagerblacksmithRenderer extends MobRenderer<StarryvillagerblacksmithEntity, Modelstarryvillagersmith<StarryvillagerblacksmithEntity>> {
	public StarryvillagerblacksmithRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstarryvillagersmith(context.bakeLayer(Modelstarryvillagersmith.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StarryvillagerblacksmithEntity entity) {
		return new ResourceLocation("elementure:textures/entities/starryvillagerblacksmith_texturemap.png");
	}
}
