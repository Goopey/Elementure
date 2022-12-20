
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.BubbleOBlueEntity;
import net.mcreator.elementure.client.model.Modelbubble_o_blue;

public class BubbleOBlueRenderer extends MobRenderer<BubbleOBlueEntity, Modelbubble_o_blue<BubbleOBlueEntity>> {
	public BubbleOBlueRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbubble_o_blue(context.bakeLayer(Modelbubble_o_blue.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<BubbleOBlueEntity, Modelbubble_o_blue<BubbleOBlueEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/bubble_o_blue_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BubbleOBlueEntity entity) {
		return new ResourceLocation("elementure:textures/entities/bubble_o_blue_texturemap.png");
	}
}
