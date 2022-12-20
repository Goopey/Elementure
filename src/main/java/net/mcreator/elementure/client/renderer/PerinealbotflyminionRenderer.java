
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.PerinealbotflyminionEntity;
import net.mcreator.elementure.client.model.Modelperineal_botfly;

public class PerinealbotflyminionRenderer extends MobRenderer<PerinealbotflyminionEntity, Modelperineal_botfly<PerinealbotflyminionEntity>> {
	public PerinealbotflyminionRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelperineal_botfly(context.bakeLayer(Modelperineal_botfly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PerinealbotflyminionEntity entity) {
		return new ResourceLocation("elementure:textures/entities/pet_perineal_botfly_texturemap.png");
	}
}
