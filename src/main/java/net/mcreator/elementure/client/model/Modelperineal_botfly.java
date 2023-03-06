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
public class Modelperineal_botfly<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelperineal_botfly"), "main");
	public final ModelPart body;
	public final ModelPart wing1;
	public final ModelPart wing2;

	public Modelperineal_botfly(ModelPart root) {
		this.body = root.getChild("body");
		this.wing1 = body.getChild("wing1");
		this.wing2 = body.getChild("wing2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
				.addBox(-3.5F, 4.0F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, -2.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition eye2_r1 = body.addOrReplaceChild("eye2_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, -4.5F, 0.0F, 0.0F, -3.1416F));
		PartDefinition wing1 = body.addOrReplaceChild("wing1", CubeListBuilder.create().texOffs(15, 17).addBox(-6.0F, 0.0F, -2.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -4.0F, 0.0F));
		PartDefinition wing2 = body.addOrReplaceChild("wing2", CubeListBuilder.create().texOffs(15, 17).mirror().addBox(0.0F, 0.0F, -2.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(4.0F, -4.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.body.setPos(0.f, 16F + (float) Math.cos((ageInTicks + 2F) / 3.f) / 1.5F, 0.f);
		this.wing1.zRot = (float) Math.sin(ageInTicks / 4.f) / 2.f;
		this.wing2.zRot = (float) Math.sin(ageInTicks / -4.f) / 2.f;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
