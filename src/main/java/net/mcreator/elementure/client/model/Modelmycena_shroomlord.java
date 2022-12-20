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
public class Modelmycena_shroomlord<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelmycena_shroomlord"),
			"main");
	public final ModelPart rArm;
	public final ModelPart lArm;
	public final ModelPart eye;
	public final ModelPart body;
	public final ModelPart rLeg;
	public final ModelPart lLeg;

	public Modelmycena_shroomlord(ModelPart root) {
		this.rArm = root.getChild("rArm");
		this.lArm = root.getChild("lArm");
		this.eye = root.getChild("eye");
		this.body = root.getChild("body");
		this.rLeg = root.getChild("rLeg");
		this.lLeg = root.getChild("lLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition rArm = partdefinition.addOrReplaceChild("rArm",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.75F, 0.0F, -2.5F, 4.0F, 19.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.0F, -9.0F, 0.0F));
		PartDefinition lArm = partdefinition.addOrReplaceChild("lArm",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.25F, 0.0F, -2.5F, 4.0F, 19.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, -9.0F, 0.0F));
		PartDefinition eye = partdefinition.addOrReplaceChild("eye",
				CubeListBuilder.create().texOffs(116, 0).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.5F, -2.5F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.5F, -7.0F, -2.5F, 13.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(88, 19)
						.addBox(-7.5F, -14.0F, -1.5F, 15.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -16.0F, -3.5F, 16.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(97, 10)
						.addBox(-7.5F, -14.0F, -2.5F, 6.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 0)
						.addBox(-7.5F, -14.0F, -3.5F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(102, 0)
						.addBox(2.5F, -14.0F, -3.5F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -7.0F, -3.25F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.5F, -14.5F, -3.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.5F, -7.5F, -3.0F, 7.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(114, 9)
						.addBox(1.5F, -14.0F, -2.5F, 6.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, -7.0F, 2.15F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -17.0F, -5.0F, 20.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(42, 112).addBox(-14.0F, -1.0F, -7.5F, 28.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(30, 93)
						.addBox(-16.0F, -2.6F, -8.5F, 32.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(34, 59)
						.addBox(-17.0F, -2.0F, -6.5F, 34.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(30, 73)
						.addBox(-15.5F, -2.0F, -9.5F, 30.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(36, 42)
						.addBox(-15.0F, -3.4F, -8.0F, 30.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(17, 26)
						.addBox(-14.0F, -4.0F, -7.5F, 28.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 113)
						.addBox(-12.5F, -4.7F, -6.5F, 25.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
						.addBox(-11.0F, -5.3F, -5.0F, 22.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 76)
						.addBox(-9.0F, -5.6F, -4.0F, 18.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -17.0F, 0.0F));
		PartDefinition rLeg = partdefinition.addOrReplaceChild("rLeg",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.5F, 8.0F, 0.0F));
		PartDefinition lLeg = partdefinition.addOrReplaceChild("lLeg",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.5F, 8.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		rArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.eye.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.eye.xRot = headPitch / (180F / (float) Math.PI);
		this.lLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.lArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
