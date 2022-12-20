
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.FluffwhaleEntity;
import net.mcreator.elementure.client.model.Modelfluff_whale;

public class FluffwhaleRenderer extends MobRenderer<FluffwhaleEntity, Modelfluff_whale<FluffwhaleEntity>> {
	public FluffwhaleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfluff_whale(context.bakeLayer(Modelfluff_whale.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FluffwhaleEntity entity) {
		return new ResourceLocation("elementure:textures/entities/fluff_whale_texturemap.png");
	}
}
