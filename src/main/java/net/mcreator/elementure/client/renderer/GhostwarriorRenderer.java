
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.GhostwarriorEntity;
import net.mcreator.elementure.client.model.Modelghost_warrior;

public class GhostwarriorRenderer extends MobRenderer<GhostwarriorEntity, Modelghost_warrior<GhostwarriorEntity>> {
	public GhostwarriorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelghost_warrior(context.bakeLayer(Modelghost_warrior.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GhostwarriorEntity entity) {
		return new ResourceLocation("elementure:textures/entities/ghost_warrior_texturemap.png");
	}
}
