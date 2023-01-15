
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.NightmareSpikeEntity;
import net.mcreator.elementure.client.model.ModelnightmareSpike;

public class NightmareSpikeRenderer extends MobRenderer<NightmareSpikeEntity, ModelnightmareSpike<NightmareSpikeEntity>> {
	public NightmareSpikeRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelnightmareSpike(context.bakeLayer(ModelnightmareSpike.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareSpikeEntity entity) {
		return new ResourceLocation("elementure:textures/entities/nightmare_mass_texturemap.png");
	}
}
