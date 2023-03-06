
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenafumoonshroomlordEntity;
import net.mcreator.elementure.client.model.Modelmycena_fumoon_shroomlord;

public class MycenafumoonshroomlordRenderer extends MobRenderer<MycenafumoonshroomlordEntity, Modelmycena_fumoon_shroomlord<MycenafumoonshroomlordEntity>> {
	public MycenafumoonshroomlordRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_fumoon_shroomlord(context.bakeLayer(Modelmycena_fumoon_shroomlord.LAYER_LOCATION)), 0.6f);
		this.addLayer(new EyesLayer<MycenafumoonshroomlordEntity, Modelmycena_fumoon_shroomlord<MycenafumoonshroomlordEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_fumoom_shroomlord_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenafumoonshroomlordEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_fumoom_shroomlord_texturemap.png");
	}
}
