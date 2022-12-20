
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.MinoskullflaibulletEntity;
import net.mcreator.elementure.client.model.Modelminoskull_flail;

public class MinoskullflaibulletRenderer extends MobRenderer<MinoskullflaibulletEntity, Modelminoskull_flail<MinoskullflaibulletEntity>> {
	public MinoskullflaibulletRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelminoskull_flail(context.bakeLayer(Modelminoskull_flail.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(MinoskullflaibulletEntity entity) {
		return new ResourceLocation("elementure:textures/entities/minoskull_flail_texturemap.png");
	}
}
