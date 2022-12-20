// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelchromaticwheel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "chromaticwheel"), "main");
	private final ModelPart main_body;

	public Modelchromaticwheel(ModelPart root) {
		this.main_body = root.getChild("main_body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main_body = partdefinition.addOrReplaceChild("main_body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -7.0F, -3.0F, 1.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(10, 22)
						.addBox(-1.0F, -3.0F, -7.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 10)
						.addBox(-1.0F, -3.0F, 3.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 0)
						.addBox(-1.0F, -6.0F, -5.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -5.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(-1.0F, -6.0F, 3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -5.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 4)
						.addBox(-1.0F, 3.0F, -5.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 5)
						.addBox(-1.0F, 3.0F, 3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 3.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 3.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-1.5F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 28)
						.addBox(-2.0F, -3.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-2.0F, 1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 21)
						.addBox(-2.0F, -2.0F, -2.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-2.0F, -1.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 21)
						.addBox(-2.0F, -2.0F, 1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-2.0F, -1.0F, 2.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		main_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.main_body.xRot = ageInTicks;
	}
}