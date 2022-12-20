
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.SmallObleckminionEntity;
import net.mcreator.elementure.client.model.Modelobleck_minion;

public class SmallObleckminionRenderer extends MobRenderer<SmallObleckminionEntity, Modelobleck_minion<SmallObleckminionEntity>> {
	public SmallObleckminionRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelobleck_minion(context.bakeLayer(Modelobleck_minion.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SmallObleckminionEntity entity) {
		return new ResourceLocation("elementure:textures/entities/obleck_minion_texturemap.png");
	}
}
