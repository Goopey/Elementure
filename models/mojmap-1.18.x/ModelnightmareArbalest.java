// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelnightmareArbalest<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "nightmarearbalest"), "main");
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart body;
	private final ModelPart bb_main;
	private final ModelPart head_tilt;
	private final ModelPart head_pivot_bob;
	private final ModelPart spider_leg_1;
	private final ModelPart spider_leg_3;
	private final ModelPart spider_leg_5;

	public ModelnightmareArbalest(ModelPart root) {
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.body = root.getChild("body");
		this.head_tilt = body.getChild("head_tilt");
		this.head_pivot_bob = head_tilt.getChild("head_pivot_bob");
		this.spider_leg_1 = head_pivot_bob.getChild("spider_leg_1");
		this.spider_leg_3 = head_pivot_bob.getChild("spider_leg_3");
		this.spider_leg_5 = head_pivot_bob.getChild("spider_leg_5");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 18)
				.addBox(-1.0F, -0.01F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(0, 18).mirror()
						.addBox(-1.0F, -0.01F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 48)
						.addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head_tilt = body.addOrReplaceChild("head_tilt", CubeListBuilder.create(),
				PartPose.offset(0.0F, -11.0F, 0.5F));

		PartDefinition head_pivot_bob = head_tilt.addOrReplaceChild("head_pivot_bob",
				CubeListBuilder.create().texOffs(32, 0)
						.addBox(-3.99F, -8.01F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 16)
						.addBox(-3.99F, -8.01F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(-0.25F)).texOffs(64, 0)
						.addBox(-3.99F, -8.01F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spider_leg_1 = head_pivot_bob.addOrReplaceChild("spider_leg_1", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.0F, -2.5F));

		PartDefinition cube_r1 = spider_leg_1.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(44, 35).mirror()
						.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, -0.0873F, 0.2618F, 0.0F));

		PartDefinition spider_leg_3 = head_pivot_bob.addOrReplaceChild("spider_leg_3", CubeListBuilder.create(),
				PartPose.offset(-2.0F, -4.0F, -1.5F));

		PartDefinition cube_r2 = spider_leg_3.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(44, 35).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 2.0F, 17.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, -0.3927F, 0.1309F, 0.0F));

		PartDefinition spider_leg_5 = head_pivot_bob.addOrReplaceChild("spider_leg_5", CubeListBuilder.create(),
				PartPose.offset(4.0F, -4.0F, -2.5F));

		PartDefinition cube_r3 = spider_leg_5.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(44, 35).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.507F, 0.4081F, -2.971F, 0.1745F, -0.1745F, 0.0F));

		PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, -11.0F, 0.0F));

		PartDefinition right_arm_tilt = right_arm.addOrReplaceChild("right_arm_tilt", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2217F, -0.3927F, 0.0F));

		PartDefinition cube_r4 = right_arm_tilt.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 48).addBox(-12.0F, -10.0F, -0.4F, 16.0F, 16.0F, 0.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-2.0F, 10.0F, -1.0F, 0.2182F, -0.3927F, -1.9635F));

		PartDefinition right_pauldron_r1 = right_arm_tilt.addOrReplaceChild("right_pauldron_r1",
				CubeListBuilder.create().texOffs(112, 0)
						.addBox(-2.0F, -2.0F, -2.01F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 0.5F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create(),
				PartPose.offset(5.0F, -11.0F, 0.0F));

		PartDefinition left_arm_tilt = left_arm.addOrReplaceChild("left_arm_tilt", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2654F, 0.6981F, 0.0F));

		PartDefinition left_pauldron_r1 = left_arm_tilt.addOrReplaceChild("left_pauldron_r1",
				CubeListBuilder.create().texOffs(112, 0).mirror()
						.addBox(-2.01F, -2.0F, -2.01F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(24, 18).mirror()
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.01F, 0.5F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(104, 21)
				.addBox(-4.0F, -12.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.spider_leg_1.xRot = (float) (Math.cos(ageInTicks / 6) / 3);
		this.spider_leg_3.xRot = (float) (Math.cos(ageInTicks / 6 + 0.25) / 3);
		this.spider_leg_5.xRot = (float) (Math.cos(ageInTicks / 6 + 0.5) / 3);
		float bobAge = (ageInTicks / 8.f);
		this.head_tilt.zRot = (float) (-Math.sin((bobAge / 3.f) + 0.25 * (Math.sin((bobAge / 3.f) + (Math.PI / 2))))
				/ 6);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -0.5F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 0.5F * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}