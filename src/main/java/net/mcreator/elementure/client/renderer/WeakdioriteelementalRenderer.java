
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.WeakdioriteelementalEntity;
import net.mcreator.elementure.client.model.Modelweakdioriteelemental;

public class WeakdioriteelementalRenderer extends MobRenderer<WeakdioriteelementalEntity, Modelweakdioriteelemental<WeakdioriteelementalEntity>> {
	public WeakdioriteelementalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweakdioriteelemental(context.bakeLayer(Modelweakdioriteelemental.LAYER_LOCATION)), 0.30000000000000004f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeakdioriteelementalEntity entity) {
		return new ResourceLocation("elementure:textures/entities/weakdioriteelemental-texturemap.png");
	}
}
