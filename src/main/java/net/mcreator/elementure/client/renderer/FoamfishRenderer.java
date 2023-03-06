
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.FoamfishEntity;
import net.mcreator.elementure.client.model.Modelfoamfish;

public class FoamfishRenderer extends MobRenderer<FoamfishEntity, Modelfoamfish<FoamfishEntity>> {
	public FoamfishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfoamfish(context.bakeLayer(Modelfoamfish.LAYER_LOCATION)), 0.19999999999999998f);
	}

	@Override
	public ResourceLocation getTextureLocation(FoamfishEntity entity) {
		return new ResourceLocation("elementure:textures/entities/foamfish.png");
	}
}
