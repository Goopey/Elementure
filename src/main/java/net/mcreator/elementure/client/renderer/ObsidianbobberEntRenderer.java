
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.ObsidianbobberEntEntity;
import net.mcreator.elementure.client.model.Modelcustom_bobber;

public class ObsidianbobberEntRenderer extends MobRenderer<ObsidianbobberEntEntity, Modelcustom_bobber<ObsidianbobberEntEntity>> {
	public ObsidianbobberEntRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_bobber(context.bakeLayer(Modelcustom_bobber.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(ObsidianbobberEntEntity entity) {
		return new ResourceLocation("elementure:textures/entities/obsidian_bobber_texturemap.png");
	}
}
