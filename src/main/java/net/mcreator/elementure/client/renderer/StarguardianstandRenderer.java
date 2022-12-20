
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.StarguardianstandEntity;
import net.mcreator.elementure.client.model.Modelstarguardian;

public class StarguardianstandRenderer extends MobRenderer<StarguardianstandEntity, Modelstarguardian<StarguardianstandEntity>> {
	public StarguardianstandRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstarguardian(context.bakeLayer(Modelstarguardian.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<StarguardianstandEntity, Modelstarguardian<StarguardianstandEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/starguardian_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(StarguardianstandEntity entity) {
		return new ResourceLocation("elementure:textures/entities/empty_texturemap.png");
	}
}
