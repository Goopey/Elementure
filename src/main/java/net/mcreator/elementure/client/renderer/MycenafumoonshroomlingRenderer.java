
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenafumoonshroomlingEntity;
import net.mcreator.elementure.client.model.Modelmycena_fumoon_shroomling;

public class MycenafumoonshroomlingRenderer
		extends
			MobRenderer<MycenafumoonshroomlingEntity, Modelmycena_fumoon_shroomling<MycenafumoonshroomlingEntity>> {
	public MycenafumoonshroomlingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_fumoon_shroomling(context.bakeLayer(Modelmycena_fumoon_shroomling.LAYER_LOCATION)), 0.3f);
		this.addLayer(new EyesLayer<MycenafumoonshroomlingEntity, Modelmycena_fumoon_shroomling<MycenafumoonshroomlingEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_fumoon_shroomling_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenafumoonshroomlingEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_fumoon_shroomling_texturemap.png");
	}
}
