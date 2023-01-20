
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.SpiderQueenEntity;
import net.mcreator.elementure.client.model.ModelspiderQueen;

public class SpiderQueenRenderer extends MobRenderer<SpiderQueenEntity, ModelspiderQueen<SpiderQueenEntity>> {
	public SpiderQueenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelspiderQueen(context.bakeLayer(ModelspiderQueen.LAYER_LOCATION)), 0.7f);
		this.addLayer(new EyesLayer<SpiderQueenEntity, ModelspiderQueen<SpiderQueenEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/spiderqueen_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SpiderQueenEntity entity) {
		return new ResourceLocation("elementure:textures/entities/spiderqueen_texturemap.png");
	}
}
