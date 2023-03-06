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
public class Modelstatue_protector<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelstatue_protector"), "main");
	public final ModelPart leg_right;
	public final ModelPart leg_left;
	public final ModelPart arm_left;
	public final ModelPart arm_right;
	public final ModelPart head;
	public final ModelPart bb_main;

	public Modelstatue_protector(ModelPart root) {
		this.leg_right = root.getChild("leg_right");
		this.leg_left = root.getChild("leg_left");
		this.arm_left = root.getChild("arm_left");
		this.arm_right = root.getChild("arm_right");
		this.head = root.getChild("head");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leg_right = partdefinition.addOrReplaceChild("leg_right", CubeListBuilder.create().texOffs(28, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition leg_left = partdefinition.addOrReplaceChild("leg_left", CubeListBuilder.create().texOffs(28, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition arm_left = partdefinition.addOrReplaceChild("arm_left", CubeListBuilder.create().texOffs(48, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, 0.0F));
		PartDefinition arm_right = partdefinition.addOrReplaceChild("arm_right", CubeListBuilder.create().texOffs(48, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(40, 0).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		leg_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leg_right.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.arm_right.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leg_left.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.arm_left.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
