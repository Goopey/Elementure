
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.SmallgraniteelementalEntity;
import net.mcreator.elementure.client.model.Modelsmallgraniteelemental;

public class SmallgraniteelementalRenderer extends MobRenderer<SmallgraniteelementalEntity, Modelsmallgraniteelemental<SmallgraniteelementalEntity>> {
	public SmallgraniteelementalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsmallgraniteelemental(context.bakeLayer(Modelsmallgraniteelemental.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(SmallgraniteelementalEntity entity) {
		return new ResourceLocation("elementure:textures/entities/weakgraniteelemental-texturemap.png");
	}
}
