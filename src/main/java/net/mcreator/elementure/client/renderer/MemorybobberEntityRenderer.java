
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.MemorybobberEntityEntity;
import net.mcreator.elementure.client.model.Modelcustom_bobber;

public class MemorybobberEntityRenderer extends MobRenderer<MemorybobberEntityEntity, Modelcustom_bobber<MemorybobberEntityEntity>> {
	public MemorybobberEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_bobber(context.bakeLayer(Modelcustom_bobber.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(MemorybobberEntityEntity entity) {
		return new ResourceLocation("elementure:textures/entities/memory_bobber_texturemap.png");
	}
}
