
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.SpectreknightEntity;
import net.mcreator.elementure.client.model.Modelspectre_knight;

public class SpectreknightRenderer extends MobRenderer<SpectreknightEntity, Modelspectre_knight<SpectreknightEntity>> {
	public SpectreknightRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspectre_knight(context.bakeLayer(Modelspectre_knight.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpectreknightEntity entity) {
		return new ResourceLocation("elementure:textures/entities/spectre_knight_texturemap.png");
	}
}
