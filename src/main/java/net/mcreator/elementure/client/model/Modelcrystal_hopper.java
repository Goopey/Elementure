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
public class Modelcrystal_hopper<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelcrystal_hopper"), "main");
	public final ModelPart mid_gem;
	public final ModelPart leg9;
	public final ModelPart leg8;
	public final ModelPart leg7;
	public final ModelPart leg6_extra;
	public final ModelPart leg5;
	public final ModelPart leg3;
	public final ModelPart leg_10;
	public final ModelPart leg_4;
	public final ModelPart leg2;
	public final ModelPart leg1_extra;
	public final ModelPart bb_main;

	public Modelcrystal_hopper(ModelPart root) {
		this.mid_gem = root.getChild("mid_gem");
		this.leg9 = root.getChild("leg9");
		this.leg8 = root.getChild("leg8");
		this.leg7 = root.getChild("leg7");
		this.leg6_extra = root.getChild("leg6_extra");
		this.leg5 = root.getChild("leg5");
		this.leg3 = root.getChild("leg3");
		this.leg_10 = root.getChild("leg_10");
		this.leg_4 = root.getChild("leg_4");
		this.leg2 = root.getChild("leg2");
		this.leg1_extra = root.getChild("leg1_extra");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition mid_gem = partdefinition.addOrReplaceChild("mid_gem",
				CubeListBuilder.create().texOffs(12, 14).addBox(-3.5F, -13.0F, -4.5F, 7.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(12, 14)
						.addBox(-4.5F, -17.0F, -2.5F, 9.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 14)
						.addBox(-2.5F, -20.0F, -3.5F, 5.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.0F, 0.0F));
		PartDefinition gem_8_r1 = mid_gem.addOrReplaceChild("gem_8_r1",
				CubeListBuilder.create().texOffs(56, 0).addBox(0.5F, -1.5F, -2.4683F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2346F, -11.4286F, -5.5317F, 0.7615F, 0.6471F, 0.5321F));
		PartDefinition gem_7_r1 = mid_gem.addOrReplaceChild("gem_7_r1",
				CubeListBuilder.create().texOffs(56, 0).addBox(0.0F, -1.5F, 0.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.3219F, 4.9328F, -0.7615F, -0.6471F, 0.5321F));
		PartDefinition gem_6_r1 = mid_gem.addOrReplaceChild("gem_6_r1",
				CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -21.0F, -2.01F, 2.0F, 21.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.5236F));
		PartDefinition gem_5_r1 = mid_gem.addOrReplaceChild("gem_5_r1",
				CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -17.0F, -2.01F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, -0.5236F));
		PartDefinition gem_4_r1 = mid_gem.addOrReplaceChild("gem_4_r1",
				CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -18.0F, -0.01F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, -0.5236F));
		PartDefinition gem_3_r1 = mid_gem.addOrReplaceChild("gem_3_r1",
				CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -15.0F, -0.01F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.5236F));
		PartDefinition gem_2_r1 = mid_gem.addOrReplaceChild("gem_2_r1",
				CubeListBuilder.create().texOffs(56, 0).addBox(0.0F, -17.0F, -1.01F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition gem_1_r1 = mid_gem.addOrReplaceChild("gem_1_r1",
				CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -16.0F, -1.01F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition leg9 = partdefinition.addOrReplaceChild("leg9", CubeListBuilder.create(), PartPose.offset(-8.0F, 13.5F, -4.0F));
		PartDefinition leg9_r1 = leg9.addOrReplaceChild("leg9_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition leg8 = partdefinition.addOrReplaceChild("leg8", CubeListBuilder.create(), PartPose.offset(-8.0F, 13.5F, 4.0F));
		PartDefinition leg8_r1 = leg8.addOrReplaceChild("leg8_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition leg7 = partdefinition.addOrReplaceChild("leg7", CubeListBuilder.create(), PartPose.offset(8.0F, 13.5F, 4.0F));
		PartDefinition leg7_r1 = leg7.addOrReplaceChild("leg7_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition leg6_extra = partdefinition.addOrReplaceChild("leg6_extra",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.25F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 9.25F, 9.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition leg7_r2 = leg6_extra.addOrReplaceChild("leg7_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.75F, 0.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition leg5 = partdefinition.addOrReplaceChild("leg5", CubeListBuilder.create(), PartPose.offset(8.0F, 11.5F, 0.0F));
		PartDefinition leg5_r1 = leg5.addOrReplaceChild("leg5_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offset(7.0F, 9.25F, -9.0F));
		PartDefinition leg3_r1 = leg3.addOrReplaceChild("leg3_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.25F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition leg_10 = partdefinition.addOrReplaceChild("leg_10", CubeListBuilder.create(), PartPose.offset(8.0F, 13.5F, -4.0F));
		PartDefinition leg10_r1 = leg_10.addOrReplaceChild("leg10_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition leg_4 = partdefinition.addOrReplaceChild("leg_4", CubeListBuilder.create(), PartPose.offset(-7.0F, 9.25F, -9.0F));
		PartDefinition leg4_r1 = leg_4.addOrReplaceChild("leg4_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -7.25F, -1.0F, 2.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(-8.0F, 11.5F, 0.0F));
		PartDefinition leg2_r1 = leg2.addOrReplaceChild("leg2_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition leg1_extra = partdefinition.addOrReplaceChild("leg1_extra",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.25F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 9.25F, 9.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition leg11_r1 = leg1_extra.addOrReplaceChild("leg11_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.75F, 0.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(16, 45).addBox(-5.0F, -8.0F, -7.0F, 10.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(20, 49)
						.addBox(-6.0F, -8.01F, -5.0F, 12.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-3.5F, -7.0F, -8.0F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * -0.67F * limbSwingAmount;
		this.leg_4.xRot = Mth.cos(limbSwing * 1.0F) * 0.67F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * -0.67F * limbSwingAmount;
		this.leg5.xRot = Mth.cos(limbSwing * 1.0F) * -0.67F * limbSwingAmount;
		this.leg_10.xRot = Mth.cos(limbSwing * 1.0F) * 0.67F * limbSwingAmount;
		this.leg6_extra.xRot = Mth.cos(limbSwing * 1.0F) * 0.67F * limbSwingAmount;
		this.leg9.xRot = Mth.cos(limbSwing * 1.0F) * 0.67F * limbSwingAmount;
		this.leg8.xRot = Mth.cos(limbSwing * 1.0F) * -0.67F * limbSwingAmount;
		this.leg7.xRot = Mth.cos(limbSwing * 1.0F) * -0.67F * limbSwingAmount;
		this.leg1_extra.xRot = Mth.cos(limbSwing * 1.0F) * 0.67F * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		mid_gem.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg6_extra.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1_extra.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
