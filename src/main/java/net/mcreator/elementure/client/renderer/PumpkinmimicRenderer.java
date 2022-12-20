
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.PumpkinmimicEntity;
import net.mcreator.elementure.client.model.Modelpumpkin_mimic;

public class PumpkinmimicRenderer extends MobRenderer<PumpkinmimicEntity, Modelpumpkin_mimic<PumpkinmimicEntity>> {
	public PumpkinmimicRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpumpkin_mimic(context.bakeLayer(Modelpumpkin_mimic.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PumpkinmimicEntity entity) {
		return new ResourceLocation("elementure:textures/entities/pumpkin_mimic.png");
	}
}
