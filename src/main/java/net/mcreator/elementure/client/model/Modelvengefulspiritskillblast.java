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
public class Modelvengefulspiritskillblast<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("elementure", "modelvengefulspiritskillblast"), "main");
	public final ModelPart MainBody;

	public Modelvengefulspiritskillblast(ModelPart root) {
		this.MainBody = root.getChild("MainBody");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition MainBody = partdefinition.addOrReplaceChild("MainBody",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -6.0F, -15.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition Tail5 = MainBody.addOrReplaceChild("Tail5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.8F, -1.0F, 1.0F));
		PartDefinition Tail6 = MainBody.addOrReplaceChild("Tail6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.7F, -3.7F, 1.0F));
		PartDefinition MinorBody = MainBody.addOrReplaceChild("MinorBody",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -5.5F, -6.5F, 11.0F, 11.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -9.0F));
		PartDefinition Tail1 = MainBody.addOrReplaceChild("Tail1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.2F, -4.0F, 1.0F));
		PartDefinition TailBase = MainBody.addOrReplaceChild("TailBase",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 2.0F));
		PartDefinition Tail3 = MainBody.addOrReplaceChild("Tail3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.4F, 3.4F, 1.0F));
		PartDefinition TailBaseMain = MainBody.addOrReplaceChild("TailBaseMain",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -4.5F, 0.0F, 9.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.9F));
		PartDefinition Tail9 = MainBody.addOrReplaceChild("Tail9",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.8F, -3.2F, -1.0F));
		PartDefinition Tail13 = MainBody.addOrReplaceChild("Tail13",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.4F, 1.0F, 1.0F));
		PartDefinition Tail4 = MainBody.addOrReplaceChild("Tail4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 2.0F, 1.0F));
		PartDefinition Tail7 = MainBody.addOrReplaceChild("Tail7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 3.2F, 1.0F));
		PartDefinition Tail11 = MainBody.addOrReplaceChild("Tail11",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 25.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.6F, 0.6F, 1.0F));
		PartDefinition Tail8 = MainBody.addOrReplaceChild("Tail8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.8F, 0.0F, -1.0F));
		PartDefinition TailBaseMinor = MainBody.addOrReplaceChild("TailBaseMinor",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 2.5F));
		PartDefinition Face = MainBody.addOrReplaceChild("Face",
				CubeListBuilder.create().texOffs(73, 0).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -11.0F));
		PartDefinition BodySides = MainBody.addOrReplaceChild("BodySides",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.5F, -5.5F, -5.5F, 13.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -9.0F));
		PartDefinition Tail12 = MainBody.addOrReplaceChild("Tail12",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.1F, -4.0F, -1.0F));
		PartDefinition Bodytops = MainBody.addOrReplaceChild("Bodytops",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -6.5F, -5.5F, 11.0F, 13.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -9.0F));
		PartDefinition Tail2 = MainBody.addOrReplaceChild("Tail2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.1F, -1.9F, 1.0F));
		PartDefinition Tail10 = MainBody.addOrReplaceChild("Tail10",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.3F, 3.7F, 1.0F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		MainBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
