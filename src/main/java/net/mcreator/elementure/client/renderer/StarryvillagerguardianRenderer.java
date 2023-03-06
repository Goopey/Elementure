
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.StarryvillagerguardianEntity;
import net.mcreator.elementure.client.model.Modelstarryvillagerfighter;

public class StarryvillagerguardianRenderer extends MobRenderer<StarryvillagerguardianEntity, Modelstarryvillagerfighter<StarryvillagerguardianEntity>> {
	public StarryvillagerguardianRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstarryvillagerfighter(context.bakeLayer(Modelstarryvillagerfighter.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StarryvillagerguardianEntity entity) {
		return new ResourceLocation("elementure:textures/entities/starryvillagerguardian_texturemap.png");
	}
}
