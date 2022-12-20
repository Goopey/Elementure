
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.ButterflybudfamiliarEntity;
import net.mcreator.elementure.client.model.Modelbutterfly_bud;

public class ButterflybudfamiliarRenderer extends MobRenderer<ButterflybudfamiliarEntity, Modelbutterfly_bud<ButterflybudfamiliarEntity>> {
	public ButterflybudfamiliarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbutterfly_bud(context.bakeLayer(Modelbutterfly_bud.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(ButterflybudfamiliarEntity entity) {
		return new ResourceLocation("elementure:textures/entities/butterfly_bud_texturemap.png");
	}
}
