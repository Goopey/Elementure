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
public class Modelruingranitelemental<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelruingranitelemental"), "main");
	public final ModelPart Crystal5;
	public final ModelPart Body6;
	public final ModelPart Body5;
	public final ModelPart Body4;
	public final ModelPart Body3;
	public final ModelPart Body2;
	public final ModelPart Ring;
	public final ModelPart Crystal4;
	public final ModelPart Crystal3;
	public final ModelPart Crystal2;
	public final ModelPart Crystal1;
	public final ModelPart Headmain;
	public final ModelPart LeftArmBone;
	public final ModelPart RightArmBone;
	public final ModelPart bb_main;

	public Modelruingranitelemental(ModelPart root) {
		this.Crystal5 = root.getChild("Crystal5");
		this.Body6 = root.getChild("Body6");
		this.Body5 = root.getChild("Body5");
		this.Body4 = root.getChild("Body4");
		this.Body3 = root.getChild("Body3");
		this.Body2 = root.getChild("Body2");
		this.Ring = root.getChild("Ring");
		this.Crystal4 = root.getChild("Crystal4");
		this.Crystal3 = root.getChild("Crystal3");
		this.Crystal2 = root.getChild("Crystal2");
		this.Crystal1 = root.getChild("Crystal1");
		this.Headmain = root.getChild("Headmain");
		this.LeftArmBone = root.getChild("LeftArmBone");
		this.RightArmBone = root.getChild("RightArmBone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Crystal5 = partdefinition.addOrReplaceChild("Crystal5", CubeListBuilder.create().texOffs(48, 0).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 14.0F, 3.1F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition Body6 = partdefinition.addOrReplaceChild("Body6", CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -2.01F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5F, -0.5F, -3.1416F, 0.7854F, 3.1416F));
		PartDefinition Body5 = partdefinition.addOrReplaceChild("Body5", CubeListBuilder.create().texOffs(56, 0).addBox(-1.99F, -2.0F, -1.99F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5F, -0.5F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition Body4 = partdefinition.addOrReplaceChild("Body4", CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5F, -0.5F, -2.3562F, 0.0F, -3.1416F));
		PartDefinition Body3 = partdefinition.addOrReplaceChild("Body3", CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5F, -0.5F, -3.1416F, 0.0F, 2.3562F));
		PartDefinition Body2 = partdefinition.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1F, 0.0F, 2.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 4.5F, 3.5F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition Ring = partdefinition.addOrReplaceChild("Ring", CubeListBuilder.create().texOffs(84, 0).addBox(-11.0F, 0.0F, 0.0F, 11.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5F, 12.8F, 4.5F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition Crystal4 = partdefinition.addOrReplaceChild("Crystal4", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, 0.0F, -2.0F, 0.0F, 13.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, 14.5F, 1.5F, 3.1416F, 0.0F, -2.7773F));
		PartDefinition Crystal3 = partdefinition.addOrReplaceChild("Crystal3", CubeListBuilder.create().texOffs(44, 24).addBox(-8.3F, 0.0F, 0.0F, 9.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8F, 14.5F, -3.5F, 2.7773F, 0.0F, 3.1416F));
		PartDefinition Crystal2 = partdefinition.addOrReplaceChild("Crystal2", CubeListBuilder.create().texOffs(20, 24).mirror().addBox(-8.3F, 0.0F, 0.0F, 9.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.8F, 14.5F, 3.5F, -2.7773F, 0.0F, 3.1416F));
		PartDefinition Crystal1 = partdefinition.addOrReplaceChild("Crystal1", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, 0.0F, -2.0F, 0.0F, 13.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, 14.5F, 1.5F, -3.1416F, 0.0F, 2.7773F));
		PartDefinition Headmain = partdefinition.addOrReplaceChild("Headmain", CubeListBuilder.create().texOffs(100, 16).addBox(-3.0F, -4.5F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.5F, 0.0F));
		PartDefinition HeadBottom = Headmain.addOrReplaceChild("HeadBottom", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2276F, 0.0F, 0.0F));
		PartDefinition HeadTop = Headmain.addOrReplaceChild("HeadTop", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.9F, 0.0F, -0.3187F, 0.0F, 0.0F));
		PartDefinition HeadMinor = Headmain.addOrReplaceChild("HeadMinor", CubeListBuilder.create().texOffs(50, 0).addBox(-3.5F, -2.0F, -4.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 1.5F));
		PartDefinition LeftArmBone = partdefinition.addOrReplaceChild("LeftArmBone", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6618F, 3.3813F, 0.0F, -3.1416F, 0.0F, -3.1416F));
		PartDefinition LeftArm = LeftArmBone.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9F, 1.8F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1F, -4.4F, 0.0F));
		PartDefinition RightArmBone = partdefinition.addOrReplaceChild("RightArmBone", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5596F, 3.3648F, 0.0F, 0.0F, 0.0F, 0.003F));
		PartDefinition RightArm = RightArmBone.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.2F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1F, 0.6F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -27.5F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Body1_r1 = bb_main.addOrReplaceChild("Body1_r1", CubeListBuilder.create().texOffs(0, 0).addBox(2.5F, -19.4F, 3.5F, 2.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition ChestLeft_r1 = bb_main.addOrReplaceChild("ChestLeft_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.1F, -2.5F, -4.0F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7364F, -21.6879F, 0.0F, -3.1416F, 0.0F, 2.9596F));
		PartDefinition Shoulderleft_r1 = bb_main.addOrReplaceChild("Shoulderleft_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.1F, -0.7F, -4.0F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.8553F, -24.8874F, 0.0F, -3.1416F, 0.0F, -2.0944F));
		PartDefinition ChestRight_r1 = bb_main.addOrReplaceChild("ChestRight_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.5F, -4.0F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5625F, -22.516F, 0.0F, 0.0F, 0.0F, 0.185F));
		PartDefinition Shoulderright_r1 = bb_main.addOrReplaceChild("Shoulderright_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.2F, -0.7F, -4.0F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6902F, -24.9998F, 0.0F, 0.0F, 0.0F, -1.0442F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Crystal5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Crystal4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Crystal3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Crystal2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Crystal1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Headmain.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArmBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArmBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftArmBone.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightArmBone.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Headmain.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Headmain.xRot = headPitch / (180F / (float) Math.PI);
	}
}
