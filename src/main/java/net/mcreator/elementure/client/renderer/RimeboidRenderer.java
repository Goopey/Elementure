
package net.mcreator.elementure.client.renderer;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.RimeboidEntity;
import net.mcreator.elementure.client.model.ModelrimeBoid;

@OnlyIn(Dist.CLIENT)
public class RimeboidRenderer extends MobRenderer<RimeboidEntity, ModelrimeBoid<RimeboidEntity>> {
	public RimeboidRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelrimeBoid(context.bakeLayer(ModelrimeBoid.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<RimeboidEntity, ModelrimeBoid<RimeboidEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/rimeboid_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(RimeboidEntity entity) {
		return entity.color;
	}
}
