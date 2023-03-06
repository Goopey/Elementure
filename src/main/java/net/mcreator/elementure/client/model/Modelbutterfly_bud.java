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
public class Modelbutterfly_bud<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelbutterfly_bud"), "main");
	public final ModelPart body;
	public final ModelPart body2;
	public final ModelPart head;
	public final ModelPart wingleft1bone;
	public final ModelPart wingleft2bone;
	public final ModelPart wingright1bone;
	public final ModelPart wingright2bone;

	public Modelbutterfly_bud(ModelPart root) {
		this.body = root.getChild("body");
		this.body2 = body.getChild("body2");
		this.head = body2.getChild("head");
		this.wingleft1bone = body.getChild("wingleft1bone");
		this.wingleft2bone = body.getChild("wingleft2bone");
		this.wingright1bone = body.getChild("wingright1bone");
		this.wingright2bone = body.getChild("wingright2bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 0.0F));
		PartDefinition wingright1bone = body.addOrReplaceChild("wingright1bone", CubeListBuilder.create(), PartPose.offset(-2.5F, -0.25F, -2.5F));
		PartDefinition wingright1 = wingright1bone.addOrReplaceChild("wingright1", CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, 0.0F, -3.5F, 14.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition wingright2bone = body.addOrReplaceChild("wingright2bone", CubeListBuilder.create(), PartPose.offset(-2.5F, 0.25F, -1.0F));
		PartDefinition wingright2 = wingright2bone.addOrReplaceChild("wingright2", CubeListBuilder.create().texOffs(0, 8).addBox(-8.0F, 0.0F, -1.0F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition wingleft1bone = body.addOrReplaceChild("wingleft1bone", CubeListBuilder.create(), PartPose.offset(2.5F, -0.25F, -2.5F));
		PartDefinition wingleft1 = wingleft1bone.addOrReplaceChild("wingleft1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, -1.0F, -3.5F, 14.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition wingleft2bone = body.addOrReplaceChild("wingleft2bone", CubeListBuilder.create(), PartPose.offset(2.5F, 0.25F, -1.0F));
		PartDefinition wingleft2 = wingleft2bone.addOrReplaceChild("wingleft2", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(0.0F, 0.0F, -1.0F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition body1 = body.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(46, 11).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(20, 60)
				.addBox(1.5F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 60).addBox(-2.5F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition body3 = body1.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(52, 23).addBox(-1.5F, -1.5F, 0.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(44, 0).addBox(-2.5F, -2.65F, -2.65F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(20, 60)
				.addBox(2.0F, 1.25F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 60).addBox(-3.0F, 1.25F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition head = body2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(54, 53).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(43, 61)
				.addBox(-0.5F, 0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 53).addBox(0.0F, 0.5F, -2.9F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.65F, 0.0873F, 0.0F, 0.0F));
		PartDefinition antennae1 = head.addOrReplaceChild("antennae1", CubeListBuilder.create().texOffs(35, 58).addBox(-0.25F, -2.42F, -2.85F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.25F, -1.25F, -1.5F, 0.5236F, -0.48F, 0.1309F));
		PartDefinition antennae2 = head.addOrReplaceChild("antennae2", CubeListBuilder.create().texOffs(26, 58).addBox(0.25F, -2.42F, -2.85F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.25F, -1.25F, -1.5F, 0.5236F, 0.48F, -0.1309F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.wingleft1bone.zRot = Mth.sin(ageInTicks / 2.f) / -6.f;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.wingright1bone.zRot = Mth.sin(ageInTicks / 2.f) / 6.f;
		this.wingright2bone.zRot = Mth.sin(ageInTicks / 2.f) / 6.f;
		this.wingleft2bone.zRot = Mth.sin(ageInTicks / 2.f) / -6.f;
		// this.body.setPos(0.f, 0.f, 0.f);
		// this.body.setRot(0.f, 0.f, 0.f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
