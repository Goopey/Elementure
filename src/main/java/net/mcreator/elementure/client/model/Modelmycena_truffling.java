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
public class Modelmycena_truffling<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelmycena_truffling"), "main");
	public final ModelPart body;

	public Modelmycena_truffling(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.15F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.5F, -2.85F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, -2.84F, -1.5F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.5F, -3.15F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -8.15F, -4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -8.14F, -4.5F, 6.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.5F, -6.44F, -4.51F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.5F, -5.76F, -4.49F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.5F, -8.14F, -3.0F, 9.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.49F, -6.44F, -2.5F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.51F, -5.76F, -1.5F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(20, 52).addBox(-5.5F, -1.0F, -5.5F, 11.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(32, 40).addBox(-2.5F, -1.5F, -5.51F, 5.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(32, 34)
						.addBox(-5.49F, -1.49F, -2.5F, 11.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-5.0F, -1.85F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(28, 21)
						.addBox(-4.5F, -2.25F, -4.5F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(1, 51).addBox(-3.5F, -2.65F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.15F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
