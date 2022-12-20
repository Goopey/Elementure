
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.ArchkassemEntity;
import net.mcreator.elementure.client.model.Modelarch_kassem;

public class ArchkassemRenderer extends MobRenderer<ArchkassemEntity, Modelarch_kassem<ArchkassemEntity>> {
	public ArchkassemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelarch_kassem(context.bakeLayer(Modelarch_kassem.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<ArchkassemEntity, Modelarch_kassem<ArchkassemEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/arch_kassem_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ArchkassemEntity entity) {
		return new ResourceLocation("elementure:textures/entities/arch_kassem_texturemap.png");
	}
}
