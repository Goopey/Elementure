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
public class Modelmycena_fumoon_sporeling<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelmycena_fumoon_sporeling"), "main");
	public final ModelPart body;
	public final ModelPart head;

	public Modelmycena_fumoon_sporeling(ModelPart root) {
		this.body = root.getChild("body");
		this.head = body.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(28, 27).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 29).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.5F, -1.25F, -2.01F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.99F, -2.25F, -3.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, -2.24F, -2.01F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.01F, -1.24F, -3.01F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.01F, -2.54F, -2.01F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.5F, -3.0F, -2.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.5F, -1.25F, -2.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -1.75F, 1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(2.75F, -1.0F, 1.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.75F, -1.5F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.75F, -3.0F, 0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.75F, -1.5F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.25F, -1.5F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.5F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.xRot = (float) Math.sin(ageInTicks / 20.f) / 3.f;
		this.body.zRot = (float) Math.sin(ageInTicks / 20.f) / 3.f;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
