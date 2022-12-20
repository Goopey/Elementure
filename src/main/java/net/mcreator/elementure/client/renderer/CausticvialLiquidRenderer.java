
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.CausticvialLiquidEntity;
import net.mcreator.elementure.client.model.Modelempty;

public class CausticvialLiquidRenderer extends MobRenderer<CausticvialLiquidEntity, Modelempty<CausticvialLiquidEntity>> {
	public CausticvialLiquidRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelempty(context.bakeLayer(Modelempty.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(CausticvialLiquidEntity entity) {
		return new ResourceLocation("elementure:textures/entities/empty_texturemap.png");
	}
}
