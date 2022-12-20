
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.WindyshoresCloudEntity;
import net.mcreator.elementure.client.model.Modelwindyshorescloud;

public class WindyshoresCloudRenderer extends MobRenderer<WindyshoresCloudEntity, Modelwindyshorescloud<WindyshoresCloudEntity>> {
	public WindyshoresCloudRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwindyshorescloud(context.bakeLayer(Modelwindyshorescloud.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(WindyshoresCloudEntity entity) {
		return new ResourceLocation("elementure:textures/entities/windyshorescloud_texturemap.png");
	}
}
