
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MindobleckEntity;
import net.mcreator.elementure.client.model.Modelmind_obleck;

public class MindobleckRenderer extends MobRenderer<MindobleckEntity, Modelmind_obleck<MindobleckEntity>> {
	public MindobleckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmind_obleck(context.bakeLayer(Modelmind_obleck.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<MindobleckEntity, Modelmind_obleck<MindobleckEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mind_obleck_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MindobleckEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mind_obleck_texturemap.png");
	}
}
