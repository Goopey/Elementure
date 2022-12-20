
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.BigkassemEntity;
import net.mcreator.elementure.client.model.Modelbig_kassem;

public class BigkassemRenderer extends MobRenderer<BigkassemEntity, Modelbig_kassem<BigkassemEntity>> {
	public BigkassemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbig_kassem(context.bakeLayer(Modelbig_kassem.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<BigkassemEntity, Modelbig_kassem<BigkassemEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/big_kassem_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BigkassemEntity entity) {
		return new ResourceLocation("elementure:textures/entities/big_kassem_texturemap.png");
	}
}
