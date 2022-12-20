
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.SnyEntity;
import net.mcreator.elementure.client.model.Modelsny;

public class SnyRenderer extends MobRenderer<SnyEntity, Modelsny<SnyEntity>> {
	public SnyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsny(context.bakeLayer(Modelsny.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnyEntity entity) {
		return new ResourceLocation("elementure:textures/entities/sny_texturemap.png");
	}
}
