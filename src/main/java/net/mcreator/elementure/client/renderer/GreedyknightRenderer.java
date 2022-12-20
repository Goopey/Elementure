
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.GreedyknightEntity;
import net.mcreator.elementure.client.model.Modelgreedy_knight;

public class GreedyknightRenderer extends MobRenderer<GreedyknightEntity, Modelgreedy_knight<GreedyknightEntity>> {
	public GreedyknightRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgreedy_knight(context.bakeLayer(Modelgreedy_knight.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GreedyknightEntity entity) {
		return new ResourceLocation("elementure:textures/entities/greedy_knight_texturemap.png");
	}
}
