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
public class Modelmycena_shroom_villager_elder<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("elementure", "modelmycena_shroom_villager_elder"), "main");
	public final ModelPart LeftArmBone;
	public final ModelPart RightArmBone;
	public final ModelPart Body;
	public final ModelPart rLegBone;
	public final ModelPart lLegBone;
	public final ModelPart HeadBone;

	public Modelmycena_shroom_villager_elder(ModelPart root) {
		this.LeftArmBone = root.getChild("LeftArmBone");
		this.RightArmBone = root.getChild("RightArmBone");
		this.Body = root.getChild("Body");
		this.rLegBone = root.getChild("rLegBone");
		this.lLegBone = root.getChild("lLegBone");
		this.HeadBone = root.getChild("HeadBone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftArmBone = partdefinition.addOrReplaceChild("LeftArmBone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.75F, -0.25F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.75F, 12.25F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition RightArmBone = partdefinition.addOrReplaceChild("RightArmBone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.25F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.75F, 12.25F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(54, 52).addBox(-1.8F, -3.455F, -1.0F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(43, 60)
						.addBox(-1.3F, 0.545F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 61)
						.addBox(-2.3F, 0.545F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.05F, -0.955F, -1.01F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.55F, -1.455F, -0.99F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.45F, -0.955F, -0.99F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.95F, -1.455F, -1.01F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.3F, 12.455F, 0.0F));
		PartDefinition rLegBone = partdefinition.addOrReplaceChild("rLegBone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.25F, 5.0F, -0.99F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 13.0F, 0.0F));
		PartDefinition lLegBone = partdefinition.addOrReplaceChild("lLegBone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.75F, 5.0F, -1.01F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 13.0F, 0.0F));
		PartDefinition HeadBone = partdefinition.addOrReplaceChild("HeadBone",
				CubeListBuilder.create().texOffs(0, 54).addBox(-4.5F, -1.0F, -4.5F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(16, 39)
						.addBox(-6.0F, -1.4F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(34, 26)
						.addBox(-1.5F, -2.39F, -5.99F, 3.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(34, 22)
						.addBox(-6.01F, -2.39F, -1.5F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-5.5F, -2.4F, -5.5F, 11.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-4.0F, -3.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(-1.0F, -2.99F, -5.01F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-4.99F, -2.99F, -1.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 14)
						.addBox(-3.0F, -3.5F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		LeftArmBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArmBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rLegBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lLegBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		HeadBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftArmBone.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rLegBone.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.HeadBone.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.HeadBone.xRot = headPitch / (180F / (float) Math.PI);
		this.RightArmBone.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.lLegBone.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
