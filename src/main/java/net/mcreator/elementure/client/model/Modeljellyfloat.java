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

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeljellyfloat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modeljellyfloat"), "main");
	public final ModelPart body;
	public final ModelPart tentacle_1;
	public final ModelPart tentacle_2;
	public final ModelPart tentacle_3;
	public final ModelPart tentacle_4;

	public Modeljellyfloat(ModelPart root) {
		this.body = root.getChild("body");
		this.tentacle_1 = body.getChild("tentacle_1");
		this.tentacle_2 = body.getChild("tentacle_2");
		this.tentacle_3 = body.getChild("tentacle_3");
		this.tentacle_4 = body.getChild("tentacle_4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -32.0F, -12.0F, 24.0F, 24.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
				.addBox(-13.0F, -16.0F, -13.0F, 26.0F, 10.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(32, 96).addBox(-12.0F, -6.0F, -12.0F, 24.0F, 8.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition l_wing_r1 = body.addOrReplaceChild("l_wing_r1", CubeListBuilder.create().texOffs(92, 0).addBox(-5.5F, -1.0F, -6.0F, 6.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, -29.0F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition r_wing_r1 = body.addOrReplaceChild("r_wing_r1", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-0.5F, -1.0F, -6.0F, 6.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-12.0F, -29.0F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition tentacle_1 = body.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-3.0F, -1.0F, -2.0F, 5.0F, 32.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(7.0F, -8.0F, -7.0F));
		PartDefinition tentacle_2 = body.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(0, 91).addBox(-4.0F, -1.0F, -1.0F, 5.0F, 32.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -8.0F, -8.0F));
		PartDefinition tentacle_3 = body.addOrReplaceChild("tentacle_3", CubeListBuilder.create(), PartPose.offset(-7.0F, -8.0F, 7.0F));
		PartDefinition cube_r1 = tentacle_3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 91).addBox(-2.5F, -17.0F, -2.5F, 5.0F, 32.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 16.0F, -0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition tentacle_4 = body.addOrReplaceChild("tentacle_4", CubeListBuilder.create(), PartPose.offset(7.0F, -8.0F, 7.0F));
		PartDefinition cube_r2 = tentacle_4.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-2.5F, -17.01F, -2.5F, 5.0F, 32.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, 16.01F, -0.5F, 0.0F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.tentacle_1.xRot = Mth.sin(ageInTicks / 4.f) / -6.f + 0.25f;
		this.tentacle_2.xRot = Mth.sin(ageInTicks / 4.f) / 6.f + 0.25f;
		this.tentacle_3.xRot = Mth.sin(ageInTicks / 4.f) / -6.f + 0.25f;
		this.tentacle_4.xRot = Mth.sin(ageInTicks / 4.f) / 6.f + 0.25f;
		this.body.setPos(0.f, 24.f + (float) Math.log(Math.sin(ageInTicks / 3.f) + 2.f) * 2.f, 0.f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
