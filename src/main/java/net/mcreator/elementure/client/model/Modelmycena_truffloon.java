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
public class Modelmycena_truffloon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelmycena_truffloon"), "main");
	public final ModelPart main_body;

	public Modelmycena_truffloon(ModelPart root) {
		this.main_body = root.getChild("main_body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main_body = partdefinition.addOrReplaceChild("main_body", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition body = main_body.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, 7.51F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, 8.5F, -4.5F, 4.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, 8.5F, -2.0F, 9.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, 8.0F, -5.0F, 10.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, 6.5F, -6.0F, 12.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-8.0F, 6.5F, -8.0F, 16.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, 7.25F, -7.0F, 5.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-7.0F, 7.25F, -2.5F, 14.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, 7.01F, 3.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-7.0F, 7.01F, 3.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, 7.01F, -7.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(3.0F, 7.01F, -7.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, 5.5F, -9.0F, 18.0F, 6.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.5F, 6.01F, -9.01F, 7.0F, 6.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.99F, 6.01F, -3.5F, 18.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-10.5F, 3.5F, -10.5F, 21.0F, 7.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.5F, 2.0F, -11.5F, 23.0F, 7.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-12.0F, -1.0F, -12.0F, 24.0F, 8.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, 3.51F, -12.0F, 9.0F, 6.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-12.0F, 3.51F, -4.5F, 24.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-12.51F, 2.01F, -5.5F, 25.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.5F, 2.01F, -12.49F, 11.0F, 6.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.5F, -0.99F, -13.0F, 15.0F, 5.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-13.0F, -0.99F, -7.5F, 26.0F, 5.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-13.0F, 4.01F, -6.0F, 26.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-13.0F, 5.01F, -4.0F, 26.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, 4.01F, -13.0F, 12.0F, 1.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 5.01F, -13.0F, 8.0F, 1.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.0F, -2.0F, -11.0F, 22.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-12.5F, -3.0F, -12.5F, 25.0F, 1.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-12.51F, -1.49F, -9.0F, 25.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-9.0F, -1.49F, -12.49F, 18.0F, 1.0F, 25.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition shroom1 = body.addOrReplaceChild("shroom1", CubeListBuilder.create().texOffs(250, 0).addBox(0.0F, -3.5F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 3.5F, 12.0F, -0.3054F, -0.5672F, 0.3491F));
		PartDefinition shroom2 = body.addOrReplaceChild("shroom2", CubeListBuilder.create().texOffs(250, 0).addBox(0.0F, -3.5F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 0.5F, -10.0F, 0.2182F, 0.2182F, 0.6109F));
		PartDefinition shroom3 = body.addOrReplaceChild("shroom3", CubeListBuilder.create().texOffs(230, 0).addBox(0.0F, -3.5F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 0.5F, -1.5F, -0.0436F, 0.0873F, 0.3927F));
		PartDefinition shroom4 = body.addOrReplaceChild("shroom4", CubeListBuilder.create().texOffs(238, 0).addBox(0.0F, -3.0F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 1.5F, 5.5F, 0.1745F, 0.1745F, 0.2618F));
		PartDefinition shroom5 = body.addOrReplaceChild("shroom5", CubeListBuilder.create().texOffs(250, 0).addBox(0.0F, -3.5F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 4.5F, 1.5F, 0.3054F, -0.1745F, 0.2182F));
		PartDefinition shroom6 = body.addOrReplaceChild("shroom6", CubeListBuilder.create().texOffs(250, 0).addBox(0.0F, -3.5F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 0.5F, 10.0F, -0.2618F, -0.2182F, 0.5672F));
		PartDefinition shroom7 = body.addOrReplaceChild("shroom7", CubeListBuilder.create().texOffs(250, 12).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 1.0F, -12.0F, 0.3054F, 0.2182F, -0.0873F));
		PartDefinition shroom9 = body.addOrReplaceChild("shroom9", CubeListBuilder.create().texOffs(250, 0).addBox(0.0F, -3.5F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, 1.5F, -10.0F, 0.2182F, -0.2182F, -0.3054F));
		PartDefinition shroom10 = body.addOrReplaceChild("shroom10", CubeListBuilder.create().texOffs(250, 0).addBox(0.0F, -3.5F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, 1.5F, 5.0F, -0.2182F, 0.1309F, -0.3054F));
		PartDefinition shroom11 = body.addOrReplaceChild("shroom11", CubeListBuilder.create().texOffs(238, 0).addBox(0.0F, -3.0F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, 0.0F, 10.0F, 0.0873F, 0.1745F, -0.3491F));
		PartDefinition shroom12 = body.addOrReplaceChild("shroom12", CubeListBuilder.create().texOffs(230, 0).addBox(0.0F, -3.5F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, 0.5F, -0.5F, 0.0436F, -0.1309F, -0.3927F));
		PartDefinition shroom13 = body.addOrReplaceChild("shroom13", CubeListBuilder.create().texOffs(238, 0).addBox(0.0F, -3.0F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, 4.0F, -3.0F, 0.1309F, -0.0873F, -0.3927F));
		PartDefinition shroom14 = body.addOrReplaceChild("shroom14", CubeListBuilder.create().texOffs(238, 0).addBox(0.0F, -3.0F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, 4.0F, -12.0F, 0.5672F, -0.6981F, -0.3927F));
		PartDefinition shroom16 = body.addOrReplaceChild("shroom16", CubeListBuilder.create().texOffs(250, 0).addBox(0.0F, -4.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 2.0F, -12.0F, 0.0F, 0.6981F, 0.3491F));
		PartDefinition shroom17 = body.addOrReplaceChild("shroom17", CubeListBuilder.create().texOffs(250, 12).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 3.0F, -13.0F, 0.3054F, -0.2618F, 0.1309F));
		PartDefinition shroom19 = body.addOrReplaceChild("shroom19", CubeListBuilder.create().texOffs(250, 3).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 2.0F, -13.0F, 0.48F, 0.2618F, -0.0436F));
		PartDefinition shroom20 = body.addOrReplaceChild("shroom20", CubeListBuilder.create().texOffs(230, 4).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 1.0F, -13.0F, 0.2618F, -0.2618F, -0.1309F));
		PartDefinition shroom21 = body.addOrReplaceChild("shroom21", CubeListBuilder.create().texOffs(250, 12).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 5.0F, -13.0F, 0.3054F, -0.0873F, 0.1309F));
		PartDefinition shroom22 = body.addOrReplaceChild("shroom22", CubeListBuilder.create().texOffs(250, 12).addBox(-1.5F, -2.5F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, 5.5F, 12.0F, -0.3491F, -0.7854F, 0.1309F));
		PartDefinition shroom23 = body.addOrReplaceChild("shroom23", CubeListBuilder.create().texOffs(250, 3).addBox(-1.5F, -3.5F, 0.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.5F, 2.5F, 12.0F, -0.3491F, -0.2182F, -0.0436F));
		PartDefinition shroom24 = body.addOrReplaceChild("shroom24", CubeListBuilder.create().texOffs(250, 3).addBox(-1.5F, -3.5F, 0.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, 0.5F, 13.0F, -0.4363F, 0.3491F, 0.1309F));
		PartDefinition shroom25 = body.addOrReplaceChild("shroom25", CubeListBuilder.create().texOffs(247, 12).addBox(-1.5F, -2.5F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5F, 1.5F, 12.0F, -0.2618F, 0.1309F, 0.2618F));
		PartDefinition shroom26 = body.addOrReplaceChild("shroom26", CubeListBuilder.create().texOffs(230, 4).addBox(-2.0F, -3.5F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 2.5F, 13.0F, -0.2618F, -0.2182F, -0.2618F));
		PartDefinition shroom27 = body.addOrReplaceChild("shroom27", CubeListBuilder.create().texOffs(247, 12).addBox(-1.5F, -2.5F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5F, -0.5F, 13.0F, -0.2618F, 0.1745F, 0.0873F));
		PartDefinition head = main_body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(160, 224).addBox(-8.5F, -1.35F, -15.5F, 17.0F, 1.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(160, 196).addBox(-15.5F, -1.35F, -8.5F, 31.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 226)
						.addBox(-14.0F, -2.59F, -14.0F, 28.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 196).addBox(-15.0F, -2.1F, -6.5F, 30.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 151)
						.addBox(-6.5F, -2.1F, -15.0F, 13.0F, 1.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(152, 136).addBox(-13.0F, -3.49F, -13.0F, 26.0F, 1.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(160, 101)
						.addBox(-12.0F, -4.3F, -12.0F, 24.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(172, 74).addBox(-10.5F, -4.95F, -10.5F, 21.0F, 1.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(0, 121)
						.addBox(-8.5F, -5.4F, -8.5F, 17.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(101, 110).addBox(-7.0F, -5.85F, -7.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		main_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
