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

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelobleck_lord<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelobleck_lord"), "main");
	public final ModelPart l_arm3;
	public final ModelPart l_arm2;
	public final ModelPart left_arm;
	public final ModelPart r_arm3;
	public final ModelPart r_arm2;
	public final ModelPart right_arm;
	public final ModelPart main_head;
	public final ModelPart right_leg;
	public final ModelPart left_leg;
	public final ModelPart r_arm4;
	public final ModelPart l_arm4;
	public final ModelPart bb_main;

	public Modelobleck_lord(ModelPart root) {
		this.l_arm3 = root.getChild("l_arm3");
		this.l_arm2 = root.getChild("l_arm2");
		this.left_arm = root.getChild("left_arm");
		this.r_arm3 = root.getChild("r_arm3");
		this.r_arm2 = root.getChild("r_arm2");
		this.right_arm = root.getChild("right_arm");
		this.main_head = root.getChild("main_head");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.r_arm4 = root.getChild("r_arm4");
		this.l_arm4 = root.getChild("l_arm4");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition l_arm3 = partdefinition.addOrReplaceChild("l_arm3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.5F, -9.0F, 6.0F, 0.4363F, 0.0F, -1.9199F));
		PartDefinition arm_bottom_l8_r1 = l_arm3.addOrReplaceChild("arm_bottom_l8_r1",
				CubeListBuilder.create().texOffs(26, 103).addBox(-3.49F, 15.5F, 3.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 103)
						.addBox(-2.99F, 15.5F, 7.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 103)
						.addBox(-0.49F, 15.5F, 7.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 103)
						.addBox(-0.99F, 15.5F, 2.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 103)
						.addBox(0.51F, 7.0F, 5.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 91).mirror()
						.addBox(-3.51F, 10.0F, 3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 97).mirror()
						.addBox(-3.5F, -1.0F, 3.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 1.0F, -6.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition l_arm2 = partdefinition.addOrReplaceChild("l_arm2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.5F, -4.0F, 6.0F, 0.2618F, 0.0F, -1.5272F));
		PartDefinition arm_bottom_l7_r1 = l_arm2.addOrReplaceChild("arm_bottom_l7_r1",
				CubeListBuilder.create().texOffs(26, 49).addBox(-3.49F, 20.5F, 3.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 49)
						.addBox(-2.99F, 20.5F, 7.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 49)
						.addBox(-0.49F, 20.5F, 7.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 49)
						.addBox(-0.99F, 20.5F, 2.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 49)
						.addBox(0.51F, 12.0F, 5.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 37)
						.addBox(-3.51F, 15.0F, 3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 43).addBox(-3.5F, 4.0F, 3.5F, 5.0F,
								16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -4.0F, -6.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, -8.0F, 0.0F));
		PartDefinition arm_bottom_l6_r1 = left_arm.addOrReplaceChild("arm_bottom_l6_r1",
				CubeListBuilder.create().texOffs(78, 33).mirror().addBox(-2.49F, 16.5F, -2.49F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(78, 33).mirror().addBox(-1.99F, 16.5F, 1.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(78, 33).mirror().addBox(0.51F, 16.5F, 1.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(78, 33).mirror().addBox(0.01F, 16.5F, -3.01F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(94, 33).mirror().addBox(1.51F, 8.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(78, 21).mirror().addBox(-2.51F, 11.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(78, 0).mirror().addBox(-2.5F, 0.0F, -2.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition r_arm3 = partdefinition.addOrReplaceChild("r_arm3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.5F, -9.0F, 6.0F, 0.4363F, 0.0F, 1.9199F));
		PartDefinition arm_bottom_r18_r1 = r_arm3.addOrReplaceChild("arm_bottom_r18_r1",
				CubeListBuilder.create().texOffs(26, 103).addBox(1.49F, 15.5F, 3.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 103)
						.addBox(0.99F, 15.5F, 7.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 103)
						.addBox(-1.51F, 15.5F, 7.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 103)
						.addBox(-1.01F, 15.5F, 2.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 103)
						.addBox(-2.51F, 7.0F, 5.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 91)
						.addBox(-2.49F, 10.0F, 3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 97).addBox(-1.5F, -1.0F, 3.5F, 5.0F,
								16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.0F, -6.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition r_arm2 = partdefinition.addOrReplaceChild("r_arm2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.5F, -4.0F, 6.0F, 0.2618F, 0.0F, 1.5272F));
		PartDefinition arm_bottom_r12_r1 = r_arm2.addOrReplaceChild("arm_bottom_r12_r1",
				CubeListBuilder.create().texOffs(70, 49).addBox(1.49F, 20.5F, 3.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 49)
						.addBox(0.99F, 20.5F, 7.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 49)
						.addBox(-1.51F, 20.5F, 7.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 49)
						.addBox(-1.01F, 20.5F, 2.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(86, 49)
						.addBox(-2.51F, 12.0F, 5.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 37)
						.addBox(-2.49F, 15.0F, 3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(108, 43).addBox(-1.5F, 4.0F, 3.5F, 5.0F,
								16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -4.0F, -6.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, -8.0F, 0.0F));
		PartDefinition arm_bottom_r6_r1 = right_arm.addOrReplaceChild("arm_bottom_r6_r1",
				CubeListBuilder.create().texOffs(78, 33).addBox(0.49F, 16.5F, -2.49F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-0.01F, 16.5F, 1.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-2.51F, 16.5F, 1.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-2.01F, 16.5F, -3.01F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(94, 33)
						.addBox(-3.51F, 8.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 21)
						.addBox(-3.49F, 11.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(78, 0).addBox(-2.5F, 0.0F, -2.5F, 5.0F,
								16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition main_head = partdefinition.addOrReplaceChild(
				"main_head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F))
						.texOffs(25, 0).addBox(-3.0F, -6.5F, -4.75F, 6.0F, 6.0F, 1.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, -8.5F, 0.0F));
		PartDefinition back_spike_right_r1 = main_head.addOrReplaceChild("back_spike_right_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(-4.0F, -3.5F, 0.0F, 0.0436F, -0.4363F, -0.1309F));
		PartDefinition side_spike_right_r1 = main_head.addOrReplaceChild("side_spike_right_r1",
				CubeListBuilder.create().texOffs(32, 8).mirror().addBox(1.5F, 1.0F, 1.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(1.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -3.5F, 0.0F, 0.0436F, -0.3491F, -0.1309F));
		PartDefinition back_spike_left_r1 = main_head.addOrReplaceChild("back_spike_left_r1",
				CubeListBuilder.create().texOffs(32, 8).addBox(-2.5F, 1.0F, 1.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(4.0F, -3.5F, 0.0F, 0.0436F, 0.3491F, 0.1309F));
		PartDefinition side_spike_left_r1 = main_head.addOrReplaceChild("side_spike_left_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(4.0F, -3.5F, 0.0F, 0.0436F, 0.4363F, 0.1309F));
		PartDefinition back_ear_right = main_head.addOrReplaceChild("back_ear_right",
				CubeListBuilder.create().texOffs(13, 23).mirror().addBox(-2.0F, -1.5F, -2.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(1.0F))
						.mirror(false).texOffs(0, 22).mirror().addBox(-1.5F, -1.25F, 0.75F, 1.0F, 1.0F, 7.0F, new CubeDeformation(1.0F)).mirror(false)
						.texOffs(0, 22).mirror().addBox(-1.51F, 0.25F, 2.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(1.0F)).mirror(false)
						.texOffs(28, 16).mirror().addBox(-1.49F, 1.75F, 0.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(1.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -7.0F, 1.5F, -0.0873F, -0.2618F, 0.2182F));
		PartDefinition spike_right_side_r1 = back_ear_right.addOrReplaceChild(
				"spike_right_side_r1", CubeListBuilder.create().texOffs(0, 22).mirror()
						.addBox(-1.5F, -1.25F, 0.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(1.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.1745F, 0.0873F));
		PartDefinition back_ear_left = main_head.addOrReplaceChild("back_ear_left",
				CubeListBuilder.create().texOffs(13, 23).addBox(0.0F, -1.5F, -2.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(1.0F)).texOffs(0, 22)
						.addBox(0.5F, -1.25F, 0.75F, 1.0F, 1.0F, 7.0F, new CubeDeformation(1.0F)).texOffs(0, 22)
						.addBox(0.51F, 0.25F, 2.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(1.0F)).texOffs(28, 16).addBox(0.49F, 1.75F, 0.25F, 1.0F,
								1.0F, 8.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(4.0F, -7.0F, 1.5F, -0.0873F, 0.2618F, -0.2182F));
		PartDefinition spike_left_side_r1 = back_ear_left.addOrReplaceChild("spike_left_side_r1",
				CubeListBuilder.create().texOffs(0, 22).addBox(0.5F, -1.25F, 0.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, -0.1745F, -0.0873F));
		PartDefinition ear_top_right = main_head.addOrReplaceChild("ear_top_right",
				CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-3.0F, 1.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false)
						.texOffs(1, 22).mirror().addBox(-2.75F, 0.75F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(1.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -9.5F, 1.5F, 0.7854F, -0.2182F, -0.3054F));
		PartDefinition ear_top_right2 = main_head.addOrReplaceChild("ear_top_right2",
				CubeListBuilder.create().texOffs(0, 17).addBox(1.0F, 1.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)).texOffs(1, 22)
						.addBox(1.75F, 0.75F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, -9.5F, 1.5F, 0.7854F, 0.2182F, 0.3054F));
		PartDefinition ear_top = main_head.addOrReplaceChild("ear_top",
				CubeListBuilder.create().texOffs(0, 17).addBox(-1.5F, -0.25F, -5.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, -9.5F, 1.5F, 0.3054F, 0.0F, 0.0F));
		PartDefinition spike_top2_r1 = ear_top.addOrReplaceChild("spike_top2_r1",
				CubeListBuilder.create().texOffs(1, 22).addBox(-0.5F, 0.49F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(1.0F)).texOffs(0, 26)
						.addBox(-1.0F, 0.5F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(108, 21).addBox(-5.0F, 0.0F, -2.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(108, 21).mirror()
				.addBox(0.0F, 0.0F, -2.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition r_arm4 = partdefinition.addOrReplaceChild("r_arm4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.5F, 0.0F, 6.0F, 0.4363F, 0.0F, 1.2217F));
		PartDefinition arm_bottom_r19_r1 = r_arm4.addOrReplaceChild("arm_bottom_r19_r1",
				CubeListBuilder.create().texOffs(26, 76).addBox(1.49F, 11.5F, 3.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 76)
						.addBox(0.99F, 11.5F, 7.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 76)
						.addBox(-1.51F, 11.5F, 7.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 76)
						.addBox(-1.01F, 11.5F, 2.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 76)
						.addBox(-2.51F, 3.0F, 5.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 64)
						.addBox(-2.49F, 6.0F, 3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 70).addBox(-1.5F, -1.0F, 3.5F, 5.0F,
								12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.0F, -6.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition l_arm4 = partdefinition.addOrReplaceChild("l_arm4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(4.5F, 0.0F, 6.0F, 0.4363F, 0.0F, -1.2217F));
		PartDefinition arm_bottom_l9_r1 = l_arm4.addOrReplaceChild("arm_bottom_l9_r1",
				CubeListBuilder.create().texOffs(26, 76).addBox(-3.49F, 11.5F, 3.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 76)
						.addBox(-2.99F, 11.5F, 7.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 76)
						.addBox(-0.49F, 11.5F, 7.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 76)
						.addBox(-0.99F, 11.5F, 2.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 76)
						.addBox(0.51F, 3.0F, 5.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 64).mirror()
						.addBox(-3.51F, 6.0F, 3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 70).mirror()
						.addBox(-3.5F, -1.0F, 3.5F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 1.0F, -6.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(98, 0).addBox(-5.0F, -32.0F, -2.5F, 10.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition left_shoulder_r1 = bb_main.addOrReplaceChild("left_shoulder_r1",
				CubeListBuilder.create().texOffs(0, 35).addBox(-2.0F, -8.0F, -2.375F, 6.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -27.0F, 2.5F, -0.3491F, -0.48F, 0.5236F));
		PartDefinition right_shoulder_r1 = bb_main.addOrReplaceChild(
				"right_shoulder_r1", CubeListBuilder.create().texOffs(0, 35).mirror()
						.addBox(-4.0F, -8.0F, -2.375F, 6.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, -27.0F, 2.5F, -0.3491F, 0.48F, -0.5236F));
		return LayerDefinition.create(meshdefinition, 504, 252);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		boolean flag1 = entity.getPersistentData().getBoolean("shootingbullet");
		float bulletarmrotationZ = (flag1 ? 0.66F : 0F);
		float bulletarmrotationX = (flag1 ? -1.5F : 0F);
		boolean flag2 = entity.getPersistentData().getBoolean("slice");
		float slicerotationX = (flag2 ? -1.5F : 0F);
		if ((entity.getPersistentData().getBoolean("attackongoing")) == (true)) {
			this.right_arm.xRot = bulletarmrotationX;
			this.right_arm.zRot = 0.0F;
			this.left_arm.xRot = bulletarmrotationX + slicerotationX;
			if ((entity.getPersistentData().getBoolean("slice")) == (true)) {
				this.left_arm.yRot = (float) (Math.sin(ageInTicks * 2.0F));
			} else {
				this.left_arm.yRot = 0.0F;
			}
			this.left_arm.zRot = 0.0F;
		} else {
			this.right_arm.xRot = (Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount) + (Mth.cos(ageInTicks / 8) / 24);
			this.right_arm.zRot = Mth.sin(ageInTicks / 8) / -24;
			this.left_arm.xRot = (Mth.cos(limbSwing * 0.6662F) * limbSwingAmount) - (Mth.cos(ageInTicks / 8) / 24);
			this.left_arm.zRot = Mth.sin(ageInTicks / 8) / 24;
		}
		this.r_arm2.xRot = (float) ((Mth.cos(ageInTicks / 6) / 8) + 0.261799);
		this.r_arm2.zRot = (float) ((Mth.sin(ageInTicks / 6) / 8) + 1.352630);
		this.r_arm3.xRot = (float) ((Mth.cos(-ageInTicks / 6) / 8) + 0.436332);
		this.r_arm3.zRot = (float) ((Mth.sin(ageInTicks / 6) / 8) + 1.919862);
		this.r_arm4.xRot = (float) ((Mth.cos(ageInTicks / 6) / 8) + 0.626332);
		this.r_arm4.zRot = (float) ((Mth.sin(-ageInTicks / 6) / 8) - 2.229862);
		this.l_arm2.xRot = (float) ((Mth.cos(-ageInTicks / 6) / 8) + 0.261799);
		this.l_arm2.zRot = (float) ((Mth.sin(-ageInTicks / 6) / 8) - 1.352630);
		this.l_arm3.xRot = (float) ((Mth.cos(ageInTicks / 6) / 8) + 0.436332);
		this.l_arm3.zRot = (float) ((Mth.sin(-ageInTicks / 6) / 8) - 1.919862);
		this.l_arm4.xRot = (float) ((Mth.cos(ageInTicks / 6) / 8) + 0.626332);
		this.l_arm4.zRot = (float) ((Mth.sin(-ageInTicks / 6) / 8) - 2.229862);
		this.right_leg.xRot = (Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount);
		this.main_head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.main_head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.xRot = (Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		l_arm3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		l_arm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_arm3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_arm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		main_head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_arm4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		l_arm4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
