
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.IronknightEntity;
import net.mcreator.elementure.client.model.Modelironknight;

public class IronknightRenderer extends MobRenderer<IronknightEntity, Modelironknight<IronknightEntity>> {
	public IronknightRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelironknight(context.bakeLayer(Modelironknight.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IronknightEntity entity) {
		return new ResourceLocation("elementure:textures/entities/ironknight_texturemap.png");
	}
}
