// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelforce_obleck<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "force_obleck"), "main");
	private final ModelPart main_body;
	private final ModelPart FistWrist1;
	private final ModelPart FistWrist2;

	public Modelforce_obleck(ModelPart root) {
		this.main_body = root.getChild("main_body");
		this.FistWrist1 = root.getChild("FistWrist1");
		this.FistWrist2 = root.getChild("FistWrist2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main_body = partdefinition.addOrReplaceChild("main_body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-3.0F, -7.0F, -4.75F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition side_spike_right_r1 = main_body.addOrReplaceChild("side_spike_right_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -2.5F, 0.0F, 0.1309F, -0.2618F, -0.1309F));

		PartDefinition side_spike_left_r1 = main_body.addOrReplaceChild("side_spike_left_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -2.5F, 0.0F, 0.1309F, 0.2618F, 0.1309F));

		PartDefinition back_ear_right = main_body.addOrReplaceChild("back_ear_right", CubeListBuilder.create()
				.texOffs(13, 23).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 26).mirror()
				.addBox(-0.5F, -2.75F, 1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 26)
				.mirror().addBox(-0.5F, -1.25F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 16).mirror().addBox(-0.5F, 0.25F, 1.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offsetAndRotation(-4.0F, -6.0F, 1.5F, 0.4363F, -0.3491F, -0.2618F));

		PartDefinition spike_right_side_r1 = back_ear_right.addOrReplaceChild("spike_right_side_r1",
				CubeListBuilder.create().texOffs(0, 26).mirror()
						.addBox(-0.5F, -2.75F, 1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.1745F, 0.0873F));

		PartDefinition back_ear_left = main_body.addOrReplaceChild("back_ear_left",
				CubeListBuilder.create().texOffs(13, 23)
						.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-0.5F, -2.75F, 1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-0.5F, -1.25F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 16)
						.addBox(-0.5F, 0.25F, 1.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -6.0F, 1.5F, 0.4363F, 0.3491F, 0.2182F));

		PartDefinition spike_left_side_r1 = back_ear_left.addOrReplaceChild("spike_left_side_r1",
				CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -2.75F, 1.75F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, -0.1745F, -0.0873F));

		PartDefinition ear_top_right = main_body.addOrReplaceChild("ear_top_right",
				CubeListBuilder.create().texOffs(0, 17).mirror()
						.addBox(-3.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 26).mirror()
						.addBox(-2.75F, -0.75F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -8.5F, 1.5F, 0.3927F, -0.2182F, -0.3054F));

		PartDefinition ear_top_right2 = main_body.addOrReplaceChild("ear_top_right2",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(1.75F, -0.75F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.5F, 1.5F, 0.3927F, 0.2182F, 0.3054F));

		PartDefinition FistWrist1 = partdefinition.addOrReplaceChild(
				"FistWrist1", CubeListBuilder.create().texOffs(36, 19).addBox(-4.607F, 10.7399F, -2.0F, 3.0F, 4.0F,
						4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.3F, 6.1F, 2.0F, 0.0F, 0.0F, 0.182F));

		PartDefinition Fisttop1 = FistWrist1
				.addOrReplaceChild("Fisttop1",
						CubeListBuilder.create().texOffs(36, 19).addBox(-7.1114F, 6.525F, -4.0F, 6.0F, 5.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.6F, 7.6F, 0.0F, 0.0F, 0.0F, 0.182F));

		PartDefinition Fistside1 = Fisttop1.addOrReplaceChild("Fistside1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.6F, 0.3F, 0.0F, 0.0F, 0.0F, -1.2292F));

		PartDefinition Fistside1_r1 = Fistside1.addOrReplaceChild(
				"Fistside1_r1", CubeListBuilder.create().texOffs(36, 19).addBox(-13.8798F, 0.115F, -4.01F, 6.0F, 5.0F,
						8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 1.9F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition FistWristside11 = FistWrist1.addOrReplaceChild("FistWristside11",
				CubeListBuilder.create().texOffs(36, 19).addBox(-4.607F, 9.1768F, 4.0796F, 3.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8F, -0.7F, -0.5463F, 0.0F, 0.0F));

		PartDefinition FistWristside12 = FistWrist1.addOrReplaceChild(
				"FistWristside12", CubeListBuilder.create().texOffs(36, 19).addBox(-4.607F, 9.1768F, -7.0796F, 3.0F,
						4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, 0.5463F, 0.0F, 0.0F));

		PartDefinition FistWrist2 = partdefinition.addOrReplaceChild("FistWrist2",
				CubeListBuilder.create().texOffs(36, 19).addBox(-4.607F, 10.7399F, -2.0F, 3.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.3F, 6.1F, 2.0F, 0.0F, -3.1416F, -0.182F));

		PartDefinition Fisttop2 = FistWrist2
				.addOrReplaceChild("Fisttop2",
						CubeListBuilder.create().texOffs(36, 19).addBox(-7.1114F, 6.525F, -4.0F, 6.0F, 5.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.6F, 7.6F, 0.0F, 0.0F, 0.0F, 0.182F));

		PartDefinition Fistside2 = Fisttop2.addOrReplaceChild("Fistside2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.6F, 0.3F, 0.0F, 0.0F, 0.0F, -1.2292F));

		PartDefinition Fistside2_r1 = Fistside2.addOrReplaceChild(
				"Fistside2_r1", CubeListBuilder.create().texOffs(36, 19).addBox(-11.4798F, -0.185F, -4.01F, 6.0F, 5.0F,
						8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6F, 1.9F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition FistWristside21 = FistWrist2.addOrReplaceChild("FistWristside21",
				CubeListBuilder.create().texOffs(36, 19).addBox(-4.607F, 9.1768F, 4.0796F, 3.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8F, -0.7F, -0.5463F, 0.0F, 0.0F));

		PartDefinition FistWristside22 = FistWrist2.addOrReplaceChild(
				"FistWristside22", CubeListBuilder.create().texOffs(36, 19).addBox(-4.607F, 9.1768F, -7.0796F, 3.0F,
						4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, 0.5463F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		main_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		FistWrist1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		FistWrist2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.FistWrist1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.FistWrist2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}