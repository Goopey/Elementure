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

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbiggraniteelemental<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelbiggraniteelemental"), "main");
	public final ModelPart Head;
	public final ModelPart Main4;
	public final ModelPart Main3;
	public final ModelPart Main2;
	public final ModelPart Main1;
	public final ModelPart Neck4;
	public final ModelPart Neck3;
	public final ModelPart Neck2;
	public final ModelPart Neck1;
	public final ModelPart Body4;
	public final ModelPart Body3;
	public final ModelPart Body2;
	public final ModelPart Shoulder2;
	public final ModelPart Shoulder1;
	public final ModelPart Heart;
	public final ModelPart Ring6;
	public final ModelPart Ring5;
	public final ModelPart Ring4;
	public final ModelPart Ring3;
	public final ModelPart Ring2;
	public final ModelPart Ring1;
	public final ModelPart bb_main;

	public Modelbiggraniteelemental(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Main4 = root.getChild("Main4");
		this.Main3 = root.getChild("Main3");
		this.Main2 = root.getChild("Main2");
		this.Main1 = root.getChild("Main1");
		this.Neck4 = root.getChild("Neck4");
		this.Neck3 = root.getChild("Neck3");
		this.Neck2 = root.getChild("Neck2");
		this.Neck1 = root.getChild("Neck1");
		this.Body4 = root.getChild("Body4");
		this.Body3 = root.getChild("Body3");
		this.Body2 = root.getChild("Body2");
		this.Shoulder2 = root.getChild("Shoulder2");
		this.Shoulder1 = root.getChild("Shoulder1");
		this.Heart = root.getChild("Heart");
		this.Ring6 = root.getChild("Ring6");
		this.Ring5 = root.getChild("Ring5");
		this.Ring4 = root.getChild("Ring4");
		this.Ring3 = root.getChild("Ring3");
		this.Ring2 = root.getChild("Ring2");
		this.Ring1 = root.getChild("Ring1");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(92, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.7F, -1.0F));
		PartDefinition Horn1 = Head.addOrReplaceChild("Horn1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -4.7F, -1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 2.1F, -2.5F, 0.6374F, -1.0016F, 0.0F));
		PartDefinition Horn2 = Head.addOrReplaceChild("Horn2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -4.7F, -1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9F, 2.1F, -2.5F, 0.6374F, 1.0016F, 0.0F));
		PartDefinition Main4 = partdefinition.addOrReplaceChild("Main4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -20.0F, -1.5F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.6F, 0.7F, -0.2731F, 0.0F, 0.0F));
		PartDefinition Main3 = partdefinition.addOrReplaceChild("Main3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -20.0F, -1.5F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.6F, -0.7F, 0.2731F, 0.0F, 0.0F));
		PartDefinition Main2 = partdefinition.addOrReplaceChild("Main2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -20.0F, -1.5F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7F, 15.6F, 0.0F, 0.0F, 0.0F, 0.2731F));
		PartDefinition Main1 = partdefinition.addOrReplaceChild("Main1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -20.0F, -1.5F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7F, 15.6F, 0.0F, 0.0F, 0.0F, -0.2731F));
		PartDefinition Neck4 = partdefinition.addOrReplaceChild("Neck4", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -4.5F, -1.5F, 2.0488F, -0.8652F, -3.1416F));
		PartDefinition Neck3 = partdefinition.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -4.5F, -1.5F, 2.0488F, 0.8652F, 3.1416F));
		PartDefinition Neck2 = partdefinition.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5F, -13.5F, 6.4F, -0.5918F, -0.7285F, 0.0F));
		PartDefinition Neck1 = partdefinition.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, -13.5F, 6.4F, -0.5918F, 0.7285F, 0.0F));
		PartDefinition Body4 = partdefinition.addOrReplaceChild("Body4", CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition Body3 = partdefinition.addOrReplaceChild("Body3", CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Body2 = partdefinition.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition Shoulder2 = partdefinition.addOrReplaceChild("Shoulder2", CubeListBuilder.create().texOffs(32, 32).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.5F, -15.5F, 2.0F));
		PartDefinition Band2 = Shoulder2.addOrReplaceChild("Band2", CubeListBuilder.create().texOffs(48, 16).addBox(-4.5F, -0.5F, -4.5F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.2F, 0.0F));
		PartDefinition FistWrist2 = Shoulder2.addOrReplaceChild("FistWrist2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8F, 21.6F, 0.0F, 0.0F, -3.1416F, -0.182F));
		PartDefinition Fisttop2 = FistWrist2.addOrReplaceChild("Fisttop2", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -4.6F, -4.0F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6F, 7.6F, 0.0F, 0.0F, 0.0F, 0.182F));
		PartDefinition Fistside2 = Fisttop2.addOrReplaceChild("Fistside2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6F, 0.3F, 0.0F, 0.0F, 0.0F, -1.2292F));
		PartDefinition Fistside2_r1 = Fistside2.addOrReplaceChild("Fistside2_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9F, -3.8F, -4.01F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6F, 1.9F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition FistWristside21 = FistWrist2.addOrReplaceChild("FistWristside21", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8F, -0.7F, -0.5463F, 0.0F, 0.0F));
		PartDefinition FistWristside22 = FistWrist2.addOrReplaceChild("FistWristside22", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, 0.5463F, 0.0F, 0.0F));
		PartDefinition Shoulder1 = partdefinition.addOrReplaceChild("Shoulder1", CubeListBuilder.create().texOffs(0, 32).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(12.5F, -15.5F, 2.0F));
		PartDefinition Band1 = Shoulder1.addOrReplaceChild("Band1", CubeListBuilder.create().texOffs(48, 16).addBox(-4.5F, -0.5F, -4.5F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.2F, 0.0F));
		PartDefinition FistWrist1 = Shoulder1.addOrReplaceChild("FistWrist1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8F, 21.6F, 0.0F, 0.0F, 0.0F, 0.182F));
		PartDefinition Fisttop1 = FistWrist1.addOrReplaceChild("Fisttop1", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -4.6F, -4.0F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6F, 7.6F, 0.0F, 0.0F, 0.0F, 0.182F));
		PartDefinition Fistside1 = Fisttop1.addOrReplaceChild("Fistside1", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6F, 0.3F, 0.0F, 0.0F, 0.0F, -1.2292F));
		PartDefinition Fistside1_r1 = Fistside1.addOrReplaceChild("Fistside1_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3F, -3.5F, -4.01F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 1.9F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition FistWristside11 = FistWrist1.addOrReplaceChild("FistWristside11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8F, -0.7F, -0.5463F, 0.0F, 0.0F));
		PartDefinition FistWristside12 = FistWrist1.addOrReplaceChild("FistWristside12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, 0.5463F, 0.0F, 0.0F));
		PartDefinition Heart = partdefinition.addOrReplaceChild("Heart", CubeListBuilder.create().texOffs(60, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.0F, 2.0F));
		PartDefinition Ring6 = partdefinition.addOrReplaceChild("Ring6", CubeListBuilder.create().texOffs(92, 36).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, 17.0F, 2.0F, -3.1416F, 0.4363F, 3.1416F));
		PartDefinition Ring5 = partdefinition.addOrReplaceChild("Ring5", CubeListBuilder.create().texOffs(92, 36).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, 17.0F, 2.0F, 0.0F, 0.4363F, 0.0F));
		PartDefinition Ring4 = partdefinition.addOrReplaceChild("Ring4", CubeListBuilder.create().texOffs(64, 40).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, 17.0F, -6.5F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Ring3 = partdefinition.addOrReplaceChild("Ring3", CubeListBuilder.create().texOffs(64, 40).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, 17.0F, 10.5F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Ring2 = partdefinition.addOrReplaceChild("Ring2", CubeListBuilder.create().texOffs(92, 36).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, 17.0F, 2.0F, -3.1416F, -0.4363F, 3.1416F));
		PartDefinition Ring1 = partdefinition.addOrReplaceChild("Ring1", CubeListBuilder.create().texOffs(92, 36).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, 17.0F, 2.0F, 0.0F, -0.4363F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -38.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Main4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Main3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Main2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Main1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Shoulder2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Shoulder1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Heart.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.Shoulder1.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Shoulder2.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
