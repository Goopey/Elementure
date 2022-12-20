
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.HarpoonbulletEntity;
import net.mcreator.elementure.client.model.Modelharpoon_bullet;

public class HarpoonbulletRenderer extends MobRenderer<HarpoonbulletEntity, Modelharpoon_bullet<HarpoonbulletEntity>> {
	public HarpoonbulletRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelharpoon_bullet(context.bakeLayer(Modelharpoon_bullet.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(HarpoonbulletEntity entity) {
		return new ResourceLocation("elementure:textures/entities/harpoon_texturemap.png");
	}
}
