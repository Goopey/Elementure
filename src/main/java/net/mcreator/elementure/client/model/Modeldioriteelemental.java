package net.mcreator.elementure.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class Modeldioriteelemental<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modeldioriteelemental"),
			"main");
	public final ModelPart Head;
	public final ModelPart ShoulderLeft;
	public final ModelPart ShoulderRight;
	public final ModelPart BodyAll;

	public Modeldioriteelemental(ModelPart root) {
		this.Head = root.getChild("Head");
		this.ShoulderLeft = root.getChild("ShoulderLeft");
		this.ShoulderRight = root.getChild("ShoulderRight");
		this.BodyAll = root.getChild("BodyAll");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(100, 0).addBox(-3.5F, -3.5F, -3.52F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -9.2F, 0.0F));
		PartDefinition ring_tot_2 = Head.addOrReplaceChild("ring_tot_2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 33.2F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Ring5 = ring_tot_2.addOrReplaceChild("Ring5",
				CubeListBuilder.create().texOffs(50, 24).addBox(-1.5F, -1.5F, -4.5F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, -30.4F, 0.0F));
		PartDefinition Ring6 = ring_tot_2.addOrReplaceChild("Ring6",
				CubeListBuilder.create().texOffs(50, 12).addBox(-1.5F, -1.5F, -4.5F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, -30.4F, 0.0F));
		PartDefinition Ring7 = ring_tot_2.addOrReplaceChild("Ring7",
				CubeListBuilder.create().texOffs(76, 0).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -30.4F, -3.0F, 0.0F, -1.5708F, -0.0098F));
		PartDefinition Ring8 = ring_tot_2.addOrReplaceChild("Ring8",
				CubeListBuilder.create().texOffs(76, 8).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -30.4F, 3.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition ShoulderLeft = partdefinition.addOrReplaceChild("ShoulderLeft",
				CubeListBuilder.create().texOffs(36, 0).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.4F, -3.7F, 0.0F));
		PartDefinition LeftArm = ShoulderLeft.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition ShoulderRight = partdefinition.addOrReplaceChild("ShoulderRight",
				CubeListBuilder.create().texOffs(36, 0).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.4F, -3.7F, 0.0F));
		PartDefinition RightArm = ShoulderRight.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition BodyAll = partdefinition.addOrReplaceChild("BodyAll",
				CubeListBuilder.create().texOffs(39, 0).addBox(-2.0F, -24.4F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Body2 = BodyAll.addOrReplaceChild("Body2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.59F, -5.0F, -3.51F, 8.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.9F, 0.0F, 0.0F, 0.0F, -0.3187F));
		PartDefinition Body3 = BodyAll.addOrReplaceChild("Body3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.4F, -5.0F, -3.5F, 8.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.9F, 0.0F, 0.0F, 0.0F, 0.3187F));
		PartDefinition Body4 = BodyAll.addOrReplaceChild("Body4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -23.6F, 0.0F, 0.0F, 0.0F, 0.0911F));
		PartDefinition Body5 = BodyAll.addOrReplaceChild("Body5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -23.6F, 0.0F, 0.0F, 0.0F, -0.0911F));
		PartDefinition Heart = BodyAll.addOrReplaceChild("Heart",
				CubeListBuilder.create().texOffs(40, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -15.1F, 0.0F));
		PartDefinition ring_tot_1 = BodyAll.addOrReplaceChild("ring_tot_1", CubeListBuilder.create(), PartPose.offset(3.5F, -11.4F, 0.0F));
		PartDefinition Ring1 = ring_tot_1.addOrReplaceChild("Ring1",
				CubeListBuilder.create().texOffs(50, 24).addBox(-1.5F, -1.5F, -4.5F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Ring2 = ring_tot_1.addOrReplaceChild("Ring2",
				CubeListBuilder.create().texOffs(50, 12).addBox(-1.5F, -1.5F, -4.5F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, 0.0F, 0.0F));
		PartDefinition Ring3 = ring_tot_1.addOrReplaceChild("Ring3",
				CubeListBuilder.create().texOffs(76, 0).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.0F, -3.0F, 0.0F, -1.5708F, -0.0098F));
		PartDefinition Ring4 = ring_tot_1.addOrReplaceChild("Ring4",
				CubeListBuilder.create().texOffs(76, 8).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.0F, 3.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Crystal1 = BodyAll.addOrReplaceChild("Crystal1",
				CubeListBuilder.create().texOffs(20, 32).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 9.0F, 0.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -10.4F, -3.3F, 0.4098F, 0.0F, 0.0F));
		PartDefinition Crystal2 = BodyAll.addOrReplaceChild("Crystal2",
				CubeListBuilder.create().texOffs(0, 32).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 9.0F, 0.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -10.4F, 3.3F, -0.4098F, 0.0F, 0.0F));
		PartDefinition Crystal3 = BodyAll.addOrReplaceChild("Crystal3",
				CubeListBuilder.create().texOffs(20, 36).addBox(0.0F, 0.0F, -4.0F, 0.0F, 9.0F, 8.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-3.3F, -10.4F, 0.0F, 0.0F, 0.0F, -0.4098F));
		PartDefinition Crystal4 = BodyAll.addOrReplaceChild("Crystal4",
				CubeListBuilder.create().texOffs(0, 36).addBox(0.0F, 0.0F, -4.0F, 0.0F, 9.0F, 8.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(3.3F, -10.4F, 0.0F, 0.0F, 0.0F, 0.4098F));
		PartDefinition Body6 = BodyAll.addOrReplaceChild("Body6",
				CubeListBuilder.create().texOffs(39, 0).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -18.2F, 0.0F));
		PartDefinition Crystal5 = BodyAll.addOrReplaceChild("Crystal5",
				CubeListBuilder.create().texOffs(-8, 56).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, -12.4F, 0.0F));
		PartDefinition Body7 = BodyAll.addOrReplaceChild("Body7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, -2.5F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -28.5F, 0.0F, 0.0F, 0.0F, 0.5009F));
		PartDefinition Body8 = BodyAll.addOrReplaceChild("Body8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, -2.5F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -28.5F, 0.0F, 0.0F, 0.0F, -0.5009F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ShoulderLeft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ShoulderRight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BodyAll.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.ShoulderLeft.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.ShoulderRight.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
