
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.SoulskullfamiliarEntity;
import net.mcreator.elementure.client.model.Modelsoul_skull_familiar;

public class SoulskullfamiliarRenderer extends MobRenderer<SoulskullfamiliarEntity, Modelsoul_skull_familiar<SoulskullfamiliarEntity>> {
	public SoulskullfamiliarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsoul_skull_familiar(context.bakeLayer(Modelsoul_skull_familiar.LAYER_LOCATION)), 0f);
		this.addLayer(new EyesLayer<SoulskullfamiliarEntity, Modelsoul_skull_familiar<SoulskullfamiliarEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/soul_skull_lighttexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SoulskullfamiliarEntity entity) {
		return new ResourceLocation("elementure:textures/entities/soul_skull_texturemap.png");
	}
}
