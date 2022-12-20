// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelarachneel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "arachneel"), "main");
	private final ModelPart head;
	private final ModelPart head2;
	private final ModelPart leg_1;
	private final ModelPart leg_2;
	private final ModelPart leg_3;
	private final ModelPart leg_4;
	private final ModelPart leg_5;
	private final ModelPart leg_6;
	private final ModelPart leg_7;
	private final ModelPart leg_8;
	private final ModelPart bb_main;

	public Modelarachneel(ModelPart root) {
		this.head = root.getChild("head");
		this.head2 = head.getChild("head2");
		this.leg_1 = root.getChild("leg_1");
		this.leg_2 = root.getChild("leg_2");
		this.leg_3 = root.getChild("leg_3");
		this.leg_4 = root.getChild("leg_4");
		this.leg_5 = root.getChild("leg_5");
		this.leg_6 = root.getChild("leg_6");
		this.leg_7 = root.getChild("leg_7");
		this.leg_8 = root.getChild("leg_8");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(50, 12).addBox(
				-2.0F, -5.0F, -2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(40, 0).addBox(-3.0F,
				-6.0F, -6.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -1.5F));

		PartDefinition jaw1 = head2.addOrReplaceChild("jaw1", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 0.0F, -4.5F));

		PartDefinition cube_r1 = jaw1.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(54, 58).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.3491F, 0.6109F, -0.3054F));

		PartDefinition jaw2 = head2.addOrReplaceChild("jaw2", CubeListBuilder.create(),
				PartPose.offset(2.0F, 0.0F, -4.5F));

		PartDefinition cube_r2 = jaw2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(54, 58).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.3491F, -0.6109F, 0.3054F));

		PartDefinition leg_1 = partdefinition.addOrReplaceChild("leg_1", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 22.5F, 1.0F));

		PartDefinition cube_r3 = leg_1.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -6.5F, -2.5F, 2.0F, 10.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.3054F));

		PartDefinition cube_r4 = leg_1.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, -0.3054F));

		PartDefinition leg_2 = partdefinition.addOrReplaceChild("leg_2", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 22.5F, 3.9F));

		PartDefinition cube_r5 = leg_2
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -6.5F, -0.5F, 2.0F, 10.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r6 = leg_2.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -7.0F, -0.5F, 2.0F, 9.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.3054F));

		PartDefinition leg_3 = partdefinition.addOrReplaceChild("leg_3", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 22.5F, 7.0F));

		PartDefinition cube_r7 = leg_3.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -6.5F, 0.5F, 2.0F, 10.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.3054F));

		PartDefinition cube_r8 = leg_3.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, -0.3054F));

		PartDefinition leg_4 = partdefinition.addOrReplaceChild("leg_4", CubeListBuilder.create(),
				PartPose.offset(4.0F, 22.5F, 1.0F));

		PartDefinition cube_r9 = leg_4.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(3.0F, -6.5F, -2.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, -0.3054F));

		PartDefinition cube_r10 = leg_4.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.3054F));

		PartDefinition leg_5 = partdefinition.addOrReplaceChild("leg_5", CubeListBuilder.create(),
				PartPose.offset(4.0F, 22.5F, 4.0F));

		PartDefinition cube_r11 = leg_5.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(3.0F, -6.5F, -0.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r12 = leg_5.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, -7.0F, -0.5F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.3054F));

		PartDefinition leg_6 = partdefinition.addOrReplaceChild("leg_6", CubeListBuilder.create(),
				PartPose.offset(4.0F, 22.5F, 7.0F));

		PartDefinition cube_r13 = leg_6.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(3.0F, -6.5F, 0.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, -0.3054F));

		PartDefinition cube_r14 = leg_6.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.3054F));

		PartDefinition leg_7 = partdefinition.addOrReplaceChild("leg_7", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 24.0F, 7.0F));

		PartDefinition cube_r15 = leg_7.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.0F, 0.0F, 2.0F, 15.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, 3.0F, 0.2618F, -0.3054F, 0.0F));

		PartDefinition cube_r16 = leg_7.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 14.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.1309F, -0.3054F, 0.0F));

		PartDefinition leg_8 = partdefinition.addOrReplaceChild("leg_8", CubeListBuilder.create(),
				PartPose.offset(2.0F, 24.0F, 7.0F));

		PartDefinition cube_r17 = leg_8.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-0.5F, -2.0F, 0.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -12.0F, 3.0F, 0.2618F, 0.3054F, 0.0F));

		PartDefinition cube_r18 = leg_8.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, -13.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.1309F, 0.3054F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 48)
				.addBox(-4.0F, -8.01F, 0.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (360F / (float) Math.PI);
		this.head.xRot = headPitch / (360F / (float) Math.PI);
		this.head2.yRot = netHeadYaw / (360F / (float) Math.PI);
		this.head2.xRot = headPitch / (360F / (float) Math.PI);
		this.leg_1.yRot = Mth.cos(limbSwing * 1.0F) * -0.5F * limbSwingAmount;
		this.leg_2.yRot = Mth.cos(limbSwing * 1.0F) * 0.5F * limbSwingAmount;
		this.leg_3.yRot = Mth.cos(limbSwing * 1.0F) * -0.5F * limbSwingAmount;
		this.leg_4.yRot = Mth.cos(limbSwing * 1.0F) * 0.5F * limbSwingAmount;
		this.leg_5.yRot = Mth.cos(limbSwing * 1.0F) * -0.5F * limbSwingAmount;
		this.leg_6.yRot = Mth.cos(limbSwing * 1.0F) * 0.5F * limbSwingAmount;
		this.leg_7.xRot = Mth.cos(limbSwing * 1.0F) * -0.5F * limbSwingAmount;
		this.leg_8.xRot = Mth.cos(limbSwing * 1.0F) * 0.5F * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}