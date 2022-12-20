// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelobleck_lord_eldritch<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "obleck_lord_eldritch"), "main");
	private final ModelPart r_arm5;
	private final ModelPart r_arm4;
	private final ModelPart r_arm3;
	private final ModelPart l_arm2;
	private final ModelPart l_arm1;
	private final ModelPart r_arm2;
	private final ModelPart r_arm1;
	private final ModelPart ear_top;
	private final ModelPart ear_top_right2;
	private final ModelPart ear_top_right;
	private final ModelPart back_ear_left;
	private final ModelPart back_ear_right;
	private final ModelPart bb_main;

	public Modelobleck_lord_eldritch(ModelPart root) {
		this.r_arm5 = root.getChild("r_arm5");
		this.r_arm4 = root.getChild("r_arm4");
		this.r_arm3 = root.getChild("r_arm3");
		this.l_arm2 = root.getChild("l_arm2");
		this.l_arm1 = root.getChild("l_arm1");
		this.r_arm2 = root.getChild("r_arm2");
		this.r_arm1 = root.getChild("r_arm1");
		this.ear_top = root.getChild("ear_top");
		this.ear_top_right2 = root.getChild("ear_top_right2");
		this.ear_top_right = root.getChild("ear_top_right");
		this.back_ear_left = root.getChild("back_ear_left");
		this.back_ear_right = root.getChild("back_ear_right");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition r_arm5 = partdefinition.addOrReplaceChild("r_arm5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 21.0F, 6.0F, -1.5708F, 0.5236F, -1.5708F));

		PartDefinition arm_bottom_r22_r1 = r_arm5.addOrReplaceChild("arm_bottom_r22_r1",
				CubeListBuilder.create().texOffs(78, 33)
						.addBox(8.49F, 44.5F, 3.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(7.99F, 44.5F, 7.01F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(5.49F, 44.5F, 7.01F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(5.99F, 44.5F, 2.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(94, 33)
						.addBox(4.49F, 36.0F, 5.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 21)
						.addBox(4.51F, 39.0F, 3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(78, 0)
						.addBox(5.5F, 28.0F, 3.51F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, -29.0F, -6.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition r_arm4 = partdefinition.addOrReplaceChild("r_arm4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 21.0F, 6.0F, 1.5708F, -0.5672F, -1.5708F));

		PartDefinition arm_bottom_r21_r1 = r_arm4.addOrReplaceChild("arm_bottom_r21_r1",
				CubeListBuilder.create().texOffs(78, 33)
						.addBox(8.49F, 37.5F, 3.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(7.99F, 37.5F, 7.01F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(5.49F, 37.5F, 7.01F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(5.99F, 37.5F, 2.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(94, 33)
						.addBox(4.49F, 29.0F, 5.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 21)
						.addBox(4.51F, 32.0F, 3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(78, 0)
						.addBox(5.5F, 21.0F, 3.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, -29.0F, -6.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition r_arm3 = partdefinition.addOrReplaceChild("r_arm3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 13.0F, 4.0F, 1.5708F, -0.3491F, 1.5708F));

		PartDefinition arm_bottom_r20_r1 = r_arm3.addOrReplaceChild("arm_bottom_r20_r1",
				CubeListBuilder.create().texOffs(78, 33)
						.addBox(10.49F, 35.5F, 1.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(9.99F, 35.5F, 5.01F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(7.49F, 35.5F, 5.01F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(7.99F, 35.5F, 0.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(94, 33)
						.addBox(6.49F, 27.0F, 3.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 21)
						.addBox(6.51F, 30.0F, 1.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(78, 0)
						.addBox(7.5F, 19.0F, 1.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, -21.0F, -4.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition l_arm2 = partdefinition.addOrReplaceChild("l_arm2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.5F, 19.0F, 6.0F, -0.4363F, 0.7418F, -1.9199F));

		PartDefinition arm_bottom_l9_r1 = l_arm2.addOrReplaceChild("arm_bottom_l9_r1",
				CubeListBuilder.create().texOffs(78, 33)
						.addBox(-0.49F, 42.5F, -0.49F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(0.01F, 42.5F, 3.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(2.51F, 42.5F, 3.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(2.01F, 42.5F, -1.01F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(94, 33)
						.addBox(3.51F, 34.0F, 1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 21)
						.mirror().addBox(-0.51F, 37.0F, -1.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(78, 0).mirror()
						.addBox(-0.5F, 26.0F, -0.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -27.0F, -6.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition l_arm1 = partdefinition.addOrReplaceChild("l_arm1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.5F, 17.0F, 6.0F, 0.4363F, 0.0F, -2.0944F));

		PartDefinition arm_bottom_l8_r1 = l_arm1.addOrReplaceChild("arm_bottom_l8_r1",
				CubeListBuilder.create().texOffs(78, 33)
						.addBox(-3.49F, 42.5F, 3.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-2.99F, 42.5F, 7.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-0.49F, 42.5F, 7.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-0.99F, 42.5F, 2.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(94, 33)
						.addBox(0.51F, 34.0F, 5.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 21)
						.mirror().addBox(-3.51F, 37.0F, 3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(78, 0).mirror()
						.addBox(-3.5F, 26.0F, 3.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -25.0F, -6.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition r_arm2 = partdefinition.addOrReplaceChild("r_arm2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.5F, 19.0F, 0.0F, -0.4363F, -0.7418F, 1.9199F));

		PartDefinition arm_bottom_r19_r1 = r_arm2.addOrReplaceChild("arm_bottom_r19_r1",
				CubeListBuilder.create().texOffs(78, 33)
						.addBox(2.49F, 42.5F, -2.49F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(1.99F, 42.5F, 1.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-0.51F, 42.5F, 1.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-0.01F, 42.5F, -3.01F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(94, 33)
						.addBox(-1.51F, 34.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 21)
						.addBox(-1.49F, 37.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(78, 0)
						.addBox(-0.5F, 26.0F, -2.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -27.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition r_arm1 = partdefinition.addOrReplaceChild("r_arm1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.5F, 17.0F, 6.0F, 0.4363F, 0.0F, 2.0944F));

		PartDefinition arm_bottom_r18_r1 = r_arm1.addOrReplaceChild("arm_bottom_r18_r1",
				CubeListBuilder.create().texOffs(78, 33)
						.addBox(1.49F, 42.5F, 3.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(0.99F, 42.5F, 7.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-1.51F, 42.5F, 7.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-1.01F, 42.5F, 2.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(94, 33)
						.addBox(-2.51F, 34.0F, 5.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 21)
						.addBox(-2.49F, 37.0F, 3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(78, 0)
						.addBox(-1.5F, 26.0F, 3.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -25.0F, -6.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition ear_top = partdefinition
				.addOrReplaceChild("ear_top",
						CubeListBuilder.create().texOffs(0, 17).addBox(-1.5F, -1.25F, -5.0F, 3.0F, 1.0F, 4.0F,
								new CubeDeformation(1.0F)),
						PartPose.offsetAndRotation(0.0F, 14.0F, 1.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition spike_top2_r1 = ear_top.addOrReplaceChild("spike_top2_r1",
				CubeListBuilder.create().texOffs(1, 22)
						.addBox(-0.5F, -0.51F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(1.0F)).texOffs(0, 26)
						.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition ear_top_right2 = partdefinition.addOrReplaceChild("ear_top_right2",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)).texOffs(1, 22)
						.addBox(1.75F, -0.25F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, 1.5F, 0.7854F, 0.2182F, 0.3054F));

		PartDefinition ear_top_right = partdefinition.addOrReplaceChild("ear_top_right",
				CubeListBuilder.create().texOffs(0, 17).mirror()
						.addBox(-3.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false)
						.texOffs(1, 22).mirror()
						.addBox(-2.75F, -0.25F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(1.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 14.0F, 1.5F, 0.7854F, -0.2182F, -0.3054F));

		PartDefinition back_ear_left = partdefinition.addOrReplaceChild("back_ear_left",
				CubeListBuilder.create().texOffs(13, 23)
						.addBox(0.0F, 0.5F, -2.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(1.0F)).texOffs(0, 22)
						.addBox(0.5F, 0.75F, 0.75F, 1.0F, 1.0F, 7.0F, new CubeDeformation(1.0F)).texOffs(0, 22)
						.addBox(0.51F, 2.25F, 2.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(1.0F)).texOffs(28, 16)
						.addBox(0.49F, 3.75F, 0.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(4.0F, 13.5F, 1.5F, -0.0873F, 0.2618F, -0.2182F));

		PartDefinition spike_left_side_r1 = back_ear_left.addOrReplaceChild("spike_left_side_r1",
				CubeListBuilder.create().texOffs(0, 22).addBox(0.5F, 0.75F, 0.75F, 1.0F, 1.0F, 6.0F,
						new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, -0.1745F, -0.0873F));

		PartDefinition back_ear_right = partdefinition.addOrReplaceChild("back_ear_right", CubeListBuilder.create()
				.texOffs(13, 23).mirror().addBox(-2.0F, 0.5F, -2.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(1.0F))
				.mirror(false).texOffs(0, 22).mirror()
				.addBox(-1.5F, 0.75F, 0.75F, 1.0F, 1.0F, 7.0F, new CubeDeformation(1.0F)).mirror(false).texOffs(0, 22)
				.mirror().addBox(-1.51F, 2.25F, 2.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(1.0F)).mirror(false)
				.texOffs(28, 16).mirror().addBox(-1.49F, 3.75F, 0.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(1.0F))
				.mirror(false), PartPose.offsetAndRotation(-4.0F, 13.5F, 1.5F, -0.0873F, -0.2618F, 0.2182F));

		PartDefinition spike_right_side_r1 = back_ear_right.addOrReplaceChild("spike_right_side_r1",
				CubeListBuilder.create().texOffs(0, 22).mirror()
						.addBox(-1.5F, 0.75F, 0.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(1.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.1745F, 0.0873F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -9.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F)).texOffs(25, 0)
						.addBox(-3.0F, -8.0F, -4.75F, 6.0F, 6.0F, 1.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_spike_right_r1 = bb_main.addOrReplaceChild("back_spike_right_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 2.0F, -0.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(-4.0F, -6.0F, 0.0F, 0.0436F, -0.4363F, -0.1309F));

		PartDefinition back_spike_left_r1 = bb_main.addOrReplaceChild("back_spike_left_r1",
				CubeListBuilder.create().texOffs(32, 8).addBox(-2.5F, 2.0F, 1.5F, 1.0F, 1.0F, 6.0F,
						new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(4.0F, -6.0F, 0.0F, 0.0436F, 0.3491F, 0.1309F));

		PartDefinition side_spike_right_r1 = bb_main.addOrReplaceChild("side_spike_right_r1",
				CubeListBuilder.create().texOffs(32, 8).mirror()
						.addBox(1.5F, 2.0F, 1.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(1.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -6.0F, 0.0F, 0.0436F, -0.3491F, -0.1309F));

		PartDefinition side_spike_left_r1 = bb_main.addOrReplaceChild("side_spike_left_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 2.0F, -0.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(4.0F, -6.0F, 0.0F, 0.0436F, 0.4363F, 0.1309F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bb_main.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.bb_main.xRot = headPitch / (180F / (float) Math.PI);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		r_arm5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_arm4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_arm3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		l_arm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		l_arm1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_arm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_arm1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ear_top.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ear_top_right2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ear_top_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_ear_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_ear_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}