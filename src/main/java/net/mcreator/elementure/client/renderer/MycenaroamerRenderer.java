
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenaroamerEntity;
import net.mcreator.elementure.client.model.Modelmycena_roamer;

public class MycenaroamerRenderer extends MobRenderer<MycenaroamerEntity, Modelmycena_roamer<MycenaroamerEntity>> {
	public MycenaroamerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_roamer(context.bakeLayer(Modelmycena_roamer.LAYER_LOCATION)), 0.3f);
		this.addLayer(new EyesLayer<MycenaroamerEntity, Modelmycena_roamer<MycenaroamerEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_roamer_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenaroamerEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_roamer_texturemap.png");
	}
}
