// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelobleck_turret<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "obleck_turret"), "main");
	private final ModelPart main_head;
	private final ModelPart bottom_arms;
	private final ModelPart r_arm1;
	private final ModelPart r_arm2;
	private final ModelPart r_arm3;
	private final ModelPart r_arm4;

	public Modelobleck_turret(ModelPart root) {
		this.main_head = root.getChild("main_head");
		this.bottom_arms = main_head.getChild("bottom_arms");
		this.r_arm1 = bottom_arms.getChild("r_arm1");
		this.r_arm2 = bottom_arms.getChild("r_arm2");
		this.r_arm3 = bottom_arms.getChild("r_arm3");
		this.r_arm4 = bottom_arms.getChild("r_arm4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main_head = partdefinition.addOrReplaceChild("main_head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -9.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition ears_1 = main_head.addOrReplaceChild("ears_1", CubeListBuilder.create(),
				PartPose.offset(0.0F, -5.5F, 0.0F));

		PartDefinition ear_top_side_1 = ears_1.addOrReplaceChild("ear_top_side_1",
				CubeListBuilder.create().texOffs(0, 17).mirror()
						.addBox(-1.0F, -4.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false)
						.texOffs(1, 22).mirror()
						.addBox(-0.5F, -4.25F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(1.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -4.5F, 1.5F, 1.0908F, 3.1416F, 0.0F));

		PartDefinition ear_top_side_2 = ears_1.addOrReplaceChild("ear_top_side_2",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(-1.0F, -7.0F, -3.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)).texOffs(1, 22)
						.addBox(-0.5F, -7.25F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5F, 1.5F, 1.0908F, 0.0F, 0.0F));

		PartDefinition ears_2 = main_head.addOrReplaceChild("ears_2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition ear_top_side_3 = ears_2.addOrReplaceChild("ear_top_side_3",
				CubeListBuilder.create().texOffs(0, 17).mirror()
						.addBox(-1.0F, -4.0F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false)
						.texOffs(1, 22).mirror()
						.addBox(-0.5F, -4.25F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(1.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -4.5F, 1.5F, 1.0908F, 3.1416F, 0.0F));

		PartDefinition ear_top_side_4 = ears_2.addOrReplaceChild("ear_top_side_4",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(-1.0F, -7.0F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)).texOffs(1, 22)
						.addBox(-0.5F, -7.25F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, 1.5F, 1.0908F, 0.0F, 0.0F));

		PartDefinition ears_3 = main_head.addOrReplaceChild("ears_3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition ear_top_side_5 = ears_3.addOrReplaceChild("ear_top_side_5",
				CubeListBuilder.create().texOffs(0, 17).mirror()
						.addBox(-1.0F, -4.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false)
						.texOffs(1, 22).mirror()
						.addBox(-0.5F, -4.25F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(1.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -4.5F, 1.5F, 1.0908F, 3.1416F, 0.0F));

		PartDefinition ear_top_side_6 = ears_3.addOrReplaceChild("ear_top_side_6",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(-1.0F, -7.0F, -3.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)).texOffs(1, 22)
						.addBox(-0.5F, -7.25F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5F, 1.5F, 1.0908F, 0.0F, 0.0F));

		PartDefinition ears_4 = main_head.addOrReplaceChild("ears_4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, 0.0F, -1.5708F, -3.1416F));

		PartDefinition ear_top_side_7 = ears_4.addOrReplaceChild("ear_top_side_7",
				CubeListBuilder.create().texOffs(0, 17).mirror()
						.addBox(-1.0F, -4.0F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false)
						.texOffs(1, 22).mirror()
						.addBox(-0.5F, -4.25F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(1.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -4.5F, 1.5F, 1.0908F, 3.1416F, 0.0F));

		PartDefinition ear_top_side_8 = ears_4.addOrReplaceChild("ear_top_side_8",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(-1.0F, -7.0F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)).texOffs(1, 22)
						.addBox(-0.5F, -7.25F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, 1.5F, 1.0908F, 0.0F, 0.0F));

		PartDefinition bottom_arms = main_head.addOrReplaceChild("bottom_arms", CubeListBuilder.create(),
				PartPose.offset(0.0F, -5.5F, 0.0F));

		PartDefinition r_arm1 = bottom_arms.addOrReplaceChild("r_arm1",
				CubeListBuilder.create().texOffs(78, 0)
						.addBox(-8.0F, -0.5F, 3.0F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(78, 21)
						.addBox(-8.5F, 10.5F, 2.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(94, 33)
						.addBox(-8.51F, 7.5F, 6.51F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-4.0F, 15.5F, 7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-9.0F, 15.5F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-4.49F, 15.5F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-6.5F, 15.5F, 2.49F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, -0.0873F));

		PartDefinition r_arm2 = bottom_arms.addOrReplaceChild("r_arm2",
				CubeListBuilder.create().texOffs(78, 0)
						.addBox(-8.0F, -0.5F, 3.0F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(78, 21)
						.addBox(-8.5F, 10.5F, 2.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(94, 33)
						.addBox(-8.51F, 7.5F, 6.51F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-4.0F, 15.5F, 7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-9.0F, 15.5F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-4.49F, 15.5F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-6.5F, 15.5F, 2.49F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 3.1416F, 0.0873F));

		PartDefinition r_arm3 = bottom_arms.addOrReplaceChild("r_arm3",
				CubeListBuilder.create().texOffs(78, 0)
						.addBox(-8.0F, -0.5F, -8.0F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(78, 21)
						.addBox(-8.5F, 10.5F, -8.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(94, 33)
						.addBox(-8.51F, 7.5F, -8.49F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-4.0F, 15.5F, -9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-9.0F, 15.5F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-4.49F, 15.5F, -6.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-6.5F, 15.5F, -4.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, -0.0873F));

		PartDefinition r_arm4 = bottom_arms.addOrReplaceChild("r_arm4",
				CubeListBuilder.create().texOffs(78, 0)
						.addBox(-8.0F, -0.5F, -8.0F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(78, 21)
						.addBox(-8.5F, 10.5F, -8.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(94, 33)
						.addBox(-8.51F, 7.5F, -8.49F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-4.0F, 15.5F, -9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-9.0F, 15.5F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-4.49F, 15.5F, -6.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(-6.5F, 15.5F, -4.51F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 3.1416F, 0.0873F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.main_head.yRot = ageInTicks / 10.f;
		this.main_head.setPos(0.0F, (float) ((-1 / (Math.cos(1.22F * Math.cos(ageInTicks / 8.0F))))), 0.0F);
		this.r_arm1.xRot = -0.087266F + (float) (Math.cos(((ageInTicks / 10.0F) + (3 * Math.PI / 2))) / 8.0F);
		this.r_arm1.zRot = 0.087266F + (float) (Math.sin(((ageInTicks / 10.0F) + (3 * Math.PI / 2))) / 8.0F);
		this.r_arm2.xRot = -0.087266F + (float) (Math.cos(((ageInTicks / 10.0F) + (3 * Math.PI / 2))) / 8.0F);
		this.r_arm2.yRot = (float) (Math.PI);
		this.r_arm2.zRot = -0.087266F + (float) (Math.sin(((ageInTicks / 10.0F) + (3 * Math.PI / 2))) / 8.0F);
		this.r_arm3.xRot = 0.087266F + (float) (Math.cos(((ageInTicks / 10.0F) + (Math.PI / 2))) / 8.0F);
		this.r_arm3.zRot = 0.087266F + (float) (Math.cos(((ageInTicks / 10.0F) + (Math.PI / 2))) / 8.0F);
		this.r_arm4.xRot = 0.087266F + (float) (Math.cos(((ageInTicks / 10.0F) + (Math.PI / 2))) / 8.0F);
		this.r_arm4.yRot = (float) (Math.PI);
		this.r_arm4.zRot = -0.087266F + (float) (Math.cos(((ageInTicks / 10.0F) + (Math.PI / 2))) / 8.0F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		main_head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}