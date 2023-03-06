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

// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelrocketWormBody<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelrocket_worm_body"), "main");
	public final ModelPart body;
	public final ModelPart tail;
	public final ModelPart head;

	public ModelrocketWormBody(ModelPart root) {
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -14.0F, -6.0F, 14.0F, 14.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(88, 112)
				.addBox(-10.0F, -9.0F, -4.0F, 3.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(88, 112).addBox(7.0F, -9.0F, -4.0F, 3.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(88, 112).addBox(15.0F, -1.5F, -5.5F, 3.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(88, 112).addBox(0.0F, -1.5F, -5.5F, 3.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -16.0F, 1.5F, 0.0F, 0.0F, 1.5708F));
		PartDefinition tail = partdefinition
				.addOrReplaceChild(
						"tail", CubeListBuilder.create().texOffs(86, 128).addBox(7.0F, -9.0F, -4.0F, 3.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(88, 128).addBox(7.0F, -8.5F, 7.0F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F))
								.texOffs(94, 136).addBox(-9.0F, -8.5F, 7.0F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(86, 128).addBox(-10.0F, -9.0F, -4.0F, 3.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r2 = tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(76, 170).addBox(-1.5F, -1.0F, -12.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 2.9671F, 0.0F, -3.1416F));
		PartDefinition cube_r3 = tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 170).addBox(-1.5F, -2.0F, -12.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.0F, 9.0F, -2.9671F, 0.0F, 3.1416F));
		PartDefinition cube_r4 = tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(76, 170).addBox(-5.0F, -3.5F, -3.0F, 10.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 3.0543F, 0.0F, 3.1416F));
		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 170).addBox(-5.0F, -2.5F, -3.0F, 10.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.0F, 9.0F, -3.0543F, 0.0F, 3.1416F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(86, 0).addBox(7.0F, -9.0F, -7.0F, 3.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(86, 0).addBox(7.0F, -8.5F, 4.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(86, 0)
						.addBox(-9.0F, -8.5F, 4.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(86, 0).addBox(-10.0F, -9.0F, -7.0F, 3.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(86, 0).addBox(-1.25F, -1.5F, -8.5F, 2.0F, 3.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -7.0F, -6.5F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(86, 0).addBox(-0.75F, -1.5F, -8.5F, 2.0F, 3.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -7.0F, -6.5F, 0.0F, 0.4363F, 0.0F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(76, 42).addBox(-1.5F, -1.0F, -12.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 42).addBox(-1.5F, -2.0F, -12.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.0F, -1.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(76, 42).addBox(-5.0F, -3.5F, -3.0F, 10.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 42).addBox(-5.0F, -2.5F, -3.0F, 10.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.0F, -1.0F, 0.0873F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 192);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
