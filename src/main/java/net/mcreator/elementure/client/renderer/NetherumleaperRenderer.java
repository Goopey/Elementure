
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.NetherumleaperEntity;
import net.mcreator.elementure.client.model.Modelnetherum_leaper;

public class NetherumleaperRenderer extends MobRenderer<NetherumleaperEntity, Modelnetherum_leaper<NetherumleaperEntity>> {
	public NetherumleaperRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnetherum_leaper(context.bakeLayer(Modelnetherum_leaper.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<NetherumleaperEntity, Modelnetherum_leaper<NetherumleaperEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/netherum_leaper_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(NetherumleaperEntity entity) {
		return new ResourceLocation("elementure:textures/entities/netherum_leaper_texturemap.png");
	}
}
