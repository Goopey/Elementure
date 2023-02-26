
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.HalloweenspiritEntity;
import net.mcreator.elementure.client.model.Modelspirit;

public class HalloweenspiritRenderer extends MobRenderer<HalloweenspiritEntity, Modelspirit<HalloweenspiritEntity>> {
	public HalloweenspiritRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspirit(context.bakeLayer(Modelspirit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HalloweenspiritEntity entity) {
		return new ResourceLocation("elementure:textures/entities/spirit.png");
	}
}
