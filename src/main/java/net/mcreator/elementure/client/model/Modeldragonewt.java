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
public class Modeldragonewt<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modeldragonewt"), "main");
	public final ModelPart body;
	public final ModelPart tailtop;
	public final ModelPart tailmid;
	public final ModelPart tailend;
	public final ModelPart wingsbottom;
	// bottom right
	public final ModelPart wing_bottom_right;
	public final ModelPart wingrightbottom1_r;
	public final ModelPart wingrightbottom2_r;
	public final ModelPart wingrightbottom3_r;
	public final ModelPart wingrightbottom4_r;
	public final ModelPart wingrightbottom5_r;
	public final ModelPart wingrightbottom6_r;
	public final ModelPart wingrightbottom7_r;
	public final ModelPart wingrightbottom8_r;
	// bottom left
	public final ModelPart wing_bottom_left;
	public final ModelPart wingleftbottom1_r;
	public final ModelPart wingleftbottom2_r;
	public final ModelPart wingleftbottom3_r;
	public final ModelPart wingleftbottom4_r;
	public final ModelPart wingleftbottom5_r;
	public final ModelPart wingleftbottom6_r;
	public final ModelPart wingleftbottom7_r;
	public final ModelPart wingleftbottom8_r;
	// --
	public final ModelPart wingstop;
	// top right
	public final ModelPart wing_top_right;
	public final ModelPart wingrighttop1_r;
	public final ModelPart wingrighttop2_r;
	public final ModelPart wingrighttop3_r;
	public final ModelPart wingrighttop4_r;
	public final ModelPart wingrighttop5_r;
	public final ModelPart wingrighttop6_r;
	public final ModelPart wingrighttop7_r;
	public final ModelPart wingrighttop8_r;
	// top left
	public final ModelPart wing_top_left;
	public final ModelPart winglefttop1_r;
	public final ModelPart winglefttop2_r;
	public final ModelPart winglefttop3_r;
	public final ModelPart winglefttop4_r;
	public final ModelPart winglefttop5_r;
	public final ModelPart winglefttop6_r;
	public final ModelPart winglefttop7_r;
	public final ModelPart winglefttop8_r;
	// --
	public final ModelPart head;

	public Modeldragonewt(ModelPart root) {
		this.body = root.getChild("body");
		this.tailtop = body.getChild("tailtop");
		this.tailmid = tailtop.getChild("tailmid");
		this.tailend = tailmid.getChild("tailend");
		this.wingsbottom = root.getChild("wingsbottom");
		// bottom right
		this.wing_bottom_right = wingsbottom.getChild("wing_bottom_right");
		this.wingrightbottom1_r = wing_bottom_right.getChild("wingrightbottom1_r");
		this.wingrightbottom2_r = wing_bottom_right.getChild("wingrightbottom2_r");
		this.wingrightbottom3_r = wing_bottom_right.getChild("wingrightbottom3_r");
		this.wingrightbottom4_r = wing_bottom_right.getChild("wingrightbottom4_r");
		this.wingrightbottom5_r = wing_bottom_right.getChild("wingrightbottom5_r");
		this.wingrightbottom6_r = wing_bottom_right.getChild("wingrightbottom6_r");
		this.wingrightbottom7_r = wing_bottom_right.getChild("wingrightbottom7_r");
		this.wingrightbottom8_r = wing_bottom_right.getChild("wingrightbottom8_r");
		// bottom left
		this.wing_bottom_left = wingsbottom.getChild("wing_bottom_left");
		this.wingleftbottom1_r = wing_bottom_left.getChild("wingleftbottom1_r");
		this.wingleftbottom2_r = wing_bottom_left.getChild("wingleftbottom2_r");
		this.wingleftbottom3_r = wing_bottom_left.getChild("wingleftbottom3_r");
		this.wingleftbottom4_r = wing_bottom_left.getChild("wingleftbottom4_r");
		this.wingleftbottom5_r = wing_bottom_left.getChild("wingleftbottom5_r");
		this.wingleftbottom6_r = wing_bottom_left.getChild("wingleftbottom6_r");
		this.wingleftbottom7_r = wing_bottom_left.getChild("wingleftbottom7_r");
		this.wingleftbottom8_r = wing_bottom_left.getChild("wingleftbottom8_r");
		// --
		this.wingstop = root.getChild("wingstop");
		// top right
		this.wing_top_right = wingstop.getChild("wing_top_right");
		this.wingrighttop1_r = wing_top_right.getChild("wingrighttop1_r");
		this.wingrighttop2_r = wing_top_right.getChild("wingrighttop2_r");
		this.wingrighttop3_r = wing_top_right.getChild("wingrighttop3_r");
		this.wingrighttop4_r = wing_top_right.getChild("wingrighttop4_r");
		this.wingrighttop5_r = wing_top_right.getChild("wingrighttop5_r");
		this.wingrighttop6_r = wing_top_right.getChild("wingrighttop6_r");
		this.wingrighttop7_r = wing_top_right.getChild("wingrighttop7_r");
		this.wingrighttop8_r = wing_top_right.getChild("wingrighttop8_r");
		// top left
		this.wing_top_left = wingstop.getChild("wing_top_left");
		this.winglefttop1_r = wing_top_left.getChild("winglefttop1_r");
		this.winglefttop2_r = wing_top_left.getChild("winglefttop2_r");
		this.winglefttop3_r = wing_top_left.getChild("winglefttop3_r");
		this.winglefttop4_r = wing_top_left.getChild("winglefttop4_r");
		this.winglefttop5_r = wing_top_left.getChild("winglefttop5_r");
		this.winglefttop6_r = wing_top_left.getChild("winglefttop6_r");
		this.winglefttop7_r = wing_top_left.getChild("winglefttop7_r");
		this.winglefttop8_r = wing_top_left.getChild("winglefttop8_r");
		// --
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(156, 26).mirror().addBox(-3.0F, -1.75F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(156, 26).mirror().addBox(-3.0F, -8.75F, -1.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(24, 2).addBox(-7.5F, -8.25F, -11.0F, 15.0F, 11.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(52, 29)
						.addBox(-7.0F, -7.75F, -13.0F, 14.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.25F, 3.0F));
		PartDefinition backspike_10_r1 = body.addOrReplaceChild("backspike_10_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -2.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -5.0F, 19.5F, -0.9599F, -0.3491F, -0.9599F));
		PartDefinition backspike_9_r1 = body.addOrReplaceChild("backspike_9_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -2.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -5.0F, 19.5F, -0.9599F, 0.3491F, 0.9599F));
		PartDefinition backspike_8_r1 = body.addOrReplaceChild("backspike_8_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -3.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -9.0F, 19.5F, -0.9599F, 0.3491F, 0.1745F));
		PartDefinition backspike_7_r1 = body.addOrReplaceChild("backspike_7_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -3.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -9.0F, 19.5F, -0.9599F, -0.3491F, -0.1745F));
		PartDefinition underspike_6_r1 = body.addOrReplaceChild("underspike_6_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 3.0F, -6.5F, 0.9599F, -0.4363F, -0.1745F));
		PartDefinition backspike_6_r1 = body.addOrReplaceChild("backspike_6_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -9.0F, -6.5F, -0.9599F, -0.4363F, -0.1745F));
		PartDefinition underspike_5_r1 = body.addOrReplaceChild("underspike_5_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -9.0F, 1.5F, -0.9599F, -0.4363F, -0.1745F));
		PartDefinition backspike_5_r1 = body.addOrReplaceChild("backspike_5_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 2.0F, 1.5F, 0.9599F, -0.4363F, -0.1745F));
		PartDefinition underspike_4_r1 = body.addOrReplaceChild("underspike_4_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 3.0F, 10.5F, 0.9599F, -0.4363F, -0.1745F));
		PartDefinition backspike_4_r1 = body.addOrReplaceChild("backspike_4_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -9.0F, 10.5F, -0.9599F, -0.4363F, -0.1745F));
		PartDefinition underspike_3_r1 = body.addOrReplaceChild("underspike_3_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 3.0F, 10.5F, 0.9599F, 0.4363F, 0.1745F));
		PartDefinition backspike_3_r1 = body.addOrReplaceChild("backspike_3_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -2.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -9.0F, 10.5F, -0.9599F, 0.4363F, 0.1745F));
		PartDefinition underspike_2_r1 = body.addOrReplaceChild("underspike_2_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 2.0F, 1.5F, 0.9599F, 0.4363F, 0.1745F));
		PartDefinition backspike_2_r1 = body.addOrReplaceChild("backspike_2_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -9.0F, 1.5F, -0.9599F, 0.4363F, 0.1745F));
		PartDefinition underspike_1_r1 = body.addOrReplaceChild("underspike_1_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 2.5F, -6.5F, 0.9599F, 0.4363F, 0.1745F));
		PartDefinition backspike_1_r1 = body.addOrReplaceChild("backspike_1_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -9.0F, -6.5F, -0.9599F, 0.4363F, 0.1745F));
		PartDefinition tailtop = body.addOrReplaceChild(
				"tailtop", CubeListBuilder.create().texOffs(84, 0).addBox(-6.5F, -5.0F, -1.0F, 13.0F, 9.0F, 14.0F, new CubeDeformation(0.0F))
						.texOffs(50, 43).addBox(-7.0F, -4.0F, -0.99F, 14.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.25F, 19.0F));
		PartDefinition backspike_12_r1 = tailtop.addOrReplaceChild("backspike_12_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-2.75F, -4.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 3.25F, 3.5F, -0.9163F, 0.48F, 0.6981F));
		PartDefinition backspike_11_r1 = tailtop.addOrReplaceChild("backspike_11_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(0.75F, -4.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 3.25F, 3.5F, -0.9163F, -0.48F, -0.6981F));
		PartDefinition backspike_20_r1 = tailtop.addOrReplaceChild("backspike_20_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -4.5F, -1.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.75F, 6.5F, -1.1345F, 0.0F, 0.0F));
		PartDefinition tailmid = tailtop.addOrReplaceChild(
				"tailmid", CubeListBuilder.create().texOffs(138, 0).addBox(-5.5F, -4.5F, -1.0F, 11.0F, 8.0F, 14.0F, new CubeDeformation(0.0F))
						.texOffs(138, 0).addBox(-6.0F, -4.0F, -0.99F, 12.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 13.0F));
		PartDefinition backspike_21_r1 = tailmid.addOrReplaceChild("backspike_21_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -2.5F, -2.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.75F, 8.5F, -1.309F, 0.0F, 0.0F));
		PartDefinition backspike_14_r1 = tailmid.addOrReplaceChild("backspike_14_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.25F, -4.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 3.25F, 3.5F, -0.9163F, -0.48F, -0.6981F));
		PartDefinition backspike_13_r1 = tailmid.addOrReplaceChild("backspike_13_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.75F, -4.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 3.25F, 3.5F, -0.9163F, 0.48F, 0.6981F));
		PartDefinition backspike_19_r1 = tailmid.addOrReplaceChild("backspike_19_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.25F, -1.5F, 1.1345F, 0.0F, 0.0F));
		PartDefinition tailend = tailmid.addOrReplaceChild(
				"tailend", CubeListBuilder.create().texOffs(116, 23).addBox(-4.5F, -3.5F, -1.0F, 9.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
						.texOffs(116, 23).addBox(-5.0F, -3.0F, -0.99F, 10.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 13.0F));
		PartDefinition backspike_18_r1 = tailend.addOrReplaceChild("backspike_18_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.25F, -4.5F, -1.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -2.75F, 4.5F, -1.309F, 0.48F, -2.3562F));
		PartDefinition backspike_17_r1 = tailend.addOrReplaceChild("backspike_17_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.75F, -4.5F, -1.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -2.75F, 4.5F, -1.309F, -0.48F, 2.3562F));
		PartDefinition backspike_16_r1 = tailend.addOrReplaceChild("backspike_16_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.75F, -3.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 3.25F, 4.5F, -1.309F, 0.48F, 0.9599F));
		PartDefinition backspike_15_r1 = tailend.addOrReplaceChild("backspike_15_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.25F, -3.5F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 3.25F, 4.5F, -1.309F, -0.48F, -0.9599F));
		PartDefinition tailbit = tailend.addOrReplaceChild("tailbit",
				CubeListBuilder.create().texOffs(156, 26).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.5F, 15.0F));
		PartDefinition wingsbottom = partdefinition.addOrReplaceChild("wingsbottom", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 0.0F));
		PartDefinition wing_bottom_left = wingsbottom.addOrReplaceChild("wing_bottom_left", CubeListBuilder.create(),
				PartPose.offsetAndRotation(7.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition wingleftbottom1_r = wing_bottom_left.addOrReplaceChild("wingleftbottom1_r",
				CubeListBuilder.create().texOffs(191, 255).addBox(-1.5F, 0.5F, -4.0F, 31.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition wingleftbottom2_r = wing_bottom_left.addOrReplaceChild("wingleftbottom2_r",
				CubeListBuilder.create().texOffs(190, 255).addBox(-1.5F, 0.5F, -3.0F, 32.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition wingleftbottom3_r = wing_bottom_left.addOrReplaceChild("wingleftbottom3_r",
				CubeListBuilder.create().texOffs(190, 250).addBox(-1.5F, 0.5F, -2.0F, 32.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition wingleftbottom4_r = wing_bottom_left.addOrReplaceChild("wingleftbottom4_r",
				CubeListBuilder.create().texOffs(190, 255).addBox(-1.5F, 0.5F, -1.0F, 32.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition wingleftbottom5_r = wing_bottom_left.addOrReplaceChild("wingleftbottom5_r",
				CubeListBuilder.create().texOffs(190, 250).addBox(-1.5F, 0.5F, 0.0F, 32.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition wingleftbottom6_r = wing_bottom_left.addOrReplaceChild("wingleftbottom6_r",
				CubeListBuilder.create().texOffs(192, 255).addBox(-1.5F, 0.5F, 1.0F, 30.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition wingleftbottom7_r = wing_bottom_left.addOrReplaceChild("wingleftbottom7_r",
				CubeListBuilder.create().texOffs(194, 255).addBox(-1.5F, 0.5F, 2.0F, 28.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition wingleftbottom8_r = wing_bottom_left.addOrReplaceChild("wingleftbottom8_r",
				CubeListBuilder.create().texOffs(198, 255).addBox(-1.5F, 0.5F, 3.0F, 24.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition wing_bottom_right = wingsbottom.addOrReplaceChild("wing_bottom_right", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-7.5F, -2.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition wingrightbottom1_r = wing_bottom_right.addOrReplaceChild(
				"wingrightbottom1_r", CubeListBuilder.create().texOffs(191, 250).mirror()
						.addBox(-30.5F, 0.5F, -4.0F, 31.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition wingrightbottom2_r = wing_bottom_right.addOrReplaceChild("wingrightbottom2_r", CubeListBuilder.create().texOffs(190, 220)
				.mirror().addBox(-31.5F, 0.5F, -3.0F, 32.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition wingrightbottom3_r = wing_bottom_right.addOrReplaceChild(
				"wingrightbottom3_r", CubeListBuilder.create().texOffs(190, 255).mirror()
						.addBox(-31.5F, 0.5F, -2.0F, 32.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition wingrightbottom4_r = wing_bottom_right.addOrReplaceChild(
				"wingrightbottom4_r", CubeListBuilder.create().texOffs(190, 250).mirror()
						.addBox(-31.5F, 0.5F, -1.0F, 32.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition wingrightbottom5_r = wing_bottom_right.addOrReplaceChild(
				"wingrightbottom5_r", CubeListBuilder.create().texOffs(190, 255).mirror()
						.addBox(-31.5F, 0.5F, 0.0F, 32.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition wingrightbottom6_r = wing_bottom_right.addOrReplaceChild(
				"wingrightbottom6_r", CubeListBuilder.create().texOffs(192, 250).mirror()
						.addBox(-29.5F, 0.5F, 1.0F, 30.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition wingrightbottom7_r = wing_bottom_right.addOrReplaceChild(
				"wingrightbottom7_r", CubeListBuilder.create().texOffs(194, 250).mirror()
						.addBox(-27.5F, 0.5F, 2.0F, 28.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition wingrightbottom8_r = wing_bottom_right.addOrReplaceChild(
				"wingrightbottom8_r", CubeListBuilder.create().texOffs(198, 250).mirror()
						.addBox(-23.5F, 0.5F, 3.0F, 24.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition wingstop = partdefinition.addOrReplaceChild("wingstop", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 7.0F));
		PartDefinition wing_top_left = wingstop.addOrReplaceChild("wing_top_left", CubeListBuilder.create(),
				PartPose.offsetAndRotation(7.5F, 1.0F, 5.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition winglefttop1_r = wing_top_left.addOrReplaceChild("winglefttop1_r",
				CubeListBuilder.create().texOffs(191, 234).addBox(-1.5F, 0.0F, -4.0F, 31.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition winglefttop2_r = wing_top_left.addOrReplaceChild("winglefttop2_r",
				CubeListBuilder.create().texOffs(190, 250).addBox(-1.5F, 0.0F, -3.0F, 32.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition winglefttop3_r = wing_top_left.addOrReplaceChild("winglefttop3_r",
				CubeListBuilder.create().texOffs(190, 234).addBox(-1.5F, 0.0F, -2.0F, 32.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition winglefttop4_r = wing_top_left.addOrReplaceChild("winglefttop4_r",
				CubeListBuilder.create().texOffs(190, 220).addBox(-1.5F, 0.0F, -1.0F, 32.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition winglefttop5_r = wing_top_left.addOrReplaceChild("winglefttop5_r",
				CubeListBuilder.create().texOffs(190, 234).addBox(-1.5F, 0.0F, 0.0F, 32.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition winglefttop6_r = wing_top_left.addOrReplaceChild("winglefttop6_r",
				CubeListBuilder.create().texOffs(192, 234).addBox(-1.5F, 0.0F, 1.0F, 30.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition winglefttop7_r = wing_top_left.addOrReplaceChild("winglefttop7_r",
				CubeListBuilder.create().texOffs(194, 234).addBox(-1.5F, 0.0F, 2.0F, 28.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition winglefttop8_r = wing_top_left.addOrReplaceChild("winglefttop8_r",
				CubeListBuilder.create().texOffs(198, 234).addBox(-1.5F, 0.0F, 3.0F, 24.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition wing_top_right = wingstop.addOrReplaceChild("wing_top_right", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-7.5F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition wingrighttop1_r = wing_top_right.addOrReplaceChild(
				"wingrighttop1_r", CubeListBuilder.create().texOffs(191, 220).mirror()
						.addBox(-31.0F, 0.0F, -4.0F, 31.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition wingrighttop2_r = wing_top_right.addOrReplaceChild(
				"wingrighttop2_r", CubeListBuilder.create().texOffs(190, 234).mirror()
						.addBox(-32.0F, 0.0F, -3.0F, 32.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition wingrighttop3_r = wing_top_right.addOrReplaceChild(
				"wingrighttop3_r", CubeListBuilder.create().texOffs(190, 255).mirror()
						.addBox(-32.0F, 0.0F, -2.0F, 32.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition wingrighttop4_r = wing_top_right.addOrReplaceChild(
				"wingrighttop4_r", CubeListBuilder.create().texOffs(190, 234).mirror()
						.addBox(-32.0F, 0.0F, -1.0F, 32.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition wingrighttop5_r = wing_top_right.addOrReplaceChild(
				"wingrighttop5_r", CubeListBuilder.create().texOffs(190, 220).mirror()
						.addBox(-32.0F, 0.0F, 0.0F, 32.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition wingrighttop6_r = wing_top_right.addOrReplaceChild(
				"wingrighttop6_r", CubeListBuilder.create().texOffs(192, 220).mirror()
						.addBox(-30.0F, 0.0F, 1.0F, 30.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition wingrighttop7_r = wing_top_right.addOrReplaceChild("wingrighttop7_r", CubeListBuilder.create().texOffs(194, 220).mirror()
				.addBox(-28.0F, 0.0F, 2.0F, 28.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition wingrighttop8_r = wing_top_right.addOrReplaceChild(
				"wingrighttop8_r", CubeListBuilder.create().texOffs(198, 220).mirror()
						.addBox(-24.0F, 0.0F, 3.0F, 24.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 18.0F, -10.0F));
		PartDefinition mouth_spike_left2_r1 = head.addOrReplaceChild("mouth_spike_left2_r1",
				CubeListBuilder.create().texOffs(99, 5).addBox(-3.0F, -1.0F, -0.5F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, 5.5F, -14.0F, 0.1309F, 0.9599F, 0.0F));
		PartDefinition mouth_spike_right2_r1 = head.addOrReplaceChild("mouth_spike_right2_r1",
				CubeListBuilder.create().texOffs(99, 5).addBox(-3.0F, -1.0F, -0.5F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, 5.5F, -14.0F, 0.1309F, -0.9599F, 0.0F));
		PartDefinition mouth_spike_left_r1 = head.addOrReplaceChild("mouth_spike_left_r1",
				CubeListBuilder.create().texOffs(99, 5).addBox(-7.0F, 2.5F, -14.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, -0.1745F, 0.0F));
		PartDefinition mouth_spike_right_r1 = head.addOrReplaceChild("mouth_spike_right_r1",
				CubeListBuilder.create().texOffs(99, 5).addBox(5.0F, 2.5F, -14.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.1745F, 0.0F));
		PartDefinition mouthfront_r1 = head.addOrReplaceChild("mouthfront_r1",
				CubeListBuilder.create().texOffs(0, 74).addBox(-3.49F, -4.0F, -6.25F, 7.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.5F, -7.5F, 0.4363F, 0.0F, 0.0F));
		PartDefinition mouth_r1 = head.addOrReplaceChild("mouth_r1",
				CubeListBuilder.create().texOffs(10, 8).addBox(-4.0F, -3.0F, -5.5F, 8.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.5F, -7.5F, 0.1745F, 0.0F, 0.0F));
		PartDefinition skull_rim2_r1 = head.addOrReplaceChild("skull_rim2_r1",
				CubeListBuilder.create().texOffs(0, 43).addBox(-1.35F, -2.0F, -13.0F, 2.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -5.0F, 0.48F, -0.3054F, 0.5236F));
		PartDefinition skull_rim_r1 = head.addOrReplaceChild("skull_rim_r1",
				CubeListBuilder.create().texOffs(0, 43).addBox(-0.65F, -2.0F, -13.01F, 2.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -5.0F, 0.48F, 0.3054F, -0.5236F));
		PartDefinition left_eyebrow_r1 = head.addOrReplaceChild("left_eyebrow_r1",
				CubeListBuilder.create().texOffs(0, 42).addBox(-2.5F, -0.75F, -12.5F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -6.0F, -1.0F, 0.5585F, -0.2182F, -0.1745F));
		PartDefinition right_eyebrow_r1 = head.addOrReplaceChild("right_eyebrow_r1",
				CubeListBuilder.create().texOffs(0, 42).addBox(0.5F, -0.75F, -12.5F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -6.0F, -1.0F, 0.5585F, 0.2182F, 0.1745F));
		PartDefinition left_eyebrow_mid_r1 = head.addOrReplaceChild("left_eyebrow_mid_r1",
				CubeListBuilder.create().texOffs(0, 34).addBox(-2.5F, -1.0F, -6.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -4.0F, -1.0F, 0.3054F, -0.3054F, -0.1745F));
		PartDefinition right_eyebrow_mid_r1 = head.addOrReplaceChild("right_eyebrow_mid_r1",
				CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -1.0F, -6.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -4.0F, -1.0F, 0.3054F, 0.3054F, 0.1745F));
		PartDefinition left_eyebrow_spike_r1 = head.addOrReplaceChild("left_eyebrow_spike_r1",
				CubeListBuilder.create().texOffs(0, 34).addBox(-2.5F, -1.6F, 1.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -4.0F, -1.0F, 0.6109F, 0.3927F, 0.0F));
		PartDefinition right_eyebrow_spike_r1 = head.addOrReplaceChild("right_eyebrow_spike_r1",
				CubeListBuilder.create().texOffs(0, 34).addBox(0.5F, -1.6F, 1.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -4.0F, -1.0F, 0.6109F, -0.3927F, 0.0F));
		PartDefinition left_eyebrow_top_r1 = head.addOrReplaceChild("left_eyebrow_top_r1",
				CubeListBuilder.create().texOffs(0, 34).addBox(-11.5F, -1.25F, -2.5F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-2.5F, -1.25F, -2.5F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -4.0F, -1.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition eye_left_r1 = head.addOrReplaceChild("eye_left_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.5F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.5F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -3.0F, -4.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition skull_top_r1 = head.addOrReplaceChild("skull_top_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -5.0F, -15.0F, 7.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(6, 6)
						.addBox(-5.5F, -3.0F, -8.0F, 11.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		/*
		 * This is for the body bobbing up and down
		 */
		this.head.setPos(0.0F, (float) (18.0F + Math.sin(ageInTicks / 10) * 1.5), -7.0F);
		this.body.setPos(0.0F, (float) (21.25F + Math.sin(ageInTicks / 10) * 1.5), 3.0F);
		/*
		 * These two have extra functions inside to make them bob with the wing movement
		 */
		this.wingsbottom.setPos(0.0F, (20.0F + (float) ((Math.sin(ageInTicks / 6) / 1.5) + (Math.sin(ageInTicks / 10) * 1.5))), 0.0F);
		this.wingstop.setPos(0.0F, (16.0F + (float) ((Math.cos(ageInTicks / 6) / 1.5) + (Math.sin(ageInTicks / 10) * 1.5))), 7.0F);
		/*
		 * This is the code to make the whole wing wave at once, adding this extra spin
		 * movement to its flying
		 */
		this.wing_top_left.zRot = (float) (Math.sin(ageInTicks / 6) / 5);
		this.wing_top_right.zRot = (float) (Math.sin(ageInTicks / 6) / -5);
		this.wing_bottom_left.zRot = (float) (Math.sin(ageInTicks / 6) / -5);
		this.wing_bottom_right.zRot = (float) (Math.sin(ageInTicks / 6) / 5);
		/*
		 * This is the code to make the wings do waves
		 */
		this.wingleftbottom1_r.zRot = (float) (Math.cos(ageInTicks / 6) / 3);
		this.wingleftbottom2_r.zRot = (float) (Math.cos(ageInTicks / 6 + 0.25) / 3);
		this.wingleftbottom3_r.zRot = (float) (Math.cos(ageInTicks / 6 + 0.5) / 3);
		this.wingleftbottom4_r.zRot = (float) (Math.cos(ageInTicks / 6 + 0.75) / 3);
		this.wingleftbottom5_r.zRot = (float) (Math.cos(ageInTicks / 6 + 1) / 3);
		this.wingleftbottom6_r.zRot = (float) (Math.cos(ageInTicks / 6 + 1.25) / 3);
		this.wingleftbottom7_r.zRot = (float) (Math.cos(ageInTicks / 6 + 1.5) / 3);
		this.wingleftbottom8_r.zRot = (float) (Math.cos(ageInTicks / 6 + 1.75) / 3);
		this.wingrightbottom1_r.zRot = (float) (Math.cos(ageInTicks / 6) / -3);
		this.wingrightbottom2_r.zRot = (float) (Math.cos(ageInTicks / 6 + 0.25) / -3);
		this.wingrightbottom3_r.zRot = (float) (Math.cos(ageInTicks / 6 + 0.5) / -3);
		this.wingrightbottom4_r.zRot = (float) (Math.cos(ageInTicks / 6 + 0.75) / -3);
		this.wingrightbottom5_r.zRot = (float) (Math.cos(ageInTicks / 6 + 1) / -3);
		this.wingrightbottom6_r.zRot = (float) (Math.cos(ageInTicks / 6 + 1.25) / -3);
		this.wingrightbottom7_r.zRot = (float) (Math.cos(ageInTicks / 6 + 1.5) / -3);
		this.wingrightbottom8_r.zRot = (float) (Math.cos(ageInTicks / 6 + 1.75) / -3);
		this.winglefttop1_r.zRot = (float) (Math.cos(ageInTicks / 6) / 3);
		this.winglefttop2_r.zRot = (float) (Math.cos(ageInTicks / 6 + 0.25) / 3);
		this.winglefttop3_r.zRot = (float) (Math.cos(ageInTicks / 6 + 0.5) / 3);
		this.winglefttop4_r.zRot = (float) (Math.cos(ageInTicks / 6 + 0.75) / 3);
		this.winglefttop5_r.zRot = (float) (Math.cos(ageInTicks / 6 + 1) / 3);
		this.winglefttop6_r.zRot = (float) (Math.cos(ageInTicks / 6 + 1.25) / 3);
		this.winglefttop7_r.zRot = (float) (Math.cos(ageInTicks / 6 + 1.5) / 3);
		this.winglefttop8_r.zRot = (float) (Math.cos(ageInTicks / 6 + 1.75) / 3);
		this.wingrighttop1_r.zRot = (float) (Math.cos(ageInTicks / 6) / -3);
		this.wingrighttop2_r.zRot = (float) (Math.cos(ageInTicks / 6 + 0.25) / -3);
		this.wingrighttop3_r.zRot = (float) (Math.cos(ageInTicks / 6 + 0.5) / -3);
		this.wingrighttop4_r.zRot = (float) (Math.cos(ageInTicks / 6 + 0.75) / -3);
		this.wingrighttop5_r.zRot = (float) (Math.cos(ageInTicks / 6 + 1) / -3);
		this.wingrighttop6_r.zRot = (float) (Math.cos(ageInTicks / 6 + 1.25) / -3);
		this.wingrighttop7_r.zRot = (float) (Math.cos(ageInTicks / 6 + 1.5) / -3);
		this.wingrighttop8_r.zRot = (float) (Math.cos(ageInTicks / 6 + 1.75) / -3);
		/* TO-DO the tail wag goes here */
		this.tailtop.yRot = (float) (Math.sin(ageInTicks / 6) / 4);
		this.tailmid.yRot = (float) (Math.sin(ageInTicks / 6 + 1.9) / 4);
		this.tailend.yRot = (float) (Math.sin(ageInTicks / 6 + 3.8) / 4);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingsbottom.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingstop.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
