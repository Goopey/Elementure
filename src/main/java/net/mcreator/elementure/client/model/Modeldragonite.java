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
public class Modeldragonite<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modeldragonite"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart wings;
	public final ModelPart wing1right;
	public final ModelPart wing2right;
	public final ModelPart wing1left;
	public final ModelPart wing2left;
	public final ModelPart tailtop;
	public final ModelPart tailmid;
	public final ModelPart tailend;
	public final ModelPart tailbit;

	public Modeldragonite(ModelPart root) {
		this.body = root.getChild("body");
		this.head = body.getChild("head");
		this.wings = body.getChild("wings");
		this.wing1right = wings.getChild("wing1right");
		this.wing2right = wings.getChild("wing2right");
		this.wing1left = wings.getChild("wing1left");
		this.wing2left = wings.getChild("wing2left");
		this.tailtop = body.getChild("tailtop");
		this.tailmid = tailtop.getChild("tailmid");
		this.tailend = tailmid.getChild("tailend");
		this.tailbit = tailend.getChild("tailbit");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(24, 2).addBox(-7.5F, -8.25F, -11.0F, 15.0F, 11.0F, 30.0F, new CubeDeformation(0.5F)).texOffs(52, 29)
						.addBox(-7.49F, -7.75F, -13.0F, 15.0F, 10.0F, 3.0F, new CubeDeformation(0.5F)).texOffs(156, 26).mirror()
						.addBox(-3.0F, -5.75F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(3.5F)).mirror(false),
				PartPose.offset(0.0F, 21.25F, 3.0F));
		PartDefinition backspike_8_r1 = body.addOrReplaceChild("backspike_8_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -3.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(5.0F, -9.0F, 19.5F, -0.9599F, 0.3491F, 0.1745F));
		PartDefinition backspike_7_r1 = body.addOrReplaceChild("backspike_7_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -3.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-5.0F, -9.0F, 19.5F, -0.9599F, -0.3491F, -0.1745F));
		PartDefinition underspike_6_r1 = body.addOrReplaceChild("underspike_6_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-5.0F, 3.0F, -6.5F, 0.9599F, -0.4363F, -0.1745F));
		PartDefinition backspike_6_r1 = body.addOrReplaceChild("backspike_6_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-5.0F, -9.0F, -6.5F, -0.9599F, -0.4363F, -0.1745F));
		PartDefinition underspike_4_r1 = body.addOrReplaceChild("underspike_4_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-5.0F, 3.0F, 10.5F, 0.9599F, -0.4363F, -0.1745F));
		PartDefinition underspike_3_r1 = body.addOrReplaceChild("underspike_3_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(5.0F, 3.0F, 10.5F, 0.9599F, 0.4363F, 0.1745F));
		PartDefinition underspike_1_r1 = body.addOrReplaceChild("underspike_1_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(5.0F, 2.5F, -6.5F, 0.9599F, 0.4363F, 0.1745F));
		PartDefinition backspike_1_r1 = body.addOrReplaceChild("backspike_1_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(5.0F, -9.0F, -6.5F, -0.9599F, 0.4363F, 0.1745F));
		PartDefinition tailtop = body.addOrReplaceChild(
				"tailtop", CubeListBuilder.create().texOffs(84, 0).addBox(-6.5F, -5.0F, -1.0F, 13.0F, 9.0F, 14.0F, new CubeDeformation(0.5F))
						.texOffs(50, 43).addBox(-7.0F, -4.0F, -0.99F, 14.0F, 7.0F, 14.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, -2.25F, 19.0F));
		PartDefinition backspike_12_r1 = tailtop.addOrReplaceChild("backspike_12_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-2.75F, -4.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(7.0F, 3.25F, 3.5F, -0.9163F, 0.48F, 0.6981F));
		PartDefinition backspike_11_r1 = tailtop.addOrReplaceChild("backspike_11_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(0.75F, -4.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-7.0F, 3.25F, 3.5F, -0.9163F, -0.48F, -0.6981F));
		PartDefinition tailmid = tailtop.addOrReplaceChild(
				"tailmid", CubeListBuilder.create().texOffs(138, 0).addBox(-5.5F, -4.5F, -1.0F, 11.0F, 8.0F, 14.0F, new CubeDeformation(0.5F))
						.texOffs(138, 0).addBox(-6.0F, -4.0F, -0.99F, 12.0F, 7.0F, 14.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 13.0F));
		PartDefinition backspike_14_r1 = tailmid.addOrReplaceChild("backspike_14_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.75F, -2.75F, -2.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-7.75F, -4.25F, 7.0F, -1.6144F, -0.48F, 0.6981F));
		PartDefinition backspike_13_r1 = tailmid.addOrReplaceChild("backspike_13_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.25F, -2.75F, -2.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(7.75F, -4.25F, 7.0F, -1.6144F, 0.48F, -0.6981F));
		PartDefinition backspike_19_r1 = tailmid.addOrReplaceChild("backspike_19_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 4.25F, -1.5F, 1.1345F, 0.0F, 0.0F));
		PartDefinition tailend = tailmid.addOrReplaceChild(
				"tailend", CubeListBuilder.create().texOffs(116, 23).addBox(-4.5F, -3.5F, -1.0F, 9.0F, 6.0F, 9.0F, new CubeDeformation(0.5F))
						.texOffs(116, 23).addBox(-5.0F, -3.0F, -0.99F, 10.0F, 5.0F, 9.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 13.0F));
		PartDefinition backspike_18_r1 = tailend.addOrReplaceChild("backspike_18_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.25F, -4.5F, -1.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-5.0F, -2.75F, 4.5F, -1.309F, 0.3927F, -2.3562F));
		PartDefinition backspike_17_r1 = tailend.addOrReplaceChild("backspike_17_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.75F, -4.5F, -1.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(5.0F, -2.75F, 4.5F, -1.309F, -0.3927F, 2.3562F));
		PartDefinition backspike_16_r1 = tailend.addOrReplaceChild("backspike_16_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.75F, -3.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(5.0F, 3.25F, 4.5F, -1.309F, 0.3927F, 0.9599F));
		PartDefinition backspike_15_r1 = tailend.addOrReplaceChild("backspike_15_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.25F, -3.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-5.0F, 3.25F, 4.5F, -1.309F, -0.3927F, -0.9599F));
		PartDefinition tailbit = tailend.addOrReplaceChild("tailbit",
				CubeListBuilder.create().texOffs(119, 24).addBox(-4.0F, -2.5F, -7.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, -0.5F, 15.0F));
		PartDefinition backspike_20_r1 = tailbit.addOrReplaceChild("backspike_20_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(0.0F, -4.5F, -1.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -1.5708F, -0.3054F, 1.5708F));
		PartDefinition backspike_19_r2 = tailbit.addOrReplaceChild("backspike_19_r2",
				CubeListBuilder.create().texOffs(0, 7).addBox(-3.0F, -4.5F, -1.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.3054F, 1.5708F));
		PartDefinition wings = body.addOrReplaceChild("wings", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));
		PartDefinition wing1left = wings.addOrReplaceChild("wing1left", CubeListBuilder.create(), PartPose.offset(8.0F, 0.0F, 2.0F));
		PartDefinition wing12lleft_r1 = wing1left.addOrReplaceChild("wing12lleft_r1",
				CubeListBuilder.create().texOffs(156, 239).addBox(15.0F, -3.0F, 0.0F, 42.0F, -6.0F, 8.0F, new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0F, 1.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition wing11lleft_r1 = wing1left.addOrReplaceChild("wing11lleft_r1",
				CubeListBuilder.create().texOffs(156, 218).addBox(0.0F, 0.0F, -3.0F, 40.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition wing2left = wings.addOrReplaceChild("wing2left",
				CubeListBuilder.create().texOffs(156, 227).addBox(-1.0F, 0.0F, 0.0F, 40.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 248)
						.addBox(14.0F, 11.0F, -3.0F, 42.0F, -6.0F, 8.0F, new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition wing1right = wings.addOrReplaceChild("wing1right", CubeListBuilder.create(), PartPose.offset(-8.0F, 0.0F, 2.0F));
		PartDefinition wiing12right_r1 = wing1right.addOrReplaceChild("wiing12right_r1",
				CubeListBuilder.create().texOffs(0, 239).addBox(-71.0F, -2.0F, 0.0F, 42.0F, -6.0F, 8.0F, new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(15.0F, -2.0F, 1.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition wiing11right_r1 = wing1right.addOrReplaceChild("wiing11right_r1",
				CubeListBuilder.create().texOffs(0, 227).addBox(-54.0F, 1.0F, -3.0F, 40.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition wing2right = wings.addOrReplaceChild("wing2right",
				CubeListBuilder.create().texOffs(0, 217).addBox(-39.0F, 0.0F, -10.0F, 40.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(156, 248)
						.addBox(-56.0F, 11.0F, -13.0F, 42.0F, -6.0F, 8.0F, new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(-8.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(207, 0).addBox(-6.5F, -1.0F, -9.5F, 13.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(207, 38)
						.addBox(-2.5F, -5.75F, -13.9F, 5.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -13.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition hornleft_r1 = head.addOrReplaceChild("hornleft_r1",
				CubeListBuilder.create().texOffs(224, 92).addBox(-1.5F, -9.0F, -1.0F, 5.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -7.0F, -15.0F, -1.4835F, -0.3491F, 2.0508F));
		PartDefinition hornright_r1 = head.addOrReplaceChild(
				"hornright_r1", CubeListBuilder.create().texOffs(224, 91).mirror()
						.addBox(-3.5F, -10.0F, -1.0F, 5.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0F, -7.0F, -15.0F, -1.4835F, 0.3491F, -2.0508F));
		PartDefinition rim_4_r1 = head.addOrReplaceChild(
				"rim_4_r1", CubeListBuilder.create().texOffs(212, 60).mirror()
						.addBox(-0.5F, -2.0F, -6.0F, 3.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -5.0F, -7.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition rim_3_r1 = head.addOrReplaceChild("rim_3_r1",
				CubeListBuilder.create().texOffs(212, 60).addBox(-2.5F, -2.0F, -6.0F, 3.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -5.0F, -7.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition rim_2_r1 = head.addOrReplaceChild(
				"rim_2_r1", CubeListBuilder.create().texOffs(212, 60).mirror()
						.addBox(-0.5F, -2.0F, -8.0F, 3.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, -3.0F, -7.0F, 0.0F, 0.1309F, 0.5236F));
		PartDefinition rim_1_r1 = head.addOrReplaceChild("rim_1_r1",
				CubeListBuilder.create().texOffs(212, 60).addBox(-2.5F, -2.0F, -8.0F, 3.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -3.0F, -7.0F, 0.0F, -0.1309F, -0.5236F));
		PartDefinition headtop_r1 = head.addOrReplaceChild("headtop_r1",
				CubeListBuilder.create().texOffs(200, 36).addBox(-5.0F, -3.5F, -14.9F, 10.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition mouth2_r1 = head.addOrReplaceChild("mouth2_r1",
				CubeListBuilder.create().texOffs(228, 29).addBox(-5.99F, -1.15F, -0.75F, 12.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, -15.25F, 0.2618F, 0.0F, -3.1416F));
		PartDefinition mouth_r1 = head.addOrReplaceChild("mouth_r1",
				CubeListBuilder.create().texOffs(138, 58).addBox(-6.0F, -2.5F, -14.75F, 12.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition chin_r1 = head.addOrReplaceChild("chin_r1",
				CubeListBuilder.create().texOffs(220, 17).addBox(-5.0F, 0.5F, -14.5F, 10.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI) + 0.17453292519943295769236907684886F;
		this.body.setPos(0.0F, 16.F + (float) (Math.sin(ageInTicks / 10) * 2), 0.0F);
		// x is movement away from body
		// y is vertical bobbing for wings
		// z is front-back bobbing the wings have (front are bobbing together but not
		// with back)
		this.wing1left.setPos((float) (Math.sin(ageInTicks / 10) * -3), (float) (Math.sin(ageInTicks / 10) / 4),
				(float) (Math.sin(ageInTicks / 10) * 2));
		this.wing2left.setPos((float) (Math.sin(ageInTicks / 10) * -3), (float) (Math.sin(ageInTicks / 10) / 4),
				(float) (-Math.sin(ageInTicks / 10) * 2));
		this.wing1right.setPos((float) (Math.sin(ageInTicks / 10) * 3), (float) (Math.sin(ageInTicks / 10) / 4),
				(float) (Math.sin(ageInTicks / 10) * 2));
		this.wing2right.setPos((float) (Math.sin(ageInTicks / 10) * 3), (float) (Math.sin(ageInTicks / 10) / 4),
				(float) (-Math.sin(ageInTicks / 10) * 2));
		// wing rotation/flapping animation
		this.wing1left.zRot = (float) (-Math.sin(ageInTicks / 20) / 2.5);
		this.wing1right.zRot = (float) (Math.sin(ageInTicks / 20) / 2.5);
		this.wing2left.zRot = (float) (Math.sin(ageInTicks / 20) / 2.5);
		this.wing2right.zRot = (float) (-Math.sin(ageInTicks / 20) / 2.5);
		/* the tail wag goes here */
		this.tailtop.yRot = (float) (Math.sin(ageInTicks / 6) / 4);
		this.tailmid.yRot = (float) (Math.sin(ageInTicks / 6 + 1.9) / 4);
		this.tailend.yRot = (float) (Math.sin(ageInTicks / 6 + 3.8) / 4);
		this.tailbit.yRot = (float) (-Math.sin(ageInTicks / 6) / 8);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
