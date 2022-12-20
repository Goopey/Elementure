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

// Made with Blockbench 4.4.0
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelsirenqueen<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelsirenqueen"), "main");
	public final ModelPart head;
	public final ModelPart right_arm;
	public final ModelPart left_arm;
	public final ModelPart tail_base;
	public final ModelPart tail_top;
	public final ModelPart tail_mid;
	public final ModelPart tail_end;
	public final ModelPart tail;
	public final ModelPart bb_main;

	public Modelsirenqueen(ModelPart root) {
		this.head = root.getChild("head");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.tail_base = root.getChild("tail_base");
		this.tail_top = tail_base.getChild("tail_top");
		this.tail_mid = tail_top.getChild("tail_mid");
		this.tail_end = tail_mid.getChild("tail_end");
		this.tail = tail_end.getChild("tail");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(210, 0).addBox(-7.0F, -20.0F, -4.5F, 14.0F, 26.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(191, 16)
						.addBox(-2.0F, -2.0F, -6.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(207, 35)
						.addBox(-9.0F, 5.99F, -6.5F, 18.0F, 0.0F, 13.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, -20.0F, 0.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(180, 32).addBox(-6.0F, 0.0F, -6.5F, 6.0F, 0.0F, 13.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(9.0F, 6.01F, 0.0F, 0.0F, 0.0F, 2.3562F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(180, 32).addBox(-6.0F, 0.0F, -6.5F, 6.0F, 0.0F, 13.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-9.0F, 6.01F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(162, 0).addBox(-9.0F, 0.0F, 0.0F, 18.0F, 0.0F, 6.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 6.01F, 6.5F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(162, 0).addBox(-9.0F, 0.0F, 0.0F, 18.0F, 0.0F, 6.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 6.01F, -6.5F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r5 = head
				.addOrReplaceChild(
						"cube_r5", CubeListBuilder.create().texOffs(191, 16).mirror()
								.addBox(-2.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(196, 93).mirror().addBox(-3.0F, -9.0F, -8.01F, 14.0F, 16.0F, 16.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(196, 93).mirror().addBox(-2.5F, 9.0F, -2.01F, 13.0F, 16.0F, 10.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(196, 93).mirror().addBox(-1.5F, 9.0F, -8.01F, 11.0F, 16.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(196, 93).mirror().addBox(-1.99F, 13.0F, -8.51F, 12.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(196, 93).mirror().addBox(-2.0F, 7.0F, -6.01F, 12.0F, 23.0F, 12.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(196, 93).mirror().addBox(0.0F, 30.0F, -5.01F, 8.0F, 11.0F, 10.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(16.0F, -10.0F, 0.0F));
		PartDefinition FistWrist1 = right_arm.addOrReplaceChild(
				"FistWrist1", CubeListBuilder.create().texOffs(147, 81).mirror()
						.addBox(-1.671F, -1.9835F, -2.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3F, 41.1F, 0.0F, 0.0F, 0.0F, 0.182F));
		PartDefinition Fisttop1 = FistWrist1.addOrReplaceChild(
				"Fisttop1", CubeListBuilder.create().texOffs(147, 81).mirror()
						.addBox(-8.3561F, -4.5345F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.6F, 7.6F, 0.0F, 0.0F, 0.0F, 0.182F));
		PartDefinition Fistside1 = Fisttop1.addOrReplaceChild("Fistside1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.6F, 0.3F, 0.0F, 0.0F, 0.0F, -1.2292F));
		PartDefinition Fistside1_r1 = Fistside1.addOrReplaceChild(
				"Fistside1_r1", CubeListBuilder.create().texOffs(147, 81).mirror()
						.addBox(-3.5982F, -4.2124F, -4.01F, 7.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 1.9F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition FistWristside11 = FistWrist1.addOrReplaceChild(
				"FistWristside11", CubeListBuilder.create().texOffs(147, 81).mirror()
						.addBox(-1.681F, -3.8403F, -2.0109F, 5.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.8F, -0.7F, -0.5463F, 0.0F, 0.0F));
		PartDefinition FistWristside12 = FistWrist1.addOrReplaceChild(
				"FistWristside12", CubeListBuilder.create().texOffs(147, 81).mirror()
						.addBox(-1.691F, -3.8403F, -0.9891F, 5.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, 0.5463F, 0.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(196, 93).addBox(-11.0F, -9.0F, -8.01F, 14.0F, 16.0F, 16.0F, new CubeDeformation(0.0F))
						.texOffs(196, 93).addBox(-10.5F, 9.0F, -2.01F, 13.0F, 16.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(196, 93)
						.addBox(-9.5F, 9.0F, -8.01F, 11.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(196, 93)
						.addBox(-9.99F, 13.0F, -8.51F, 12.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(196, 93)
						.addBox(-10.0F, 7.0F, -6.01F, 12.0F, 23.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(196, 93)
						.addBox(-8.0F, 30.0F, -5.01F, 8.0F, 11.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-16.0F, -10.0F, 0.0F));
		PartDefinition FistWrist2 = left_arm.addOrReplaceChild("FistWrist2",
				CubeListBuilder.create().texOffs(147, 81).addBox(-1.309F, -1.9835F, -2.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7F, 41.1F, 0.0F, -3.1416F, 0.0F, -2.9596F));
		PartDefinition Fisttop2 = FistWrist2.addOrReplaceChild("Fisttop2",
				CubeListBuilder.create().texOffs(147, 81).addBox(-8.0F, -4.6F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6F, 7.6F, 0.0F, 0.0F, 0.0F, 0.182F));
		PartDefinition Fistside2 = Fisttop2.addOrReplaceChild("Fistside2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.6F, 0.3F, 0.0F, 0.0F, 0.0F, -1.2292F));
		PartDefinition Fistside2_r1 = Fistside2.addOrReplaceChild("Fistside2_r1",
				CubeListBuilder.create().texOffs(147, 81).addBox(-3.3905F, -3.9158F, -4.01F, 7.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 1.9F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition FistWristside2 = FistWrist2.addOrReplaceChild("FistWristside2",
				CubeListBuilder.create().texOffs(147, 81).addBox(-1.319F, -3.8403F, -2.0109F, 5.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8F, -0.7F, -0.5463F, 0.0F, 0.0F));
		PartDefinition FistWristside3 = FistWrist2.addOrReplaceChild("FistWristside3",
				CubeListBuilder.create().texOffs(147, 81).addBox(-1.329F, -3.8403F, -0.9891F, 5.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, 0.5463F, 0.0F, 0.0F));
		PartDefinition tail_base = partdefinition.addOrReplaceChild("tail_base",
				CubeListBuilder.create().texOffs(91, 43).addBox(-10.0F, -2.0F, -7.0F, 20.0F, 12.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 27.0F, 0.0F));
		PartDefinition tail_top = tail_base.addOrReplaceChild("tail_top",
				CubeListBuilder.create().texOffs(91, 43).addBox(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition tail_mid = tail_top.addOrReplaceChild("tail_mid",
				CubeListBuilder.create().texOffs(91, 43).addBox(-8.0F, -2.0F, -5.0F, 16.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.mirror().addBox(8.0F, 0.0F, 0.0F, 12.0F, 18.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false).texOffs(0, 51)
						.addBox(-20.0F, 0.0F, 0.0F, 12.0F, 18.0F, 0.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition tail_end = tail_mid.addOrReplaceChild("tail_end",
				CubeListBuilder.create().texOffs(91, 43).addBox(-7.5F, -2.0F, -4.5F, 15.0F, 20.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition tail = tail_end.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(34, 58).addBox(-12.0F, 0.0F, -1.0F, 24.0F, 19.0F, 0.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, 18.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -38.0F, -8.0F, 32.0F, 17.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-14.0F, -38.01F, -10.0F, 28.0F, 18.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-13.0F, -21.0F, -8.0F, 26.0F, 14.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -21.01F, -9.0F, 20.0F, 16.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -5.01F, -9.0F, 16.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.0F, -7.0F, -8.0F, 22.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 106)
						.addBox(7.99F, -44.0F, -8.0F, 4.0F, 6.0F, 16.0F, new CubeDeformation(1.0F)).texOffs(0, 106).mirror()
						.addBox(-11.71F, -44.0F, -8.0F, 4.0F, 6.0F, 16.0F, new CubeDeformation(1.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(49, 84).addBox(0.0F, -12.0F, 0.0F, 0.0F, 24.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -20.01F, 10.0F, 0.48F, -0.7854F, 0.0F));
		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(49, 84).addBox(0.0F, -12.0F, 0.0F, 0.0F, 24.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -20.01F, 10.0F, 0.48F, 0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.tail_base.xRot = (float) (Math.sin(ageInTicks / 6) / 4);
		this.tail_top.xRot = (float) (Math.sin(ageInTicks / 6 + 1.9) / 4);
		this.tail_mid.xRot = (float) (Math.sin(ageInTicks / 6 + 3.8) / 4);
		this.tail_end.xRot = (float) (-Math.sin(ageInTicks / 6) / 8);
		this.tail.xRot = (float) (-Math.sin(ageInTicks / 6 + 1.9) / 8);
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail_base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
