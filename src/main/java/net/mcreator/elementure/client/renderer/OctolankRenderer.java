
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.OctolankEntity;
import net.mcreator.elementure.client.model.Modeloctolank;

public class OctolankRenderer extends MobRenderer<OctolankEntity, Modeloctolank<OctolankEntity>> {
	public OctolankRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeloctolank(context.bakeLayer(Modeloctolank.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OctolankEntity entity) {
		return new ResourceLocation("elementure:textures/octolank_texturemap.png");
	}
}
