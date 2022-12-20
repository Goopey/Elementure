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
public class Modellightningandesiteknight<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modellightningandesiteknight"),
			"main");
	public final ModelPart ShieldLeft;
	public final ModelPart ShieldRight;
	public final ModelPart ShoulderRight;
	public final ModelPart ShoulderLeft;
	public final ModelPart NeckRing;
	public final ModelPart Head;
	public final ModelPart Heart;
	public final ModelPart bb_main;

	public Modellightningandesiteknight(ModelPart root) {
		this.ShieldLeft = root.getChild("ShieldLeft");
		this.ShieldRight = root.getChild("ShieldRight");
		this.ShoulderRight = root.getChild("ShoulderRight");
		this.ShoulderLeft = root.getChild("ShoulderLeft");
		this.NeckRing = root.getChild("NeckRing");
		this.Head = root.getChild("Head");
		this.Heart = root.getChild("Heart");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition ShieldLeft = partdefinition
				.addOrReplaceChild(
						"ShieldLeft", CubeListBuilder.create().texOffs(60, 16).mirror()
								.addBox(-5.0F, 0.0F, 0.0F, 5.0F, 6.0F, 0.0F, new CubeDeformation(0.1F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 7.1F, -3.1F, -3.1416F, 0.3643F, 3.1416F));
		PartDefinition ShieldLeftBottom = ShieldLeft.addOrReplaceChild("ShieldLeftBottom",
				CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-5.0F, 0.0F, 0.0F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.4554F, 0.0F, 0.0F));
		PartDefinition ShieldRight = partdefinition.addOrReplaceChild("ShieldRight",
				CubeListBuilder.create().texOffs(72, 0).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 6.0F, 0.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 7.1F, -3.1F, 0.0F, 0.3643F, 0.0F));
		PartDefinition ShieldRightBottom = ShieldRight.addOrReplaceChild(
				"ShieldRightBottom", CubeListBuilder.create().texOffs(72, 16).mirror()
						.addBox(-5.0F, 0.0F, 0.0F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.4554F, 0.0F, 0.0F));
		PartDefinition ShoulderRight = partdefinition.addOrReplaceChild("ShoulderRight",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.3F, -0.6F, 0.0F));
		PartDefinition ShoulderSideRight = ShoulderRight.addOrReplaceChild("ShoulderSideRight",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 5.0F, 0.0F));
		PartDefinition ArmRight = ShoulderRight.addOrReplaceChild("ArmRight",
				CubeListBuilder.create().texOffs(44, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.8F, 5.0F, 0.0F));
		PartDefinition ShoulderLeft = partdefinition.addOrReplaceChild("ShoulderLeft",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.3F, -0.6F, 0.0F));
		PartDefinition ShoulderSideLeft = ShoulderLeft.addOrReplaceChild("ShoulderSideLeft",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 5.0F, 0.0F));
		PartDefinition ArmLeft = ShoulderLeft.addOrReplaceChild("ArmLeft",
				CubeListBuilder.create().texOffs(36, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.2F, 5.0F, 0.0F));
		PartDefinition NeckRing = partdefinition.addOrReplaceChild("NeckRing",
				CubeListBuilder.create().texOffs(0, 20).addBox(-4.5F, 0.0F, -4.5F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.5F, 0.0F));
		PartDefinition Crystal1 = NeckRing.addOrReplaceChild("Crystal1",
				CubeListBuilder.create().texOffs(0, 48).addBox(0.0F, 0.0F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(3.6F, 2.9F, 0.0F, 0.0F, 0.0F, 0.5918F));
		PartDefinition Crystal2 = NeckRing.addOrReplaceChild("Crystal2",
				CubeListBuilder.create().texOffs(0, 40).addBox(0.0F, 0.0F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-3.6F, 2.9F, 0.0F, 0.0F, 0.0F, -0.5918F));
		PartDefinition Crystal3 = NeckRing.addOrReplaceChild("Crystal3",
				CubeListBuilder.create().texOffs(0, 36).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.9F, 3.6F, -0.5918F, 0.0F, 0.0F));
		PartDefinition Crystal4 = NeckRing.addOrReplaceChild("Crystal4",
				CubeListBuilder.create().texOffs(16, 36).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.9F, -3.6F, 0.5918F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(20, 48).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.4F, 0.0F));
		PartDefinition HornMain1 = Head.addOrReplaceChild("HornMain1",
				CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4F, -1.8F, -1.0F, 0.4554F, -0.4554F, 0.0F));
		PartDefinition HornMinor1 = HornMain1.addOrReplaceChild("HornMinor1",
				CubeListBuilder.create().texOffs(35, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3F, 0.1F, 4.2F, -0.0456F, 0.6829F, -0.0456F));
		PartDefinition HornMain2 = Head.addOrReplaceChild("HornMain2",
				CubeListBuilder.create().texOffs(36, 0).addBox(-1.2F, -1.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4F, -1.8F, -1.0F, 0.4554F, 0.4554F, 0.0F));
		PartDefinition HornMinor2 = HornMain2.addOrReplaceChild("HornMinor2",
				CubeListBuilder.create().texOffs(36, 0).addBox(0.2F, -1.0F, 0.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 0.1F, 4.2F, -0.0456F, -0.6829F, 0.0456F));
		PartDefinition Heart = partdefinition.addOrReplaceChild("Heart",
				CubeListBuilder.create().texOffs(35, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.1F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(36, 0).addBox(-2.0F, -28.4F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		ShieldLeft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ShieldRight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ShoulderRight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ShoulderLeft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		NeckRing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Heart.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.ShoulderLeft.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.ShoulderRight.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
