
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.GlassbellboatEntityEntity;
import net.mcreator.elementure.client.model.Modelglassbellboat;

public class GlassbellboatEntityRenderer extends MobRenderer<GlassbellboatEntityEntity, Modelglassbellboat<GlassbellboatEntityEntity>> {
	public GlassbellboatEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelglassbellboat(context.bakeLayer(Modelglassbellboat.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(GlassbellboatEntityEntity entity) {
		return new ResourceLocation("elementure:textures/entities/glassbellboat_texturemap.png");
	}
}
