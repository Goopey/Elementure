
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.HiddenrunesfamiliarEntity;
import net.mcreator.elementure.client.model.Modelhidden_runes_familiar;

public class HiddenrunesfamiliarRenderer extends MobRenderer<HiddenrunesfamiliarEntity, Modelhidden_runes_familiar<HiddenrunesfamiliarEntity>> {
	public HiddenrunesfamiliarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhidden_runes_familiar(context.bakeLayer(Modelhidden_runes_familiar.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HiddenrunesfamiliarEntity entity) {
		return new ResourceLocation("elementure:textures/entities/hidden_runes_familiar_texturemap.png");
	}
}
