package net.mcreator.elementure.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcoal_puck<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelcoal_puck"), "main");
	public final ModelPart body_whole_pivot;
	public final ModelPart right_arm_r1;
	public final ModelPart left_arm_r1;

	public Modelcoal_puck(ModelPart root) {
		this.body_whole_pivot = root.getChild("body_whole_pivot");
		this.right_arm_r1 = body_whole_pivot.getChild("right_arm_r1");
		this.left_arm_r1 = body_whole_pivot.getChild("left_arm_r1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body_whole_pivot = partdefinition
				.addOrReplaceChild(
						"body_whole_pivot", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 0).addBox(-2.5F, 3.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
								.texOffs(28, 0).mirror().addBox(1.5F, 3.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 13).addBox(-3.0F, -1.5F, -3.15F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition right_arm_r1 = body_whole_pivot.addOrReplaceChild("right_arm_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition left_arm_r1 = body_whole_pivot.addOrReplaceChild("left_arm_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		return LayerDefinition.create(meshdefinition, 32, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.left_arm_r1.xRot = (float) Math.sin(ageInTicks / 7) / 12;
		this.left_arm_r1.zRot = (float) Math.sin(ageInTicks / -7) / 12;
		this.right_arm_r1.xRot = (float) Math.sin(ageInTicks / -7) / 12;
		this.right_arm_r1.zRot = (float) Math.sin(ageInTicks / 7) / 12;
		this.body_whole_pivot.zRot = (float) Math.sin(ageInTicks / 8) / 12;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body_whole_pivot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
