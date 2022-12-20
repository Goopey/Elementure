
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.BubbleEntity;
import net.mcreator.elementure.client.model.Modelbubble;

public class BubbleRenderer extends MobRenderer<BubbleEntity, Modelbubble<BubbleEntity>> {
	public BubbleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbubble(context.bakeLayer(Modelbubble.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BubbleEntity entity) {
		return new ResourceLocation("elementure:textures/entities/bubble_texturemap.png");
	}
}
