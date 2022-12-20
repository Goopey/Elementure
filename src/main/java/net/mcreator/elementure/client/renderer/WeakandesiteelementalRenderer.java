
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.WeakandesiteelementalEntity;
import net.mcreator.elementure.client.model.Modelweaklightningandesiteelemental;

public class WeakandesiteelementalRenderer
		extends
			MobRenderer<WeakandesiteelementalEntity, Modelweaklightningandesiteelemental<WeakandesiteelementalEntity>> {
	public WeakandesiteelementalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweaklightningandesiteelemental(context.bakeLayer(Modelweaklightningandesiteelemental.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeakandesiteelementalEntity entity) {
		return new ResourceLocation("elementure:textures/entities/weaklightningandesiteelemental_texturemap.png");
	}
}
