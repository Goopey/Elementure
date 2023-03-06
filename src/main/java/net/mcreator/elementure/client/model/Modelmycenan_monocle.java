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
public class Modelmycenan_monocle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelmycenan_monocle"), "main");
	public final ModelPart Monocle;

	public Modelmycenan_monocle(ModelPart root) {
		this.Monocle = root.getChild("Monocle");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Monocle = partdefinition.addOrReplaceChild("Monocle",
				CubeListBuilder.create().texOffs(32, 0).addBox(1.0F, -6.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 2).addBox(1.0F, -2.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(0.0F, -5.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 0).addBox(4.0F, -5.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 0)
						.addBox(4.01F, -6.0F, -4.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 4).addBox(1.0F, -5.0F, -4.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Monocle.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
