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
public class Modelcandle_knight<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelcandle_knight"), "main");
	public final ModelPart legs;
	public final ModelPart candles;
	public final ModelPart right_arm;
	public final ModelPart left_arm;
	public final ModelPart head;
	public final ModelPart bb_main;

	public Modelcandle_knight(ModelPart root) {
		this.legs = root.getChild("legs");
		this.candles = root.getChild("candles");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.head = root.getChild("head");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition legs = partdefinition.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition legs_r1 = legs.addOrReplaceChild("legs_r1",
				CubeListBuilder.create().texOffs(67, 16).addBox(-4.5F, 0.0F, -2.0F, 9.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -3.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition candles = partdefinition.addOrReplaceChild("candles", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition candle_1 = candles.addOrReplaceChild("candle_1",
				CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-1.0F, -6.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 2).mirror()
						.addBox(-2.0F, -6.0F, 1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-7.0F, -7.0F, 6.0F));
		PartDefinition candle_5 = candles.addOrReplaceChild("candle_5",
				CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-1.0F, -6.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 2)
						.addBox(-2.0F, -6.0F, 1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(12.0F, -20.0F, -11.0F));
		PartDefinition candle_6 = candles.addOrReplaceChild("candle_6",
				CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-1.0F, -6.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 2)
						.addBox(-2.0F, -6.0F, 1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -14.0F, -8.0F));
		PartDefinition candle_7 = candles.addOrReplaceChild("candle_7",
				CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-1.0F, -6.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 2)
						.addBox(-2.0F, -6.0F, 1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, -26.0F, 13.0F));
		PartDefinition candle_8 = candles.addOrReplaceChild("candle_8",
				CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-1.0F, -6.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 2)
						.addBox(-2.0F, -6.0F, 1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.0F, -9.0F, 4.0F));
		PartDefinition candle_9 = candles.addOrReplaceChild("candle_9",
				CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-1.0F, -6.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 2)
						.addBox(-2.0F, -6.0F, 1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, -20.0F, -9.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(48, 16).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(-4.01F, -0.5F, -2.01F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 54)
						.addBox(-4.51F, -2.5F, -2.51F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 0.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(48, 16).mirror().addBox(0.0F, 0.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 59).mirror().addBox(3.01F, -0.5F, -2.01F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(64, 54).mirror().addBox(-0.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 0.0F, 0.0F));
		PartDefinition sword_r1 = left_arm.addOrReplaceChild("sword_r1",
				CubeListBuilder.create().texOffs(96, 32).addBox(0.0F, -10.0F, -10.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 13.2426F, -5.6569F, 2.3562F, 0.0F, -3.1416F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(24, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 46)
						.addBox(-4.5F, -8.5F, -4.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(88, 23)
						.addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition candle_2 = head.addOrReplaceChild("candle_2",
				CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-1.0F, -6.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 2).mirror()
						.addBox(-2.0F, -6.0F, 1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(4.0F, -7.0F, 2.0F));
		PartDefinition candle_3 = head.addOrReplaceChild("candle_3",
				CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-1.0F, -6.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 2)
						.addBox(-2.0F, -6.0F, 1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, -6.0F, -2.0F));
		PartDefinition candle_4 = head.addOrReplaceChild("candle_4",
				CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-1.0F, -6.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 2)
						.addBox(-2.0F, -6.0F, 1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, -6.0F, -6.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -19.0F, -2.0F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-5.0F, -24.0F, -2.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(-4.0F, -24.0F, -2.5F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-3.0F, -19.0F, -2.5F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(2, 23)
						.addBox(-2.0F, -14.0F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.candles.setPos(0F, (float) Math.sin(ageInTicks / 4.f) / 2.f + 24.f, 0F);
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.legs.xRot = (float) Math.sin(ageInTicks / 20.f) / 4.f + 0.2F;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		candles.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
