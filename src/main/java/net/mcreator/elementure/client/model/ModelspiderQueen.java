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

import net.mcreator.elementure.entity.SpiderQueenEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelspiderQueen<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelspider_queen"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart leg_1;
	public final ModelPart rotat1;
	public final ModelPart leg_1_rotat;
	public final ModelPart leg_top_1;
	public final ModelPart leg_4;
	public final ModelPart rotat4;
	public final ModelPart leg_1_rotat2;
	public final ModelPart leg_top_4;
	public final ModelPart leg_5;
	public final ModelPart rotat5;
	public final ModelPart leg_1_rotat3;
	public final ModelPart leg_top_3;
	public final ModelPart leg_6;
	public final ModelPart rotat6;
	public final ModelPart leg_1_rotat4;
	public final ModelPart leg_top_2;
	public final ModelPart leg_2;
	public final ModelPart rotat2;
	public final ModelPart leg_1_rotat5;
	public final ModelPart leg_top_5;
	public final ModelPart leg_8;
	public final ModelPart rotat8;
	public final ModelPart leg_1_rotat6;
	public final ModelPart leg_top_6;
	public final ModelPart leg_7;
	public final ModelPart rotat7;
	public final ModelPart leg_1_rotat7;
	public final ModelPart leg_top_7;
	public final ModelPart leg_3;
	public final ModelPart rotat3;
	public final ModelPart leg_1_rotat8;
	public final ModelPart leg_top_8;

	public ModelspiderQueen(ModelPart root) {
		this.body = root.getChild("body");
		this.head = body.getChild("head");
		this.leg_1 = body.getChild("leg_1");
		this.rotat1 = leg_1.getChild("rotat1");
		this.leg_1_rotat = rotat1.getChild("leg_1_rotat");
		this.leg_top_1 = leg_1_rotat.getChild("leg_top_1");
		this.leg_4 = body.getChild("leg_4");
		this.rotat4 = leg_4.getChild("rotat4");
		this.leg_1_rotat2 = rotat4.getChild("leg_1_rotat2");
		this.leg_top_4 = leg_1_rotat2.getChild("leg_top_4");
		this.leg_5 = body.getChild("leg_5");
		this.rotat5 = leg_5.getChild("rotat5");
		this.leg_1_rotat3 = rotat5.getChild("leg_1_rotat3");
		this.leg_top_3 = leg_1_rotat3.getChild("leg_top_3");
		this.leg_6 = body.getChild("leg_6");
		this.rotat6 = leg_6.getChild("rotat6");
		this.leg_1_rotat4 = rotat6.getChild("leg_1_rotat4");
		this.leg_top_2 = leg_1_rotat4.getChild("leg_top_2");
		this.leg_2 = body.getChild("leg_2");
		this.rotat2 = leg_2.getChild("rotat2");
		this.leg_1_rotat5 = rotat2.getChild("leg_1_rotat5");
		this.leg_top_5 = leg_1_rotat5.getChild("leg_top_5");
		this.leg_8 = body.getChild("leg_8");
		this.rotat8 = leg_8.getChild("rotat8");
		this.leg_1_rotat6 = rotat8.getChild("leg_1_rotat6");
		this.leg_top_6 = leg_1_rotat6.getChild("leg_top_6");
		this.leg_7 = body.getChild("leg_7");
		this.rotat7 = leg_7.getChild("rotat7");
		this.leg_1_rotat7 = rotat7.getChild("leg_1_rotat7");
		this.leg_top_7 = leg_1_rotat7.getChild("leg_top_7");
		this.leg_3 = body.getChild("leg_3");
		this.rotat3 = leg_3.getChild("rotat3");
		this.leg_1_rotat8 = rotat3.getChild("leg_1_rotat8");
		this.leg_top_8 = leg_1_rotat8.getChild("leg_top_8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(88, 0).addBox(-5.0F, 4.0F, -3.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(76, 25)
						.addBox(-6.0F, 3.0F, -5.0F, 12.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-7.5F, -7.0F, -7.0F, 15.0F, 10.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(39, 0)
						.addBox(-6.5F, -11.0F, -6.0F, 13.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(87, 53)
						.addBox(-6.0F, -9.0F, 8.0F, 12.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 12).addBox(-4.0F, -15.5F, -4.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, -9.0F));
		PartDefinition cube_r1 = head
				.addOrReplaceChild(
						"cube_r1", CubeListBuilder.create().texOffs(0, 0).mirror()
								.addBox(-1.5F, -2.0F, -0.6F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(2.5F, -7.0F, -4.0F, 0.3054F, -0.48F, 0.0F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.0F, -0.6F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -7.0F, -4.0F, 0.3054F, 0.48F, 0.0F));
		PartDefinition leg_1 = body.addOrReplaceChild("leg_1", CubeListBuilder.create(), PartPose.offset(6.0F, 4.0F, -5.0F));
		PartDefinition rotat1 = leg_1.addOrReplaceChild("rotat1", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition leg_1_rotat = rotat1.addOrReplaceChild(
				"leg_1_rotat", CubeListBuilder.create().texOffs(0, 119).mirror()
						.addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.1745F, 0.9163F));
		PartDefinition cube_r3 = leg_1_rotat.addOrReplaceChild(
				"cube_r3", CubeListBuilder.create().texOffs(15, 116).mirror()
						.addBox(-3.8228F, -19.5902F, -0.7551F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(7.813F, 1.2367F, -0.2449F, 0.0F, 0.0F, -0.6109F));
		PartDefinition leg_top_1 = leg_1_rotat.addOrReplaceChild("leg_top_1", CubeListBuilder.create(),
				PartPose.offset(-4.187F, -11.7633F, -0.2449F));
		PartDefinition cube_r4 = leg_top_1.addOrReplaceChild(
				"cube_r4", CubeListBuilder.create().texOffs(60, 119).mirror()
						.addBox(2.9021F, -12.161F, -1.2551F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0242F, 0.5643F, 0.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition cube_r5 = leg_top_1.addOrReplaceChild(
				"cube_r5", CubeListBuilder.create().texOffs(71, 121).mirror()
						.addBox(2.1884F, -10.9749F, -1.7551F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0085F, 1.9221F, 0.0F, 0.0F, 0.0F, -1.2217F));
		PartDefinition cube_r6 = leg_top_1.addOrReplaceChild(
				"cube_r6", CubeListBuilder.create().texOffs(112, 112).mirror()
						.addBox(0.1375F, 2.5227F, -1.7651F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, 5.0F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r7 = leg_top_1.addOrReplaceChild(
				"cube_r7", CubeListBuilder.create().texOffs(96, 108).mirror()
						.addBox(-1.0756F, -12.81F, -1.7551F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, 4.0F, 0.0F, 0.0F, 0.0F, -1.0908F));
		PartDefinition leg_4 = body.addOrReplaceChild("leg_4", CubeListBuilder.create(), PartPose.offset(6.0F, 3.0F, 9.0F));
		PartDefinition rotat4 = leg_4.addOrReplaceChild("rotat4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));
		PartDefinition leg_1_rotat2 = rotat4.addOrReplaceChild(
				"leg_1_rotat2", CubeListBuilder.create().texOffs(0, 119).mirror()
						.addBox(-1.0F, -6.0F, -0.5102F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, -0.1745F, 0.9163F));
		PartDefinition cube_r8 = leg_1_rotat2.addOrReplaceChild(
				"cube_r8", CubeListBuilder.create().texOffs(15, 116).mirror()
						.addBox(-3.8228F, -19.5902F, -0.7551F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(7.813F, 1.2367F, 0.2449F, 0.0F, 0.0F, -0.6109F));
		PartDefinition leg_top_4 = leg_1_rotat2.addOrReplaceChild("leg_top_4", CubeListBuilder.create(),
				PartPose.offset(-4.187F, -10.7633F, 0.2449F));
		PartDefinition cube_r9 = leg_top_4.addOrReplaceChild(
				"cube_r9", CubeListBuilder.create().texOffs(60, 119).mirror()
						.addBox(2.9021F, -12.161F, -1.2551F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0242F, -0.4357F, 0.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition cube_r10 = leg_top_4.addOrReplaceChild(
				"cube_r10", CubeListBuilder.create().texOffs(71, 121).mirror()
						.addBox(2.1884F, -10.9749F, -1.7551F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0085F, 0.9221F, 0.0F, 0.0F, 0.0F, -1.2217F));
		PartDefinition cube_r11 = leg_top_4.addOrReplaceChild(
				"cube_r11", CubeListBuilder.create().texOffs(112, 112).mirror()
						.addBox(0.1375F, 2.5227F, -1.7651F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, 4.0F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r12 = leg_top_4.addOrReplaceChild(
				"cube_r12", CubeListBuilder.create().texOffs(96, 108).mirror()
						.addBox(-1.0756F, -12.81F, -1.7551F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, 3.0F, 0.0F, 0.0F, 0.0F, -1.0908F));
		PartDefinition leg_5 = body.addOrReplaceChild("leg_5", CubeListBuilder.create(), PartPose.offset(6.0F, 4.0F, 4.0F));
		PartDefinition rotat5 = leg_5.addOrReplaceChild("rotat5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leg_1_rotat3 = rotat5.addOrReplaceChild(
				"leg_1_rotat3", CubeListBuilder.create().texOffs(0, 119).mirror()
						.addBox(-1.0F, -6.0F, -0.5102F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.2618F, -0.1745F, 0.9163F));
		PartDefinition cube_r13 = leg_1_rotat3.addOrReplaceChild(
				"cube_r13", CubeListBuilder.create().texOffs(15, 116).mirror()
						.addBox(-3.8228F, -19.5902F, -0.7551F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(7.813F, 1.2367F, 0.2449F, 0.0F, 0.0F, -0.6109F));
		PartDefinition leg_top_3 = leg_1_rotat3.addOrReplaceChild("leg_top_3", CubeListBuilder.create(),
				PartPose.offset(-2.187F, -11.7633F, 0.2449F));
		PartDefinition cube_r14 = leg_top_3.addOrReplaceChild(
				"cube_r14", CubeListBuilder.create().texOffs(60, 119).mirror()
						.addBox(2.9021F, -12.161F, -1.2551F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0242F, 0.5643F, 0.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition cube_r15 = leg_top_3.addOrReplaceChild(
				"cube_r15", CubeListBuilder.create().texOffs(71, 121).mirror()
						.addBox(2.1884F, -10.9749F, -1.7551F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0085F, 1.9221F, 0.0F, 0.0F, 0.0F, -1.2217F));
		PartDefinition cube_r16 = leg_top_3.addOrReplaceChild(
				"cube_r16", CubeListBuilder.create().texOffs(112, 112).mirror()
						.addBox(0.1375F, 2.5227F, -1.7651F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(6.0F, 5.0F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r17 = leg_top_3.addOrReplaceChild(
				"cube_r17", CubeListBuilder.create().texOffs(96, 108).mirror()
						.addBox(-1.0756F, -12.81F, -1.7551F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(6.0F, 4.0F, 0.0F, 0.0F, 0.0F, -1.0908F));
		PartDefinition leg_6 = body.addOrReplaceChild("leg_6", CubeListBuilder.create(), PartPose.offset(6.0F, 3.0F, 0.0F));
		PartDefinition rotat6 = leg_6.addOrReplaceChild("rotat6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition leg_1_rotat4 = rotat6.addOrReplaceChild(
				"leg_1_rotat4", CubeListBuilder.create().texOffs(0, 119).mirror()
						.addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.1745F, 0.9163F));
		PartDefinition cube_r18 = leg_1_rotat4.addOrReplaceChild(
				"cube_r18", CubeListBuilder.create().texOffs(15, 116).mirror()
						.addBox(-3.8228F, -19.5902F, -0.7551F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(7.813F, 1.2367F, -0.2449F, 0.0F, 0.0F, -0.6109F));
		PartDefinition leg_top_2 = leg_1_rotat4.addOrReplaceChild("leg_top_2", CubeListBuilder.create(),
				PartPose.offset(-5.187F, -11.7633F, -0.2449F));
		PartDefinition cube_r19 = leg_top_2.addOrReplaceChild(
				"cube_r19", CubeListBuilder.create().texOffs(60, 119).mirror()
						.addBox(2.9021F, -12.161F, -1.2551F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0242F, 0.5643F, 0.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition cube_r20 = leg_top_2.addOrReplaceChild(
				"cube_r20", CubeListBuilder.create().texOffs(71, 121).mirror()
						.addBox(2.1884F, -10.9749F, -1.7551F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0085F, 1.9221F, 0.0F, 0.0F, 0.0F, -1.2217F));
		PartDefinition cube_r21 = leg_top_2.addOrReplaceChild(
				"cube_r21", CubeListBuilder.create().texOffs(112, 112).mirror()
						.addBox(0.1375F, 2.5227F, -1.7651F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(9.0F, 5.0F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r22 = leg_top_2.addOrReplaceChild(
				"cube_r22", CubeListBuilder.create().texOffs(96, 108).mirror()
						.addBox(-1.0756F, -12.81F, -1.7551F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(9.0F, 4.0F, 0.0F, 0.0F, 0.0F, -1.0908F));
		PartDefinition leg_2 = body.addOrReplaceChild("leg_2", CubeListBuilder.create(), PartPose.offset(-6.0F, 3.0F, -5.0F));
		PartDefinition rotat2 = leg_2.addOrReplaceChild("rotat2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition leg_1_rotat5 = rotat2.addOrReplaceChild(
				"leg_1_rotat5", CubeListBuilder.create().texOffs(0, 119).mirror()
						.addBox(-1.0F, -6.0F, -0.5102F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, -0.1745F, 0.9163F));
		PartDefinition cube_r23 = leg_1_rotat5.addOrReplaceChild(
				"cube_r23", CubeListBuilder.create().texOffs(15, 116).mirror()
						.addBox(-3.8228F, -19.5902F, -0.7551F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(7.813F, 1.2367F, 0.2449F, 0.0F, 0.0F, -0.6109F));
		PartDefinition leg_top_5 = leg_1_rotat5.addOrReplaceChild("leg_top_5", CubeListBuilder.create(),
				PartPose.offset(-4.187F, -11.7633F, 0.2449F));
		PartDefinition cube_r24 = leg_top_5.addOrReplaceChild(
				"cube_r24", CubeListBuilder.create().texOffs(60, 119).mirror()
						.addBox(2.9021F, -12.161F, -1.2551F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0242F, 0.5643F, 0.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition cube_r25 = leg_top_5.addOrReplaceChild(
				"cube_r25", CubeListBuilder.create().texOffs(71, 121).mirror()
						.addBox(2.1884F, -10.9749F, -1.7551F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0085F, 1.9221F, 0.0F, 0.0F, 0.0F, -1.2217F));
		PartDefinition cube_r26 = leg_top_5.addOrReplaceChild(
				"cube_r26", CubeListBuilder.create().texOffs(112, 112).mirror()
						.addBox(0.1375F, 2.5227F, -1.7651F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, 5.0F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r27 = leg_top_5.addOrReplaceChild(
				"cube_r27", CubeListBuilder.create().texOffs(96, 108).mirror()
						.addBox(-1.0756F, -12.81F, -1.7551F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, 4.0F, 0.0F, 0.0F, 0.0F, -1.0908F));
		PartDefinition leg_8 = body.addOrReplaceChild("leg_8", CubeListBuilder.create(), PartPose.offset(-7.0F, 3.0F, 1.0F));
		PartDefinition rotat8 = leg_8.addOrReplaceChild("rotat8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.7925F, 0.0F));
		PartDefinition leg_1_rotat6 = rotat8.addOrReplaceChild(
				"leg_1_rotat6", CubeListBuilder.create().texOffs(0, 119).mirror()
						.addBox(-1.0F, -6.0F, -0.5102F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, -0.1745F, 0.9163F));
		PartDefinition cube_r28 = leg_1_rotat6.addOrReplaceChild(
				"cube_r28", CubeListBuilder.create().texOffs(15, 116).mirror()
						.addBox(-3.8228F, -19.5902F, -0.7551F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(7.813F, 1.2367F, 0.2449F, 0.0F, 0.0F, -0.6109F));
		PartDefinition leg_top_6 = leg_1_rotat6.addOrReplaceChild("leg_top_6", CubeListBuilder.create(),
				PartPose.offset(-4.187F, -11.7633F, 0.2449F));
		PartDefinition cube_r29 = leg_top_6.addOrReplaceChild(
				"cube_r29", CubeListBuilder.create().texOffs(60, 119).mirror()
						.addBox(2.9021F, -12.161F, -1.2551F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0242F, 0.5643F, 0.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition cube_r30 = leg_top_6.addOrReplaceChild(
				"cube_r30", CubeListBuilder.create().texOffs(71, 121).mirror()
						.addBox(2.1884F, -10.9749F, -1.7551F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0085F, 1.9221F, 0.0F, 0.0F, 0.0F, -1.2217F));
		PartDefinition cube_r31 = leg_top_6.addOrReplaceChild(
				"cube_r31", CubeListBuilder.create().texOffs(112, 112).mirror()
						.addBox(0.1375F, 2.5227F, -1.7651F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, 5.0F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r32 = leg_top_6.addOrReplaceChild(
				"cube_r32", CubeListBuilder.create().texOffs(96, 108).mirror()
						.addBox(-1.0756F, -12.81F, -1.7551F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, 4.0F, 0.0F, 0.0F, 0.0F, -1.0908F));
		PartDefinition leg_7 = body.addOrReplaceChild("leg_7", CubeListBuilder.create(), PartPose.offset(-6.0F, 3.0F, 5.0F));
		PartDefinition rotat7 = leg_7.addOrReplaceChild("rotat7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition leg_1_rotat7 = rotat7.addOrReplaceChild(
				"leg_1_rotat7", CubeListBuilder.create().texOffs(0, 119).mirror()
						.addBox(-1.0F, -6.0F, -0.5102F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.1745F, 0.9163F));
		PartDefinition cube_r33 = leg_1_rotat7.addOrReplaceChild(
				"cube_r33", CubeListBuilder.create().texOffs(15, 116).mirror()
						.addBox(-3.8228F, -19.5902F, -0.7551F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(7.813F, 1.2367F, 0.2449F, 0.0F, 0.0F, -0.6109F));
		PartDefinition leg_top_7 = leg_1_rotat7.addOrReplaceChild("leg_top_7", CubeListBuilder.create(),
				PartPose.offset(-4.187F, -11.7633F, 0.2449F));
		PartDefinition cube_r34 = leg_top_7.addOrReplaceChild(
				"cube_r34", CubeListBuilder.create().texOffs(60, 119).mirror()
						.addBox(2.9021F, -12.161F, -1.2551F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0242F, 0.5643F, 0.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition cube_r35 = leg_top_7.addOrReplaceChild(
				"cube_r35", CubeListBuilder.create().texOffs(71, 121).mirror()
						.addBox(2.1884F, -10.9749F, -1.7551F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0085F, 1.9221F, 0.0F, 0.0F, 0.0F, -1.2217F));
		PartDefinition cube_r36 = leg_top_7.addOrReplaceChild(
				"cube_r36", CubeListBuilder.create().texOffs(112, 112).mirror()
						.addBox(0.1375F, 2.5227F, -1.7651F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, 5.0F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r37 = leg_top_7.addOrReplaceChild(
				"cube_r37", CubeListBuilder.create().texOffs(96, 108).mirror()
						.addBox(-1.0756F, -12.81F, -1.7551F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, 4.0F, 0.0F, 0.0F, 0.0F, -1.0908F));
		PartDefinition leg_3 = body.addOrReplaceChild("leg_3", CubeListBuilder.create(), PartPose.offset(-5.0F, 3.0F, 10.0F));
		PartDefinition rotat3 = leg_3.addOrReplaceChild("rotat3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.7053F, 0.0F));
		PartDefinition leg_1_rotat8 = rotat3.addOrReplaceChild(
				"leg_1_rotat8", CubeListBuilder.create().texOffs(0, 119).mirror()
						.addBox(-1.0F, -6.0F, -0.5102F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.1745F, 0.9163F));
		PartDefinition cube_r38 = leg_1_rotat8.addOrReplaceChild(
				"cube_r38", CubeListBuilder.create().texOffs(15, 116).mirror()
						.addBox(-3.8228F, -19.5902F, -0.7551F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(7.813F, 1.2367F, 0.2449F, 0.0F, 0.0F, -0.6109F));
		PartDefinition leg_top_8 = leg_1_rotat8.addOrReplaceChild("leg_top_8", CubeListBuilder.create(),
				PartPose.offset(-4.187F, -11.7633F, 0.2449F));
		PartDefinition cube_r39 = leg_top_8.addOrReplaceChild(
				"cube_r39", CubeListBuilder.create().texOffs(60, 119).mirror()
						.addBox(2.9021F, -12.161F, -1.2551F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0242F, 0.5643F, 0.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition cube_r40 = leg_top_8.addOrReplaceChild(
				"cube_r40", CubeListBuilder.create().texOffs(71, 121).mirror()
						.addBox(2.1884F, -10.9749F, -1.7551F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0085F, 1.9221F, 0.0F, 0.0F, 0.0F, -1.2217F));
		PartDefinition cube_r41 = leg_top_8.addOrReplaceChild(
				"cube_r41", CubeListBuilder.create().texOffs(112, 112).mirror()
						.addBox(0.1375F, 2.5227F, -1.7651F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, 5.0F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r42 = leg_top_8.addOrReplaceChild(
				"cube_r42", CubeListBuilder.create().texOffs(96, 108).mirror()
						.addBox(-1.0756F, -12.81F, -1.7551F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, 4.0F, 0.0F, 0.0F, 0.0F, -1.0908F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		if (((SpiderQueenEntity) entity).isRolling()) {
			this.body.xRot = ageInTicks * 0.5f;
			this.leg_1.yRot = -20;
			this.leg_2.yRot = 20;
			this.leg_3.yRot = 20;
			this.leg_4.yRot = -20;
			this.leg_5.yRot = -20;
			this.leg_6.yRot = -20;
			this.leg_7.yRot = 20;
			this.leg_8.yRot = 20;
			this.leg_top_1.yRot = 25;
			this.leg_top_2.yRot = 25;
			this.leg_top_3.yRot = 25;
			this.leg_top_4.yRot = 25;
			this.leg_top_5.yRot = 25;
			this.leg_top_6.yRot = 25;
			this.leg_top_7.yRot = 25;
			this.leg_top_8.yRot = 25;
		} else {
			this.body.xRot = 0;
			this.leg_2.yRot = Mth.cos(limbSwing * 1.0F) * -0.02F * limbSwingAmount;
			this.leg_1.yRot = Mth.cos(limbSwing * 1.0F) * 0.02F * limbSwingAmount;
			this.leg_4.yRot = Mth.cos(limbSwing * 1.0F) * 0.02F * limbSwingAmount;
			this.leg_3.yRot = Mth.cos(limbSwing * 1.0F) * -0.02F * limbSwingAmount;
			this.leg_6.yRot = Mth.cos(limbSwing * 1.0F) * 0.02F * limbSwingAmount;
			this.leg_5.yRot = Mth.cos(limbSwing * 1.0F) * -0.02F * limbSwingAmount;
			this.leg_8.yRot = Mth.cos(limbSwing * 1.0F) * 0.02F * limbSwingAmount;
			this.leg_7.yRot = Mth.cos(limbSwing * 1.0F) * -0.02F * limbSwingAmount;
			this.leg_top_2.yRot = Mth.cos(limbSwing * 1.0F) * -0.25F * limbSwingAmount;
			this.leg_top_1.yRot = Mth.cos(limbSwing * 1.0F) * 0.25F * limbSwingAmount;
			this.leg_top_4.yRot = Mth.cos(limbSwing * 1.0F) * 0.25F * limbSwingAmount;
			this.leg_top_3.yRot = Mth.cos(limbSwing * 1.0F) * -0.25F * limbSwingAmount;
			this.leg_top_6.yRot = Mth.cos(limbSwing * 1.0F) * 0.25F * limbSwingAmount;
			this.leg_top_5.yRot = Mth.cos(limbSwing * 1.0F) * -0.25F * limbSwingAmount;
			this.leg_top_8.yRot = Mth.cos(limbSwing * 1.0F) * 0.25F * limbSwingAmount;
			this.leg_top_7.yRot = Mth.cos(limbSwing * 1.0F) * -0.25F * limbSwingAmount;
			this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
			this.head.xRot = headPitch / (180F / (float) Math.PI);
		}
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
