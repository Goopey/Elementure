
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.DiscardedSkeletonEntity;
import net.mcreator.elementure.client.model.ModeldiscardedSkeleton;

public class DiscardedSkeletonRenderer extends MobRenderer<DiscardedSkeletonEntity, ModeldiscardedSkeleton<DiscardedSkeletonEntity>> {
	public DiscardedSkeletonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModeldiscardedSkeleton(context.bakeLayer(ModeldiscardedSkeleton.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DiscardedSkeletonEntity entity) {
		return new ResourceLocation("elementure:textures/entities/host_texturemap.png");
	}
}
