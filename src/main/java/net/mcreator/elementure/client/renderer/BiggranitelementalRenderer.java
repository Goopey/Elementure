
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.BiggranitelementalEntity;
import net.mcreator.elementure.client.model.Modelbiggraniteelemental;

public class BiggranitelementalRenderer extends MobRenderer<BiggranitelementalEntity, Modelbiggraniteelemental<BiggranitelementalEntity>> {
	public BiggranitelementalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbiggraniteelemental(context.bakeLayer(Modelbiggraniteelemental.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BiggranitelementalEntity entity) {
		return new ResourceLocation("elementure:textures/entities/biggraniteelemental-texturemap.png");
	}
}
