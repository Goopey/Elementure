
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.StatueprotectorEntity;
import net.mcreator.elementure.client.model.Modelstatue_protector;

public class StatueprotectorRenderer extends MobRenderer<StatueprotectorEntity, Modelstatue_protector<StatueprotectorEntity>> {
	public StatueprotectorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstatue_protector(context.bakeLayer(Modelstatue_protector.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StatueprotectorEntity entity) {
		return new ResourceLocation("elementure:textures/entities/statue_protector_texturemap.png");
	}
}
