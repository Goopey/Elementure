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

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeltarworm_link<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modeltarworm_link"), "main");
	public final ModelPart bb_main;

	public Modeltarworm_link(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -14.0F, -7.0F, 14.0F, 14.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-6.0F, -13.0F, -9.0F, 12.0F, 12.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(2.0F, -10.0F, 1.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(2.0F)).texOffs(0, 42)
						.addBox(-7.0F, -10.0F, 1.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(2.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition spikes13_r1 = bb_main.addOrReplaceChild("spikes13_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(0.0F, -2.5F, -5.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.5F, -15.5F, 0.5F, -0.0436F, 0.0F, 0.0F));
		PartDefinition spikes1_r1 = bb_main.addOrReplaceChild("spikes1_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(0.0F, -3.5F, -5.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-3.5F, -14.5F, 0.5F, -0.1309F, 0.0F, -0.6545F));
		PartDefinition spikes2_r1 = bb_main.addOrReplaceChild("spikes2_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(0.0F, -3.5F, -5.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(3.5F, -14.5F, 0.5F, -0.1309F, 0.0F, 0.6545F));
		PartDefinition spikes11_r1 = bb_main.addOrReplaceChild("spikes11_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(5.0F, -2.5F, -5.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(7.0F, 0.1F, 1.0F, 0.1309F, 0.0F, 2.9234F));
		PartDefinition spikes12_r1 = bb_main.addOrReplaceChild("spikes12_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(-5.0F, -2.5F, -5.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-7.0F, 0.1F, 1.0F, 0.1309F, 0.0F, -2.9234F));
		PartDefinition spikes9_r1 = bb_main.addOrReplaceChild("spikes9_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(2.0F, -2.5F, -5.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(7.0F, 0.1F, 1.0F, 0.1309F, 0.0F, 2.7053F));
		PartDefinition spikes10_r1 = bb_main.addOrReplaceChild("spikes10_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(-2.0F, -2.5F, -5.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-7.0F, 0.1F, 1.0F, 0.1309F, 0.0F, -2.7053F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(8, 15).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -12.0F, 10.0F, 0.1309F, -0.1309F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 15).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -12.0F, 10.0F, 0.1309F, 0.1309F, 0.0F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(8, 15).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -1.0F, 10.0F, -0.1309F, -0.1309F, 0.0F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(8, 15).addBox(-3.0F, -3.0F, -2.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -1.0F, 10.0F, -0.1309F, 0.1309F, 0.0F));
		PartDefinition spikes7_r1 = bb_main.addOrReplaceChild("spikes7_r1",
				CubeListBuilder.create().texOffs(44, 33).addBox(0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.01F)).texOffs(44, 21)
						.addBox(0.0F, -4.5F, -10.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-6.0F, -13.5F, 2.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition spikes5_r1 = bb_main.addOrReplaceChild("spikes5_r1",
				CubeListBuilder.create().texOffs(44, 33).addBox(0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.01F)).texOffs(44, 21)
						.addBox(0.0F, -4.5F, -10.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(6.0F, -13.5F, 2.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition spikes4_r1 = bb_main.addOrReplaceChild("spikes4_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(0.0F, -4.5F, -5.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-7.0F, -1.9F, 1.0F, 0.1309F, 0.0F, -2.4435F));
		PartDefinition spikes3_r1 = bb_main.addOrReplaceChild("spikes3_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(0.0F, -4.5F, -5.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(7.0F, -1.9F, 1.0F, 0.1309F, 0.0F, 2.4435F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
