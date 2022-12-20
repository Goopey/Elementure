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
public class Modelmycena_fumoon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelmycena_fumoon"), "main");
	public final ModelPart body;
	public final ModelPart spore_vent_1;
	public final ModelPart spore_vent_2;
	public final ModelPart spore_vent_3;
	public final ModelPart spore_vent_4;
	public final ModelPart spore_vent_5;
	public final ModelPart spore_vent_6;

	public Modelmycena_fumoon(ModelPart root) {
		this.body = root.getChild("body");
		this.spore_vent_1 = root.getChild("spore_vent_1");
		this.spore_vent_2 = root.getChild("spore_vent_2");
		this.spore_vent_3 = root.getChild("spore_vent_3");
		this.spore_vent_4 = root.getChild("spore_vent_4");
		this.spore_vent_5 = root.getChild("spore_vent_5");
		this.spore_vent_6 = root.getChild("spore_vent_6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -1.0F, -5.5F, 11.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -2.0F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -2.25F, -7.0F, 4.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -2.25F, -2.0F, 14.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.5F, -5.75F, -7.5F, 13.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.5F, -4.76F, -6.5F, 15.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.5F, -5.76F, -5.5F, 15.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -6.74F, -5.5F, 14.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -6.75F, -7.0F, 12.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -7.75F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.5F, -8.75F, -5.5F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.5F, -8.75F, -5.5F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.5F, -8.75F, -5.5F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.5F, -8.75F, 3.5F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.5F, -8.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.5F, -8.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.5F, -8.25F, -3.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.5F, -8.25F, -3.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0F, -9.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -9.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.5F, -9.5F, -5.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.5F, -9.5F, 4.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, -10.25F, 3.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, -10.25F, -4.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, -10.25F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.5F, -10.25F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, -7.5F, -6.5F, 9.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.5F, -7.5F, -4.5F, 13.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition spore_vent_1 = partdefinition.addOrReplaceChild("spore_vent_1", CubeListBuilder.create(), PartPose.offset(0.0F, 17.25F, 0.0F));
		PartDefinition spore_arm_1 = spore_vent_1.addOrReplaceChild("spore_arm_1",
				CubeListBuilder.create().texOffs(52, 59).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 58)
						.addBox(-2.0F, -3.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(37, 60)
						.addBox(-1.5F, -3.25F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spore_vent_2 = partdefinition.addOrReplaceChild("spore_vent_2", CubeListBuilder.create(), PartPose.offset(6.5F, 19.5F, 2.0F));
		PartDefinition sporevent_2_2 = spore_vent_2.addOrReplaceChild("sporevent_2_2",
				CubeListBuilder.create().texOffs(0, 57).addBox(-1.5F, -3.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition spore_vent_3 = partdefinition.addOrReplaceChild("spore_vent_3", CubeListBuilder.create(), PartPose.offset(1.5F, 17.5F, 7.0F));
		PartDefinition sporevent_3_2 = spore_vent_3.addOrReplaceChild("sporevent_3_2",
				CubeListBuilder.create().texOffs(0, 57).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, -0.5236F));
		PartDefinition spore_vent_4 = partdefinition.addOrReplaceChild("spore_vent_4", CubeListBuilder.create(),
				PartPose.offset(-7.0F, 21.0F, -2.0F));
		PartDefinition sporevent_4_2 = spore_vent_4.addOrReplaceChild("sporevent_4_2",
				CubeListBuilder.create().texOffs(0, 57).addBox(-1.5F, -3.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, -0.7854F));
		PartDefinition spore_vent_5 = partdefinition.addOrReplaceChild("spore_vent_5", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 16.0F, -4.0F));
		PartDefinition sporevent_5_2 = spore_vent_5.addOrReplaceChild("sporevent_5_2",
				CubeListBuilder.create().texOffs(0, 57).addBox(-1.5F, -3.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, -0.3491F));
		PartDefinition spore_vent_6 = partdefinition.addOrReplaceChild("spore_vent_6", CubeListBuilder.create(), PartPose.offset(1.0F, 20.0F, -6.5F));
		PartDefinition sporevent_6_2 = spore_vent_6.addOrReplaceChild("sporevent_6_2",
				CubeListBuilder.create().texOffs(0, 57).addBox(-1.5F, -3.0F, -2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.4363F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.spore_vent_6.zRot = (float) (Math.sin(ageInTicks / 4) / 3);
		this.spore_vent_1.yRot = (float) (Math.sin(ageInTicks / 4) / 2);
		this.spore_vent_3.zRot = (float) (Math.sin(ageInTicks / 4) / 2.5);
		this.spore_vent_2.xRot = (float) (Math.sin(ageInTicks / 4) / 3);
		this.spore_vent_5.xRot = (float) (Math.sin(ageInTicks / 4) / 3.5);
		this.spore_vent_4.xRot = (float) (Math.sin(ageInTicks / 4) / 2.75);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spore_vent_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spore_vent_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spore_vent_3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spore_vent_4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spore_vent_5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spore_vent_6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
