
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenashroomvillagerpriestEntity;
import net.mcreator.elementure.client.model.Modelmycena_shroom_villager_priest;

public class MycenashroomvillagerpriestRenderer
		extends
			MobRenderer<MycenashroomvillagerpriestEntity, Modelmycena_shroom_villager_priest<MycenashroomvillagerpriestEntity>> {
	public MycenashroomvillagerpriestRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_shroom_villager_priest(context.bakeLayer(Modelmycena_shroom_villager_priest.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<MycenashroomvillagerpriestEntity, Modelmycena_shroom_villager_priest<MycenashroomvillagerpriestEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_shroom_villager_priest_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenashroomvillagerpriestEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_shroom_villager_priest_texturemap.png");
	}
}
