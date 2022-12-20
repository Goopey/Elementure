
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.EchoBerryEntity;
import net.mcreator.elementure.client.model.ModelechoFruit;

public class EchoBerryRenderer extends MobRenderer<EchoBerryEntity, ModelechoFruit<EchoBerryEntity>> {
	public EchoBerryRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelechoFruit(context.bakeLayer(ModelechoFruit.LAYER_LOCATION)), 0f);
		this.addLayer(new EyesLayer<EchoBerryEntity, ModelechoFruit<EchoBerryEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/echofruit_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EchoBerryEntity entity) {
		return new ResourceLocation("elementure:textures/entities/echofruit_texturemap.png");
	}
}
