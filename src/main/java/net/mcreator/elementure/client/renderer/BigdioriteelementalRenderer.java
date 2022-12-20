
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.BigdioriteelementalEntity;
import net.mcreator.elementure.client.model.Modelbigdioriteelemental;

public class BigdioriteelementalRenderer extends MobRenderer<BigdioriteelementalEntity, Modelbigdioriteelemental<BigdioriteelementalEntity>> {
	public BigdioriteelementalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigdioriteelemental(context.bakeLayer(Modelbigdioriteelemental.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigdioriteelementalEntity entity) {
		return new ResourceLocation("elementure:textures/entities/bigdioriteelemental_texturemap.png");
	}
}
