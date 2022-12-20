
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.TarwormEntity;
import net.mcreator.elementure.client.model.Modeltarworm;

public class TarwormRenderer extends MobRenderer<TarwormEntity, Modeltarworm<TarwormEntity>> {
	public TarwormRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltarworm(context.bakeLayer(Modeltarworm.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(TarwormEntity entity) {
		return new ResourceLocation("elementure:textures/tarworm_texturemap.png");
	}
}
