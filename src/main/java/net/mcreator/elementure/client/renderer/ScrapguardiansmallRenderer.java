
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.ScrapguardiansmallEntity;
import net.mcreator.elementure.client.model.Modelscrap_guardian_small;

public class ScrapguardiansmallRenderer extends MobRenderer<ScrapguardiansmallEntity, Modelscrap_guardian_small<ScrapguardiansmallEntity>> {
	public ScrapguardiansmallRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelscrap_guardian_small(context.bakeLayer(Modelscrap_guardian_small.LAYER_LOCATION)), 0.1f);
		this.addLayer(new EyesLayer<ScrapguardiansmallEntity, Modelscrap_guardian_small<ScrapguardiansmallEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/scrap_guardian_small_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ScrapguardiansmallEntity entity) {
		return new ResourceLocation("elementure:textures/entities/scrap_guardian_small_texturemap.png");
	}
}
