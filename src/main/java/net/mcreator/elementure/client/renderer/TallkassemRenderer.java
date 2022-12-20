
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.TallkassemEntity;
import net.mcreator.elementure.client.model.Modeltall_kassem;

public class TallkassemRenderer extends MobRenderer<TallkassemEntity, Modeltall_kassem<TallkassemEntity>> {
	public TallkassemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltall_kassem(context.bakeLayer(Modeltall_kassem.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<TallkassemEntity, Modeltall_kassem<TallkassemEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/tall_kassem_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(TallkassemEntity entity) {
		return new ResourceLocation("elementure:textures/entities/tall_kassem_texturemap.png");
	}
}
