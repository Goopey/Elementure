
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenashroomvillagerNitwitEntity;
import net.mcreator.elementure.client.model.Modelmycena_shroom_villager_nitwit;

public class MycenashroomvillagerNitwitRenderer
		extends
			MobRenderer<MycenashroomvillagerNitwitEntity, Modelmycena_shroom_villager_nitwit<MycenashroomvillagerNitwitEntity>> {
	public MycenashroomvillagerNitwitRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_shroom_villager_nitwit(context.bakeLayer(Modelmycena_shroom_villager_nitwit.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<MycenashroomvillagerNitwitEntity, Modelmycena_shroom_villager_nitwit<MycenashroomvillagerNitwitEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_shroom_villager_nitwit_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenashroomvillagerNitwitEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_shroom_villager_nitwit_texturemap.png");
	}
}
