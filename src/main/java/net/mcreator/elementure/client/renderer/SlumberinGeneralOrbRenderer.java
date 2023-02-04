
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.SlumberinGeneralOrbEntity;
import net.mcreator.elementure.client.model.Modelempty;

public class SlumberinGeneralOrbRenderer extends MobRenderer<SlumberinGeneralOrbEntity, Modelempty<SlumberinGeneralOrbEntity>> {
	public SlumberinGeneralOrbRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelempty(context.bakeLayer(Modelempty.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SlumberinGeneralOrbEntity entity) {
		return new ResourceLocation("elementure:textures/entities/empty_texturemap.png");
	}
}
