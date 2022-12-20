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
public class Modelblackstone_grimace<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelblackstone_grimace"),
			"main");
	public final ModelPart body;

	public Modelblackstone_grimace(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -24.0F, -12.0F, 4.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, -24.0F, -12.0F, 4.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-12.0F, -24.0F, -10.0F, 24.0F, 24.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 103)
						.addBox(-12.0F, -24.0F, -11.0F, 24.0F, 24.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 116)
						.addBox(-12.0F, -10.0F, -13.0F, 24.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(86, 99)
						.addBox(-10.0F, -10.0F, -14.0F, 20.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 90)
						.addBox(-8.0F, -24.0F, -12.0F, 16.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 90)
						.addBox(-3.0F, -19.0F, -12.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 96)
						.addBox(-8.0F, -16.0F, -12.0F, 16.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 75)
						.addBox(0.0F, -13.0F, -12.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 86)
						.addBox(-8.0F, -13.0F, -12.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
