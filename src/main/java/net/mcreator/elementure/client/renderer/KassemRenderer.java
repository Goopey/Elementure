
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.KassemEntity;
import net.mcreator.elementure.client.model.Modelkassem;

public class KassemRenderer extends MobRenderer<KassemEntity, Modelkassem<KassemEntity>> {
	public KassemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkassem(context.bakeLayer(Modelkassem.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<KassemEntity, Modelkassem<KassemEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/kassem_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(KassemEntity entity) {
		return new ResourceLocation("elementure:textures/entities/kassem_texturemap.png");
	}
}
