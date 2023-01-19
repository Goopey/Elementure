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

// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelfang_bola<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelfang_bola"), "main");
	public final ModelPart bone;

	public Modelfang_bola(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.9375F, -1.5F, -0.0625F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0625F, -1.5F, 1.9375F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(10, 13)
						.addBox(4.0625F, -0.5F, 0.9375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 13)
						.addBox(3.0625F, -0.5F, -1.0625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 13)
						.addBox(1.0625F, -0.5F, -2.0625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 13)
						.addBox(-1.9375F, -0.5F, -3.0625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 13)
						.addBox(-4.9375F, -0.5F, -2.0625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 13)
						.addBox(-5.9375F, -0.5F, -1.0625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0625F, 15.5F, -0.9375F, -1.5708F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
