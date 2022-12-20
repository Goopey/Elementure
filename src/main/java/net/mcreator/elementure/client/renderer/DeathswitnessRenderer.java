
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.DeathswitnessEntity;
import net.mcreator.elementure.client.model.Modeldeaths_witness;

public class DeathswitnessRenderer extends MobRenderer<DeathswitnessEntity, Modeldeaths_witness<DeathswitnessEntity>> {
	public DeathswitnessRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldeaths_witness(context.bakeLayer(Modeldeaths_witness.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(DeathswitnessEntity entity) {
		return new ResourceLocation("elementure:textures/entities/thewitness-texturemap.png");
	}
}
