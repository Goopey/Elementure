
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.SlumberingGeneralEntity;
import net.mcreator.elementure.client.model.ModelslumberingGeneral;

public class SlumberingGeneralRenderer extends MobRenderer<SlumberingGeneralEntity, ModelslumberingGeneral<SlumberingGeneralEntity>> {
	public SlumberingGeneralRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelslumberingGeneral(context.bakeLayer(ModelslumberingGeneral.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SlumberingGeneralEntity entity) {
		return new ResourceLocation("elementure:textures/entities/slumberinggeneral_texturemap.png");
	}
}
