
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.KingsknightEntity;
import net.mcreator.elementure.client.model.Modelkings_knight;

public class KingsknightRenderer extends MobRenderer<KingsknightEntity, Modelkings_knight<KingsknightEntity>> {
	public KingsknightRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkings_knight(context.bakeLayer(Modelkings_knight.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KingsknightEntity entity) {
		return new ResourceLocation("elementure:textures/entities/kings_knight_texturemap.png");
	}
}
