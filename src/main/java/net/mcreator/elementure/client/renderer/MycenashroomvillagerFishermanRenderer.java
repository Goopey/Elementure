
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenashroomvillagerFishermanEntity;
import net.mcreator.elementure.client.model.Modelmycena_shroom_villager_fisherman;

public class MycenashroomvillagerFishermanRenderer
		extends
			MobRenderer<MycenashroomvillagerFishermanEntity, Modelmycena_shroom_villager_fisherman<MycenashroomvillagerFishermanEntity>> {
	public MycenashroomvillagerFishermanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_shroom_villager_fisherman(context.bakeLayer(Modelmycena_shroom_villager_fisherman.LAYER_LOCATION)), 0.5f);
		this.addLayer(
				new EyesLayer<MycenashroomvillagerFishermanEntity, Modelmycena_shroom_villager_fisherman<MycenashroomvillagerFishermanEntity>>(this) {
					@Override
					public RenderType renderType() {
						return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_shroom_fisherman_lightingtexturemap.png"));
					}
				});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenashroomvillagerFishermanEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_shroom_fisherman_texturemap.png");
	}
}
