
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenainfectedshroomguardEntity;
import net.mcreator.elementure.client.model.Modelmycena_shroom_infected_guard;

public class MycenainfectedshroomguardRenderer
		extends
			MobRenderer<MycenainfectedshroomguardEntity, Modelmycena_shroom_infected_guard<MycenainfectedshroomguardEntity>> {
	public MycenainfectedshroomguardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_shroom_infected_guard(context.bakeLayer(Modelmycena_shroom_infected_guard.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<MycenainfectedshroomguardEntity, Modelmycena_shroom_infected_guard<MycenainfectedshroomguardEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/mycena_shroom_infected_guard_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenainfectedshroomguardEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_shroom_infected_guard_texturemap.png");
	}
}
