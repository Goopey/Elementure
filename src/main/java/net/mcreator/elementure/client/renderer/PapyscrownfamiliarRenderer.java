
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.PapyscrownfamiliarEntity;
import net.mcreator.elementure.client.model.Modelpapys_crown;

public class PapyscrownfamiliarRenderer extends MobRenderer<PapyscrownfamiliarEntity, Modelpapys_crown<PapyscrownfamiliarEntity>> {
	public PapyscrownfamiliarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpapys_crown(context.bakeLayer(Modelpapys_crown.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PapyscrownfamiliarEntity entity) {
		return new ResourceLocation("elementure:textures/entities/papys_crown_texturemap.png");
	}
}
