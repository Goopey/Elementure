
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.DizmiteEntity;
import net.mcreator.elementure.client.model.Modeldizmite;

public class DizmiteRenderer extends MobRenderer<DizmiteEntity, Modeldizmite<DizmiteEntity>> {
	public DizmiteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldizmite(context.bakeLayer(Modeldizmite.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(DizmiteEntity entity) {
		return new ResourceLocation("elementure:textures/entities/dizmite_texturemap.png");
	}
}
