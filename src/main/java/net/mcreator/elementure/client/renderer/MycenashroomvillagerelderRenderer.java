
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenashroomvillagerelderEntity;
import net.mcreator.elementure.client.model.Modelmycena_shroom_villager_elder;

public class MycenashroomvillagerelderRenderer
		extends
			MobRenderer<MycenashroomvillagerelderEntity, Modelmycena_shroom_villager_elder<MycenashroomvillagerelderEntity>> {
	public MycenashroomvillagerelderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_shroom_villager_elder(context.bakeLayer(Modelmycena_shroom_villager_elder.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<MycenashroomvillagerelderEntity, Modelmycena_shroom_villager_elder<MycenashroomvillagerelderEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_shroom_villager_elder_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenashroomvillagerelderEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_shroom_villager_elder_texturemap.png");
	}
}
