
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.DarkspiritEntity;
import net.mcreator.elementure.client.model.Modelempty;

public class DarkspiritRenderer extends MobRenderer<DarkspiritEntity, Modelempty<DarkspiritEntity>> {
	public DarkspiritRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelempty(context.bakeLayer(Modelempty.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DarkspiritEntity entity) {
		return new ResourceLocation("elementure:textures/empty_texturemap.png");
	}
}
