// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelnetherum_titan<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "netherum_titan"), "main");
	private final ModelPart l_leg;
	private final ModelPart r_leg;
	private final ModelPart r_arm;
	private final ModelPart l_arm;
	private final ModelPart head;
	private final ModelPart eye_rot;
	private final ModelPart bb_main;

	public Modelnetherum_titan(ModelPart root) {
		this.l_leg = root.getChild("l_leg");
		this.r_leg = root.getChild("r_leg");
		this.r_arm = root.getChild("r_arm");
		this.l_arm = root.getChild("l_arm");
		this.head = root.getChild("head");
		this.eye_rot = head.getChild("eye_rot");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition l_leg = partdefinition.addOrReplaceChild("l_leg",
				CubeListBuilder.create().texOffs(29, 0).mirror()
						.addBox(-2.0F, 0.0F, -2.5F, 5.0F, 64.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, -40.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition r_leg = partdefinition.addOrReplaceChild("r_leg",
				CubeListBuilder.create().texOffs(29, 0).addBox(-3.0F, 0.0F, -2.5F, 5.0F, 64.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -40.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition r_arm = partdefinition.addOrReplaceChild("r_arm",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-6.0F, -2.0F, -3.0F, 6.0F, 72.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-9.0F, -63.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition l_arm = partdefinition.addOrReplaceChild("l_arm",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.0F, -3.0F, 6.0F, 72.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -63.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(84, 20)
						.addBox(-4.5F, -6.0F, -9.0F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(84, 0)
						.addBox(-6.5F, -6.5F, -5.0F, 13.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(57, 110)
						.addBox(-4.5F, -3.5F, -9.0F, 9.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(86, 100)
						.addBox(-4.0F, -5.0F, -9.25F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -62.0F, -2.0F));

		PartDefinition eye_rot = head.addOrReplaceChild("eye_rot", CubeListBuilder.create().texOffs(51, 0).addBox(-3.0F,
				-2.5F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -5.0F));

		PartDefinition horn_1 = head.addOrReplaceChild("horn_1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 86.0F, 2.0F));

		PartDefinition horn_4_r1 = horn_1.addOrReplaceChild("horn_4_r1",
				CubeListBuilder.create().texOffs(0, 100).addBox(-1.5F, -11.5F, -2.0F, 3.0F, 24.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5F, -86.0F, -8.5F, -0.8385F, -0.3046F, -0.2981F));

		PartDefinition horn_3_r1 = horn_1.addOrReplaceChild("horn_3_r1",
				CubeListBuilder.create().texOffs(0, 100).addBox(-2.0F, -8.5F, -4.0F, 6.0F, 13.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, -85.0F, -8.5F, -0.9599F, -0.5236F, 0.0F));

		PartDefinition horn_2_r1 = horn_1.addOrReplaceChild("horn_2_r1",
				CubeListBuilder.create().texOffs(0, 100).addBox(-3.5F, -10.0F, -2.0F, 4.0F, 7.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5F, -92.0F, -3.0F, -0.7854F, 0.1745F, 0.3491F));

		PartDefinition horn_1_r1 = horn_1.addOrReplaceChild("horn_1_r1",
				CubeListBuilder.create().texOffs(0, 100).addBox(-3.5F, -4.0F, -3.5F, 5.0F, 10.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5F, -92.0F, -3.0F, -0.6981F, 0.1745F, 0.1745F));

		PartDefinition horn_2 = head.addOrReplaceChild("horn_2", CubeListBuilder.create(),
				PartPose.offset(16.0F, 86.0F, 2.0F));

		PartDefinition horn_4_r2 = horn_2.addOrReplaceChild("horn_4_r2",
				CubeListBuilder.create().texOffs(0, 100).addBox(-1.5F, -11.5F, -2.0F, 3.0F, 24.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, -86.0F, -8.5F, -0.8385F, 0.3046F, 0.2981F));

		PartDefinition horn_3_r2 = horn_2.addOrReplaceChild("horn_3_r2",
				CubeListBuilder.create().texOffs(0, 100).addBox(-4.0F, -8.5F, -4.0F, 6.0F, 13.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -85.0F, -8.5F, -0.9599F, 0.5236F, 0.0F));

		PartDefinition horn_2_r2 = horn_2.addOrReplaceChild("horn_2_r2",
				CubeListBuilder.create().texOffs(0, 100).addBox(-0.5F, -10.0F, -2.0F, 4.0F, 7.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5F, -92.0F, -3.0F, -0.7854F, -0.1745F, -0.3491F));

		PartDefinition horn_1_r2 = horn_2.addOrReplaceChild("horn_1_r2",
				CubeListBuilder.create().texOffs(0, 100).addBox(-1.5F, -4.0F, -3.5F, 5.0F, 10.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5F, -92.0F, -3.0F, -0.6981F, -0.1745F, -0.1745F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(56, 40)
						.addBox(-6.0F, -71.0F, -2.0F, 12.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(63, 65)
						.addBox(-9.0F, -88.0F, -3.0F, 18.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.eye_rot.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.eye_rot.xRot = headPitch / (180F / (float) Math.PI);
		this.l_leg.xRot = Mth.cos(limbSwing * 1.0F) * -0.2F * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.r_leg.xRot = Mth.cos(limbSwing * 1.0F) * 0.2F * limbSwingAmount;
		this.l_arm.xRot = Mth.cos(limbSwing * 0.6662F) * 0.2F * limbSwingAmount;
		this.r_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.2F * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		l_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		l_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}