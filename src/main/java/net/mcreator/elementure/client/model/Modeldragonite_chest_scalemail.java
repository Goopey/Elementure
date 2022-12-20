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
public class Modeldragonite_chest_scalemail<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("elementure", "modeldragonite_chest_scalemail"), "main");
	public final ModelPart right_arm;
	public final ModelPart left_arm;
	public final ModelPart body;

	public Modeldragonite_chest_scalemail(ModelPart root) {
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(40, 118).mirror().addBox(-3.75F, -2.5F, -2.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(48, 80).addBox(-3.2F, -2.0F, -2.011F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-4.0F, -1.0F, 0.0F));
		PartDefinition spike_3_r1 = right_arm.addOrReplaceChild("spike_3_r1",
				CubeListBuilder.create().texOffs(28, 100).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -2.0F, -2.0F, 0.3054F, -0.7854F, -0.4363F));
		PartDefinition spike_2_r1 = right_arm.addOrReplaceChild(
				"spike_2_r1", CubeListBuilder.create().texOffs(28, 100).mirror()
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, -2.0F, 2.0F, -0.3054F, 0.7854F, -0.4363F));
		PartDefinition spike_1_r1 = right_arm.addOrReplaceChild("spike_1_r1",
				CubeListBuilder.create().texOffs(28, 100).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(48, 80).mirror().addBox(-0.8F, -2.0F, -2.011F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.2F))
						.mirror(false).texOffs(40, 118).addBox(0.75F, -2.5F, -2.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, -1.0F, 0.0F));
		PartDefinition spike_5_r1 = left_arm.addOrReplaceChild("spike_5_r1",
				CubeListBuilder.create().texOffs(28, 100).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -2.0F, 2.0F, -0.3054F, -0.7854F, 0.4363F));
		PartDefinition spike_4_r1 = left_arm.addOrReplaceChild("spike_4_r1",
				CubeListBuilder.create().texOffs(28, 100).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition spike_6_r1 = left_arm.addOrReplaceChild(
				"spike_6_r1", CubeListBuilder.create().texOffs(28, 100).mirror()
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, -2.0F, -2.0F, 0.3054F, 0.7854F, 0.4363F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(40, 102).addBox(-4.0F, 8.0F, -2.01F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(0, 64)
						.addBox(-4.5F, 4.0F, -2.0F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(0, 76)
						.addBox(-5.0F, -1.0F, -2.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(0, 113)
						.addBox(-4.0F, -1.01F, -2.5F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(0, 99)
						.addBox(-3.0F, 4.0F, -2.49F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(2, 87)
						.addBox(-2.0F, 9.0F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition b_spike_5_r1 = body.addOrReplaceChild(
				"b_spike_5_r1", CubeListBuilder.create().texOffs(28, 101).mirror()
						.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, -0.2618F, -0.6109F, -0.0873F));
		PartDefinition b_spike_4_r1 = body.addOrReplaceChild("b_spike_4_r1",
				CubeListBuilder.create().texOffs(28, 101).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, 2.0F, -0.2618F, 0.6109F, 0.0873F));
		PartDefinition b_spike_3_r1 = body.addOrReplaceChild("b_spike_3_r1",
				CubeListBuilder.create().texOffs(28, 101).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 2.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition b_spike_2_r1 = body.addOrReplaceChild(
				"b_spike_2_r1", CubeListBuilder.create().texOffs(28, 101).mirror()
						.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.0F, 2.0F, -0.5672F, 0.0F, 0.0F));
		PartDefinition b_spike_1_r1 = body.addOrReplaceChild("b_spike_1_r1",
				CubeListBuilder.create().texOffs(28, 101).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, 2.0F, -0.6981F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
