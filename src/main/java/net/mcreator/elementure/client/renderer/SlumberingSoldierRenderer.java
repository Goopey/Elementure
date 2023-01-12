
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.SlumberingSoldierEntity;
import net.mcreator.elementure.client.model.ModelslumberingSoldier;

public class SlumberingSoldierRenderer extends MobRenderer<SlumberingSoldierEntity, ModelslumberingSoldier<SlumberingSoldierEntity>> {
	public SlumberingSoldierRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelslumberingSoldier(context.bakeLayer(ModelslumberingSoldier.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SlumberingSoldierEntity entity) {
		return new ResourceLocation("elementure:textures/entities/slumbering_soldier_texturemap.png");
	}
}
