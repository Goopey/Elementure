
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.entity.BlueAmberElevatorEntity2Entity;
import net.mcreator.elementure.client.model.Modelblue_amber_elevator_2_entity;

public class BlueAmberElevatorEntity2Renderer extends MobRenderer<BlueAmberElevatorEntity2Entity, Modelblue_amber_elevator_2_entity<BlueAmberElevatorEntity2Entity>> {
	public BlueAmberElevatorEntity2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelblue_amber_elevator_2_entity(context.bakeLayer(Modelblue_amber_elevator_2_entity.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlueAmberElevatorEntity2Entity entity) {
		return new ResourceLocation("elementure:textures/entities/blue_amber_elevator_2_texturemap.png");
	}
}
