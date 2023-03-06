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
public class Modeloctolank<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modeloctolank"), "main");
	public final ModelPart tentacle_4;
	public final ModelPart tentacle_3;
	public final ModelPart tentacle_2;
	public final ModelPart tentacle_1;
	public final ModelPart headtentacle_4;
	public final ModelPart headtentacle_3;
	public final ModelPart headtentacle_2;
	public final ModelPart headtentacle_1;
	public final ModelPart head_tentacle_back;
	public final ModelPart eye;
	public final ModelPart bb_main;

	public Modeloctolank(ModelPart root) {
		this.tentacle_4 = root.getChild("tentacle_4");
		this.tentacle_3 = root.getChild("tentacle_3");
		this.tentacle_2 = root.getChild("tentacle_2");
		this.tentacle_1 = root.getChild("tentacle_1");
		this.headtentacle_4 = root.getChild("headtentacle_4");
		this.headtentacle_3 = root.getChild("headtentacle_3");
		this.headtentacle_2 = root.getChild("headtentacle_2");
		this.headtentacle_1 = root.getChild("headtentacle_1");
		this.head_tentacle_back = root.getChild("head_tentacle_back");
		this.eye = root.getChild("eye");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition tentacle_4 = partdefinition.addOrReplaceChild("tentacle_4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 30.5F, 78.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition t_4 = tentacle_4.addOrReplaceChild("t_4", CubeListBuilder.create().texOffs(110, 36).addBox(-1.5F, -2.5F, -60.0F, 4.0F, 4.0F, 69.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition tentacle_3 = partdefinition.addOrReplaceChild("tentacle_3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 18.5F, 78.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition t_3 = tentacle_3.addOrReplaceChild("t_3", CubeListBuilder.create().texOffs(110, 36).mirror().addBox(-1.5F, -2.5F, -60.0F, 4.0F, 4.0F, 69.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition tentacle_2 = partdefinition.addOrReplaceChild("tentacle_2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 18.5F, 78.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition t_2 = tentacle_2.addOrReplaceChild("t_2", CubeListBuilder.create().texOffs(110, 36).addBox(-1.5F, -2.5F, -60.0F, 4.0F, 4.0F, 69.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition tentacle_1 = partdefinition.addOrReplaceChild("tentacle_1", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 29.5F, 78.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition t_1 = tentacle_1.addOrReplaceChild("t_1", CubeListBuilder.create().texOffs(110, 36).mirror().addBox(-1.5F, -1.5F, -60.0F, 4.0F, 4.0F, 69.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition headtentacle_4 = partdefinition.addOrReplaceChild("headtentacle_4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 32.5F, -30.5F, 0.0F, 0.0F, 3.1416F));
		PartDefinition ht_4 = headtentacle_4.addOrReplaceChild("ht_4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition headtentacle_4_1 = ht_4.addOrReplaceChild("headtentacle_4_1", CubeListBuilder.create().texOffs(136, 7).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -1.5F, 2.5F, -0.1745F, 0.1745F, 0.0F));
		PartDefinition head_tentacle_4_2 = headtentacle_4_1.addOrReplaceChild("head_tentacle_4_2", CubeListBuilder.create().texOffs(136, 7).addBox(-0.25F, -1.25F, 0.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 5.0F, 0.0873F, -0.0873F, 0.0F));
		PartDefinition head_tentacle_4_3 = head_tentacle_4_2.addOrReplaceChild("head_tentacle_4_3", CubeListBuilder.create().texOffs(136, 7).addBox(-1.0F, -1.0F, 0.75F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 7.0F, 0.1745F, -0.1745F, 0.0F));
		PartDefinition headtentacle_3 = partdefinition.addOrReplaceChild("headtentacle_3", CubeListBuilder.create(), PartPose.offsetAndRotation(7.5F, 32.5F, -30.5F, 0.0F, 0.0F, 3.1416F));
		PartDefinition ht_3 = headtentacle_3.addOrReplaceChild("ht_3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition headtentacle_3_1 = ht_3.addOrReplaceChild("headtentacle_3_1", CubeListBuilder.create().texOffs(129, 4).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -1.5F, 2.5F, -0.1745F, -0.1745F, 0.0F));
		PartDefinition head_tentacle_3_2 = headtentacle_3_1.addOrReplaceChild("head_tentacle_3_2", CubeListBuilder.create().texOffs(129, 4).addBox(0.25F, -1.25F, 0.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 5.0F, 0.0873F, 0.0873F, 0.0F));
		PartDefinition head_tentacle_3_3 = head_tentacle_3_2.addOrReplaceChild("head_tentacle_3_3", CubeListBuilder.create().texOffs(129, 4).addBox(0.25F, -1.0F, 1.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 7.0F, 0.1745F, 0.1745F, 0.0F));
		PartDefinition headtentacle_2 = partdefinition.addOrReplaceChild("headtentacle_2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.5F, 17.5F, -30.5F, 0.0F, 0.0F, 3.1416F));
		PartDefinition ht_2 = headtentacle_2.addOrReplaceChild("ht_2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition headtentacle_2_1 = ht_2.addOrReplaceChild("headtentacle_2_1", CubeListBuilder.create().texOffs(129, 4).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.5F, 2.5F, 0.1745F, -0.1745F, 0.0F));
		PartDefinition head_tentacle_2_2 = headtentacle_2_1.addOrReplaceChild("head_tentacle_2_2", CubeListBuilder.create().texOffs(129, 4).addBox(0.25F, -1.75F, 0.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 5.0F, -0.0873F, 0.0873F, 0.0F));
		PartDefinition head_tentacle_2_3 = head_tentacle_2_2.addOrReplaceChild("head_tentacle_2_3", CubeListBuilder.create().texOffs(129, 4).addBox(0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 7.0F, -0.1745F, 0.1745F, 0.0F));
		PartDefinition headtentacle_1 = partdefinition.addOrReplaceChild("headtentacle_1", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 17.5F, -30.5F, 0.0F, 0.0F, 3.1416F));
		PartDefinition ht_1 = headtentacle_1.addOrReplaceChild("ht_1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition headtentacle_1_1 = ht_1.addOrReplaceChild("headtentacle_1_1", CubeListBuilder.create().texOffs(136, 7).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.5F, 2.5F, 0.1745F, 0.1745F, 0.0F));
		PartDefinition head_tentacle_1_2 = headtentacle_1_1.addOrReplaceChild("head_tentacle_1_2", CubeListBuilder.create().texOffs(136, 7).addBox(-1.25F, -1.75F, 0.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0873F, -0.0873F, 0.0F));
		PartDefinition head_tentacle_1_3 = head_tentacle_1_2.addOrReplaceChild("head_tentacle_1_3", CubeListBuilder.create().texOffs(136, 7).addBox(-1.0F, -1.0F, 0.75F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.1745F, -0.1745F, 0.0F));
		PartDefinition head_tentacle_back = partdefinition.addOrReplaceChild("head_tentacle_back",
				CubeListBuilder.create().texOffs(136, 0).addBox(5.5F, -17.5F, 24.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(136, 0).addBox(5.5F, -4.5F, 24.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(136, 0)
						.addBox(-7.5F, -4.5F, 24.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(136, 0).addBox(-7.5F, -17.5F, 24.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 34.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition eye = partdefinition.addOrReplaceChild("eye", CubeListBuilder.create().texOffs(220, 110).addBox(-4.5F, -1.5F, -4.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.5F, 0.0F, 3.1416F, 0.0F, 3.1416F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition back_teeth_r1 = bb_main.addOrReplaceChild("back_teeth_r1",
				CubeListBuilder.create().texOffs(84, 113).addBox(-5.5F, -15.5F, -83.5F, 11.0F, 11.0F, 4.0F, new CubeDeformation(-0.5F)).texOffs(0, 111).addBox(-6.5F, -16.5F, 31.5F, 13.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(218, 0)
						.addBox(-6.5F, -16.5F, 25.5F, 13.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 7).addBox(-7.0F, -17.0F, 22.5F, 14.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, -2.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition head_bottom_3_r1 = bb_main.addOrReplaceChild("head_bottom_3_r1",
				CubeListBuilder.create().texOffs(36, 62).addBox(-7.0F, -17.0F, -78.0F, 14.0F, 14.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-8.0F, -18.0F, -59.0F, 16.0F, 16.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -19.0F, -40.0F, 18.0F, 18.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(160, 114).addBox(-4.0F, -14.0F, 42.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(19, 3)
						.addBox(-8.0F, -18.0F, 19.5F, 16.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-9.0F, -19.0F, 14.0F, 18.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-10.0F, -20.0F, -24.0F, 20.0F, 20.0F, 38.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		return LayerDefinition.create(meshdefinition, 256, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.tentacle_3.xRot = Mth.cos(limbSwing * 1.0F) * 0.2F * limbSwingAmount;
		this.tentacle_4.xRot = Mth.cos(limbSwing * 1.0F) * 0.2F * limbSwingAmount;
		this.tentacle_1.xRot = Mth.cos(limbSwing * 1.0F) * 0.2F * limbSwingAmount;
		this.tentacle_2.xRot = Mth.cos(limbSwing * 1.0F) * 0.2F * limbSwingAmount;
		this.eye.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.eye.xRot = headPitch / (180F / (float) Math.PI);
		this.headtentacle_4.xRot = Mth.cos(limbSwing * 0.222F) * limbSwingAmount;
		this.headtentacle_3.xRot = Mth.cos(limbSwing * 0.222F + (float) Math.PI) * limbSwingAmount;
		this.headtentacle_2.xRot = Mth.cos(limbSwing * 0.222F) * limbSwingAmount;
		this.headtentacle_1.xRot = Mth.cos(limbSwing * 0.222F + (float) Math.PI) * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		tentacle_4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tentacle_3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tentacle_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tentacle_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		headtentacle_4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		headtentacle_3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		headtentacle_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		headtentacle_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head_tentacle_back.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
