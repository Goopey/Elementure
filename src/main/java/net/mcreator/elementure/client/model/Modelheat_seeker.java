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
public class Modelheat_seeker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelheat_seeker"), "main");
	public final ModelPart tentacle_side_left;
	public final ModelPart tentacle_left_2;
	public final ModelPart tentacle_side_right;
	public final ModelPart tentacle_right_2;
	public final ModelPart tentacle_top_2;
	public final ModelPart tentacle_top_22;
	public final ModelPart tentacle_top_1;
	public final ModelPart tentacle_top_12;
	public final ModelPart head_bone;

	public Modelheat_seeker(ModelPart root) {
		this.tentacle_side_left = root.getChild("tentacle_side_left");
		this.tentacle_left_2 = tentacle_side_left.getChild("tentacle_left_2");
		this.tentacle_side_right = root.getChild("tentacle_side_right");
		this.tentacle_right_2 = tentacle_side_right.getChild("tentacle_right_2");
		this.tentacle_top_2 = root.getChild("tentacle_top_2");
		this.tentacle_top_22 = tentacle_top_2.getChild("tentacle_top_22");
		this.tentacle_top_1 = root.getChild("tentacle_top_1");
		this.tentacle_top_12 = tentacle_top_1.getChild("tentacle_top_12");
		this.head_bone = root.getChild("head_bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition tentacle_side_left = partdefinition.addOrReplaceChild("tentacle_side_left",
				CubeListBuilder.create().texOffs(50, 11).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 21.0F, -1.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition tentacle_left_2 = tentacle_side_left.addOrReplaceChild("tentacle_left_2",
				CubeListBuilder.create().texOffs(27, 11).addBox(0.09F, -1.01F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -0.1309F, 0.0F));
		PartDefinition tentacle_side_right = partdefinition.addOrReplaceChild("tentacle_side_right",
				CubeListBuilder.create().texOffs(50, 11).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 21.0F, -1.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition tentacle_right_2 = tentacle_side_right.addOrReplaceChild("tentacle_right_2",
				CubeListBuilder.create().texOffs(27, 11).addBox(-4.09F, -4.01F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 3.0F, 2.0F, 0.0F, 0.1309F, 0.0F));
		PartDefinition tentacle_top_2 = partdefinition.addOrReplaceChild("tentacle_top_2",
				CubeListBuilder.create().texOffs(50, 18).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.5F, -1.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition tentacle_top_22 = tentacle_top_2.addOrReplaceChild("tentacle_top_22",
				CubeListBuilder.create().texOffs(28, 20).addBox(-0.99F, 0.1F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 2.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition tentacle_top_1 = partdefinition.addOrReplaceChild("tentacle_top_1",
				CubeListBuilder.create().texOffs(50, 11).addBox(-1.0F, -1.5F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.5F, -1.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition tentacle_top_12 = tentacle_top_1.addOrReplaceChild("tentacle_top_12",
				CubeListBuilder.create().texOffs(24, 10).addBox(-0.99F, -1.1F, 0.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition head_bone = partdefinition.addOrReplaceChild("head_bone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(-3.0F, -3.0F, -5.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, 0.0F));
		PartDefinition head_6_r1 = head_bone.addOrReplaceChild("head_6_r1",
				CubeListBuilder.create().texOffs(44, 26).addBox(-2.5F, 1.86F, -1.09F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition head_5_r1 = head_bone.addOrReplaceChild("head_5_r1",
				CubeListBuilder.create().texOffs(19, 26).addBox(-2.5F, -2.86F, -1.09F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition head_4_r1 = head_bone.addOrReplaceChild("head_4_r1",
				CubeListBuilder.create().texOffs(0, 22).addBox(-0.86F, -2.51F, -3.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, 0.0436F, 0.0F));
		PartDefinition head_3_r1 = head_bone.addOrReplaceChild("head_3_r1",
				CubeListBuilder.create().texOffs(0, 22).addBox(-0.14F, -2.51F, -3.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, 2.0F, 0.0F, -0.0436F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		// -----------------Top or X--------------------
		this.tentacle_top_1.xRot = (float) Math.sin(ageInTicks / -12) / 6 + 0.26F;
		this.tentacle_top_12.xRot = (float) Math.sin(ageInTicks / -12) / 6 - 0.13F;
		/*
		*/
		this.tentacle_top_2.xRot = (float) Math.sin(ageInTicks / 12) / 6 - 0.26F;
		this.tentacle_top_22.xRot = (float) Math.sin(ageInTicks / 12) / 6 + 0.13F;
		// -----------------Side or Y--------------------
		this.tentacle_side_left.yRot = (float) Math.sin(ageInTicks / 12) / 6 + 0.26F;
		this.tentacle_left_2.yRot = (float) Math.sin(ageInTicks / 12) / 6 - 0.13F;
		/*
		*/
		this.tentacle_side_right.yRot = (float) Math.sin(ageInTicks / -12) / 6 - 0.26F;
		this.tentacle_right_2.yRot = (float) Math.sin(ageInTicks / -12) / 6 + 0.13F;
		// ----------------------------------------------
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		tentacle_side_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tentacle_side_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tentacle_top_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tentacle_top_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head_bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
