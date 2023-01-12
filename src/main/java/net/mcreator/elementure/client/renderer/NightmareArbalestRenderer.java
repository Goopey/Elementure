
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.NightmareArbalestEntity;
import net.mcreator.elementure.client.model.ModelnightmareArbalest;

public class NightmareArbalestRenderer extends MobRenderer<NightmareArbalestEntity, ModelnightmareArbalest<NightmareArbalestEntity>> {
	public NightmareArbalestRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelnightmareArbalest(context.bakeLayer(ModelnightmareArbalest.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareArbalestEntity entity) {
		return new ResourceLocation("elementure:textures/entities/nightmare_arbalest_texturemap.png");
	}
}
