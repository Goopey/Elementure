
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.MagtunaBusterFirestormBallEntity;
import net.mcreator.elementure.client.model.Modelempty;

public class MagtunaBusterFirestormBallRenderer extends MobRenderer<MagtunaBusterFirestormBallEntity, Modelempty<MagtunaBusterFirestormBallEntity>> {
	public MagtunaBusterFirestormBallRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelempty(context.bakeLayer(Modelempty.LAYER_LOCATION)), 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(MagtunaBusterFirestormBallEntity entity) {
		return new ResourceLocation("elementure:textures/entities/empty_texturemap.png");
	}
}
