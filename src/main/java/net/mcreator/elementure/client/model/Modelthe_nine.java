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
public class Modelthe_nine<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelthe_nine"), "main");
	public final ModelPart main;
	public final ModelPart eye_easteregg;

	public Modelthe_nine(ModelPart root) {
		this.main = root.getChild("main");
		this.eye_easteregg = main.getChild("eye_easteregg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, 0.0F));
		PartDefinition eye_1 = main.addOrReplaceChild("eye_1",
				CubeListBuilder.create().texOffs(0, 0).addBox(5.0F, -6.0F, 3.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(5.0F, -5.5F, 2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 56)
						.addBox(4.5F, -5.5F, 3.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition eye_2 = main.addOrReplaceChild("eye_2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -8.0F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-7.0F, -7.5F, -1.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 56)
						.addBox(-7.5F, -7.5F, -1.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition eye_3 = main.addOrReplaceChild("eye_3",
				CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, -6.5F, -6.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(2.0F, -6.0F, -6.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 56)
						.addBox(1.5F, -6.0F, -6.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition eye_4 = main.addOrReplaceChild("eye_4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -10.5F, 4.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-1.0F, -10.0F, 3.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 56)
						.addBox(-1.5F, -10.0F, 4.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition eye_5 = main.addOrReplaceChild("eye_5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -10.5F, -8.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-5.0F, -10.0F, -8.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 56)
						.addBox(-5.5F, -10.0F, -8.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition eye_6 = main.addOrReplaceChild("eye_6",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -12.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(0.0F, -12.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 56)
						.addBox(-0.5F, -12.0F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition eye_7 = main.addOrReplaceChild("eye_7",
				CubeListBuilder.create().texOffs(0, 0).addBox(4.0F, -14.5F, -8.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(4.0F, -14.0F, -8.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 56)
						.addBox(3.5F, -14.0F, -8.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition eye_8 = main.addOrReplaceChild("eye_8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -15.5F, 2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-7.0F, -15.0F, 1.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 56)
						.addBox(-7.5F, -15.0F, 2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition eye_9 = main.addOrReplaceChild("eye_9",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -18.5F, -3.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-2.0F, -18.0F, -3.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 56)
						.addBox(-2.5F, -18.0F, -3.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition eye_easteregg = main.addOrReplaceChild("eye_easteregg",
				CubeListBuilder.create().texOffs(56, 0).addBox(0.0F, -3.0F, -2.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(2.0F, 3.0F, -6.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-5.0F, -1.0F, -8.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-7.0F, 1.5F, -1.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-1.0F, -1.0F, 4.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(5.0F, -4.5F, 3.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(4.0F, -5.0F, -8.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-2.0F, -9.0F, -3.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-7.0F, -6.0F, 2.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		if ((entity.getPersistentData().getDouble("eye_timer")) > 0) {
			eye_easteregg.setPos(0.0F, 1.0F, 1.0F);
		} else {
			eye_easteregg.setPos(0.0F, 1.0F, 0.0F);
		}
		main.setPos(0.0F, (14.0F + (float) (Math.sin(ageInTicks / 8) / 6)), 0.0F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
