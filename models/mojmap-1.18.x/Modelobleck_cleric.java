// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelobleck_cleric<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "obleck_cleric"), "main");
	private final ModelPart leg_r;
	private final ModelPart leg_l;
	private final ModelPart main_body;
	private final ModelPart arm_l;
	private final ModelPart arm_r;
	private final ModelPart mid_gem;
	private final ModelPart mid_gem2;
	private final ModelPart bb_main;

	public Modelobleck_cleric(ModelPart root) {
		this.leg_r = root.getChild("leg_r");
		this.leg_l = root.getChild("leg_l");
		this.main_body = root.getChild("main_body");
		this.arm_l = root.getChild("arm_l");
		this.arm_r = root.getChild("arm_r");
		this.mid_gem = root.getChild("mid_gem");
		this.mid_gem2 = root.getChild("mid_gem2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leg_r = partdefinition.addOrReplaceChild("leg_r", CubeListBuilder.create().texOffs(0, 54).addBox(
				-3.5F, 0.0F, -1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition leg_l = partdefinition.addOrReplaceChild("leg_l",
				CubeListBuilder.create().texOffs(0, 54).mirror()
						.addBox(0.5F, 0.0F, -1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition main_body = partdefinition.addOrReplaceChild("main_body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -3.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-2.0F, 4.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-3.0F, -2.0F, -4.75F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 0.0F));

		PartDefinition back_ear_right = main_body.addOrReplaceChild("back_ear_right", CubeListBuilder.create()
				.texOffs(13, 23).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 26).mirror()
				.addBox(-0.5F, -2.75F, 1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 26)
				.mirror().addBox(-0.5F, -1.25F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 16).mirror().addBox(-0.5F, 0.25F, 1.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offsetAndRotation(-4.0F, -1.0F, 1.5F, 0.4363F, -0.3491F, -0.2618F));

		PartDefinition spike_right_side_r1 = back_ear_right.addOrReplaceChild("spike_right_side_r1",
				CubeListBuilder.create().texOffs(0, 26).mirror()
						.addBox(-0.5F, -10.75F, 1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.3927F, 0.1745F, 0.0873F));

		PartDefinition back_ear_left = main_body.addOrReplaceChild("back_ear_left",
				CubeListBuilder.create().texOffs(13, 23)
						.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-0.5F, -2.75F, 1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-0.5F, -1.25F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 16)
						.addBox(-0.5F, 0.25F, 1.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -1.0F, 1.5F, 0.4363F, 0.3491F, 0.2182F));

		PartDefinition spike_left_side_r1 = back_ear_left.addOrReplaceChild("spike_left_side_r1",
				CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -10.75F, 1.75F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.3927F, -0.1745F, -0.0873F));

		PartDefinition ear_top_right = main_body.addOrReplaceChild("ear_top_right",
				CubeListBuilder.create().texOffs(0, 17).mirror()
						.addBox(-3.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 26).mirror()
						.addBox(-2.75F, -0.75F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.5F, 1.5F, 0.3927F, -0.2182F, -0.3054F));

		PartDefinition ear_top_right2 = main_body.addOrReplaceChild("ear_top_right2",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(1.75F, -0.75F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5F, 1.5F, 0.3927F, 0.2182F, 0.3054F));

		PartDefinition arm_l = partdefinition.addOrReplaceChild("arm_l",
				CubeListBuilder.create().texOffs(56, 0).mirror()
						.addBox(-0.5F, -1.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(4.0F, 12.0F, 0.0F));

		PartDefinition arm_r = partdefinition.addOrReplaceChild("arm_r", CubeListBuilder.create().texOffs(56, 0)
				.addBox(-1.5F, -1.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 12.0F, 0.0F));

		PartDefinition mid_gem = partdefinition.addOrReplaceChild("mid_gem", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition gem_8_r1 = mid_gem.addOrReplaceChild("gem_8_r1",
				CubeListBuilder.create().texOffs(56, 32).addBox(0.5F, -7.5F, -2.4683F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2346F, 6.2171F, -5.2002F, 0.7615F, 0.6471F, 0.5321F));

		PartDefinition gem_7_r1 = mid_gem.addOrReplaceChild("gem_7_r1",
				CubeListBuilder.create().texOffs(56, 32).addBox(0.0F, -9.5F, 0.0F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3238F, 5.2643F, -0.7615F, -0.6471F, 0.5321F));

		PartDefinition gem_6_r1 = mid_gem.addOrReplaceChild("gem_6_r1",
				CubeListBuilder.create().texOffs(56, 32).addBox(-1.0F, -21.0F, -2.01F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.6457F, 0.3315F, 0.2618F, 0.0F, 0.5236F));

		PartDefinition gem_5_r1 = mid_gem.addOrReplaceChild("gem_5_r1",
				CubeListBuilder.create().texOffs(56, 32).addBox(-1.0F, -21.0F, -2.01F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.6457F, 0.3315F, 0.2618F, 0.0F, -0.5236F));

		PartDefinition gem_4_r1 = mid_gem.addOrReplaceChild("gem_4_r1",
				CubeListBuilder.create().texOffs(56, 32).addBox(-1.0F, -21.0F, -0.01F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.6457F, 0.3315F, -0.2618F, 0.0F, -0.5236F));

		PartDefinition gem_3_r1 = mid_gem.addOrReplaceChild("gem_3_r1",
				CubeListBuilder.create().texOffs(56, 32).addBox(-1.0F, -21.0F, -0.01F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.6457F, 0.3315F, -0.2618F, 0.0F, 0.5236F));

		PartDefinition gem_2_r1 = mid_gem.addOrReplaceChild("gem_2_r1",
				CubeListBuilder.create().texOffs(56, 32).addBox(0.0F, -20.0F, -1.01F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.6457F, 0.3315F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gem_1_r1 = mid_gem.addOrReplaceChild("gem_1_r1",
				CubeListBuilder.create().texOffs(56, 32).addBox(-2.0F, -20.0F, -1.01F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.6457F, 0.3315F, 0.0F, 0.0F, -0.3927F));

		PartDefinition mid_gem2 = partdefinition.addOrReplaceChild("mid_gem2", CubeListBuilder.create(),
				PartPose.offset(0.0134F, -3.5328F, -0.1678F));

		PartDefinition gem_9_r1 = mid_gem2.addOrReplaceChild("gem_9_r1",
				CubeListBuilder.create().texOffs(56, 32).addBox(0.5F, -7.5F, -2.4683F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2212F, -2.3158F, -5.368F, 0.7615F, 0.6471F, 0.5321F));

		PartDefinition gem_8_r2 = mid_gem2.addOrReplaceChild("gem_8_r2",
				CubeListBuilder.create().texOffs(56, 32).addBox(0.0F, -9.5F, 0.0F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0134F, -0.2091F, 5.0965F, -0.7615F, -0.6471F, 0.5321F));

		PartDefinition gem_7_r2 = mid_gem2.addOrReplaceChild("gem_7_r2",
				CubeListBuilder.create().texOffs(56, 32).addBox(-1.0F, -21.0F, -2.01F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0134F, 9.1128F, 0.1637F, 0.2618F, 0.0F, 0.5236F));

		PartDefinition gem_6_r2 = mid_gem2.addOrReplaceChild("gem_6_r2",
				CubeListBuilder.create().texOffs(56, 32).addBox(-1.0F, -21.0F, -2.01F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0134F, 9.1128F, 0.1637F, 0.2618F, 0.0F, -0.5236F));

		PartDefinition gem_5_r2 = mid_gem2.addOrReplaceChild("gem_5_r2",
				CubeListBuilder.create().texOffs(56, 32).addBox(-1.0F, -21.0F, -0.01F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0134F, 9.1128F, 0.1637F, -0.2618F, 0.0F, -0.5236F));

		PartDefinition gem_4_r2 = mid_gem2.addOrReplaceChild("gem_4_r2",
				CubeListBuilder.create().texOffs(56, 32).addBox(-1.0F, -21.0F, -0.01F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0134F, 9.1128F, 0.1637F, -0.2618F, 0.0F, 0.5236F));

		PartDefinition gem_3_r2 = mid_gem2.addOrReplaceChild("gem_3_r2",
				CubeListBuilder.create().texOffs(56, 32).addBox(0.0F, -20.0F, -1.01F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0134F, 9.1128F, 0.1637F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gem_2_r2 = mid_gem2.addOrReplaceChild("gem_2_r2",
				CubeListBuilder.create().texOffs(56, 32).addBox(-2.0F, -20.0F, -1.01F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0134F, 9.1128F, 0.1637F, 0.0F, 0.0F, -0.3927F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(42, 55)
						.addBox(-3.0F, -9.5F, -2.51F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 49)
						.addBox(-3.5F, -36.0F, -4.0F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(12, 50)
						.addBox(-4.0F, -36.0F, -3.5F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(13, 49)
						.addBox(-3.5F, -36.5F, -3.5F, 7.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leg_r.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_l.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		main_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm_l.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm_r.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mid_gem.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mid_gem2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leg_r.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.arm_r.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.mid_gem2.yRot = ageInTicks / 20.f;
		this.arm_l.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.main_body.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.main_body.xRot = headPitch / (180F / (float) Math.PI);
		this.leg_l.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.mid_gem.yRot = ageInTicks / 20.f;
	}
}