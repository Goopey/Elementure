// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelivory_shade<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "ivory_shade"), "main");
	private final ModelPart head;
	private final ModelPart arm_right;
	private final ModelPart arm_left;
	private final ModelPart legs;
	private final ModelPart legright;
	private final ModelPart legleft;
	private final ModelPart bb_main;

	public Modelivory_shade(ModelPart root) {
		this.head = root.getChild("head");
		this.arm_right = root.getChild("arm_right");
		this.arm_left = root.getChild("arm_left");
		this.legs = root.getChild("legs");
		this.legright = legs.getChild("legright");
		this.legleft = legs.getChild("legleft");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(32, 48)
						.addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(18, 59)
						.addBox(-3.0F, 0.0F, -5.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition arm_right = partdefinition.addOrReplaceChild("arm_right",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-6.0F, -3.5F, 0.0F));

		PartDefinition arm_left = partdefinition.addOrReplaceChild("arm_left", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, -3.5F, 0.0F));

		PartDefinition legs = partdefinition.addOrReplaceChild("legs", CubeListBuilder.create().texOffs(0, 21).addBox(
				-4.0F, -1.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 0.0F));

		PartDefinition legright = legs.addOrReplaceChild("legright",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 1.0F, 0.0F));

		PartDefinition legleft = legs.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F,
				0.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 1.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -30.0F, -1.01F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(-4.5F, -29.0F, -2.5F, 9.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 16)
						.addBox(-8.0F, -29.5F, -1.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.arm_right.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.arm_left.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.legright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legs.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}