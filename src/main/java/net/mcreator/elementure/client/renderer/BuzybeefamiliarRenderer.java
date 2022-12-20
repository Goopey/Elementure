
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.BuzybeefamiliarEntity;
import net.mcreator.elementure.client.model.Modelbuzy_bee;

public class BuzybeefamiliarRenderer extends MobRenderer<BuzybeefamiliarEntity, Modelbuzy_bee<BuzybeefamiliarEntity>> {
	public BuzybeefamiliarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbuzy_bee(context.bakeLayer(Modelbuzy_bee.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BuzybeefamiliarEntity entity) {
		return new ResourceLocation("elementure:textures/entities/buzy_bee_texturemap.png");
	}
}
