
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.MinoskullEntity;
import net.mcreator.elementure.client.model.Modelminoskull;

public class MinoskullRenderer extends MobRenderer<MinoskullEntity, Modelminoskull<MinoskullEntity>> {
	public MinoskullRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelminoskull(context.bakeLayer(Modelminoskull.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(MinoskullEntity entity) {
		return new ResourceLocation("elementure:textures/entities/minoskull_texturemap.png");
	}
}
