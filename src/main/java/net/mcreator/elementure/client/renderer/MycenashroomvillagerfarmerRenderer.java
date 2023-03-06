
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenashroomvillagerfarmerEntity;
import net.mcreator.elementure.client.model.Modelmycena_shroom_villager_farmer;

public class MycenashroomvillagerfarmerRenderer extends MobRenderer<MycenashroomvillagerfarmerEntity, Modelmycena_shroom_villager_farmer<MycenashroomvillagerfarmerEntity>> {
	public MycenashroomvillagerfarmerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_shroom_villager_farmer(context.bakeLayer(Modelmycena_shroom_villager_farmer.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<MycenashroomvillagerfarmerEntity, Modelmycena_shroom_villager_farmer<MycenashroomvillagerfarmerEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_shroom_farmer_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenashroomvillagerfarmerEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_shroom_farmer_texturemap.png");
	}
}
