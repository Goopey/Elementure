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
public class Modelwaterblastskillprojectile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("elementure", "modelwaterblastskillprojectile"), "main");
	public final ModelPart Main1;
	public final ModelPart Main2;
	public final ModelPart Main3;

	public Modelwaterblastskillprojectile(ModelPart root) {
		this.Main1 = root.getChild("Main1");
		this.Main2 = root.getChild("Main2");
		this.Main3 = root.getChild("Main3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Main1 = partdefinition.addOrReplaceChild("Main1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -1.5F, -1.5F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Minor1 = Main1.addOrReplaceChild("Minor1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -3.5F, -1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Side1 = Main1.addOrReplaceChild("Side1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -3.5F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Center = Main1.addOrReplaceChild("Center",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Main2 = partdefinition.addOrReplaceChild("Main2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.5F, 5.8F, 4.1F));
		PartDefinition Minor2 = Main2.addOrReplaceChild("Minor2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Side2 = Main2.addOrReplaceChild("Side2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -1.5F, -1.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Main3 = partdefinition.addOrReplaceChild("Main3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.2F, 4.1F, 7.3F));
		PartDefinition Side3 = Main3.addOrReplaceChild("Side3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Minor3 = Main3.addOrReplaceChild("Minor3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Main1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Main2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Main3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
