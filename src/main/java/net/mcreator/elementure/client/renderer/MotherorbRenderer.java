
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.MotherorbEntity;
import net.mcreator.elementure.client.model.Modelmotherorb;

public class MotherorbRenderer extends MobRenderer<MotherorbEntity, Modelmotherorb<MotherorbEntity>> {
	public MotherorbRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmotherorb(context.bakeLayer(Modelmotherorb.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(MotherorbEntity entity) {
		return new ResourceLocation("elementure:textures/entities/motherorb_texturemap.png");
	}
}
