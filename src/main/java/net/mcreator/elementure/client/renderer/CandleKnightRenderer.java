
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.CandleKnightEntity;
import net.mcreator.elementure.client.model.Modelcandle_knight;

public class CandleKnightRenderer extends MobRenderer<CandleKnightEntity, Modelcandle_knight<CandleKnightEntity>> {
	public CandleKnightRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcandle_knight(context.bakeLayer(Modelcandle_knight.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CandleKnightEntity entity) {
		return new ResourceLocation("elementure:textures/entities/candle_knight_texturemap.png");
	}
}
