package net.mcreator.elementure.client.model;

import net.minecraft.world.entity.Entity;
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
public class Modelweakdioriteelemental<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelweakdioriteelemental"), "main");
	public final ModelPart Arms;
	public final ModelPart bb_main;

	public Modelweakdioriteelemental(ModelPart root) {
		this.Arms = root.getChild("Arms");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Arms = partdefinition.addOrReplaceChild("Arms", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, 0.0F));
		PartDefinition TopLeftRimBack = Arms.addOrReplaceChild("TopLeftRimBack", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -10.0F, 0.5F, 0.182F, 0.5463F, -0.3187F));
		PartDefinition BottomRightRimBack = Arms.addOrReplaceChild("BottomRightRimBack", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -11.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 10.0F, 0.5F, -0.182F, -0.5463F, -0.3187F));
		PartDefinition TopLeftRimFront = Arms.addOrReplaceChild("TopLeftRimFront", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -10.0F, -0.5F, -0.182F, -0.5463F, -0.3187F));
		PartDefinition BottomLeftRimFront = Arms.addOrReplaceChild("BottomLeftRimFront", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -11.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 10.0F, -0.5F, 0.182F, -0.5463F, 0.3187F));
		PartDefinition LeftSideRimBack = Arms.addOrReplaceChild("LeftSideRimBack", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -9.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.0F, -0.7741F, 0.0F));
		PartDefinition RightSideRimFront = Arms.addOrReplaceChild("RightSideRimFront", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -9.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, 2.3448F, 0.0F));
		PartDefinition TopRightRimBack = Arms.addOrReplaceChild("TopRightRimBack", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -10.0F, 0.5F, 0.182F, -0.5463F, 0.3187F));
		PartDefinition TopRightRimFront = Arms.addOrReplaceChild("TopRightRimFront", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -10.0F, -0.5F, -0.182F, 0.5463F, 0.3187F));
		PartDefinition LeftSideRimFront = Arms.addOrReplaceChild("LeftSideRimFront", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -9.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, -2.3448F, 0.0F));
		PartDefinition BottomLeftRimBack = Arms.addOrReplaceChild("BottomLeftRimBack", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -11.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 10.0F, 0.5F, -0.182F, 0.5463F, 0.3187F));
		PartDefinition BottomRightRimFront = Arms.addOrReplaceChild("BottomRightRimFront", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -11.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 10.0F, -0.5F, 0.182F, 0.5463F, -0.3187F));
		PartDefinition RightSideRimBack = Arms.addOrReplaceChild("RightSideRimBack", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -9.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.0F, 0.7741F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(16, 0).addBox(-2.0F, -12.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Arms.yRot = ageInTicks / 20.f;
	}
}
