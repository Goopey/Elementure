
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.NetherumTitanEntity;
import net.mcreator.elementure.client.model.Modelnetherum_titan;

public class NetherumTitanRenderer extends MobRenderer<NetherumTitanEntity, Modelnetherum_titan<NetherumTitanEntity>> {
	public NetherumTitanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnetherum_titan(context.bakeLayer(Modelnetherum_titan.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<NetherumTitanEntity, Modelnetherum_titan<NetherumTitanEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/netherum_titan_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(NetherumTitanEntity entity) {
		return new ResourceLocation("elementure:textures/netherum_titan_texturemap.png");
	}
}
