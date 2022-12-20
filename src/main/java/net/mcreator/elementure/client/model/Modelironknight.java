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
public class Modelironknight<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelironknight"), "main");
	public final ModelPart Hood;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart ArmCentre;
	public final ModelPart bb_main;

	public Modelironknight(ModelPart root) {
		this.Hood = root.getChild("Hood");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.ArmCentre = root.getChild("ArmCentre");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Hood = partdefinition.addOrReplaceChild("Hood",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -4.5F, -4.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.5F, 0.0F));
		PartDefinition HornRightBase = Hood.addOrReplaceChild("HornRightBase",
				CubeListBuilder.create().texOffs(0, 20).addBox(-2.0F, -8.1F, -3.2F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.8727F, 0.0F));
		PartDefinition HornRightMain = HornRightBase.addOrReplaceChild("HornRightMain",
				CubeListBuilder.create().texOffs(40, 0).addBox(-0.9F, -9.0F, -8.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9561F, -0.2731F, -0.1676F));
		PartDefinition HornLeftBase = Hood.addOrReplaceChild(
				"HornLeftBase", CubeListBuilder.create().texOffs(0, 20).mirror()
						.addBox(-2.0F, -8.1F, -3.2F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, -0.8727F, 0.0F));
		PartDefinition HornLeftMain = HornLeftBase.addOrReplaceChild(
				"HornLeftMain", CubeListBuilder.create().texOffs(40, 0).mirror()
						.addBox(-0.9F, -9.2F, -8.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9561F, 0.2731F, 0.0F));
		PartDefinition Head = Hood.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(64, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(100, 52).mirror().addBox(-2.25F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(112, 0).mirror().addBox(-2.25F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.2F))
						.mirror(false),
				PartPose.offset(2.5F, 12.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild(
				"RightLeg", CubeListBuilder.create().texOffs(112, 0).addBox(-1.75F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.2F))
						.texOffs(72, 52).addBox(-1.75F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 12.0F, 0.0F));
		PartDefinition ArmCentre = partdefinition.addOrReplaceChild("ArmCentre",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition ShoulderRight = ArmCentre.addOrReplaceChild("ShoulderRight", CubeListBuilder.create().texOffs(24, 84).mirror()
				.addBox(-4.8F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-3.5F, 0.0F, 0.0F));
		PartDefinition ArmRight = ShoulderRight
				.addOrReplaceChild(
						"ArmRight", CubeListBuilder.create().texOffs(0, 84).mirror()
								.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(-2.2F, 0.0F, 0.0F, -0.7854F, -0.9599F, 0.0F));
		PartDefinition ShoulderLeft = ArmCentre.addOrReplaceChild("ShoulderLeft",
				CubeListBuilder.create().texOffs(24, 60).addBox(-1.2F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 0.0F, 0.0F));
		PartDefinition ArmLeft = ShoulderLeft.addOrReplaceChild("ArmLeft",
				CubeListBuilder.create().texOffs(0, 60).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2F, 0.0F, 0.0F, -0.7854F, 0.7854F, 0.0F));
		PartDefinition Sword = ArmCentre.addOrReplaceChild("Sword",
				CubeListBuilder.create().texOffs(42, 16).addBox(0.0F, -24.0F, -4.0F, 0.0F, 24.0F, 8.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, -5.1F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild(
				"bb_main", CubeListBuilder.create().texOffs(68, 24).addBox(-4.5F, -24.0F, -2.5F, 9.0F, 12.0F, 5.0F, new CubeDeformation(0.0F))
						.texOffs(100, 68).addBox(-4.5F, -15.0F, -2.5F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Hood.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ArmCentre.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.ArmCentre.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Hood.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Hood.xRot = headPitch / (180F / (float) Math.PI);
	}
}
