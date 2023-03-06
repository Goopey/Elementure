
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenafumoonsporelingEntity;
import net.mcreator.elementure.client.model.Modelmycena_fumoon_sporeling;

public class MycenafumoonsporelingRenderer extends MobRenderer<MycenafumoonsporelingEntity, Modelmycena_fumoon_sporeling<MycenafumoonsporelingEntity>> {
	public MycenafumoonsporelingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_fumoon_sporeling(context.bakeLayer(Modelmycena_fumoon_sporeling.LAYER_LOCATION)), 0.19999999999999998f);
		this.addLayer(new EyesLayer<MycenafumoonsporelingEntity, Modelmycena_fumoon_sporeling<MycenafumoonsporelingEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_fumoon_sporeling_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenafumoonsporelingEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_fumoon_sporeling_texturemap.png");
	}
}
