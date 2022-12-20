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
public class Modelbuzy_bee<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelbuzy_bee"), "main");
	public final ModelPart main_body;
	public final ModelPart antannae;
	public final ModelPart back_feet;
	public final ModelPart front_feet;
	public final ModelPart right_wing;
	public final ModelPart left_wing;

	public Modelbuzy_bee(ModelPart root) {
		this.main_body = root.getChild("main_body");
		this.antannae = main_body.getChild("antannae");
		this.back_feet = main_body.getChild("back_feet");
		this.front_feet = main_body.getChild("front_feet");
		this.right_wing = main_body.getChild("right_wing");
		this.left_wing = main_body.getChild("left_wing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main_body = partdefinition
				.addOrReplaceChild(
						"main_body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -1.5F, 3.0F, 7.0F, 7.0F, 10.0F, new CubeDeformation(0.0F))
								.texOffs(5, 6).addBox(0.0F, 1.5F, 13.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 10.5F, -8.0F));
		PartDefinition l_foot_r1 = main_body.addOrReplaceChild("l_foot_r1",
				CubeListBuilder.create().texOffs(7, 0).addBox(-0.5F, -3.2F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
						.addBox(-4.5F, -3.2F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 8.5F, 8.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition left_wing = main_body.addOrReplaceChild("left_wing",
				CubeListBuilder.create().texOffs(38, 0).mirror().addBox(0.0F, 0.0F, -2.0F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(1.5F, -1.5F, 7.0F));
		PartDefinition right_wing = main_body.addOrReplaceChild("right_wing",
				CubeListBuilder.create().texOffs(38, 0).addBox(-7.0F, 0.0F, -2.0F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, -1.5F, 7.0F));
		PartDefinition antannae = main_body
				.addOrReplaceChild(
						"antannae", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.0F, -3.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
								.texOffs(0, 0).addBox(1.5F, -2.0F, -3.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 0.5F, 3.0F));
		PartDefinition front_feet = main_body
				.addOrReplaceChild(
						"front_feet", CubeListBuilder.create().texOffs(7, 0).addBox(-1.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
								.texOffs(7, 0).addBox(0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 5.5F, 6.0F));
		PartDefinition back_feet = main_body.addOrReplaceChild("back_feet", CubeListBuilder.create(), PartPose.offset(0.0F, 5.5F, 9.0F));
		PartDefinition r_foot_back_r1 = back_feet.addOrReplaceChild("r_foot_back_r1",
				CubeListBuilder.create().texOffs(7, 0).addBox(-0.5F, -3.2F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
						.addBox(3.5F, -3.2F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.0F, 1.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition suit_case = main_body.addOrReplaceChild(
				"suit_case", CubeListBuilder.create().texOffs(37, 9).addBox(-0.5F, -3.5F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(44, 9).addBox(-1.5F, -2.0F, -4.5F, 3.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 10.35F, 8.67F));
		PartDefinition fedora = main_body.addOrReplaceChild("fedora",
				CubeListBuilder.create().texOffs(23, 20).addBox(-2.5F, -0.1F, -2.0F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-2.0F, -1.1F, -1.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.5F, 4.0F, 0.0436F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.main_body.xRot = (float) ((Math.sin(ageInTicks / 6) / 16) + 0.1);
		this.antannae.xRot = (float) ((Math.sin(ageInTicks / 6) / 8) + 0.1);
		this.back_feet.xRot = (float) ((Math.sin(ageInTicks / 6) / 8) + 0.1);
		this.front_feet.xRot = (float) ((Math.sin(ageInTicks / 6) / 8) + 0.1);
		this.right_wing.zRot = (float) ((Math.sin(ageInTicks) / 2));
		this.left_wing.zRot = (float) ((Math.sin(ageInTicks + Math.PI) / 2));
		this.main_body.setPos(0.0F,
				(10.5F + (float) ((Math.cos(ageInTicks / 6) * (1 / (Math.cos((1 / 1.5) * Math.asin(Math.sin(1.5 * (ageInTicks / 6))))))
						+ Math.cos(ageInTicks / 6)) / 2.5)),
				-8.0F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		main_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
