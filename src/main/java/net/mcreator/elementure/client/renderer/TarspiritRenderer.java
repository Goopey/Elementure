
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.TarspiritEntity;
import net.mcreator.elementure.client.model.Modeltar_spirit;

public class TarspiritRenderer extends MobRenderer<TarspiritEntity, Modeltar_spirit<TarspiritEntity>> {
	public TarspiritRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltar_spirit(context.bakeLayer(Modeltar_spirit.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<TarspiritEntity, Modeltar_spirit<TarspiritEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/tar_spirit_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(TarspiritEntity entity) {
		return new ResourceLocation("elementure:textures/entities/tar_spirit_texturemap.png");
	}
}
