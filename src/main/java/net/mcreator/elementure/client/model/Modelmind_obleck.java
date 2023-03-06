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
public class Modelmind_obleck<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelmind_obleck"), "main");
	public final ModelPart main_body;
	public final ModelPart shield_rot;

	public Modelmind_obleck(ModelPart root) {
		this.main_body = root.getChild("main_body");
		this.shield_rot = root.getChild("shield_rot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main_body = partdefinition.addOrReplaceChild("main_body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(40, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-3.0F, -7.0F, -4.75F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 19).addBox(-1.0F, -8.0F, -4.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, 0.0F));
		PartDefinition side_spike_right_r1 = main_body.addOrReplaceChild("side_spike_right_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -2.5F, 0.0F, 0.1309F, -0.2618F, -0.1309F));
		PartDefinition side_spike_right2_r1 = main_body.addOrReplaceChild("side_spike_right2_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -8.5F, -3.0F, 0.3927F, -0.3491F, -0.1309F));
		PartDefinition side_spike_left2_r1 = main_body.addOrReplaceChild("side_spike_left2_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -8.5F, -3.0F, 0.3927F, 0.3491F, 0.1309F));
		PartDefinition side_spike_left_r1 = main_body.addOrReplaceChild("side_spike_left_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -2.5F, 0.0F, 0.1309F, 0.2618F, 0.1309F));
		PartDefinition back_ear_right = main_body.addOrReplaceChild("back_ear_right",
				CubeListBuilder.create().texOffs(13, 23).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 26).mirror().addBox(-0.5F, -2.75F, 1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 26).mirror().addBox(-0.5F, -1.25F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 16).mirror().addBox(-0.5F, 0.25F, 1.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-4.0F, -6.0F, 1.5F, 0.4363F, -0.3491F, -0.2618F));
		PartDefinition spike_right_side_r1 = back_ear_right.addOrReplaceChild("spike_right_side_r1", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-0.5F, -2.75F, 1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.1745F, 0.0873F));
		PartDefinition back_ear_left = main_body.addOrReplaceChild("back_ear_left",
				CubeListBuilder.create().texOffs(13, 23).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(-0.5F, -2.75F, 1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-0.5F, -1.25F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 16).addBox(-0.5F, 0.25F, 1.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -6.0F, 1.5F, 0.4363F, 0.3491F, 0.2182F));
		PartDefinition spike_left_side_r1 = back_ear_left.addOrReplaceChild("spike_left_side_r1", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -2.75F, 1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, -0.1745F, -0.0873F));
		PartDefinition ear_top_right = main_body.addOrReplaceChild("ear_top_right", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-3.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 26).mirror()
				.addBox(-2.75F, -0.75F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -8.5F, 1.5F, 0.3927F, -0.2182F, -0.3054F));
		PartDefinition ear_top = main_body.addOrReplaceChild("ear_top", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 26).mirror()
				.addBox(-0.5F, -1.25F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -8.5F, 1.5F, 0.2618F, 0.0F, 0.0F));
		PartDefinition ear_top_right2 = main_body.addOrReplaceChild("ear_top_right2",
				CubeListBuilder.create().texOffs(0, 17).addBox(1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(1.75F, -0.75F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.5F, 1.5F, 0.3927F, 0.2182F, 0.3054F));
		PartDefinition shield_rot = partdefinition.addOrReplaceChild("shield_rot", CubeListBuilder.create().texOffs(36, 18).addBox(-3.5025F, -3.4975F, -3.4975F, 7.0F, 7.0F, 7.0F, new CubeDeformation(4.0F)),
				PartPose.offset(0.0025F, 15.9975F, -0.0025F));
		PartDefinition shield_r1 = shield_rot.addOrReplaceChild("shield_r1", CubeListBuilder.create().texOffs(36, 18).addBox(-3.5F, -3.5F, -3.51F, 7.0F, 7.0F, 7.0F, new CubeDeformation(4.0F)),
				PartPose.offsetAndRotation(-0.0025F, 0.0025F, 0.0025F, 0.0F, 0.0F, 0.7854F));
		PartDefinition shield_r2 = shield_rot.addOrReplaceChild("shield_r2", CubeListBuilder.create().texOffs(36, 18).addBox(-3.49F, -3.5F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(4.0F)),
				PartPose.offsetAndRotation(-0.0025F, 0.0025F, 0.0025F, -0.7854F, 0.0F, 0.0F));
		PartDefinition shield_r3 = shield_rot.addOrReplaceChild("shield_r3", CubeListBuilder.create().texOffs(36, 18).addBox(-3.5F, -8.51F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(4.0F)),
				PartPose.offsetAndRotation(-0.0025F, 5.0025F, 0.0025F, 0.0F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.shield_rot.yRot = ageInTicks / 20.f;
		this.shield_rot.zRot = ageInTicks / 15.f;
		this.shield_rot.xRot = ageInTicks / 25.f;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		main_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		shield_rot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
