
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.SunlighteggfamiliarEntity;
import net.mcreator.elementure.client.model.Modelsunlight_egg;

public class SunlighteggfamiliarRenderer extends MobRenderer<SunlighteggfamiliarEntity, Modelsunlight_egg<SunlighteggfamiliarEntity>> {
	public SunlighteggfamiliarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsunlight_egg(context.bakeLayer(Modelsunlight_egg.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SunlighteggfamiliarEntity entity) {
		return new ResourceLocation("elementure:textures/entities/sunlight_egg_texturemap.png");
	}
}
