
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.SpidermatriarchEntity;
import net.mcreator.elementure.client.model.ModelspiderMatriarch;

public class SpidermatriarchRenderer extends MobRenderer<SpidermatriarchEntity, ModelspiderMatriarch<SpidermatriarchEntity>> {
	public SpidermatriarchRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelspiderMatriarch(context.bakeLayer(ModelspiderMatriarch.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<SpidermatriarchEntity, ModelspiderMatriarch<SpidermatriarchEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/spider_matriarch_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SpidermatriarchEntity entity) {
		return new ResourceLocation("elementure:textures/entities/spider_matriarch_texturemap.png");
	}
}
