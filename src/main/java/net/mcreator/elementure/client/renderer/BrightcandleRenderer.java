
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.BrightcandleEntity;
import net.mcreator.elementure.client.model.Modelbright_candle;

public class BrightcandleRenderer extends MobRenderer<BrightcandleEntity, Modelbright_candle<BrightcandleEntity>> {
	public BrightcandleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbright_candle(context.bakeLayer(Modelbright_candle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BrightcandleEntity entity) {
		return new ResourceLocation("elementure:textures/entities/bright_candle_texturemap.png");
	}
}
