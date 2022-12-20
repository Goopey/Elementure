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
public class Modelnetherum_leaper<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelnetherum_leaper"),
			"main");
	public final ModelPart leg_1;
	public final ModelPart leg_2;
	public final ModelPart leg_3;
	public final ModelPart leg_4;
	public final ModelPart leg_5;
	public final ModelPart leg_6;
	public final ModelPart leg_7;
	public final ModelPart leg_8;
	public final ModelPart bb_main;

	public Modelnetherum_leaper(ModelPart root) {
		this.leg_1 = root.getChild("leg_1");
		this.leg_2 = root.getChild("leg_2");
		this.leg_3 = root.getChild("leg_3");
		this.leg_4 = root.getChild("leg_4");
		this.leg_5 = root.getChild("leg_5");
		this.leg_6 = root.getChild("leg_6");
		this.leg_7 = root.getChild("leg_7");
		this.leg_8 = root.getChild("leg_8");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leg_1 = partdefinition.addOrReplaceChild("leg_1",
				CubeListBuilder.create().texOffs(0, 47).addBox(0.0F, -1.0F, -1.0F, 2.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 11.0F, 3.0F));
		PartDefinition leg_2 = partdefinition.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(0, 47).mirror()
				.addBox(0.0F, -1.0F, -2.0F, 2.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(6.0F, 11.0F, -3.0F));
		PartDefinition leg_3 = partdefinition.addOrReplaceChild("leg_3",
				CubeListBuilder.create().texOffs(0, 47).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 11.0F, -3.0F));
		PartDefinition leg_4 = partdefinition.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(0, 47).mirror()
				.addBox(-2.0F, -1.0F, -1.0F, 2.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-6.0F, 11.0F, 3.0F));
		PartDefinition leg_5 = partdefinition.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(0, 47).mirror()
				.addBox(-2.0F, -1.0F, 0.0F, 3.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-3.0F, 11.0F, 6.0F));
		PartDefinition leg_6 = partdefinition.addOrReplaceChild("leg_6",
				CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 11.0F, 6.0F));
		PartDefinition leg_7 = partdefinition.addOrReplaceChild("leg_7",
				CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 11.0F, -6.0F));
		PartDefinition leg_8 = partdefinition.addOrReplaceChild("leg_8", CubeListBuilder.create().texOffs(0, 47).mirror()
				.addBox(-2.0F, -1.0F, -2.0F, 3.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-3.0F, 11.0F, -6.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -25.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		leg_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leg_2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg_1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg_4.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg_3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg_6.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg_5.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg_8.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg_7.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
