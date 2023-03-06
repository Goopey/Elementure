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

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelarmored_turtle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelarmored_turtle"), "main");
	public final ModelPart back;
	public final ModelPart head;
	public final ModelPart fin_front_right;
	public final ModelPart fin_front_left;
	public final ModelPart fin_back_left;
	public final ModelPart fin_back_right;

	public Modelarmored_turtle(ModelPart root) {
		this.back = root.getChild("back");
		this.head = root.getChild("head");
		this.fin_front_right = root.getChild("fin_front_right");
		this.fin_front_left = root.getChild("fin_front_left");
		this.fin_back_left = root.getChild("fin_back_left");
		this.fin_back_right = root.getChild("fin_back_right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition back = partdefinition.addOrReplaceChild("back",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -10.0F, -8.5F, 12.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(68, 22).addBox(-7.0F, -11.0F, -8.0F, 14.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(22, 38)
						.addBox(-7.0F, -7.0F, -8.0F, 14.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 21).addBox(-6.0F, -7.0F, -7.0F, 12.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -11.01F, -10.0F, 8.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-7.5F, -10.0F, -7.0F, 15.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition shell_f_r1 = back.addOrReplaceChild("shell_f_r1", CubeListBuilder.create().texOffs(100, 0).addBox(-6.0F, -4.0F, 0.0F, 12.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, -8.5F, -0.3491F, 0.0F, 0.0F));
		PartDefinition shell_b_r1 = back.addOrReplaceChild("shell_b_r1", CubeListBuilder.create().texOffs(100, 0).addBox(-6.0F, -4.0F, -2.0F, 12.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, 8.5F, 0.3491F, 0.0F, 0.0F));
		PartDefinition shell_l_r1 = back.addOrReplaceChild("shell_l_r1", CubeListBuilder.create().texOffs(65, 0).addBox(-2.0F, -4.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5F, -10.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition shell_r_r1 = back.addOrReplaceChild("shell_r_r1", CubeListBuilder.create().texOffs(65, 0).addBox(0.0F, -4.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, -10.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition shell_tr_r1 = back.addOrReplaceChild("shell_tr_r1", CubeListBuilder.create().texOffs(88, 6).addBox(0.0F, 0.0F, -7.0F, 6.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -13.75F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition shell_tl_r1 = back.addOrReplaceChild("shell_tl_r1", CubeListBuilder.create().texOffs(88, 6).addBox(-6.0F, 0.0F, -7.0F, 6.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -13.75F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 54).addBox(-3.0F, -1.5F, -4.0F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 13.0F, -8.0F));
		PartDefinition fin_front_right = partdefinition.addOrReplaceChild("fin_front_right", CubeListBuilder.create(), PartPose.offset(6.0F, 17.0F, -4.0F));
		PartDefinition frin_rot_1 = fin_front_right.addOrReplaceChild("frin_rot_1", CubeListBuilder.create().texOffs(114, 49).mirror().addBox(-1.0F, -2.0F, -1.0F, 7.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5133F, -0.1084F, 0.1897F));
		PartDefinition fin_front_left = partdefinition.addOrReplaceChild("fin_front_left", CubeListBuilder.create(), PartPose.offset(-6.0F, 17.0F, -4.0F));
		PartDefinition frin_rot_2 = fin_front_left.addOrReplaceChild("frin_rot_2", CubeListBuilder.create().texOffs(114, 49).addBox(-6.0F, -2.0F, -1.0F, 7.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5133F, 0.1084F, -0.1897F));
		PartDefinition fin_back_left = partdefinition.addOrReplaceChild("fin_back_left", CubeListBuilder.create(), PartPose.offset(-6.0F, 17.0F, 5.0F));
		PartDefinition frin_rot_3 = fin_back_left.addOrReplaceChild("frin_rot_3", CubeListBuilder.create().texOffs(104, 54).mirror().addBox(-4.0F, -1.0F, -1.0F, 5.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5133F, 0.1084F, -0.1897F));
		PartDefinition fin_back_right = partdefinition.addOrReplaceChild("fin_back_right", CubeListBuilder.create(), PartPose.offset(6.0F, 17.0F, 5.0F));
		PartDefinition frin_rot_4 = fin_back_right.addOrReplaceChild("frin_rot_4", CubeListBuilder.create().texOffs(104, 54).addBox(-1.0F, -1.0F, -1.0F, 5.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5133F, -0.1084F, 0.1897F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		back.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		fin_front_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		fin_front_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		fin_back_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		fin_back_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.fin_back_left.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.fin_back_right.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.fin_front_right.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.fin_front_left.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
