
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.OceanangelEntity;
import net.mcreator.elementure.client.model.ModeloceanAngel;

public class OceanangelRenderer extends MobRenderer<OceanangelEntity, ModeloceanAngel<OceanangelEntity>> {
	public OceanangelRenderer(EntityRendererProvider.Context context) {
		super(context, new ModeloceanAngel(context.bakeLayer(ModeloceanAngel.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<OceanangelEntity, ModeloceanAngel<OceanangelEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/oceanangel_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(OceanangelEntity entity) {
		return new ResourceLocation("elementure:textures/entities/oceanangel_texturemap.png");
	}
}
