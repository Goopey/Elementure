
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.CrystalhopperEntity;
import net.mcreator.elementure.client.model.Modelcrystal_hopper;

public class CrystalhopperRenderer extends MobRenderer<CrystalhopperEntity, Modelcrystal_hopper<CrystalhopperEntity>> {
	public CrystalhopperRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrystal_hopper(context.bakeLayer(Modelcrystal_hopper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrystalhopperEntity entity) {
		return new ResourceLocation("elementure:textures/entities/crystal_hopper_texturemap.png");
	}
}
