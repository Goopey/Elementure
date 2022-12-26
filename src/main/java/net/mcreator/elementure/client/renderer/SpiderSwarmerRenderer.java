
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.SpiderSwarmerEntity;
import net.mcreator.elementure.client.model.Modelspiderling;

public class SpiderSwarmerRenderer extends MobRenderer<SpiderSwarmerEntity, Modelspiderling<SpiderSwarmerEntity>> {
	public SpiderSwarmerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspiderling(context.bakeLayer(Modelspiderling.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<SpiderSwarmerEntity, Modelspiderling<SpiderSwarmerEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/spiderling_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SpiderSwarmerEntity entity) {
		return new ResourceLocation("elementure:textures/entities/spiderling_swarmer_texturemap.png");
	}
}
