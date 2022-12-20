// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelheadHost<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "headhost"), "main");
	private final ModelPart head_pivot_bob;
	private final ModelPart leg;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;
	private final ModelPart leg5;
	private final ModelPart leg6;

	public ModelheadHost(ModelPart root) {
		this.head_pivot_bob = root.getChild("head_pivot_bob");
		this.leg = root.getChild("leg");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
		this.leg5 = root.getChild("leg5");
		this.leg6 = root.getChild("leg6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head_pivot_bob = partdefinition.addOrReplaceChild("head_pivot_bob",
				CubeListBuilder.create().texOffs(32, 0)
						.addBox(-3.99F, -8.01F, -4.5F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 16)
						.addBox(-3.99F, -8.01F, -4.5F, 8.0F, 7.0F, 8.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(0.0F, 21.0F, 0.5F));

		PartDefinition cube_r1 = head_pivot_bob.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 46).addBox(-2.5F, -1.4F, 0.0F, 5.0F, 2.0F, 0.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, 2.8798F, 0.0F, 0.0F));

		PartDefinition leg = partdefinition.addOrReplaceChild("leg", CubeListBuilder.create(),
				PartPose.offset(4.0F, 20.0F, -3.0F));

		PartDefinition cube_r2 = leg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(44, 35).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4399F, -0.7854F, 0.0F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 20.0F, -3.0F));

		PartDefinition cube_r3 = leg2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(44, 35).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4399F, 0.7854F, 0.0F));

		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create(),
				PartPose.offset(4.0F, 20.0F, 0.0F));

		PartDefinition cube_r4 = leg3.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(44, 36).mirror()
						.addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4399F, -1.6144F, 0.0F));

		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 20.0F, 0.0F));

		PartDefinition cube_r5 = leg4.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(44, 36).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4399F, 1.6144F, 0.0F));

		PartDefinition leg5 = partdefinition.addOrReplaceChild("leg5", CubeListBuilder.create(),
				PartPose.offset(3.6F, 20.0F, 4.0F));

		PartDefinition cube_r6 = leg5.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(44, 37).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.309F, -2.3998F, 0.0F));

		PartDefinition leg6 = partdefinition.addOrReplaceChild("leg6", CubeListBuilder.create(),
				PartPose.offset(-3.5F, 20.0F, 4.0F));

		PartDefinition cube_r7 = leg6.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(44, 37).mirror()
						.addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.309F, 2.3998F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head_pivot_bob.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leg4.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg5.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg6.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}