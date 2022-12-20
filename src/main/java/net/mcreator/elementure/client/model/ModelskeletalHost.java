package net.mcreator.elementure.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelskeletalHost<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelskeletal_host"), "main");
	public final ModelPart right_leg;
	public final ModelPart left_leg;
	public final ModelPart head_tilt;
	public final ModelPart right_arm;
	public final ModelPart left_arm;
	public final ModelPart spiderHead;
	public final ModelPart spider_leg_1;
	public final ModelPart spider_leg_2;
	public final ModelPart spider_leg_3;
	public final ModelPart spider_leg_4;
	public final ModelPart spider_leg_5;
	public final ModelPart bb_main;

	public ModelskeletalHost(ModelPart root) {
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.head_tilt = root.getChild("head_tilt");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.spiderHead = root.getChild("spiderHead");
		this.spider_leg_1 = root.getChild("spider_leg_1");
		this.spider_leg_2 = root.getChild("spider_leg_2");
		this.spider_leg_3 = root.getChild("spider_leg_3");
		this.spider_leg_4 = root.getChild("spider_leg_4");
		this.spider_leg_5 = root.getChild("spider_leg_5");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -0.01F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild(
				"left_leg", CubeListBuilder.create().texOffs(0, 18).mirror()
						.addBox(-1.0F, -0.01F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition head_tilt = partdefinition.addOrReplaceChild("head_tilt", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.5F));
		PartDefinition head_pivot_bob = head_tilt.addOrReplaceChild("head_pivot_bob",
				CubeListBuilder.create().texOffs(32, 0).addBox(-3.99F, -8.01F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.829F, 0.0F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 1.0F, 0.0F));
		PartDefinition right_arm_r1 = right_arm.addOrReplaceChild("right_arm_r1",
				CubeListBuilder.create().texOffs(24, 18).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 0.5F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 1.0F, 0.0F));
		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild(
				"left_arm_r1", CubeListBuilder.create().texOffs(24, 18).mirror()
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.01F, 0.5F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition spiderHead = partdefinition.addOrReplaceChild("spiderHead",
				CubeListBuilder.create().texOffs(44, 54).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition spider_leg_1 = partdefinition.addOrReplaceChild("spider_leg_1", CubeListBuilder.create(), PartPose.offset(-4.0F, 10.0F, 0.0F));
		PartDefinition cube_r1 = spider_leg_1
				.addOrReplaceChild(
						"cube_r1", CubeListBuilder.create().texOffs(44, 35).mirror()
								.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.2182F, 0.3491F, 0.0F));
		PartDefinition spider_leg_2 = partdefinition.addOrReplaceChild("spider_leg_2", CubeListBuilder.create(), PartPose.offset(-4.0F, 7.0F, 0.0F));
		PartDefinition cube_r2 = spider_leg_2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(44, 35).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.0436F, 0.3054F, 0.0F));
		PartDefinition spider_leg_3 = partdefinition.addOrReplaceChild("spider_leg_3", CubeListBuilder.create(), PartPose.offset(-4.0F, 2.0F, 0.0F));
		PartDefinition cube_r3 = spider_leg_3.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(44, 35).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, -0.3927F, 0.1309F, 0.0F));
		PartDefinition spider_leg_4 = partdefinition.addOrReplaceChild("spider_leg_4", CubeListBuilder.create(), PartPose.offset(4.0F, 7.0F, 0.0F));
		PartDefinition cube_r4 = spider_leg_4.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(44, 35).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.2618F, -0.3054F, 0.0F));
		PartDefinition spider_leg_5 = partdefinition.addOrReplaceChild("spider_leg_5", CubeListBuilder.create(), PartPose.offset(3.0F, 12.0F, -2.0F));
		PartDefinition cube_r5 = spider_leg_5.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(44, 35).addBox(-2.0F, 5.0F, -6.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -6.0F, 0.0F, 0.1745F, -0.1745F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild(
				"bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(0, 48).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(-0.1F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 46).addBox(-2.5F, -2.0F, 0.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.0F, 0.0F, -0.6981F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.spider_leg_1.xRot = (float) (Math.cos(ageInTicks / 6) / 3);
		this.spider_leg_2.xRot = (float) (Math.cos(ageInTicks / 6 + 0.25) / 3);
		this.spider_leg_3.xRot = (float) (Math.cos(ageInTicks / 6 + 0.5) / 3);
		this.spider_leg_4.xRot = (float) (Math.cos(ageInTicks / 6 + 0.75) / 3);
		this.spider_leg_5.xRot = (float) (Math.cos(ageInTicks / 6 + 1) / 3);
		float bobAge = (ageInTicks / 8.f);
		this.head_tilt.xRot = (float) (-Math.sin(bobAge + 0.25 * (Math.sin(bobAge + (Math.PI / 2)))) / 3);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -0.5F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 0.5F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 1.0F) * -0.5F * limbSwingAmount;
		this.right_arm.xRot = Mth.cos(limbSwing * 1.0F) * 0.5F * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head_tilt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spiderHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spider_leg_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spider_leg_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spider_leg_3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spider_leg_4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spider_leg_5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
