
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.DioriteelementalEntity;
import net.mcreator.elementure.client.model.Modeldioriteelemental;

public class DioriteelementalRenderer extends MobRenderer<DioriteelementalEntity, Modeldioriteelemental<DioriteelementalEntity>> {
	public DioriteelementalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldioriteelemental(context.bakeLayer(Modeldioriteelemental.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DioriteelementalEntity entity) {
		return new ResourceLocation("elementure:textures/entities/dioriteelementalknight-texturemap.png");
	}
}
