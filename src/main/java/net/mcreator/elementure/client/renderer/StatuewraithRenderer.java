
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.StatuewraithEntity;
import net.mcreator.elementure.client.model.Modelstatue_wraith;

public class StatuewraithRenderer extends MobRenderer<StatuewraithEntity, Modelstatue_wraith<StatuewraithEntity>> {
	public StatuewraithRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstatue_wraith(context.bakeLayer(Modelstatue_wraith.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StatuewraithEntity entity) {
		return new ResourceLocation("elementure:textures/entities/statue_wraith_texturemap.png");
	}
}
