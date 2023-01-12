
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.NightmareMassEntity;
import net.mcreator.elementure.client.model.ModelnightmareMass;

public class NightmareMassRenderer extends MobRenderer<NightmareMassEntity, ModelnightmareMass<NightmareMassEntity>> {
	public NightmareMassRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelnightmareMass(context.bakeLayer(ModelnightmareMass.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareMassEntity entity) {
		return new ResourceLocation("elementure:textures/entities/nightmare_mass_texturemap.png");
	}
}
