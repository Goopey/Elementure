
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.ShadowcandleEntity;
import net.mcreator.elementure.client.model.Modelshadow_candle;

public class ShadowcandleRenderer extends MobRenderer<ShadowcandleEntity, Modelshadow_candle<ShadowcandleEntity>> {
	public ShadowcandleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshadow_candle(context.bakeLayer(Modelshadow_candle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShadowcandleEntity entity) {
		return new ResourceLocation("elementure:textures/entities/shadow_candle_texturemap.png");
	}
}
