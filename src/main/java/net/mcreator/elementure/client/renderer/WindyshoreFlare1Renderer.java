
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.WindyshoreFlare1Entity;
import net.mcreator.elementure.client.model.Modelempty;

public class WindyshoreFlare1Renderer extends MobRenderer<WindyshoreFlare1Entity, Modelempty<WindyshoreFlare1Entity>> {
	public WindyshoreFlare1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelempty(context.bakeLayer(Modelempty.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(WindyshoreFlare1Entity entity) {
		return new ResourceLocation("elementure:textures/entities/empty_texturemap.png");
	}
}
