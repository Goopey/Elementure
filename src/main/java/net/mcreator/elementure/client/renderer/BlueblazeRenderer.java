
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.BlueblazeEntity;
import net.mcreator.elementure.client.model.Modelblue_blaze;

public class BlueblazeRenderer extends MobRenderer<BlueblazeEntity, Modelblue_blaze<BlueblazeEntity>> {
	public BlueblazeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelblue_blaze(context.bakeLayer(Modelblue_blaze.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<BlueblazeEntity, Modelblue_blaze<BlueblazeEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/blue_blaze_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BlueblazeEntity entity) {
		return new ResourceLocation("elementure:textures/entities/blue_blaze_texturemap.png");
	}
}
