
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.UmbrasylEntity;
import net.mcreator.elementure.client.model.Modelumbrasyl;

public class UmbrasylRenderer extends MobRenderer<UmbrasylEntity, Modelumbrasyl<UmbrasylEntity>> {
	private boolean phaseTwo = false;

	public UmbrasylRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelumbrasyl(context.bakeLayer(Modelumbrasyl.LAYER_LOCATION)), 0.6f);
		this.addLayer(new EyesLayer<UmbrasylEntity, Modelumbrasyl<UmbrasylEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/umbrasyl_lightning_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(UmbrasylEntity entity) {
		if (entity.isPhase2()) {
			this.phaseTwo = true;
		}
		return entity.getLayer();
	}
}
