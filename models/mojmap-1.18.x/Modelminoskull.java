// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelminoskull<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "minoskull"), "main");
	private final ModelPart l_leg;
	private final ModelPart r_leg;
	private final ModelPart l_arm;
	private final ModelPart r_arm;
	private final ModelPart head;
	private final ModelPart bb_main;

	public Modelminoskull(ModelPart root) {
		this.l_leg = root.getChild("l_leg");
		this.r_leg = root.getChild("r_leg");
		this.l_arm = root.getChild("l_arm");
		this.r_arm = root.getChild("r_arm");
		this.head = root.getChild("head");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition l_leg = partdefinition.addOrReplaceChild("l_leg",
				CubeListBuilder.create().texOffs(128, 0).mirror()
						.addBox(-4.0F, -8.0F, -4.0F, 7.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 16.0F, 0.0F));

		PartDefinition r_leg = partdefinition.addOrReplaceChild("r_leg", CubeListBuilder.create().texOffs(128, 0)
				.addBox(-3.0F, -8.0F, -4.0F, 7.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 16.0F, 0.0F));

		PartDefinition l_arm = partdefinition.addOrReplaceChild("l_arm", CubeListBuilder.create().texOffs(228, 28)
				.addBox(0.0F, -4.0F, -3.0F, 7.0F, 33.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(11.0F, -12.0F, 0.0F));

		PartDefinition r_arm = partdefinition.addOrReplaceChild("r_arm",
				CubeListBuilder.create().texOffs(228, 28).mirror()
						.addBox(-7.0F, -4.0F, -3.0F, 7.0F, 33.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-11.0F, -12.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(216, 0)
				.addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -16.0F, 0.0F));

		PartDefinition horn_left3_r1 = head.addOrReplaceChild("horn_left3_r1",
				CubeListBuilder.create().texOffs(0, 32).mirror()
						.addBox(-0.5F, -6.0F, -1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false),
				PartPose.offsetAndRotation(5.5F, -8.0F, -4.5F, -0.672F, -0.4538F, 0.8727F));

		PartDefinition horn_left2_r1 = head.addOrReplaceChild("horn_left2_r1",
				CubeListBuilder.create().texOffs(0, 32).mirror()
						.addBox(-1.5F, -8.0F, -3.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false),
				PartPose.offsetAndRotation(5.5F, -8.0F, -4.5F, -0.4363F, -0.6109F, 0.1396F));

		PartDefinition horn_left_r1 = head.addOrReplaceChild("horn_left_r1",
				CubeListBuilder.create().texOffs(0, 32).mirror()
						.addBox(-1.5F, -6.0F, -1.5F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.5F, -8.0F, -4.5F, 0.3491F, -0.6109F, 0.1396F));

		PartDefinition horn_right3_r1 = head.addOrReplaceChild("horn_right3_r1",
				CubeListBuilder.create().texOffs(0, 32).addBox(-2.5F, -6.0F, -1.5F, 3.0F, 7.0F, 3.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-5.5F, -8.0F, -4.5F, -0.672F, 0.4538F, -0.8727F));

		PartDefinition horn_right2_r1 = head.addOrReplaceChild("horn_right2_r1",
				CubeListBuilder.create().texOffs(0, 32).addBox(-1.5F, -8.0F, -3.5F, 3.0F, 7.0F, 3.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-5.5F, -8.0F, -4.5F, -0.4363F, 0.6109F, -0.1396F));

		PartDefinition horn_right_r1 = head.addOrReplaceChild("horn_right_r1",
				CubeListBuilder.create().texOffs(0, 32).addBox(-1.5F, -6.0F, -1.5F, 3.0F, 10.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5F, -8.0F, -4.5F, 0.3491F, 0.6109F, -0.1396F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.0F, -40.0F, -6.0F, 22.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(171, 0)
						.addBox(-6.0F, -24.0F, -5.0F, 12.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		l_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		l_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.r_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.l_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.l_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.r_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}