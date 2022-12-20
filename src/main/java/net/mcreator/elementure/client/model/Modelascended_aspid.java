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
public class Modelascended_aspid<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelascended_aspid"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart mask;

	public Modelascended_aspid(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.mask = head.getChild("mask");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.0F, -2.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-3.0F, -2.01F, -2.5F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 11).addBox(-2.49F, -2.5F, -2.01F, 5.0F,
								1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(15, 0).addBox(-1.0F, -15.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition mask = head.addOrReplaceChild("mask", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -15.0F, -4.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition mouth_r1 = mask.addOrReplaceChild("mouth_r1",
				CubeListBuilder.create().texOffs(20, 12).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition mask_side_1_r1 = mask.addOrReplaceChild("mask_side_1_r1",
				CubeListBuilder.create().texOffs(23, 0).addBox(-10.0F, -2.5F, -0.5F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2793F, 1.0472F, -0.3491F));
		PartDefinition mask_side_2_r1 = mask.addOrReplaceChild(
				"mask_side_2_r1", CubeListBuilder.create().texOffs(23, 0).mirror()
						.addBox(5.0F, -2.5F, -0.5F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2793F, -1.0472F, 0.3491F));
		PartDefinition mask_2_r1 = mask.addOrReplaceChild("mask_2_r1",
				CubeListBuilder.create().texOffs(36, 0).addBox(0.0F, -2.5F, 0.0F, 5.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition mask_1_r1 = mask
				.addOrReplaceChild(
						"mask_1_r1", CubeListBuilder.create().texOffs(36, 0).mirror()
								.addBox(-5.0F, -2.5F, 0.0F, 5.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.mask.xRot = headPitch / (180F / (float) Math.PI) + 0.31F;
		this.head.setPos(0.0F, (float) (22.0F + Math.sin(ageInTicks / 10) / 4.F), 0.0F);
		this.body.setPos(0.0F, (float) (15.0F + Math.sin(ageInTicks / 10) / 2.2F), 0.0F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
