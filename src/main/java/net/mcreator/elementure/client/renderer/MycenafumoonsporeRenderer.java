
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenafumoonsporeEntity;
import net.mcreator.elementure.client.model.Modelmycena_fumoon_spore;

public class MycenafumoonsporeRenderer extends MobRenderer<MycenafumoonsporeEntity, Modelmycena_fumoon_spore<MycenafumoonsporeEntity>> {
	public MycenafumoonsporeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_fumoon_spore(context.bakeLayer(Modelmycena_fumoon_spore.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<MycenafumoonsporeEntity, Modelmycena_fumoon_spore<MycenafumoonsporeEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_fumoon_spore_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenafumoonsporeEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_fumoon_spore_texturemap.png");
	}
}
