
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenashroomvillagerblacksmithEntity;
import net.mcreator.elementure.client.model.Modelmycena_shroom_villager_blacksmith;

public class MycenashroomvillagerblacksmithRenderer
		extends
			MobRenderer<MycenashroomvillagerblacksmithEntity, Modelmycena_shroom_villager_blacksmith<MycenashroomvillagerblacksmithEntity>> {
	public MycenashroomvillagerblacksmithRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_shroom_villager_blacksmith(context.bakeLayer(Modelmycena_shroom_villager_blacksmith.LAYER_LOCATION)), 0.5f);
		this.addLayer(
				new EyesLayer<MycenashroomvillagerblacksmithEntity, Modelmycena_shroom_villager_blacksmith<MycenashroomvillagerblacksmithEntity>>(
						this) {
					@Override
					public RenderType renderType() {
						return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_shroom_blacksmith_lightingtexturemap.png"));
					}
				});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenashroomvillagerblacksmithEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_shroom_blacksmith_texturemap.png");
	}
}
