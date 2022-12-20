
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.LargecrystalhopperEntity;
import net.mcreator.elementure.client.model.Modellarge_crystal_hopper;

public class LargecrystalhopperRenderer extends MobRenderer<LargecrystalhopperEntity, Modellarge_crystal_hopper<LargecrystalhopperEntity>> {
	public LargecrystalhopperRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellarge_crystal_hopper(context.bakeLayer(Modellarge_crystal_hopper.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(LargecrystalhopperEntity entity) {
		return new ResourceLocation("elementure:textures/entities/large_crystal_hopper_texturemap.png");
	}
}
