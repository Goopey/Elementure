
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.TwistedknightEntity;
import net.mcreator.elementure.client.model.Modeltwisted_knight;

public class TwistedknightRenderer extends MobRenderer<TwistedknightEntity, Modeltwisted_knight<TwistedknightEntity>> {
	public TwistedknightRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltwisted_knight(context.bakeLayer(Modeltwisted_knight.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TwistedknightEntity entity) {
		return new ResourceLocation("elementure:textures/entities/twisted_knight_texturemap.png");
	}
}
