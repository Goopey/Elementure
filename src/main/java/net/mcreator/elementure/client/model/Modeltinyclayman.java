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
public class Modeltinyclayman<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modeltinyclayman"), "main");
	public final ModelPart main;
	public final ModelPart r_leg;
	public final ModelPart r_arm;
	public final ModelPart l_arm;
	public final ModelPart l_leg;
	public final ModelPart head;

	public Modeltinyclayman(ModelPart root) {
		this.main = root.getChild("main");
		this.r_leg = main.getChild("r_leg");
		this.l_leg = main.getChild("l_leg");
		this.r_arm = main.getChild("r_arm");
		this.l_arm = main.getChild("l_arm");
		this.head = main.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.0F, 0.0F));
		PartDefinition r_leg = main.addOrReplaceChild("r_leg", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.6F, 2.0F, 0.0F));
		PartDefinition r_arm = main.addOrReplaceChild("r_arm", CubeListBuilder.create(), PartPose.offset(-1.5F, -2.0F, 0.0F));
		PartDefinition right_arm_r1 = r_arm.addOrReplaceChild("right_arm_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0436F, 0.0436F));
		PartDefinition l_arm = main.addOrReplaceChild("l_arm", CubeListBuilder.create(), PartPose.offset(1.5F, -2.0F, 0.0F));
		PartDefinition left_arm_r1 = l_arm.addOrReplaceChild("left_arm_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0436F, -0.0436F));
		PartDefinition l_leg = main.addOrReplaceChild("l_leg", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.55F, 2.0F, 0.0F));
		PartDefinition head = main.addOrReplaceChild("head", CubeListBuilder.create().texOffs(4, 10).addBox(-1.5F, -3.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.r_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.l_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.l_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.r_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
