
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenashroomlingEntity;
import net.mcreator.elementure.client.model.Modelmycena_shroomling;

public class MycenashroomlingRenderer extends MobRenderer<MycenashroomlingEntity, Modelmycena_shroomling<MycenashroomlingEntity>> {
	public MycenashroomlingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_shroomling(context.bakeLayer(Modelmycena_shroomling.LAYER_LOCATION)), 0.4f);
		this.addLayer(new EyesLayer<MycenashroomlingEntity, Modelmycena_shroomling<MycenashroomlingEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_shroomling_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenashroomlingEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_shroomling_texturemap.png");
	}
}
