
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.SirenqueenEntity;
import net.mcreator.elementure.client.model.Modelsirenqueen;

public class SirenqueenRenderer extends MobRenderer<SirenqueenEntity, Modelsirenqueen<SirenqueenEntity>> {
	public SirenqueenRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsirenqueen(context.bakeLayer(Modelsirenqueen.LAYER_LOCATION)), 0f);
		this.addLayer(new EyesLayer<SirenqueenEntity, Modelsirenqueen<SirenqueenEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/sirenqueen_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SirenqueenEntity entity) {
		return new ResourceLocation("elementure:textures/entities/sirenqueen_texturemap.png");
	}
}
