
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenashroomguardEntity;
import net.mcreator.elementure.client.model.Modelmycena_shroom_guard;

public class MycenashroomguardRenderer extends MobRenderer<MycenashroomguardEntity, Modelmycena_shroom_guard<MycenashroomguardEntity>> {
	public MycenashroomguardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_shroom_guard(context.bakeLayer(Modelmycena_shroom_guard.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<MycenashroomguardEntity, Modelmycena_shroom_guard<MycenashroomguardEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_shroom_guard_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenashroomguardEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_shroom_guard_texturemap.png");
	}
}
