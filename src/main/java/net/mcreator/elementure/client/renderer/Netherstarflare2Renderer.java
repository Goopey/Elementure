
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.Netherstarflare2Entity;
import net.mcreator.elementure.client.model.Modelempty;

public class Netherstarflare2Renderer extends MobRenderer<Netherstarflare2Entity, Modelempty<Netherstarflare2Entity>> {
	public Netherstarflare2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelempty(context.bakeLayer(Modelempty.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(Netherstarflare2Entity entity) {
		return new ResourceLocation("elementure:textures/entities/empty_texturemap.png");
	}
}
