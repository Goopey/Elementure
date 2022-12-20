
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.ScrapguardianEntity;
import net.mcreator.elementure.client.model.Modelscrap_guardian;

public class ScrapguardianRenderer extends MobRenderer<ScrapguardianEntity, Modelscrap_guardian<ScrapguardianEntity>> {
	public ScrapguardianRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelscrap_guardian(context.bakeLayer(Modelscrap_guardian.LAYER_LOCATION)), 0.1f);
		this.addLayer(new EyesLayer<ScrapguardianEntity, Modelscrap_guardian<ScrapguardianEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/scrap_guardian_small_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ScrapguardianEntity entity) {
		return new ResourceLocation("elementure:textures/entities/scrap_guardian_small_texturemap.png");
	}
}
