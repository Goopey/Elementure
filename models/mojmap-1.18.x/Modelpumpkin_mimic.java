// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpumpkin_mimic<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pumpkin_mimic"), "main");
	private final ModelPart main_body;
	private final ModelPart pumpkin;

	public Modelpumpkin_mimic(ModelPart root) {
		this.main_body = root.getChild("main_body");
		this.pumpkin = root.getChild("pumpkin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main_body = partdefinition.addOrReplaceChild("main_body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-3.0F, -7.0F, -4.75F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

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
				.mirror(false), PartPose.offsetAndRotation(-4.0F, -6.0F, 1.5F, 0.4363F, -0.5236F, -0.0873F));

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
				PartPose.offsetAndRotation(4.0F, -6.0F, 1.5F, 0.4363F, 0.5236F, 0.0873F));

		PartDefinition spike_left_side_r1 = back_ear_left.addOrReplaceChild("spike_left_side_r1",
				CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -2.75F, 1.75F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, -0.1745F, -0.0873F));

		PartDefinition ear_top_right = main_body.addOrReplaceChild("ear_top_right",
				CubeListBuilder.create().texOffs(0, 17).mirror()
						.addBox(-3.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 26).mirror()
						.addBox(-2.75F, -0.75F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -8.5F, 1.5F, 0.7854F, -0.2182F, 0.0F));

		PartDefinition ear_top_right2 = main_body.addOrReplaceChild("ear_top_right2",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(1.75F, -0.75F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.5F, 1.5F, 0.7854F, 0.2182F, 0.0F));

		PartDefinition pumpkin = partdefinition.addOrReplaceChild("pumpkin", CubeListBuilder.create().texOffs(0, 32)
				.addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < 11)) {
			pumpkin.setPos(0.0F, -10800.0F, 0.0F);
		} else {
			pumpkin.setPos(0.0F, 24.0F, 0.0F);
		}

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		main_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pumpkin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}