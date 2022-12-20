
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.NetherquartzchargerEntity;
import net.mcreator.elementure.client.model.Modelnether_quartz_charger;

public class NetherquartzchargerRenderer extends MobRenderer<NetherquartzchargerEntity, Modelnether_quartz_charger<NetherquartzchargerEntity>> {
	public NetherquartzchargerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnether_quartz_charger(context.bakeLayer(Modelnether_quartz_charger.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<NetherquartzchargerEntity, Modelnether_quartz_charger<NetherquartzchargerEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/nether_quartz_charger_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(NetherquartzchargerEntity entity) {
		return new ResourceLocation("elementure:textures/entities/nether_quartz_charger_texturemap.png");
	}
}
