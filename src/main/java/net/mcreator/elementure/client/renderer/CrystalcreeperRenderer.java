
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.CrystalcreeperEntity;
import net.mcreator.elementure.client.model.Modelcrystal_creeper;

public class CrystalcreeperRenderer extends MobRenderer<CrystalcreeperEntity, Modelcrystal_creeper<CrystalcreeperEntity>> {
	public CrystalcreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrystal_creeper(context.bakeLayer(Modelcrystal_creeper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrystalcreeperEntity entity) {
		return new ResourceLocation("elementure:textures/entities/crystal_creeper_texturemap.png");
	}
}
