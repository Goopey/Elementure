
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenatrufflingEntity;
import net.mcreator.elementure.client.model.Modelmycena_truffling;

public class MycenatrufflingRenderer extends MobRenderer<MycenatrufflingEntity, Modelmycena_truffling<MycenatrufflingEntity>> {
	public MycenatrufflingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_truffling(context.bakeLayer(Modelmycena_truffling.LAYER_LOCATION)), 0.3f);
		this.addLayer(new EyesLayer<MycenatrufflingEntity, Modelmycena_truffling<MycenatrufflingEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_truffling_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenatrufflingEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_truffling_texturemap.png");
	}
}
