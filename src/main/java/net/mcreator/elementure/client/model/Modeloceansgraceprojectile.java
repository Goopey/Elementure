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
public class Modeloceansgraceprojectile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modeloceansgraceprojectile"), "main");
	public final ModelPart Rod;

	public Modeloceansgraceprojectile(ModelPart root) {
		this.Rod = root.getChild("Rod");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Rod = partdefinition.addOrReplaceChild("Rod", CubeListBuilder.create().texOffs(4, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition RodTop = Rod.addOrReplaceChild("RodTop", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Conduit = RodTop.addOrReplaceChild("Conduit", CubeListBuilder.create().texOffs(40, 0).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition SpearCenter = Conduit.addOrReplaceChild("SpearCenter", CubeListBuilder.create().texOffs(0, 80).addBox(-1.0F, -1.0F, -12.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition SpearExtension = Conduit.addOrReplaceChild("SpearExtension", CubeListBuilder.create().texOffs(0, 36).addBox(-5.0F, -1.0F, -1.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.6F));
		PartDefinition SpearLeft = SpearExtension.addOrReplaceChild("SpearLeft", CubeListBuilder.create().texOffs(48, 56).addBox(-1.0F, -1.0F, -16.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, 3.0F));
		PartDefinition SpearRight = SpearExtension.addOrReplaceChild("SpearRight", CubeListBuilder.create().texOffs(0, 56).addBox(-1.0F, -1.0F, -16.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 0.0F, 3.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Rod.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
