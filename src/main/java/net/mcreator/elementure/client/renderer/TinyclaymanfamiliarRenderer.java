
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.TinyclaymanfamiliarEntity;
import net.mcreator.elementure.client.model.Modeltinyclayman;

public class TinyclaymanfamiliarRenderer extends MobRenderer<TinyclaymanfamiliarEntity, Modeltinyclayman<TinyclaymanfamiliarEntity>> {
	public TinyclaymanfamiliarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltinyclayman(context.bakeLayer(Modeltinyclayman.LAYER_LOCATION)), 0.30000000000000004f);
	}

	@Override
	public ResourceLocation getTextureLocation(TinyclaymanfamiliarEntity entity) {
		return new ResourceLocation("elementure:textures/entities/tinyclayman_texturemap.png");
	}
}
