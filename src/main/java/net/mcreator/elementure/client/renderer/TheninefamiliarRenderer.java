
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.TheninefamiliarEntity;
import net.mcreator.elementure.client.model.Modelthe_nine;

public class TheninefamiliarRenderer extends MobRenderer<TheninefamiliarEntity, Modelthe_nine<TheninefamiliarEntity>> {
	public TheninefamiliarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelthe_nine(context.bakeLayer(Modelthe_nine.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(TheninefamiliarEntity entity) {
		return new ResourceLocation("elementure:textures/entities/thenine_texturemap.png");
	}
}
