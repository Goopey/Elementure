
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.SoulobleckEntity;
import net.mcreator.elementure.client.model.Modelsoul_obleck;

public class SoulobleckRenderer extends MobRenderer<SoulobleckEntity, Modelsoul_obleck<SoulobleckEntity>> {
	public SoulobleckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsoul_obleck(context.bakeLayer(Modelsoul_obleck.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<SoulobleckEntity, Modelsoul_obleck<SoulobleckEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/soul_obleck_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SoulobleckEntity entity) {
		return new ResourceLocation("elementure:textures/entities/soul_obleck_texturemap.png");
	}
}
