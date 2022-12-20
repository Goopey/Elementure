// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsword_temple_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sword_temple_armor"), "main");
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart body;

	public Modelsword_temple_armor(ModelPart root) {
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(48, 80)
						.addBox(-3.2F, -2.0F, -2.01F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(0, 123)
						.addBox(-2.8F, -3.0F, -2.01F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(40, 118)
						.addBox(-3.7F, -3.5F, -2.51F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-4.0F, -1.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(48, 80)
				.mirror().addBox(-0.8F, -2.0F, -2.01F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false)
				.texOffs(0, 123).mirror().addBox(1.9F, -3.0F, -2.01F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.2F))
				.mirror(false).texOffs(40, 118).mirror()
				.addBox(-1.2F, -3.5F, -2.51F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offset(4.0F, -1.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(40, 102)
						.addBox(-4.0F, 8.0F, -2.01F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(0, 64)
						.addBox(-4.5F, 4.0F, -2.0F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(0, 76)
						.addBox(-5.0F, -1.0F, -2.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(0, 113)
						.addBox(-4.0F, -1.01F, -2.5F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(0, 99)
						.addBox(-3.0F, 4.0F, -2.49F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(2, 87)
						.addBox(-2.0F, 9.0F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}