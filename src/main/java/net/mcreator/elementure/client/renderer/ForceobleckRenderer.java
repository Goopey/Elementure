
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.ForceobleckEntity;
import net.mcreator.elementure.client.model.Modelforce_obleck;

public class ForceobleckRenderer extends MobRenderer<ForceobleckEntity, Modelforce_obleck<ForceobleckEntity>> {
	public ForceobleckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelforce_obleck(context.bakeLayer(Modelforce_obleck.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ForceobleckEntity entity) {
		return new ResourceLocation("elementure:textures/entities/force_obleck_texturemap.png");
	}
}
