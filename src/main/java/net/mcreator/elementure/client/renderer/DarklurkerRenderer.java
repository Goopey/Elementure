
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.DarklurkerEntity;
import net.mcreator.elementure.client.model.Modeldarklurker;

public class DarklurkerRenderer extends MobRenderer<DarklurkerEntity, Modeldarklurker<DarklurkerEntity>> {
	public DarklurkerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldarklurker(context.bakeLayer(Modeldarklurker.LAYER_LOCATION)), 0.7999999999999999f);
	}

	@Override
	public ResourceLocation getTextureLocation(DarklurkerEntity entity) {
		return new ResourceLocation("elementure:textures/entities/darklurker_texturemap.png");
	}
}
