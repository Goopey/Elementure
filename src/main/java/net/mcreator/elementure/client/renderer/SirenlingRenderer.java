
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.SirenlingEntity;
import net.mcreator.elementure.client.model.Modelsirenling;

public class SirenlingRenderer extends MobRenderer<SirenlingEntity, Modelsirenling<SirenlingEntity>> {
	public SirenlingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsirenling(context.bakeLayer(Modelsirenling.LAYER_LOCATION)), 0.2f);
		this.addLayer(new EyesLayer<SirenlingEntity, Modelsirenling<SirenlingEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/sirenling_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SirenlingEntity entity) {
		return new ResourceLocation("elementure:textures/entities/sirenling_texturemap.png");
	}
}
