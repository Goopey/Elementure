
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.PerinealbotflyEntity;
import net.mcreator.elementure.client.model.Modelperineal_botfly;

public class PerinealbotflyRenderer extends MobRenderer<PerinealbotflyEntity, Modelperineal_botfly<PerinealbotflyEntity>> {
	public PerinealbotflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelperineal_botfly(context.bakeLayer(Modelperineal_botfly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PerinealbotflyEntity entity) {
		return new ResourceLocation("elementure:textures/entities/perineal_botfly_texturemap.png");
	}
}
