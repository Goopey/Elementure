
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.IvoryshadeEntity;
import net.mcreator.elementure.client.model.Modelivory_shade;

public class IvoryshadeRenderer extends MobRenderer<IvoryshadeEntity, Modelivory_shade<IvoryshadeEntity>> {
	public IvoryshadeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelivory_shade(context.bakeLayer(Modelivory_shade.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IvoryshadeEntity entity) {
		return new ResourceLocation("elementure:textures/entities/ivory_shade_texturemap.png");
	}
}
