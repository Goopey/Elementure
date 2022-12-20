
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenashroomvillagerleatherworkerEntity;
import net.mcreator.elementure.client.model.Modelmycena_shroom_villager_leatherworker;

public class MycenashroomvillagerleatherworkerRenderer
		extends
			MobRenderer<MycenashroomvillagerleatherworkerEntity, Modelmycena_shroom_villager_leatherworker<MycenashroomvillagerleatherworkerEntity>> {
	public MycenashroomvillagerleatherworkerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_shroom_villager_leatherworker(context.bakeLayer(Modelmycena_shroom_villager_leatherworker.LAYER_LOCATION)),
				0.5f);
		this.addLayer(
				new EyesLayer<MycenashroomvillagerleatherworkerEntity, Modelmycena_shroom_villager_leatherworker<MycenashroomvillagerleatherworkerEntity>>(
						this) {
					@Override
					public RenderType renderType() {
						return RenderType
								.eyes(new ResourceLocation("elementure:textures/entities/mycena_shroom_leatherworker_lightingtexturemap.png"));
					}
				});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenashroomvillagerleatherworkerEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_shroom_leatherworker_texturemap.png");
	}
}
