
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.StaticspriteEntity;
import net.mcreator.elementure.client.model.Modelstaticsprite;

public class StaticspriteRenderer extends MobRenderer<StaticspriteEntity, Modelstaticsprite<StaticspriteEntity>> {
	public StaticspriteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstaticsprite(context.bakeLayer(Modelstaticsprite.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(StaticspriteEntity entity) {
		return new ResourceLocation("elementure:textures/entities/static_sprite_texturemap.png");
	}
}
