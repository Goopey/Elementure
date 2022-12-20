
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.DeadscrapguardianEntity;
import net.mcreator.elementure.client.model.Modelscrap_guardian;

public class DeadscrapguardianRenderer extends MobRenderer<DeadscrapguardianEntity, Modelscrap_guardian<DeadscrapguardianEntity>> {
	public DeadscrapguardianRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelscrap_guardian(context.bakeLayer(Modelscrap_guardian.LAYER_LOCATION)), 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(DeadscrapguardianEntity entity) {
		return new ResourceLocation("elementure:textures/entities/scrap_guardian_small_dead_texturemap.png");
	}
}
