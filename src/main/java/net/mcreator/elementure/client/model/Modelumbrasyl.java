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
public class Modelumbrasyl<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelumbrasyl"), "main");
	public final ModelPart head;

	public Modelumbrasyl(ModelPart root) {
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(406, 232).addBox(-40.0F, -19.0F, 15.0F, 80.0F, 30.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(411, 243).addBox(-40.0F, -54.0F, 27.0F, 80.0F, 20.0F, 34.0F, new CubeDeformation(0.0F)).texOffs(746, 205)
						.addBox(-24.0F, -12.0F, -57.0F, 48.0F, 24.0F, 91.0F, new CubeDeformation(0.0F)).texOffs(487, 0).addBox(26.0F, -14.0F, -13.0F, 10.0F, 30.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(487, 0)
						.addBox(24.0F, -12.0F, -31.0F, 10.0F, 30.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(487, 0).addBox(-34.0F, -12.0F, -31.0F, 10.0F, 30.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(487, 0)
						.addBox(-36.0F, -14.0F, -13.0F, 10.0F, 30.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.0F, 1.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(768, 0).addBox(-37.0F, -15.0F, -27.0F, 74.0F, 37.0F, 54.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, 25.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(487, 0).addBox(-5.0F, -10.0F, -10.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-25.0F, -10.0F, -22.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(487, 0).addBox(-5.0F, -10.0F, -10.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-27.0F, -12.0F, -4.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(487, 0).addBox(-11.0F, -3.0F, 6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(35.0F, -12.0F, -20.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(487, 0).addBox(-11.0F, -3.0F, -10.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.0F, -10.0F, -22.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(487, 0).addBox(-9.0F, -10.0F, -10.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-27.0F, 21.0F, -4.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(487, 0).addBox(-9.0F, -10.0F, -10.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-25.0F, 23.0F, -22.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(487, 0).addBox(-11.0F, -6.0F, -10.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.0F, 23.0F, -22.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(487, 0).addBox(-11.0F, -6.0F, 6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(35.0F, 21.0F, -20.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(746, 0).addBox(-19.5F, -16.0F, -8.5F, 39.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.5F, 26.5032F, -50.2048F, 0.5236F, -0.7418F, 0.2618F));
		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(746, 0).addBox(-19.5F, -16.0F, -8.5F, 39.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.5F, 26.5032F, -50.2048F, 0.5236F, 0.7418F, -0.2618F));
		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(487, 0).addBox(-6.0F, -26.0F, -5.0F, 12.0F, 56.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-27.0F, 20.0096F, -57.5F, 0.5236F, 0.8727F, 0.0F));
		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(487, 0).addBox(-6.0F, -26.0F, -5.0F, 12.0F, 56.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.0F, 20.0096F, -57.5F, 0.5236F, -0.8727F, 0.0F));
		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(487, 0).addBox(-6.0F, -33.0F, -11.0F, 12.0F, 40.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.0F, -50.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(746, 0).addBox(-18.0F, 0.0F, -38.0F, 36.0F, 24.0F, 72.0F, new CubeDeformation(0.0F)).texOffs(746, 0)
				.addBox(-24.0F, -16.0F, -51.0F, 48.0F, 18.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(746, 0).addBox(-31.0F, -16.0F, -34.0F, 62.0F, 32.0F, 46.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 22.0F, -9.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(746, 0).addBox(-20.0F, -27.0F, 27.0F, 40.0F, 26.0F, 66.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -20.5F, -30.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(746, 0).addBox(-16.0F, -18.0F, -35.0F, 32.0F, 26.0F, 67.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -20.5F, -30.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(487, 0).addBox(-6.0F, -19.0F, -6.0F, 12.0F, 32.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-38.0F, -8.5F, -42.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(487, 0).addBox(-6.0F, -19.0F, -6.0F, 12.0F, 32.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(38.0F, -8.5F, -42.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(487, 0).addBox(-6.0F, -15.0F, -6.0F, 12.0F, 32.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, -9.5F, -67.0F, -0.2618F, -0.3054F, 0.0F));
		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(487, 0).addBox(-6.0F, -15.0F, -6.0F, 12.0F, 32.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.0F, -9.5F, -67.0F, -0.2618F, 0.3054F, 0.0F));
		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(746, 0).addBox(-36.0F, -16.51F, -18.0F, 47.0F, 22.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, -51.0F, 0.0472F, 0.5668F, 0.0181F));
		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(746, 0).addBox(-11.0F, -16.5F, -18.0F, 47.0F, 22.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, -51.0F, 0.0472F, -0.5668F, -0.0181F));
		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(746, 0).addBox(-31.0F, -6.0F, -22.0F, 62.0F, 25.0F, 50.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -20.5F, -30.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(746, 0).addBox(-35.0F, -54.0F, -28.0F, 70.0F, 32.0F, 60.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, 25.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(406, 232).mirror().addBox(-7.0F, -11.0F, -17.0F, 12.0F, 22.0F, 50.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-37.0F, -4.0F, 47.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(406, 232).addBox(-5.0F, -11.0F, -17.0F, 12.0F, 22.0F, 50.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(37.0F, -4.0F, 47.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(406, 232).mirror().addBox(-12.0F, -9.0F, -29.0F, 16.0F, 16.0F, 60.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-26.2533F, -54.0601F, 111.3773F, 0.0873F, 0.0873F, 0.0F));
		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(406, 232).mirror().addBox(-28.0F, 3.0F, -17.0F, 20.0F, 20.0F, 68.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-31.0F, -45.0F, 60.0F, 0.3631F, -1.0648F, -0.2978F));
		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(406, 232).mirror().addBox(-10.0F, -10.0F, -17.0F, 20.0F, 20.0F, 68.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-31.0F, -47.0F, 60.0F, 0.1745F, -0.1309F, 0.0F));
		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(406, 232).addBox(-12.0F, -9.0F, -29.0F, 16.0F, 16.0F, 60.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(38.7467F, -54.0601F, 111.3773F, 0.0873F, -0.0873F, 0.0F));
		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(406, 232).addBox(9.0F, 3.0F, -17.0F, 20.0F, 20.0F, 68.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(34.0F, -45.0F, 60.0F, 0.3631F, 1.0648F, 0.2978F));
		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(406, 232).addBox(-10.0F, -10.0F, -17.0F, 20.0F, 20.0F, 68.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(34.0F, -47.0F, 60.0F, 0.1745F, 0.1309F, 0.0F));
		return LayerDefinition.create(meshdefinition, 1024, 320);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
	}
}
