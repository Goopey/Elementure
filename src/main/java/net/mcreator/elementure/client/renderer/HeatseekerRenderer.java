
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.HeatseekerEntity;
import net.mcreator.elementure.client.model.Modelheat_seeker;

public class HeatseekerRenderer extends MobRenderer<HeatseekerEntity, Modelheat_seeker<HeatseekerEntity>> {
	public HeatseekerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelheat_seeker(context.bakeLayer(Modelheat_seeker.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(HeatseekerEntity entity) {
		return new ResourceLocation("elementure:textures/entities/heat_seeker_texturemap.png");
	}
}
