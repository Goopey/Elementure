
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.CosmicslimefamiliarEntity;
import net.mcreator.elementure.client.model.Modelcosmic_slime;

public class CosmicslimefamiliarRenderer extends MobRenderer<CosmicslimefamiliarEntity, Modelcosmic_slime<CosmicslimefamiliarEntity>> {
	public CosmicslimefamiliarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcosmic_slime(context.bakeLayer(Modelcosmic_slime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CosmicslimefamiliarEntity entity) {
		return new ResourceLocation("elementure:textures/entities/cosmic_slime_texturemap.png");
	}
}
