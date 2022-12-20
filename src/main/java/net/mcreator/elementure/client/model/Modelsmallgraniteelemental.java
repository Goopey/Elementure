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
public class Modelsmallgraniteelemental<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelsmallgraniteelemental"),
			"main");
	public final ModelPart Core3;
	public final ModelPart Core2;
	public final ModelPart Core1;
	public final ModelPart arms;
	public final ModelPart bb_main;

	public Modelsmallgraniteelemental(ModelPart root) {
		this.Core3 = root.getChild("Core3");
		this.Core2 = root.getChild("Core2");
		this.Core1 = root.getChild("Core1");
		this.arms = root.getChild("arms");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Core3 = partdefinition.addOrReplaceChild("Core3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition Core2 = partdefinition.addOrReplaceChild("Core2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.51F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Core1 = partdefinition.addOrReplaceChild("Core1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.49F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition arms = partdefinition.addOrReplaceChild("arms", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition TopArmLeft = arms.addOrReplaceChild("TopArmLeft",
				CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, -16.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition TopArmRight = arms.addOrReplaceChild("TopArmRight",
				CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, -16.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition BottomArmLeft = arms.addOrReplaceChild("BottomArmLeft",
				CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition BottomArmRight = arms.addOrReplaceChild("BottomArmRight",
				CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -26.5F, -2.49F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Core3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Core2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Core1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.arms.yRot = ageInTicks / 20.f;
	}
}
