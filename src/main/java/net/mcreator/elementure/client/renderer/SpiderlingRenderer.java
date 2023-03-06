
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.SpiderlingEntity;
import net.mcreator.elementure.client.model.Modelspiderling;

public class SpiderlingRenderer extends MobRenderer<SpiderlingEntity, Modelspiderling<SpiderlingEntity>> {
	public SpiderlingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspiderling(context.bakeLayer(Modelspiderling.LAYER_LOCATION)), 0.19999999999999998f);
		this.addLayer(new EyesLayer<SpiderlingEntity, Modelspiderling<SpiderlingEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/spiderling_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SpiderlingEntity entity) {
		return new ResourceLocation("elementure:textures/entities/spiderling_texturemap.png");
	}
}
