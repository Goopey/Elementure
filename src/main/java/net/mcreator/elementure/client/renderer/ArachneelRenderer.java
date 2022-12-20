
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.ArachneelEntity;
import net.mcreator.elementure.client.model.Modelarachneel;

public class ArachneelRenderer extends MobRenderer<ArachneelEntity, Modelarachneel<ArachneelEntity>> {
	public ArachneelRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelarachneel(context.bakeLayer(Modelarachneel.LAYER_LOCATION)), 0.3f);
		this.addLayer(new EyesLayer<ArachneelEntity, Modelarachneel<ArachneelEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/arachneel_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ArachneelEntity entity) {
		return new ResourceLocation("elementure:textures/entities/arachneel_texturemap.png");
	}
}
