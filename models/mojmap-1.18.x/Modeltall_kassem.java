// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltall_kassem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tall_kassem"), "main");
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart head;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart bb_main;

	public Modeltall_kassem(ModelPart root) {
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.head = root.getChild("head");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 26)
				.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 14.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(0, 26).mirror()
						.addBox(-1.4F, 0.0F, -1.5F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, 14.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(24, 0)
						.addBox(-3.5F, -9.0F, -3.0F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(32, 13)
						.addBox(-2.0F, -6.0F, -6.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(-0.5F, -6.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, -7.5F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.5F, -7.5F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-0.5F, -14.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hat_r1 = head.addOrReplaceChild("hat_r1",
				CubeListBuilder.create().texOffs(5, 11).addBox(-1.5F, -3.5F, -1.5F, 3.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.5F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition ear2_r1 = head.addOrReplaceChild("ear2_r1",
				CubeListBuilder.create().texOffs(0, -1).mirror()
						.addBox(0.0F, -2.0F, -1.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-3.5F, -9.0F, 3.0F, 0.2182F, -0.6109F, 0.0F));

		PartDefinition ear1_r1 = head.addOrReplaceChild("ear1_r1",
				CubeListBuilder.create().texOffs(0, -1).mirror()
						.addBox(0.0F, -2.0F, -1.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, -9.0F, 3.0F, 0.2182F, 0.6109F, 0.0F));

		PartDefinition hair2_r1 = head.addOrReplaceChild("hair2_r1",
				CubeListBuilder.create().texOffs(24, 13).mirror()
						.addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, -4.5F, -5.0F, 0.2182F, 0.2182F, 0.0F));

		PartDefinition hair1_r1 = head.addOrReplaceChild("hair1_r1",
				CubeListBuilder.create().texOffs(24, 13).addBox(0.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(2.0F, -4.5F, -5.0F, 0.2182F, -0.2182F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create()
				.texOffs(38, 112).addBox(-2.0F, -3.0F, -10.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, -2.0F, 0.0F));

		PartDefinition staff_r1 = right_arm.addOrReplaceChild("staff_r1",
				CubeListBuilder.create().texOffs(60, 101).addBox(-0.5F, -10.0F, -0.5F, 1.0F, 26.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 10.0F, -8.5F, 0.0F, -0.7854F, 0.0F));

		PartDefinition right_arm_end_r1 = right_arm.addOrReplaceChild("right_arm_end_r1",
				CubeListBuilder.create().texOffs(52, 12).addBox(-1.59F, -0.6F, -2.3F, 3.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4F, 6.5F, -1.5F, -1.4835F, 0.0F, 0.0F));

		PartDefinition right_arm_r1 = right_arm.addOrReplaceChild("right_arm_r1",
				CubeListBuilder.create().texOffs(52, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 7.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(52, 0).mirror()
						.addBox(-1.1F, -0.99F, -1.5F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 30).mirror().addBox(0.4F, 6.0F, -8.0F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.01F))
						.mirror(false),
				PartPose.offset(5.0F, -2.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 44)
						.addBox(-4.0F, -27.0F, -2.0F, 8.0F, 19.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 39)
						.addBox(-7.0F, -27.01F, -2.5F, 14.0F, 24.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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