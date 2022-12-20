
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.ArmoredturtleEntity;
import net.mcreator.elementure.client.model.Modelarmored_turtle;

public class ArmoredturtleRenderer extends MobRenderer<ArmoredturtleEntity, Modelarmored_turtle<ArmoredturtleEntity>> {
	public ArmoredturtleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelarmored_turtle(context.bakeLayer(Modelarmored_turtle.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<ArmoredturtleEntity, Modelarmored_turtle<ArmoredturtleEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/armored_turtle_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ArmoredturtleEntity entity) {
		return new ResourceLocation("elementure:textures/entities/armored_turtle_texturemap.png");
	}
}
