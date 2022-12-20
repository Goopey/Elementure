
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.BabyghastEntity;
import net.mcreator.elementure.client.model.ModelBaby_Ghast;

public class BabyghastRenderer extends MobRenderer<BabyghastEntity, ModelBaby_Ghast<BabyghastEntity>> {
	public BabyghastRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBaby_Ghast(context.bakeLayer(ModelBaby_Ghast.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(BabyghastEntity entity) {
		return new ResourceLocation("elementure:textures/entities/baby_ghast_lighting.png");
	}
}
