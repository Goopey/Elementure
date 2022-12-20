
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.CruelknightEntity;
import net.mcreator.elementure.client.model.Modelcruel_knight;

public class CruelknightRenderer extends MobRenderer<CruelknightEntity, Modelcruel_knight<CruelknightEntity>> {
	public CruelknightRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcruel_knight(context.bakeLayer(Modelcruel_knight.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CruelknightEntity entity) {
		return new ResourceLocation("elementure:textures/entities/cruel_knight_texturemap.png");
	}
}
