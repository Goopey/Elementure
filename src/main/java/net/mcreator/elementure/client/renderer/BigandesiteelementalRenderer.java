
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.BigandesiteelementalEntity;
import net.mcreator.elementure.client.model.Modelbigligniteelemental;

public class BigandesiteelementalRenderer extends MobRenderer<BigandesiteelementalEntity, Modelbigligniteelemental<BigandesiteelementalEntity>> {
	public BigandesiteelementalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigligniteelemental(context.bakeLayer(Modelbigligniteelemental.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigandesiteelementalEntity entity) {
		return new ResourceLocation("elementure:textures/entities/bigligniteelemental-texturemap.png");
	}
}
