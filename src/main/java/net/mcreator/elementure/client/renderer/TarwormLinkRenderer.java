
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.TarwormLinkEntity;
import net.mcreator.elementure.client.model.Modeltarworm_link;

public class TarwormLinkRenderer extends MobRenderer<TarwormLinkEntity, Modeltarworm_link<TarwormLinkEntity>> {
	public TarwormLinkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltarworm_link(context.bakeLayer(Modeltarworm_link.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(TarwormLinkEntity entity) {
		return new ResourceLocation("elementure:textures/tarworm_texturemap.png");
	}
}
