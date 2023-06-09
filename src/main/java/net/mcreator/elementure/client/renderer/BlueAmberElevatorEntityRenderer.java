
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.BlueAmberElevatorEntityEntity;
import net.mcreator.elementure.client.model.Modelblue_amber_elevator_entity;

public class BlueAmberElevatorEntityRenderer extends MobRenderer<BlueAmberElevatorEntityEntity, Modelblue_amber_elevator_entity<BlueAmberElevatorEntityEntity>> {
	public BlueAmberElevatorEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelblue_amber_elevator_entity(context.bakeLayer(Modelblue_amber_elevator_entity.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlueAmberElevatorEntityEntity entity) {
		return new ResourceLocation("elementure:textures/entities/blue_amber_elevator_texturemap.png");
	}
}
