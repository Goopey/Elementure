
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.NetherstarvillagerdustyEntity;
import net.mcreator.elementure.client.model.Modelstarryvillager;

public class NetherstarvillagerdustyRenderer extends MobRenderer<NetherstarvillagerdustyEntity, Modelstarryvillager<NetherstarvillagerdustyEntity>> {
	public NetherstarvillagerdustyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstarryvillager(context.bakeLayer(Modelstarryvillager.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NetherstarvillagerdustyEntity entity) {
		return new ResourceLocation("elementure:textures/entities/starryvillagerdusty_texturemap.png");
	}
}
