
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.GreenjellyfloatEntity;
import net.mcreator.elementure.client.model.Modelbluejelly;

public class GreenjellyfloatRenderer extends MobRenderer<GreenjellyfloatEntity, Modelbluejelly<GreenjellyfloatEntity>> {
	public GreenjellyfloatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbluejelly(context.bakeLayer(Modelbluejelly.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(GreenjellyfloatEntity entity) {
		return new ResourceLocation("elementure:textures/entities/greenjelly.png");
	}
}
