
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.CustombobberEntity;
import net.mcreator.elementure.client.model.Modelcustom_bobber;

public class CustombobberRenderer extends MobRenderer<CustombobberEntity, Modelcustom_bobber<CustombobberEntity>> {
	public CustombobberRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_bobber(context.bakeLayer(Modelcustom_bobber.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(CustombobberEntity entity) {
		return new ResourceLocation("elementure:textures/entities/custom_bobber_texturemap.png");
	}
}
