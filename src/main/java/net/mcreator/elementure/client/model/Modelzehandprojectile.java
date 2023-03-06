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
public class Modelzehandprojectile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelzehandprojectile"), "main");
	public final ModelPart main;
	public final ModelPart thumbmain;
	public final ModelPart shape4;
	public final ModelPart shape7;
	public final ModelPart shape10;
	public final ModelPart shape13;

	public Modelzehandprojectile(ModelPart root) {
		this.main = root.getChild("main");
		this.thumbmain = root.getChild("thumbmain");
		this.shape4 = root.getChild("shape4");
		this.shape7 = root.getChild("shape7");
		this.shape10 = root.getChild("shape10");
		this.shape13 = root.getChild("shape13");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -7.0F, -1.5F, 14.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.9F, 0.0F, 0.182F, 0.0F, 0.0F));
		PartDefinition thumbmain = partdefinition.addOrReplaceChild("thumbmain", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -6.0F, -1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 22.1F, 0.0F, 0.8652F, -0.5009F, 0.0F));
		PartDefinition thumbminor = thumbmain.addOrReplaceChild("thumbminor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, -0.7285F, -0.8652F, 0.0F));
		PartDefinition shape4 = partdefinition.addOrReplaceChild("shape4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -6.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2F, 8.0F, -0.9F, 0.4098F, 0.0F, 0.0F));
		PartDefinition shape5 = shape4.addOrReplaceChild("shape5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.2F, 0.0F, 0.4098F, 0.0F, 0.0F));
		PartDefinition shape6 = shape5.addOrReplaceChild("shape6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.3643F, 0.0F, 0.0F));
		PartDefinition shape7 = partdefinition.addOrReplaceChild("shape7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -7.0F, -1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7F, 8.0F, -0.9F, 0.4098F, 0.0F, 0.0F));
		PartDefinition shape8 = shape7.addOrReplaceChild("shape8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -6.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.2F, 0.0F, 0.4098F, 0.0F, 0.0F));
		PartDefinition shape9 = shape8.addOrReplaceChild("shape9", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.3643F, 0.0F, 0.0F));
		PartDefinition shape10 = partdefinition.addOrReplaceChild("shape10", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -7.0F, -1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 8.0F, -0.9F, 0.4098F, 0.0F, 0.0F));
		PartDefinition shape11 = shape10.addOrReplaceChild("shape11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.2F, 0.0F, 0.4098F, 0.0F, 0.0F));
		PartDefinition shape12 = shape11.addOrReplaceChild("shape12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.3643F, 0.0F, 0.0F));
		PartDefinition shape13 = partdefinition.addOrReplaceChild("shape13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2F, 8.0F, -0.9F, 0.4098F, 0.0F, 0.0F));
		PartDefinition shape14 = shape13.addOrReplaceChild("shape14", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.2F, 0.0F, 0.4098F, 0.0F, 0.0F));
		PartDefinition shape15 = shape14.addOrReplaceChild("shape15", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2F, -12.0F, 0.9F, 0.3643F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		thumbmain.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		shape4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		shape7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		shape10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		shape13.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
