
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.RedsunpillarEntity;
import net.mcreator.elementure.client.model.Modelempty;

public class RedsunpillarRenderer extends MobRenderer<RedsunpillarEntity, Modelempty<RedsunpillarEntity>> {
	public RedsunpillarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelempty(context.bakeLayer(Modelempty.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedsunpillarEntity entity) {
		return new ResourceLocation("elementure:textures/entities/empty_texturemap.png");
	}
}
