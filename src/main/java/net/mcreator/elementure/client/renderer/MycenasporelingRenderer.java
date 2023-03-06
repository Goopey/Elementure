
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenasporelingEntity;
import net.mcreator.elementure.client.model.Modelmycena_sporeling;

public class MycenasporelingRenderer extends MobRenderer<MycenasporelingEntity, Modelmycena_sporeling<MycenasporelingEntity>> {
	public MycenasporelingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_sporeling(context.bakeLayer(Modelmycena_sporeling.LAYER_LOCATION)), 0.19999999999999998f);
		this.addLayer(new EyesLayer<MycenasporelingEntity, Modelmycena_sporeling<MycenasporelingEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_sporeling_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenasporelingEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_sporeling_texturemap.png");
	}
}
