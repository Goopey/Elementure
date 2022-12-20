
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.DragonewtEntity;
import net.mcreator.elementure.client.model.Modeldragonewt;

public class DragonewtRenderer extends MobRenderer<DragonewtEntity, Modeldragonewt<DragonewtEntity>> {
	public DragonewtRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldragonewt(context.bakeLayer(Modeldragonewt.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<DragonewtEntity, Modeldragonewt<DragonewtEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/dragonewt_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(DragonewtEntity entity) {
		return new ResourceLocation("elementure:textures/entities/dragonewt_texturemap.png");
	}
}
