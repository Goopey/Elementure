
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.MycenasporeslingeringcloudEntity;
import net.mcreator.elementure.client.model.Modelempty;

public class MycenasporeslingeringcloudRenderer extends MobRenderer<MycenasporeslingeringcloudEntity, Modelempty<MycenasporeslingeringcloudEntity>> {
	public MycenasporeslingeringcloudRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelempty(context.bakeLayer(Modelempty.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(MycenasporeslingeringcloudEntity entity) {
		return new ResourceLocation("elementure:textures/entities/empty_texturemap.png");
	}
}
