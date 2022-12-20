
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.CthulhupetEntity;
import net.mcreator.elementure.client.model.Modelcthulhupet;

public class CthulhupetRenderer extends MobRenderer<CthulhupetEntity, Modelcthulhupet<CthulhupetEntity>> {
	public CthulhupetRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcthulhupet(context.bakeLayer(Modelcthulhupet.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CthulhupetEntity entity) {
		return new ResourceLocation("elementure:textures/entities/cthulhu_texturemap.png");
	}
}
