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

// Made with Blockbench 4.6.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelslumberingGeneral<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelslumbering_general"),
			"main");
	public final ModelPart bone;
	public final ModelPart eye_tentacle_1;
	public final ModelPart off_rot;
	public final ModelPart eye_tentacle_11;
	public final ModelPart eye_tentacle_111;
	public final ModelPart eye_tentacle_2;
	public final ModelPart off_rot2;
	public final ModelPart eye_tentacle_3;
	public final ModelPart eye_tentacle_4;
	public final ModelPart leg_1;
	public final ModelPart leg_2;
	public final ModelPart leg_3;
	public final ModelPart leg_4;
	public final ModelPart leg_5;
	public final ModelPart leg_6;
	public final ModelPart leg_7;
	public final ModelPart leg_8;
	public final ModelPart leg_9;
	public final ModelPart leg_10;
	public final ModelPart leg_11;
	public final ModelPart leg_12;
	public final ModelPart leg_13;
	public final ModelPart leg_14;
	public final ModelPart eye_tentacle_5;
	public final ModelPart off_rot3;
	public final ModelPart eye_tentacle_6;
	public final ModelPart eye_tentacle_7;
	public final ModelPart eye_tentacle_8;
	public final ModelPart off_rot4;
	public final ModelPart eye_tentacle_9;
	public final ModelPart eye_tentacle_10;
	public final ModelPart eye_tentacle_12;
	public final ModelPart off_rot5;
	public final ModelPart eye_tentacle_13;
	public final ModelPart eye_tentacle_14;
	public final ModelPart eye_tentacle_15;
	public final ModelPart off_rot6;
	public final ModelPart eye_tentacle_16;
	public final ModelPart eye_tentacle_17;
	public final ModelPart eye_tentacle_18;
	public final ModelPart off_rot7;
	public final ModelPart eye_tentacle_19;
	public final ModelPart eye_tentacle_20;
	public final ModelPart bb_main;

	public ModelslumberingGeneral(ModelPart root) {
		this.bone = root.getChild("bone");
		this.eye_tentacle_1 = root.getChild("eye_tentacle_1");
		this.off_rot = eye_tentacle_1.getChild("off_rot");
		this.eye_tentacle_11 = off_rot.getChild("eye_tentacle_11");
		this.eye_tentacle_111 = eye_tentacle_11.getChild("eye_tentacle_111");
		this.eye_tentacle_2 = root.getChild("eye_tentacle_2");
		this.off_rot2 = eye_tentacle_2.getChild("off_rot2");
		this.eye_tentacle_3 = off_rot2.getChild("eye_tentacle_3");
		this.eye_tentacle_4 = eye_tentacle_3.getChild("eye_tentacle_4");
		this.leg_1 = root.getChild("leg_1");
		this.leg_2 = root.getChild("leg_2");
		this.leg_3 = root.getChild("leg_3");
		this.leg_4 = root.getChild("leg_4");
		this.leg_5 = root.getChild("leg_5");
		this.leg_6 = root.getChild("leg_6");
		this.leg_7 = root.getChild("leg_7");
		this.leg_8 = root.getChild("leg_8");
		this.leg_9 = root.getChild("leg_9");
		this.leg_10 = root.getChild("leg_10");
		this.leg_11 = root.getChild("leg_11");
		this.leg_12 = root.getChild("leg_12");
		this.leg_13 = root.getChild("leg_13");
		this.leg_14 = root.getChild("leg_14");
		this.eye_tentacle_5 = root.getChild("eye_tentacle_5");
		this.off_rot3 = eye_tentacle_5.getChild("off_rot3");
		this.eye_tentacle_6 = off_rot3.getChild("eye_tentacle_6");
		this.eye_tentacle_7 = eye_tentacle_6.getChild("eye_tentacle_7");
		this.eye_tentacle_8 = root.getChild("eye_tentacle_8");
		this.off_rot4 = eye_tentacle_8.getChild("off_rot4");
		this.eye_tentacle_9 = off_rot4.getChild("eye_tentacle_9");
		this.eye_tentacle_10 = eye_tentacle_9.getChild("eye_tentacle_10");
		this.eye_tentacle_12 = root.getChild("eye_tentacle_12");
		this.off_rot5 = eye_tentacle_12.getChild("off_rot5");
		this.eye_tentacle_13 = off_rot5.getChild("eye_tentacle_13");
		this.eye_tentacle_14 = eye_tentacle_13.getChild("eye_tentacle_14");
		this.eye_tentacle_15 = root.getChild("eye_tentacle_15");
		this.off_rot6 = eye_tentacle_15.getChild("off_rot6");
		this.eye_tentacle_16 = off_rot6.getChild("eye_tentacle_16");
		this.eye_tentacle_17 = eye_tentacle_16.getChild("eye_tentacle_17");
		this.eye_tentacle_18 = root.getChild("eye_tentacle_18");
		this.off_rot7 = eye_tentacle_18.getChild("off_rot7");
		this.eye_tentacle_19 = off_rot7.getChild("eye_tentacle_19");
		this.eye_tentacle_20 = eye_tentacle_19.getChild("eye_tentacle_20");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(64, 80).addBox(-4.5F, 2.0F, -4.0F, 9.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 101)
						.addBox(-4.0F, -3.0F, -4.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 64)
						.addBox(-4.0F, -21.0F, -6.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(48, 80)
						.addBox(-9.0F, -13.0F, -4.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 64)
						.addBox(-4.5F, -8.0F, -4.0F, 9.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 76)
						.addBox(-5.0F, -13.0F, -4.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 113)
						.addBox(-4.0F, -13.0F, -4.5F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 99)
						.addBox(-3.0F, -8.0F, -4.5F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(2, 87)
						.addBox(-2.0F, -2.0F, -4.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 123).mirror()
						.addBox(8.0F, -14.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 123)
						.addBox(-9.0F, -14.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 110)
						.addBox(-4.5F, -21.5F, -6.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(64, 118)
						.addBox(4.5F, -14.5F, -4.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(64, 118).mirror()
						.addBox(-9.5F, -14.5F, -4.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(88, 64)
						.addBox(-5.0F, -21.25F, -7.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 80).mirror()
						.addBox(5.0F, -13.0F, -4.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition eye_tentacle_1 = partdefinition.addOrReplaceChild("eye_tentacle_1", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 1.0F, 14.0F));
		PartDefinition off_rot = eye_tentacle_1.addOrReplaceChild("off_rot",
				CubeListBuilder.create().texOffs(96, 119).addBox(-2.0771F, -6.9526F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition eye_tentacle_11 = off_rot.addOrReplaceChild("eye_tentacle_11",
				CubeListBuilder.create().texOffs(102, 121).addBox(-1.5671F, -5.4526F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition eye_tentacle_111 = eye_tentacle_11.addOrReplaceChild("eye_tentacle_111",
				CubeListBuilder.create().texOffs(107, 123).addBox(-1.0671F, -3.9526F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.0F, 0.0F));
		PartDefinition eye_tentacle_2 = partdefinition.addOrReplaceChild("eye_tentacle_2", CubeListBuilder.create(),
				PartPose.offset(3.0F, 1.0F, 15.0F));
		PartDefinition off_rot2 = eye_tentacle_2.addOrReplaceChild("off_rot2",
				CubeListBuilder.create().texOffs(97, 117).addBox(-2.9429F, -6.9526F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition eye_tentacle_3 = off_rot2.addOrReplaceChild("eye_tentacle_3",
				CubeListBuilder.create().texOffs(112, 120).addBox(-2.4329F, -6.4526F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition eye_tentacle_4 = eye_tentacle_3.addOrReplaceChild("eye_tentacle_4",
				CubeListBuilder.create().texOffs(110, 123).addBox(-1.9329F, -3.9526F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition leg_1 = partdefinition.addOrReplaceChild("leg_1",
				CubeListBuilder.create().texOffs(118, 122).addBox(-0.8F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, 22.0F, -15.0F));
		PartDefinition leg_2 = partdefinition.addOrReplaceChild("leg_2",
				CubeListBuilder.create().texOffs(118, 122).addBox(-0.8F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, 22.0F, -10.0F));
		PartDefinition leg_3 = partdefinition.addOrReplaceChild("leg_3",
				CubeListBuilder.create().texOffs(118, 122).addBox(-0.8F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, 22.0F, -5.0F));
		PartDefinition leg_4 = partdefinition.addOrReplaceChild("leg_4",
				CubeListBuilder.create().texOffs(118, 122).addBox(-0.8F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, 22.0F, 5.0F));
		PartDefinition leg_5 = partdefinition.addOrReplaceChild("leg_5",
				CubeListBuilder.create().texOffs(118, 122).addBox(-0.8F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, 22.0F, 10.0F));
		PartDefinition leg_6 = partdefinition.addOrReplaceChild("leg_6",
				CubeListBuilder.create().texOffs(118, 122).addBox(-0.8F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, 22.0F, 15.0F));
		PartDefinition leg_7 = partdefinition.addOrReplaceChild("leg_7",
				CubeListBuilder.create().texOffs(118, 122).addBox(-0.2F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-11.0F, 22.0F, 5.0F));
		PartDefinition leg_8 = partdefinition.addOrReplaceChild("leg_8",
				CubeListBuilder.create().texOffs(118, 122).addBox(-0.2F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-11.0F, 22.0F, 10.0F));
		PartDefinition leg_9 = partdefinition.addOrReplaceChild("leg_9",
				CubeListBuilder.create().texOffs(118, 122).addBox(-0.2F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-11.0F, 22.0F, 15.0F));
		PartDefinition leg_10 = partdefinition.addOrReplaceChild("leg_10",
				CubeListBuilder.create().texOffs(118, 122).addBox(-0.2F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-11.0F, 22.0F, 0.0F));
		PartDefinition leg_11 = partdefinition.addOrReplaceChild("leg_11",
				CubeListBuilder.create().texOffs(118, 122).addBox(-0.2F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-11.0F, 22.0F, -5.0F));
		PartDefinition leg_12 = partdefinition.addOrReplaceChild("leg_12",
				CubeListBuilder.create().texOffs(118, 122).addBox(-0.2F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-11.0F, 22.0F, -15.0F));
		PartDefinition leg_13 = partdefinition.addOrReplaceChild("leg_13",
				CubeListBuilder.create().texOffs(118, 122).addBox(-0.2F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-11.0F, 22.0F, -10.0F));
		PartDefinition leg_14 = partdefinition.addOrReplaceChild("leg_14",
				CubeListBuilder.create().texOffs(118, 122).addBox(-0.8F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, 22.0F, 0.0F));
		PartDefinition eye_tentacle_5 = partdefinition.addOrReplaceChild("eye_tentacle_5", CubeListBuilder.create(),
				PartPose.offset(6.0F, 16.0F, 15.0F));
		PartDefinition off_rot3 = eye_tentacle_5.addOrReplaceChild("off_rot3",
				CubeListBuilder.create().texOffs(97, 117).addBox(-2.9429F, -6.9526F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -1.3526F, 0.0F, 0.2182F));
		PartDefinition eye_tentacle_6 = off_rot3.addOrReplaceChild("eye_tentacle_6",
				CubeListBuilder.create().texOffs(112, 120).addBox(-2.4329F, -6.4526F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition eye_tentacle_7 = eye_tentacle_6.addOrReplaceChild("eye_tentacle_7",
				CubeListBuilder.create().texOffs(110, 123).addBox(-1.9329F, -3.9526F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition eye_tentacle_8 = partdefinition.addOrReplaceChild("eye_tentacle_8", CubeListBuilder.create(),
				PartPose.offset(-7.0F, 16.0F, 14.0F));
		PartDefinition off_rot4 = eye_tentacle_8.addOrReplaceChild("off_rot4",
				CubeListBuilder.create().texOffs(97, 117).addBox(-2.9429F, -6.9526F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -1.6581F, 0.0F, -0.2182F));
		PartDefinition eye_tentacle_9 = off_rot4.addOrReplaceChild("eye_tentacle_9",
				CubeListBuilder.create().texOffs(112, 120).addBox(-2.4329F, -6.4526F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition eye_tentacle_10 = eye_tentacle_9.addOrReplaceChild("eye_tentacle_10",
				CubeListBuilder.create().texOffs(110, 123).addBox(-1.9329F, -3.9526F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition eye_tentacle_12 = partdefinition.addOrReplaceChild("eye_tentacle_12", CubeListBuilder.create(),
				PartPose.offset(-7.0F, 16.0F, -3.0F));
		PartDefinition off_rot5 = eye_tentacle_12.addOrReplaceChild("off_rot5",
				CubeListBuilder.create().texOffs(97, 117).addBox(-2.9429F, -6.9526F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -1.6581F, -1.1345F, -0.2182F));
		PartDefinition eye_tentacle_13 = off_rot5.addOrReplaceChild("eye_tentacle_13",
				CubeListBuilder.create().texOffs(112, 120).addBox(-2.4329F, -6.4526F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition eye_tentacle_14 = eye_tentacle_13.addOrReplaceChild("eye_tentacle_14",
				CubeListBuilder.create().texOffs(110, 123).addBox(-1.9329F, -3.9526F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition eye_tentacle_15 = partdefinition.addOrReplaceChild("eye_tentacle_15", CubeListBuilder.create(),
				PartPose.offset(10.0F, 16.0F, -16.0F));
		PartDefinition off_rot6 = eye_tentacle_15.addOrReplaceChild("off_rot6",
				CubeListBuilder.create().texOffs(97, 117).addBox(-2.9429F, -6.9526F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -1.0F, -1.6581F, 2.0071F, -0.2182F));
		PartDefinition eye_tentacle_16 = off_rot6.addOrReplaceChild("eye_tentacle_16",
				CubeListBuilder.create().texOffs(112, 120).addBox(-2.4329F, -6.4526F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition eye_tentacle_17 = eye_tentacle_16.addOrReplaceChild("eye_tentacle_17",
				CubeListBuilder.create().texOffs(110, 123).addBox(-1.9329F, -3.9526F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition eye_tentacle_18 = partdefinition.addOrReplaceChild("eye_tentacle_18", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 16.0F, -19.0F));
		PartDefinition off_rot7 = eye_tentacle_18.addOrReplaceChild("off_rot7",
				CubeListBuilder.create().texOffs(97, 117).addBox(-2.9429F, -6.9526F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, -1.6581F, -2.7925F, -0.2182F));
		PartDefinition eye_tentacle_19 = off_rot7.addOrReplaceChild("eye_tentacle_19",
				CubeListBuilder.create().texOffs(112, 120).addBox(-2.4329F, -6.4526F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition eye_tentacle_20 = eye_tentacle_19.addOrReplaceChild("eye_tentacle_20",
				CubeListBuilder.create().texOffs(110, 123).addBox(-1.9329F, -3.9526F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(216, 76).addBox(-9.0F, -4.0F, -20.0F, 18.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(216, 76)
						.addBox(-9.0F, -4.0F, 18.0F, 18.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(180, 90)
						.addBox(-11.0F, -4.0F, -18.0F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(180, 90)
						.addBox(9.0F, -4.0F, -18.0F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(148, 0)
						.addBox(-9.0F, -16.0F, -18.0F, 18.0F, 14.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(58, 13)
						.addBox(-6.4F, -19.4F, -19.01F, 13.0F, 4.0F, 38.0F, new CubeDeformation(0.0F)).texOffs(168, 50)
						.addBox(-2.4F, -15.4F, -19.01F, 5.0F, 2.0F, 38.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -5.0F, -19.0F, 4.0F, 6.0F, 38.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -16.0F, 0.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -19.0F, 4.0F, 6.0F, 38.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -16.0F, 0.0F, 0.0F, 0.0F, 1.0472F));
		return LayerDefinition.create(meshdefinition, 256, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leg_1.xRot = Mth.cos(limbSwing * 1.0F) * -0.5F * limbSwingAmount;
		this.leg_2.xRot = Mth.cos(limbSwing * 1.0F) * 0.5F * limbSwingAmount;
		this.leg_3.xRot = Mth.cos(limbSwing * 1.0F) * -0.5F * limbSwingAmount;
		this.leg_4.xRot = Mth.cos(limbSwing * 1.0F) * 0.5F * limbSwingAmount;
		this.leg_5.xRot = Mth.cos(limbSwing * 1.0F) * -0.5F * limbSwingAmount;
		this.leg_6.xRot = Mth.cos(limbSwing * 1.0F) * 0.5F * limbSwingAmount;
		this.leg_7.xRot = Mth.cos(limbSwing * 1.0F) * -0.5F * limbSwingAmount;
		this.leg_8.xRot = Mth.cos(limbSwing * 1.0F) * 0.5F * limbSwingAmount;
		this.leg_9.xRot = Mth.cos(limbSwing * 1.0F) * -0.5F * limbSwingAmount;
		this.leg_10.xRot = Mth.cos(limbSwing * 1.0F) * 0.5F * limbSwingAmount;
		this.leg_11.xRot = Mth.cos(limbSwing * 1.0F) * -0.5F * limbSwingAmount;
		this.leg_12.xRot = Mth.cos(limbSwing * 1.0F) * 0.5F * limbSwingAmount;
		this.leg_13.xRot = Mth.cos(limbSwing * 1.0F) * -0.5F * limbSwingAmount;
		this.leg_14.xRot = Mth.cos(limbSwing * 1.0F) * 0.5F * limbSwingAmount;
		float x1 = ageInTicks / 6.f;
		float x2 = ageInTicks / 12.f;
		float x3 = ageInTicks / 18.f;
		this.eye_tentacle_1.xRot = Mth.sin(x3) / 9.f;
		this.eye_tentacle_1.yRot = Mth.sin(x3) / 9.f;
		this.eye_tentacle_1.zRot = Mth.sin(x2) / 5.f;
		this.eye_tentacle_11.xRot = Mth.sin(x3) / 12.f;
		this.eye_tentacle_11.yRot = Mth.sin(x3) / 12.f;
		this.eye_tentacle_11.zRot = Mth.sin(x3) / 12.f;
		this.eye_tentacle_111.xRot = Mth.sin(x3) / 20.f;
		this.eye_tentacle_111.yRot = Mth.sin(x3) / 20.f;
		this.eye_tentacle_111.zRot = Mth.sin(x3) / 20.f;
		this.eye_tentacle_2.xRot = Mth.sin(x2) / 9.f;
		this.eye_tentacle_2.yRot = Mth.sin(x3) / 9.f;
		this.eye_tentacle_2.zRot = Mth.sin(x1) / 5.f;
		this.eye_tentacle_3.xRot = Mth.sin(x3) / 12.f;
		this.eye_tentacle_3.yRot = Mth.sin(x2) / 12.f;
		this.eye_tentacle_3.zRot = Mth.sin(x3) / 12.f;
		this.eye_tentacle_4.xRot = Mth.sin(x3) / 20.f;
		this.eye_tentacle_4.yRot = Mth.sin(x2) / 20.f;
		this.eye_tentacle_4.zRot = Mth.sin(x3) / 20.f;
		this.eye_tentacle_5.xRot = Mth.sin(x2) / 7.f;
		this.eye_tentacle_5.yRot = Mth.sin(x1) / 5.f;
		this.eye_tentacle_5.zRot = Mth.sin(x3) / 9.f;
		this.eye_tentacle_6.xRot = Mth.sin(x3) / 12.f;
		this.eye_tentacle_6.yRot = Mth.sin(x3) / 12.f;
		this.eye_tentacle_6.zRot = Mth.sin(x3) / 12.f;
		this.eye_tentacle_7.xRot = Mth.sin(x3) / 20.f;
		this.eye_tentacle_7.yRot = Mth.sin(x3) / 20.f;
		this.eye_tentacle_7.zRot = Mth.sin(x3) / 20.f;
		this.eye_tentacle_8.xRot = Mth.sin(x3) / 9.f;
		this.eye_tentacle_8.yRot = Mth.sin(x3) / 9.f;
		this.eye_tentacle_8.zRot = Mth.sin(x2) / 5.f;
		this.eye_tentacle_9.xRot = Mth.sin(x3) / 12.f;
		this.eye_tentacle_9.yRot = Mth.sin(x3) / 12.f;
		this.eye_tentacle_9.zRot = Mth.sin(x3) / 12.f;
		this.eye_tentacle_10.xRot = Mth.sin(x3) / 20.f;
		this.eye_tentacle_10.yRot = Mth.sin(x3) / 20.f;
		this.eye_tentacle_10.zRot = Mth.sin(x3) / 20.f;
		this.eye_tentacle_12.xRot = Mth.sin(x3) / 9.f;
		this.eye_tentacle_12.yRot = Mth.sin(x2) / 5.f;
		this.eye_tentacle_12.zRot = Mth.sin(x2) / 7.f;
		this.eye_tentacle_13.xRot = Mth.sin(x3) / 12.f;
		this.eye_tentacle_13.yRot = Mth.sin(x3) / 12.f;
		this.eye_tentacle_13.zRot = Mth.sin(x1) / 12.f;
		this.eye_tentacle_14.xRot = Mth.sin(x3) / 20.f;
		this.eye_tentacle_14.yRot = Mth.sin(x3) / 20.f;
		this.eye_tentacle_14.zRot = Mth.sin(x1) / 20.f;
		this.eye_tentacle_15.xRot = Mth.sin(x3) / 9.f;
		this.eye_tentacle_15.yRot = Mth.sin(x1) / 5.f;
		this.eye_tentacle_15.zRot = Mth.sin(x2) / 7.f;
		this.eye_tentacle_16.xRot = Mth.sin(x3) / 12.f;
		this.eye_tentacle_16.yRot = Mth.sin(x2) / 12.f;
		this.eye_tentacle_16.zRot = Mth.sin(x1) / 12.f;
		this.eye_tentacle_17.xRot = Mth.sin(x2) / 20.f;
		this.eye_tentacle_17.yRot = Mth.sin(x3) / 20.f;
		this.eye_tentacle_17.zRot = Mth.sin(x1) / 20.f;
		this.eye_tentacle_18.xRot = Mth.sin(x2) / 9.f;
		this.eye_tentacle_18.yRot = Mth.sin(x3) / 9.f;
		this.eye_tentacle_18.zRot = Mth.sin(x1) / 5.f;
		this.eye_tentacle_19.xRot = Mth.sin(x3) / 12.f;
		this.eye_tentacle_19.yRot = Mth.sin(x2) / 12.f;
		this.eye_tentacle_19.zRot = Mth.sin(x3) / 12.f;
		this.eye_tentacle_20.xRot = Mth.sin(x3) / 20.f;
		this.eye_tentacle_20.yRot = Mth.sin(x2) / 20.f;
		this.eye_tentacle_20.zRot = Mth.sin(x3) / 20.f;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye_tentacle_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye_tentacle_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_11.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_12.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_13.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_14.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye_tentacle_5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye_tentacle_8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye_tentacle_12.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye_tentacle_15.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye_tentacle_18.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
