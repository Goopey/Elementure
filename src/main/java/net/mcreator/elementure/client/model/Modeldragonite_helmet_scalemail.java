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
public class Modeldragonite_helmet_scalemail<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("elementure", "modeldragonite_helmet_scalemail"), "main");
	public final ModelPart head;

	public Modeldragonite_helmet_scalemail(ModelPart root) {
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild(
				"head", CubeListBuilder.create().texOffs(92, 36).addBox(-4.5F, -9.0F, -4.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
						.texOffs(108, 54).addBox(-4.0F, -8.01F, -6.0F, 8.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition mouth_spike_left2_r1 = head.addOrReplaceChild(
				"mouth_spike_left2_r1", CubeListBuilder.create().texOffs(99, 5).mirror()
						.addBox(-4.0F, -1.0F, 0.5F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.5F, -0.5F, -8.0F, 0.1309F, 0.9599F, 0.0F));
		PartDefinition mouth_spike_right2_r1 = head.addOrReplaceChild("mouth_spike_right2_r1",
				CubeListBuilder.create().texOffs(99, 5).addBox(-2.0F, -1.0F, 0.5F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -0.5F, -8.0F, 0.1309F, -0.9599F, 0.0F));
		PartDefinition mouth_spike_left_r1 = head.addOrReplaceChild("mouth_spike_left_r1",
				CubeListBuilder.create().texOffs(99, 9).addBox(-7.0F, 2.5F, -12.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 6.0F, 0.1309F, -0.1745F, 0.0F));
		PartDefinition mouth_spike_right_r1 = head.addOrReplaceChild("mouth_spike_right_r1",
				CubeListBuilder.create().texOffs(99, 9).addBox(5.0F, 2.5F, -12.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 6.0F, 0.1309F, 0.1745F, 0.0F));
		PartDefinition skull_rim = head.addOrReplaceChild("skull_rim", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -7.0F, -2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition skull_rim2_r1 = skull_rim.addOrReplaceChild("skull_rim2_r1",
				CubeListBuilder.create().texOffs(4, 45).addBox(-1.35F, -2.0F, -5.0F, 2.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, -0.3054F, 0.5236F));
		PartDefinition skull_rim_r1 = skull_rim.addOrReplaceChild("skull_rim_r1",
				CubeListBuilder.create().texOffs(4, 45).addBox(-0.65F, -2.0F, -5.01F, 2.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.3054F, -0.5236F));
		PartDefinition left_eyebrow_r1 = head.addOrReplaceChild("left_eyebrow_r1",
				CubeListBuilder.create().texOffs(2, 44).addBox(-2.5F, -0.75F, -10.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -12.0F, 5.0F, 0.5585F, -0.2182F, -0.1745F));
		PartDefinition right_eyebrow_r1 = head.addOrReplaceChild("right_eyebrow_r1",
				CubeListBuilder.create().texOffs(2, 44).addBox(0.5F, -0.75F, -10.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -12.0F, 5.0F, 0.5585F, 0.2182F, 0.1745F));
		PartDefinition left_eyebrow_mid_r1 = head.addOrReplaceChild("left_eyebrow_mid_r1",
				CubeListBuilder.create().texOffs(0, 34).addBox(-2.5F, -1.0F, -6.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -10.0F, 5.0F, 0.3054F, -0.3054F, -0.1745F));
		PartDefinition right_eyebrow_mid_r1 = head.addOrReplaceChild("right_eyebrow_mid_r1",
				CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -1.0F, -6.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -10.0F, 5.0F, 0.3054F, 0.3054F, 0.1745F));
		PartDefinition left_eyebrow_spike_r1 = head.addOrReplaceChild("left_eyebrow_spike_r1",
				CubeListBuilder.create().texOffs(18, 36).addBox(-2.5F, -1.6F, 1.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -10.0F, 5.0F, 0.6109F, 0.3927F, 0.0F));
		PartDefinition right_eyebrow_spike_r1 = head.addOrReplaceChild("right_eyebrow_spike_r1",
				CubeListBuilder.create().texOffs(18, 36).addBox(0.5F, -1.6F, 1.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -10.0F, 5.0F, 0.6109F, -0.3927F, 0.0F));
		PartDefinition left_eyebrow_top_r1 = head.addOrReplaceChild("left_eyebrow_top_r1",
				CubeListBuilder.create().texOffs(32, 36).addBox(-11.5F, -1.25F, -2.5F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 36)
						.mirror().addBox(-2.5F, -1.25F, -2.5F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.5F, -10.0F, 5.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition skull_top_r1 = head.addOrReplaceChild("skull_top_r1",
				CubeListBuilder.create().texOffs(56, 49).addBox(-5.5F, -3.4F, -8.0F, 11.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 6.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition skull_top_r2_r1 = skull_top_r1.addOrReplaceChild("skull_top_r2_r1",
				CubeListBuilder.create().texOffs(56, 49).addBox(-5.0F, 0.55F, -4.0F, 10.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1F, -4.0F, -0.3054F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
