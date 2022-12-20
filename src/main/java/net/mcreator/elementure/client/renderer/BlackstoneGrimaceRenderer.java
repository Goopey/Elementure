
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.BlackstoneGrimaceEntity;
import net.mcreator.elementure.client.model.Modelblackstone_grimace;

public class BlackstoneGrimaceRenderer extends MobRenderer<BlackstoneGrimaceEntity, Modelblackstone_grimace<BlackstoneGrimaceEntity>> {
	public BlackstoneGrimaceRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelblackstone_grimace(context.bakeLayer(Modelblackstone_grimace.LAYER_LOCATION)), 0.7000000000000001f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlackstoneGrimaceEntity entity) {
		return new ResourceLocation("elementure:textures/entities/blackstone_grimace_texturemap.png");
	}
}
