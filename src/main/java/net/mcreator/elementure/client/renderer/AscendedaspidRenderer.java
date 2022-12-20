
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.AscendedaspidEntity;
import net.mcreator.elementure.client.model.Modelascended_aspid;

public class AscendedaspidRenderer extends MobRenderer<AscendedaspidEntity, Modelascended_aspid<AscendedaspidEntity>> {
	public AscendedaspidRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelascended_aspid(context.bakeLayer(Modelascended_aspid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AscendedaspidEntity entity) {
		return new ResourceLocation("elementure:textures/entities/ascended_aspid_texturemap.png");
	}
}
