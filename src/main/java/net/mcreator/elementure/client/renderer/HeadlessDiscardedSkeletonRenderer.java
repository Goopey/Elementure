
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.HeadlessDiscardedSkeletonEntity;
import net.mcreator.elementure.client.model.ModelheadlessDiscardedSkeleton;

public class HeadlessDiscardedSkeletonRenderer
		extends
			MobRenderer<HeadlessDiscardedSkeletonEntity, ModelheadlessDiscardedSkeleton<HeadlessDiscardedSkeletonEntity>> {
	public HeadlessDiscardedSkeletonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelheadlessDiscardedSkeleton(context.bakeLayer(ModelheadlessDiscardedSkeleton.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HeadlessDiscardedSkeletonEntity entity) {
		return new ResourceLocation("elementure:textures/entities/host_texturemap.png");
	}
}
