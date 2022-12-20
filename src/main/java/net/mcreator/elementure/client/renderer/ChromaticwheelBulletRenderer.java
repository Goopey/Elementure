
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.ChromaticwheelBulletEntity;
import net.mcreator.elementure.client.model.Modelchromaticwheel;

public class ChromaticwheelBulletRenderer extends MobRenderer<ChromaticwheelBulletEntity, Modelchromaticwheel<ChromaticwheelBulletEntity>> {
	public ChromaticwheelBulletRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchromaticwheel(context.bakeLayer(Modelchromaticwheel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChromaticwheelBulletEntity entity) {
		return new ResourceLocation("elementure:textures/entities/chromaticwheel_texturemap.png");
	}
}
