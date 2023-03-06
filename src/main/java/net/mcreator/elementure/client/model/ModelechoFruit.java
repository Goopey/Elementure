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
public class ModelechoFruit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelecho_fruit"), "main");
	public final ModelPart body;

	public ModelechoFruit(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 12).addBox(-2.5F, 4.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-2.5F, -2.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.0F, 0.0F));
		PartDefinition leaf = body.addOrReplaceChild("leaf", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -3.01F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));
		PartDefinition leaf_top_r1 = leaf.addOrReplaceChild("leaf_top_r1", CubeListBuilder.create().texOffs(18, 0).addBox(-3.0F, 0.0F, -2.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition leaf_2_r1 = leaf.addOrReplaceChild("leaf_2_r1", CubeListBuilder.create().texOffs(14, 27).addBox(-0.5F, -0.25F, -2.5F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition leaf_1_r1 = leaf.addOrReplaceChild("leaf_1_r1", CubeListBuilder.create().texOffs(14, 17).addBox(-3.5F, -0.25F, -2.5F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.body.setPos(0.f, 18.f + (float) Math.sin(ageInTicks / (Math.PI * 12.f)) * 2.f, 0.f);
		this.body.yRot = ageInTicks / 20.f;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
