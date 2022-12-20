
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.AndesiteelementalEntity;
import net.mcreator.elementure.client.model.Modellightningandesiteknight;

public class AndesiteelementalRenderer extends MobRenderer<AndesiteelementalEntity, Modellightningandesiteknight<AndesiteelementalEntity>> {
	public AndesiteelementalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellightningandesiteknight(context.bakeLayer(Modellightningandesiteknight.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AndesiteelementalEntity entity) {
		return new ResourceLocation("elementure:textures/entities/lightningandesiteknight-texturemap.png");
	}
}
