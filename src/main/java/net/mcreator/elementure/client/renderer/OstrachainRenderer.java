
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.OstrachainEntity;
import net.mcreator.elementure.client.model.Modelostrachain;

public class OstrachainRenderer extends MobRenderer<OstrachainEntity, Modelostrachain<OstrachainEntity>> {
	public OstrachainRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelostrachain(context.bakeLayer(Modelostrachain.LAYER_LOCATION)), 0f);
		this.addLayer(new EyesLayer<OstrachainEntity, Modelostrachain<OstrachainEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/ostrachain_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(OstrachainEntity entity) {
		return new ResourceLocation("elementure:textures/entities/ostrachain_texturemap.png");
	}
}
