
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.GnoblinEntity;
import net.mcreator.elementure.client.model.Modelgnoblin;

public class GnoblinRenderer extends MobRenderer<GnoblinEntity, Modelgnoblin<GnoblinEntity>> {
	public GnoblinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgnoblin(context.bakeLayer(Modelgnoblin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GnoblinEntity entity) {
		return new ResourceLocation("elementure:textures/entities/gnoblin_texturemap.png");
	}
}
