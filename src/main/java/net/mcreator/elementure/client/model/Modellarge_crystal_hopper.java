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
public class Modellarge_crystal_hopper<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modellarge_crystal_hopper"),
			"main");
	public final ModelPart mid_gem2;
	public final ModelPart mid_gem;
	public final ModelPart leg6_extra;
	public final ModelPart leg3_r1;
	public final ModelPart leg5_r1;
	public final ModelPart leg7_r1;
	public final ModelPart leg8_r1;
	public final ModelPart leg9_r1;
	public final ModelPart leg1_extra;
	public final ModelPart leg2_r1;
	public final ModelPart leg4_r1;
	public final ModelPart leg10_r1;
	public final ModelPart bb_main;

	public Modellarge_crystal_hopper(ModelPart root) {
		this.mid_gem2 = root.getChild("mid_gem2");
		this.mid_gem = root.getChild("mid_gem");
		this.leg6_extra = root.getChild("leg6_extra");
		this.leg3_r1 = root.getChild("leg3_r1");
		this.leg5_r1 = root.getChild("leg5_r1");
		this.leg7_r1 = root.getChild("leg7_r1");
		this.leg8_r1 = root.getChild("leg8_r1");
		this.leg9_r1 = root.getChild("leg9_r1");
		this.leg1_extra = root.getChild("leg1_extra");
		this.leg2_r1 = root.getChild("leg2_r1");
		this.leg4_r1 = root.getChild("leg4_r1");
		this.leg10_r1 = root.getChild("leg10_r1");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition mid_gem2 = partdefinition.addOrReplaceChild("mid_gem2",
				CubeListBuilder.create().texOffs(26, 14).addBox(-2.5F, -27.0F, -4.0F, 5.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition gem_8_r2 = mid_gem2.addOrReplaceChild("gem_8_r2",
				CubeListBuilder.create().texOffs(56, 0).addBox(0.5F, 3.5F, -2.4683F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2346F, -27.4286F, -5.5317F, 0.7615F, 0.6471F, 0.5321F));
		PartDefinition gem_7_r2 = mid_gem2.addOrReplaceChild("gem_7_r2",
				CubeListBuilder.create().texOffs(56, 0).addBox(0.0F, 0.5F, 0.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.3219F, 4.9328F, -0.7615F, -0.6471F, 0.5321F));
		PartDefinition gem_6_r2 = mid_gem2.addOrReplaceChild("gem_6_r2",
				CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -8.0F, -2.01F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.0F, 0.0F, 0.2618F, 0.0F, 0.5236F));
		PartDefinition gem_5_r2 = mid_gem2.addOrReplaceChild("gem_5_r2",
				CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -8.0F, -2.01F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.0F, 0.0F, 0.2618F, 0.0F, -0.5236F));
		PartDefinition gem_4_r2 = mid_gem2.addOrReplaceChild("gem_4_r2",
				CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -8.0F, -0.01F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.0F, 0.0F, -0.2618F, 0.0F, -0.5236F));
		PartDefinition gem_3_r2 = mid_gem2.addOrReplaceChild("gem_3_r2",
				CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -8.0F, -0.01F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.0F, 0.0F, -0.2618F, 0.0F, 0.5236F));
		PartDefinition gem_2_r2 = mid_gem2.addOrReplaceChild("gem_2_r2",
				CubeListBuilder.create().texOffs(56, 0).addBox(0.0F, -8.0F, -1.01F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition gem_1_r2 = mid_gem2.addOrReplaceChild("gem_1_r2",
				CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -8.0F, -1.01F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition mid_gem = partdefinition.addOrReplaceChild("mid_gem",
				CubeListBuilder.create().texOffs(24, 14).addBox(-3.5F, -43.0F, -4.5F, 7.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(24, 14)
						.addBox(-4.5F, -47.0F, -2.5F, 9.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(27, 14)
						.addBox(-2.5F, -50.0F, -3.5F, 5.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.0F, 0.0F));
		PartDefinition gem_8_r1 = mid_gem.addOrReplaceChild("gem_8_r1",
				CubeListBuilder.create().texOffs(56, 0).addBox(0.5F, -1.5F, -2.4683F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2346F, -41.4286F, -5.5317F, 0.7615F, 0.6471F, 0.5321F));
		PartDefinition gem_6_r1 = mid_gem.addOrReplaceChild("gem_6_r1",
				CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -21.0F, -2.01F, 2.0F, 21.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -30.0F, 0.0F, 0.2618F, 0.0F, 0.5236F));
		PartDefinition gem_5_r1 = mid_gem.addOrReplaceChild("gem_5_r1",
				CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -17.0F, -2.01F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -30.0F, 0.0F, 0.2618F, 0.0F, -0.5236F));
		PartDefinition gem_4_r1 = mid_gem.addOrReplaceChild("gem_4_r1",
				CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -18.0F, -0.01F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -30.0F, 0.0F, -0.2618F, 0.0F, -0.5236F));
		PartDefinition gem_3_r1 = mid_gem.addOrReplaceChild("gem_3_r1",
				CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -15.0F, -0.01F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -30.0F, 0.0F, -0.2618F, 0.0F, 0.5236F));
		PartDefinition gem_2_r1 = mid_gem.addOrReplaceChild("gem_2_r1",
				CubeListBuilder.create().texOffs(56, 0).addBox(0.0F, -17.0F, -1.01F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -30.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition gem_1_r1 = mid_gem.addOrReplaceChild("gem_1_r1",
				CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -16.0F, -1.01F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -30.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition leg6_extra = partdefinition.addOrReplaceChild("leg6_extra",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -10.25F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, -10.75F, 11.0F));
		PartDefinition leg7_r2 = leg6_extra.addOrReplaceChild("leg7_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -30.5F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 18.25F, -2.0F));
		PartDefinition leg3_r1 = partdefinition.addOrReplaceChild("leg3_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -14.25F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, -10.75F, -11.0F));
		PartDefinition leg5_r1 = partdefinition.addOrReplaceChild("leg5_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 47.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -18.5F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition leg7_r1 = partdefinition.addOrReplaceChild("leg7_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 44.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -16.5F, 5.0F, 0.0873F, 0.0F, -0.2618F));
		PartDefinition leg8_r1 = partdefinition.addOrReplaceChild("leg8_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 44.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -16.5F, 4.0F, 0.0873F, 0.0F, 0.2618F));
		PartDefinition leg9_r1 = partdefinition.addOrReplaceChild("leg9_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 44.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -16.5F, -4.0F, -0.0873F, 0.0F, 0.2618F));
		PartDefinition leg1_extra = partdefinition.addOrReplaceChild("leg1_extra",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -13.25F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.0F, -10.75F, 11.0F));
		PartDefinition leg11_r1 = leg1_extra.addOrReplaceChild("leg11_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -31.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.25F, 0.0F));
		PartDefinition leg2_r1 = partdefinition.addOrReplaceChild("leg2_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 47.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, -18.5F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition leg4_r1 = partdefinition.addOrReplaceChild("leg4_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -17.25F, -1.0F, 2.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.0F, -10.75F, -11.0F));
		PartDefinition leg10_r1 = partdefinition.addOrReplaceChild("leg10_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 45.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -16.5F, -5.0F, -0.0873F, 0.0F, -0.2618F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(20, 49).addBox(-6.0F, -38.01F, -5.0F, 12.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(20, 49)
						.addBox(-6.0F, -33.01F, -5.0F, 12.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(16, 45)
						.addBox(-5.0F, -38.0F, -7.0F, 10.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(16, 45)
						.addBox(-5.0F, -33.0F, -7.0F, 10.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(30, 33)
						.addBox(-3.5F, -31.0F, -7.0F, 7.0F, 5.0F, 4.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body_r1 = bb_main.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(16, 45).addBox(-5.0F, -2.5F, -7.0F, 10.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.5F, 0.0F, 3.1416F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leg2_r1.xRot = Mth.cos(limbSwing * 1.0F) * 0.25F * limbSwingAmount;
		this.leg4_r1.xRot = Mth.cos(limbSwing * 1.0F) * 0.25F * limbSwingAmount;
		this.leg9_r1.xRot = Mth.cos(limbSwing * 1.0F) * 0.25F * limbSwingAmount;
		this.leg7_r1.xRot = Mth.cos(limbSwing * 1.0F) * -0.25F * limbSwingAmount;
		this.leg3_r1.xRot = Mth.cos(limbSwing * 1.0F) * -0.25F * limbSwingAmount;
		this.leg5_r1.xRot = Mth.cos(limbSwing * 1.0F) * -0.25F * limbSwingAmount;
		this.leg10_r1.xRot = Mth.cos(limbSwing * 1.0F) * 0.25F * limbSwingAmount;
		this.leg6_extra.xRot = Mth.cos(limbSwing * 1.0F) * -0.25F * limbSwingAmount;
		this.leg8_r1.xRot = Mth.cos(limbSwing * 1.0F) * -0.25F * limbSwingAmount;
		this.leg1_extra.xRot = Mth.cos(limbSwing * 1.0F) * 0.25F * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		mid_gem2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mid_gem.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg6_extra.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3_r1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg5_r1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg7_r1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg8_r1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg9_r1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1_extra.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2_r1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4_r1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg10_r1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
