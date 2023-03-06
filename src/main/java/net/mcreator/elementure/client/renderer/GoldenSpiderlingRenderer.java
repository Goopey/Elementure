
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.GoldenSpiderlingEntity;
import net.mcreator.elementure.client.model.Modelspiderling;

public class GoldenSpiderlingRenderer extends MobRenderer<GoldenSpiderlingEntity, Modelspiderling<GoldenSpiderlingEntity>> {
	public GoldenSpiderlingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspiderling(context.bakeLayer(Modelspiderling.LAYER_LOCATION)), 0.19999999999999998f);
		this.addLayer(new EyesLayer<GoldenSpiderlingEntity, Modelspiderling<GoldenSpiderlingEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/spiderling_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GoldenSpiderlingEntity entity) {
		return new ResourceLocation("elementure:textures/entities/golden_spiderling_texturemap.png");
	}
}
