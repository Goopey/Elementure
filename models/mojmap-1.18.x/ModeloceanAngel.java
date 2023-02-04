// Made with Blockbench 4.6.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModeloceanAngel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "oceanangel"), "main");
	private final ModelPart front;
	private final ModelPart fin;
	private final ModelPart halo;

	private final ModelPart wing_base_right;
	private final ModelPart wing_r_rot_1;
	private final ModelPart wing_right;
	private final ModelPart wing_r_rot_2;

	private final ModelPart wing_base_left;
	private final ModelPart wing_l_rot_1;
	private final ModelPart wing_left;
	private final ModelPart wing_l_rot_2;

	public ModeloceanAngel(ModelPart root) {
		this.front = root.getChild("front");
		this.fin = root.getChild("fin");
		this.halo = root.getChild("halo");

		this.wing_base_right = root.getChild("wing_base_right");
		this.wing_r_rot_1 = wing_base_right.getChild("wing_r_rot_1");
		this.wing_right = wing_r_rot_1.getChild("wing_right");
		this.wing_r_rot_2 = wing_right.getChild("wing_r_rot_2");

		this.wing_base_left = root.getChild("wing_base_left");
		this.wing_l_rot_1 = wing_base_left.getChild("wing_l_rot_1");
		this.wing_left = wing_l_rot_1.getChild("wing_left");
		this.wing_l_rot_2 = wing_left.getChild("wing_l_rot_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition front = partdefinition.addOrReplaceChild("front",
				CubeListBuilder.create().texOffs(48, 48)
						.addBox(-0.5F, -1.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(-1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 2.0F));

		PartDefinition fin = partdefinition.addOrReplaceChild("fin",
				CubeListBuilder.create().texOffs(60, 61)
						.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 59)
						.addBox(-0.5F, -2.0F, 1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 2.0F));

		PartDefinition halo = partdefinition.addOrReplaceChild("halo",
				CubeListBuilder.create().texOffs(0, 58)
						.addBox(-6.5F, -0.5F, -2.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(3.5F, -0.5F, -2.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(3.5F, -1.5F, -2.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-5.5F, -1.5F, -2.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-5.5F, -1.5F, 1.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(3.5F, -1.5F, 1.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(2.5F, -1.5F, -4.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(2.5F, -1.5F, 2.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-4.5F, -1.5F, 2.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-4.5F, -1.5F, -4.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(1.5F, -1.5F, -5.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-2.5F, -1.5F, -5.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-2.5F, -1.5F, 3.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(1.5F, -1.5F, 3.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-1.5F, -1.5F, 4.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-1.5F, -1.5F, -5.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(4.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-5.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-2.5F, -0.5F, -6.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-2.5F, -0.5F, 3.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(2.5F, -0.51F, 1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(1.5F, -0.49F, 2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(1.5F, -0.49F, -5.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(2.5F, -0.51F, -4.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-4.5F, -0.49F, -5.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-5.5F, -0.51F, -4.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-5.5F, -0.51F, 1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-4.5F, -0.49F, 2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition wing_base_right = partdefinition.addOrReplaceChild("wing_base_right", CubeListBuilder.create(),
				PartPose.offset(3.0F, 11.0F, 0.0F));

		PartDefinition wing_r_rot_1 = wing_base_right.addOrReplaceChild("wing_r_rot_1",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(0.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(10, 25).mirror()
						.addBox(0.0F, 0.0F, 1.0F, 16.0F, 0.0F, 12.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition wing_right = wing_r_rot_1.addOrReplaceChild("wing_right", CubeListBuilder.create(),
				PartPose.offset(16.0F, 0.0F, 0.0F));

		PartDefinition wing_r_rot_2 = wing_right.addOrReplaceChild("wing_r_rot_2",
				CubeListBuilder.create().texOffs(0, 4).mirror()
						.addBox(0.0F, -1.01F, 0.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(-16, 22).mirror()
						.addBox(-11.0F, -0.01F, 0.0F, 11.0F, 0.0F, 16.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition wing_base_left = partdefinition.addOrReplaceChild("wing_base_left", CubeListBuilder.create(),
				PartPose.offset(-3.0F, 11.0F, 0.0F));

		PartDefinition wing_l_rot_1 = wing_base_left.addOrReplaceChild("wing_l_rot_1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 25)
						.addBox(-16.0F, 0.0F, 1.0F, 16.0F, 0.0F, 12.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition wing_left = wing_l_rot_1.addOrReplaceChild("wing_left", CubeListBuilder.create(),
				PartPose.offset(-16.0F, 0.0F, 0.0F));

		PartDefinition wing_l_rot_2 = wing_left.addOrReplaceChild("wing_l_rot_2",
				CubeListBuilder.create().texOffs(0, 4)
						.addBox(-1.0F, -1.01F, -1.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(-16, 22)
						.addBox(1.0F, -0.01F, -1.0F, 11.0F, 0.0F, 16.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, -0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.halo.setPos(0.f, Mth.sin(ageInTicks / 10.f) / 3.f, 0.f);
		this.fin.yRot = Mth.sin(ageInTicks / 5.5f) / 4.f;
		this.front.yRot = Mth.cos(ageInTicks / 5.5f) / 8.f;

		float rot = ageInTicks / 7.f;
		this.wing_base_left.zRot = Mth.sin(rot) / -6.f;
		this.wing_base_left.xRot = Mth.sin(rot) / -10.f;
		this.wing_left.yRot = Mth.sin(rot) / -5.f;
		this.wing_base_right.zRot = Mth.sin(rot) / 6.f;
		this.wing_base_right.xRot = Mth.sin(rot) / 10.f;
		this.wing_right.yRot = Mth.sin(rot) / 5.f;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		front.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		fin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		halo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wing_base_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wing_base_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}