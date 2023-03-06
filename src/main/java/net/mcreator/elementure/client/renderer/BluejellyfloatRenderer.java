
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.BluejellyfloatEntity;
import net.mcreator.elementure.client.model.Modelbluejelly;

public class BluejellyfloatRenderer extends MobRenderer<BluejellyfloatEntity, Modelbluejelly<BluejellyfloatEntity>> {
	public BluejellyfloatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbluejelly(context.bakeLayer(Modelbluejelly.LAYER_LOCATION)), 0.19999999999999998f);
	}

	@Override
	public ResourceLocation getTextureLocation(BluejellyfloatEntity entity) {
		return new ResourceLocation("elementure:textures/entities/bluejelly.png");
	}
}
