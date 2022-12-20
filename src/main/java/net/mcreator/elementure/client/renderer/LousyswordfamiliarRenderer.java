
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.LousyswordfamiliarEntity;
import net.mcreator.elementure.client.model.Modellousy_sword;

public class LousyswordfamiliarRenderer extends MobRenderer<LousyswordfamiliarEntity, Modellousy_sword<LousyswordfamiliarEntity>> {
	public LousyswordfamiliarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellousy_sword(context.bakeLayer(Modellousy_sword.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LousyswordfamiliarEntity entity) {
		return new ResourceLocation("elementure:textures/entities/lousy_sword_texturemap.png");
	}
}
