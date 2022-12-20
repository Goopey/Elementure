
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.DragoniteEntity;
import net.mcreator.elementure.client.model.Modeldragonite;

public class DragoniteRenderer extends MobRenderer<DragoniteEntity, Modeldragonite<DragoniteEntity>> {
	public DragoniteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldragonite(context.bakeLayer(Modeldragonite.LAYER_LOCATION)), 0f);
		this.addLayer(new EyesLayer<DragoniteEntity, Modeldragonite<DragoniteEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/dragonite_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(DragoniteEntity entity) {
		return new ResourceLocation("elementure:textures/entities/dragonite_texturemap.png");
	}
}
