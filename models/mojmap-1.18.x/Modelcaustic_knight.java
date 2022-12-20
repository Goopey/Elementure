// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcaustic_knight<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "caustic_knight"), "main");
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart head;
	private final ModelPart bb_main;

	public Modelcaustic_knight(ModelPart root) {
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.head = root.getChild("head");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create()
				.texOffs(29, 16).addBox(-2.2F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(29, 16)
				.addBox(-1.8F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(48, 16)
						.addBox(-4.0F, 2.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(-4.01F, 1.5F, -2.01F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 54)
						.addBox(-4.51F, 1.0F, -2.51F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 0.0F, 0.0F));

		PartDefinition sword_r1 = right_arm.addOrReplaceChild("sword_r1",
				CubeListBuilder.create().texOffs(96, 32).addBox(0.0F, -9.0F, -1.0F, 0.0F, 16.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 9.0F, 0.0F, 2.3562F, 0.0F, -3.1416F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(48, 16)
				.mirror().addBox(0.0F, 2.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 59).mirror().addBox(3.01F, 1.5F, -2.01F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(64, 54).mirror()
				.addBox(-0.5F, 1.0F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition flask = left_arm.addOrReplaceChild("flask", CubeListBuilder.create(),
				PartPose.offset(2.0F, 14.0F, 0.0F));

		PartDefinition flask_top_r1 = flask
				.addOrReplaceChild("flask_top_r1",
						CubeListBuilder.create().texOffs(91, 0).addBox(-0.99F, -4.5F, -2.5F, 2.0F, 7.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition flask_base_r1 = flask.addOrReplaceChild(
				"flask_base_r1", CubeListBuilder.create().texOffs(112, 0).addBox(-1.99F, -2.0F, -2.01F, 4.0F, 4.0F,
						4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(24, 0)
						.addBox(-4.0F, -6.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 46)
						.addBox(-4.5F, -6.5F, -4.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.5F, -17.0F, -2.0F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-5.0F, -22.0F, -2.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(-4.0F, -22.0F, -2.5F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-3.0F, -17.0F, -2.5F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(2, 23)
						.addBox(-2.0F, -12.0F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}