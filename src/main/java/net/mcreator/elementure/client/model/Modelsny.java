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
public class Modelsny<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelsny"), "main");
	public final ModelPart arm_l;
	public final ModelPart arm_r;
	public final ModelPart bb_main;

	public Modelsny(ModelPart root) {
		this.arm_l = root.getChild("arm_l");
		this.arm_r = root.getChild("arm_r");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition arm_l = partdefinition.addOrReplaceChild("arm_l", CubeListBuilder.create().texOffs(16, 55).addBox(2.0F, 12.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 6.0F, 0.0F));
		PartDefinition arm_l3_r1 = arm_l.addOrReplaceChild("arm_l3_r1", CubeListBuilder.create().texOffs(32, 55).addBox(1.0F, 8.0F, -1.99F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition arm_l2_r1 = arm_l.addOrReplaceChild("arm_l2_r1", CubeListBuilder.create().texOffs(32, 55).addBox(0.0F, 3.5F, -2.01F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition arm_l1_r1 = arm_l.addOrReplaceChild("arm_l1_r1", CubeListBuilder.create().texOffs(48, 55).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition arm_r = partdefinition.addOrReplaceChild("arm_r", CubeListBuilder.create().texOffs(16, 55).addBox(-6.0F, 12.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 6.0F, 0.0F));
		PartDefinition arm_r3_r1 = arm_r.addOrReplaceChild("arm_r3_r1", CubeListBuilder.create().texOffs(32, 55).addBox(-5.0F, 8.0F, -1.99F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition arm_r2_r1 = arm_r.addOrReplaceChild("arm_r2_r1", CubeListBuilder.create().texOffs(32, 55).addBox(-4.0F, 3.5F, -2.01F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition arm_r1_r1 = arm_r.addOrReplaceChild("arm_r1_r1", CubeListBuilder.create().texOffs(48, 55).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 11).addBox(-7.5F, -0.5F, -7.5F, 15.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-7.5F, -14.0F, -7.5F, 15.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-6.5F, -26.5F, -6.5F, 13.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-8.0F, -13.0F, -8.0F, 16.0F, 13.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -26.0F, -7.0F, 14.0F, 13.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-4.5F, -22.0F, -7.5F, 9.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		arm_l.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm_r.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.arm_r.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.arm_l.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
