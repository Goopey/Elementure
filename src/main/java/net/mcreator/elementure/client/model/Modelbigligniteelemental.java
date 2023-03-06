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
public class Modelbigligniteelemental<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelbigligniteelemental"), "main");
	public final ModelPart Body9;
	public final ModelPart Body8;
	public final ModelPart Body7;
	public final ModelPart Body6;
	public final ModelPart Crystal7;
	public final ModelPart Crystal6;
	public final ModelPart Crystal5;
	public final ModelPart Crystal4;
	public final ModelPart Crystal3;
	public final ModelPart Crystal2;
	public final ModelPart Crystal1;
	public final ModelPart Ring6;
	public final ModelPart Ring5;
	public final ModelPart Ring4;
	public final ModelPart Ring3;
	public final ModelPart Ring2;
	public final ModelPart Ring1;
	public final ModelPart Heart;
	public final ModelPart ShoulderLeft;
	public final ModelPart ShoulderRight;
	public final ModelPart HeadTop;
	public final ModelPart Body5;
	public final ModelPart Body4;
	public final ModelPart Body3;
	public final ModelPart Body2;
	public final ModelPart bb_main;

	public Modelbigligniteelemental(ModelPart root) {
		this.Body9 = root.getChild("Body9");
		this.Body8 = root.getChild("Body8");
		this.Body7 = root.getChild("Body7");
		this.Body6 = root.getChild("Body6");
		this.Crystal7 = root.getChild("Crystal7");
		this.Crystal6 = root.getChild("Crystal6");
		this.Crystal5 = root.getChild("Crystal5");
		this.Crystal4 = root.getChild("Crystal4");
		this.Crystal3 = root.getChild("Crystal3");
		this.Crystal2 = root.getChild("Crystal2");
		this.Crystal1 = root.getChild("Crystal1");
		this.Ring6 = root.getChild("Ring6");
		this.Ring5 = root.getChild("Ring5");
		this.Ring4 = root.getChild("Ring4");
		this.Ring3 = root.getChild("Ring3");
		this.Ring2 = root.getChild("Ring2");
		this.Ring1 = root.getChild("Ring1");
		this.Heart = root.getChild("Heart");
		this.ShoulderLeft = root.getChild("ShoulderLeft");
		this.ShoulderRight = root.getChild("ShoulderRight");
		this.HeadTop = root.getChild("HeadTop");
		this.Body5 = root.getChild("Body5");
		this.Body4 = root.getChild("Body4");
		this.Body3 = root.getChild("Body3");
		this.Body2 = root.getChild("Body2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body9 = partdefinition.addOrReplaceChild("Body9", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.3F, -1.4F, 0.7285F, 0.0F, 0.0F));
		PartDefinition Body8 = partdefinition.addOrReplaceChild("Body8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.3F, 1.4F, -0.7285F, 0.0F, 0.0F));
		PartDefinition Body7 = partdefinition.addOrReplaceChild("Body7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2F, 5.8F, 0.0F, 0.0456F, 0.0F, 0.3187F));
		PartDefinition Body6 = partdefinition.addOrReplaceChild("Body6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2F, 5.8F, 0.0F, 0.0456F, 0.0F, -0.3187F));
		PartDefinition Crystal7 = partdefinition.addOrReplaceChild("Crystal7", CubeListBuilder.create().texOffs(-6, 54).addBox(-6.0F, 0.0F, -4.0F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition Crystal6 = partdefinition.addOrReplaceChild("Crystal6", CubeListBuilder.create().texOffs(64, 48).addBox(0.0F, 0.0F, 0.0F, 6.0F, 15.0F, 0.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(5.0F, 9.3F, 5.5F, -0.3491F, 1.0472F, 0.0F));
		PartDefinition Crystal5 = partdefinition.addOrReplaceChild("Crystal5", CubeListBuilder.create().texOffs(48, 48).addBox(0.0F, 0.0F, 0.0F, 6.0F, 15.0F, 0.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(5.0F, 9.3F, -4.5F, 0.3491F, -1.0472F, 0.0F));
		PartDefinition Crystal4 = partdefinition.addOrReplaceChild("Crystal4", CubeListBuilder.create().texOffs(48, 28).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 15.0F, 0.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-5.0F, 9.3F, 5.5F, -0.3491F, -1.0472F, 0.0F));
		PartDefinition Crystal3 = partdefinition.addOrReplaceChild("Crystal3", CubeListBuilder.create().texOffs(64, 28).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 15.0F, 0.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-5.0F, 9.3F, -4.5F, 0.3491F, 1.0472F, 0.0F));
		PartDefinition Crystal2 = partdefinition.addOrReplaceChild("Crystal2", CubeListBuilder.create().texOffs(0, 36).addBox(-5.0F, 0.0F, 0.0F, 10.0F, 15.0F, 0.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 9.3F, -4.5F, 0.3491F, 0.0F, 0.0F));
		PartDefinition Crystal1 = partdefinition.addOrReplaceChild("Crystal1", CubeListBuilder.create().texOffs(24, 36).addBox(-5.0F, 0.0F, 0.0F, 10.0F, 15.0F, 0.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 9.3F, 5.5F, -0.3491F, 0.0F, 0.0F));
		PartDefinition Ring6 = partdefinition.addOrReplaceChild("Ring6", CubeListBuilder.create().texOffs(90, 0).addBox(-10.0F, -1.5F, -1.5F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 7.8F, -4.5F));
		PartDefinition Ring5 = partdefinition.addOrReplaceChild("Ring5", CubeListBuilder.create().texOffs(90, 0).addBox(-10.0F, -1.51F, -1.5F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 7.8F, 5.5F));
		PartDefinition Ring4 = partdefinition.addOrReplaceChild("Ring4", CubeListBuilder.create().texOffs(72, 12).addBox(-1.5F, -1.51F, -7.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 7.8F, 1.0F, 0.0F, -0.4887F, 0.0F));
		PartDefinition Ring3 = partdefinition.addOrReplaceChild("Ring3", CubeListBuilder.create().texOffs(72, 12).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 7.8F, 0.0F, 0.0F, 0.4887F, 0.0F));
		PartDefinition Ring2 = partdefinition.addOrReplaceChild("Ring2", CubeListBuilder.create().texOffs(72, 12).addBox(-1.5F, -1.51F, -7.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 7.8F, 1.0F, 0.0F, 0.4887F, 0.0F));
		PartDefinition Ring1 = partdefinition.addOrReplaceChild("Ring1", CubeListBuilder.create().texOffs(72, 12).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 7.8F, 0.0F, 0.0F, -0.4887F, 0.0F));
		PartDefinition Heart = partdefinition.addOrReplaceChild("Heart", CubeListBuilder.create().texOffs(40, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.3F, 0.0F));
		PartDefinition ShoulderLeft = partdefinition.addOrReplaceChild("ShoulderLeft", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-13.0F, -13.7F, 0.0F));
		PartDefinition ShouldersideLeft1 = ShoulderLeft.addOrReplaceChild("ShouldersideLeft1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6F, 3.0F, 0.0F));
		PartDefinition Shouldersideleft2 = ShoulderLeft.addOrReplaceChild("Shouldersideleft2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.6F, 3.0F, 0.0F));
		PartDefinition LeftArm = ShoulderLeft.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition LeftRing = LeftArm.addOrReplaceChild("LeftRing", CubeListBuilder.create().texOffs(100, 24).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.9F, 0.0F));
		PartDefinition ShoulderRight = partdefinition.addOrReplaceChild("ShoulderRight", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(13.0F, -13.7F, 0.0F));
		PartDefinition Shouldersideright1 = ShoulderRight.addOrReplaceChild("Shouldersideright1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6F, 3.0F, 0.0F));
		PartDefinition Shouldersideright2 = ShoulderRight.addOrReplaceChild("Shouldersideright2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.6F, 3.0F, 0.0F));
		PartDefinition RightArm = ShoulderRight.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition RightRing = RightArm.addOrReplaceChild("RightRing", CubeListBuilder.create().texOffs(100, 24).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.9F, 0.0F));
		PartDefinition HeadTop = partdefinition.addOrReplaceChild("HeadTop", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -23.2F, 0.0F));
		PartDefinition HeadSide1 = HeadTop.addOrReplaceChild("HeadSide1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 2.0F, 0.0F));
		PartDefinition HeadSide2 = HeadTop.addOrReplaceChild("HeadSide2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 2.0F, 0.0F));
		PartDefinition HeadBack = HeadTop.addOrReplaceChild("HeadBack", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 1.0F));
		PartDefinition HeadBottom1 = HeadTop.addOrReplaceChild("HeadBottom1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 5.0F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition HeadBottom2 = HeadTop.addOrReplaceChild("HeadBottom2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -4.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition HeadBottom3 = HeadTop.addOrReplaceChild("HeadBottom3", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.7F, 0.0F));
		PartDefinition HeadBottom4 = HeadTop.addOrReplaceChild("HeadBottom4", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0F, -4.0F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.7F, 0.0F));
		PartDefinition HeadBottom5 = HeadTop.addOrReplaceChild("HeadBottom5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.7F, 0.0F));
		PartDefinition HeadBottom6 = HeadTop.addOrReplaceChild("HeadBottom6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.7F, 0.0F));
		PartDefinition Eyes = HeadTop.addOrReplaceChild("Eyes", CubeListBuilder.create().texOffs(60, 0).addBox(-2.5F, -1.0F, -0.5F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.4F, -3.0F));
		PartDefinition Headside3 = HeadTop.addOrReplaceChild("Headside3", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.5F, 0.8F, 0.0F));
		PartDefinition Headside4 = HeadTop.addOrReplaceChild("Headside4", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, 0.8F, 0.0F));
		PartDefinition Body5 = partdefinition.addOrReplaceChild("Body5", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -14.7F, 0.7F, 0.0F, -1.0472F, 0.0F));
		PartDefinition Body51 = Body5.addOrReplaceChild("Body51", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition Body52 = Body5.addOrReplaceChild("Body52", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -2.0F));
		PartDefinition Body53 = Body5.addOrReplaceChild("Body53", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, -2.0F));
		PartDefinition Body54 = Body5.addOrReplaceChild("Body54", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, -2.0F));
		PartDefinition Body4 = partdefinition.addOrReplaceChild("Body4", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -14.7F, -0.7F, 0.0F, 1.0472F, 0.0F));
		PartDefinition Body41 = Body4.addOrReplaceChild("Body41", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));
		PartDefinition Body42 = Body4.addOrReplaceChild("Body42", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 2.0F));
		PartDefinition Body43 = Body4.addOrReplaceChild("Body43", CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 2.0F));
		PartDefinition Body44 = Body4.addOrReplaceChild("Body44", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 2.0F));
		PartDefinition Body3 = partdefinition.addOrReplaceChild("Body3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -14.7F, -1.0F, 0.0F, 1.0472F, 0.0F));
		PartDefinition Body31 = Body3.addOrReplaceChild("Body31", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition Body32 = Body3.addOrReplaceChild("Body32", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 2.0F, -2.0F));
		PartDefinition Body33 = Body3.addOrReplaceChild("Body33", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 5.0F, -2.0F));
		PartDefinition Body34 = Body3.addOrReplaceChild("Body34", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, -2.0F));
		PartDefinition Body2 = partdefinition.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -14.7F, 1.0F, 0.0F, -1.0472F, 0.0F));
		PartDefinition Body21 = Body2.addOrReplaceChild("Body21", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));
		PartDefinition Body22 = Body2.addOrReplaceChild("Body22", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 2.0F, 2.0F));
		PartDefinition Body23 = Body2.addOrReplaceChild("Body23", CubeListBuilder.create().texOffs(42, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 5.0F, 2.0F));
		PartDefinition Body24 = Body2.addOrReplaceChild("Body24", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 2.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(37, 0).addBox(-2.0F, -36.2F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Crystal7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Crystal6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Crystal5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Crystal4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Crystal3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Crystal2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Crystal1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Heart.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ShoulderLeft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ShoulderRight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		HeadTop.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.HeadTop.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.HeadTop.xRot = headPitch / (180F / (float) Math.PI);
		this.ShoulderLeft.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.ShoulderRight.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
