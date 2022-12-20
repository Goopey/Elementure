
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.GraniteelementalEntity;
import net.mcreator.elementure.client.model.Modelruingranitelemental;

public class GraniteelementalRenderer extends MobRenderer<GraniteelementalEntity, Modelruingranitelemental<GraniteelementalEntity>> {
	public GraniteelementalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelruingranitelemental(context.bakeLayer(Modelruingranitelemental.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GraniteelementalEntity entity) {
		return new ResourceLocation("elementure:textures/entities/ruingraniteknight-texturemap.png");
	}
}
