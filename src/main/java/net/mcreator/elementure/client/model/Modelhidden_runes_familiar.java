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
public class Modelhidden_runes_familiar<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelhidden_runes_familiar"),
			"main");
	public final ModelPart main_bone;
	public final ModelPart runes;
	public final ModelPart top_runes_r1;
	public final ModelPart bottom_runes_r1;

	public Modelhidden_runes_familiar(ModelPart root) {
		this.main_bone = root.getChild("main_bone");
		this.runes = main_bone.getChild("runes");
		this.top_runes_r1 = runes.getChild("top_runes_r1");
		this.bottom_runes_r1 = runes.getChild("bottom_runes_r1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main_bone = partdefinition.addOrReplaceChild("main_bone", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition body = main_bone.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.5F, 1.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition right_cover_r1 = body.addOrReplaceChild(
				"right_cover_r1", CubeListBuilder.create().texOffs(6, 0).mirror()
						.addBox(-5.75F, -3.5F, 0.5F, 6.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));
		PartDefinition right_page_3_r1 = body.addOrReplaceChild(
				"right_page_3_r1", CubeListBuilder.create().texOffs(20, 0).mirror()
						.addBox(-0.35F, -3.5F, -0.4F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.9234F, 0.0F));
		PartDefinition right_page_2_r1 = body.addOrReplaceChild(
				"right_page_2_r1", CubeListBuilder.create().texOffs(20, 0).mirror()
						.addBox(-0.35F, -3.5F, -0.4F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.5307F, 0.0F));
		PartDefinition right_page_r1 = body.addOrReplaceChild(
				"right_page_r1", CubeListBuilder.create().texOffs(20, 0).mirror()
						.addBox(-0.5F, -3.5F, -0.2F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.1817F, 0.0F));
		PartDefinition left_page_2_r1 = body.addOrReplaceChild("left_page_2_r1",
				CubeListBuilder.create().texOffs(20, 0).addBox(-0.25F, -3.5F, 0.5F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3054F, 0.0F));
		PartDefinition left_page_r1 = body.addOrReplaceChild("left_page_r1",
				CubeListBuilder.create().texOffs(20, 0).addBox(-0.25F, -3.5F, 0.5F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2182F, 0.0F));
		PartDefinition left_cover_r1 = body.addOrReplaceChild("left_cover_r1",
				CubeListBuilder.create().texOffs(6, 0).addBox(-0.25F, -3.5F, 0.5F, 6.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));
		PartDefinition runes = main_bone.addOrReplaceChild("runes",
				CubeListBuilder.create().texOffs(8, 46).addBox(-7.0F, -2.0F, -7.0F, 14.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bottom_runes_r1 = runes.addOrReplaceChild("bottom_runes_r1",
				CubeListBuilder.create().texOffs(24, 32).addBox(-5.0F, 3.5F, -5.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition top_runes_r1 = runes.addOrReplaceChild("top_runes_r1",
				CubeListBuilder.create().texOffs(24, 19).addBox(-5.0F, -6.5F, -5.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.runes.xRot = ageInTicks / 20.f;
		this.top_runes_r1.zRot = ageInTicks / 20.f;
		this.bottom_runes_r1.zRot = ageInTicks / 20.f;
		this.runes.yRot = ageInTicks / 20.f;
		this.main_bone.setPos(0.0F, (12.0F + (float) (Math.sin(ageInTicks / 4) / 4)), 0.0F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		main_bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
