
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.CausticknightEntity;
import net.mcreator.elementure.client.model.Modelcaustic_knight;

public class CausticknightRenderer extends MobRenderer<CausticknightEntity, Modelcaustic_knight<CausticknightEntity>> {
	public CausticknightRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcaustic_knight(context.bakeLayer(Modelcaustic_knight.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CausticknightEntity entity) {
		return new ResourceLocation("elementure:textures/entities/caustic_knight_texturemap.png");
	}
}
