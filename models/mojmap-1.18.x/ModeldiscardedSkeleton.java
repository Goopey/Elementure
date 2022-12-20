// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModeldiscardedSkeleton<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "discardedskeleton"), "main");
	private final ModelPart bone;

	public ModeldiscardedSkeleton(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, -13.0F, -1.5708F, 0.0F, -3.1416F));

		PartDefinition right_leg = bone.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -0.01F, -1.0F, 2.0F, 12.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition left_leg = bone.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(0, 18).mirror()
						.addBox(-1.0F, -0.01F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition head_tilt = bone.addOrReplaceChild("head_tilt", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -23.0F, 0.5F, 0.0F, 0.0F, -0.1309F));

		PartDefinition head_pivot_bob = head_tilt.addOrReplaceChild("head_pivot_bob", CubeListBuilder.create()
				.texOffs(32, 0).addBox(-3.99F, -8.01F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = bone.addOrReplaceChild("right_arm", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.0F, -23.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition right_arm_r1 = right_arm.addOrReplaceChild("right_arm_r1",
				CubeListBuilder.create().texOffs(24, 18).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 0.5F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm = bone.addOrReplaceChild("left_arm", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.0F, -23.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild("left_arm_r1",
				CubeListBuilder.create().texOffs(24, 18).mirror()
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.01F, 0.5F, 0.0F, 0.0F, 0.0F, -0.1309F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}