// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcosmic_slime<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cosmic_slime"), "main");
	private final ModelPart main_body;
	private final ModelPart bb_main;
	private final ModelPart head_main;

	public Modelcosmic_slime(ModelPart root) {
		this.main_body = root.getChild("main_body");
		this.bb_main = root.getChild("bb_main");
		this.head_main = main_body.getChild("head_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main_body = partdefinition.addOrReplaceChild("main_body",
				CubeListBuilder.create().texOffs(23, 54)
						.addBox(-2.0F, 0.0F, -1.5F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 9)
						.addBox(-3.5F, -0.01F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.5F, -0.01F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition head_main = main_body.addOrReplaceChild("head_main", CubeListBuilder.create().texOffs(48, 34)
				.addBox(-2.0F, 1.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-14.0F, -20.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bb_main.yRot = ageInTicks;
		this.head_main.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head_main.xRot = headPitch / (180F / (float) Math.PI);
		this.main_body.setPos(0.0F, (12.0F + (float) (Math.cos(ageInTicks / 6) / 8)), 0.0F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		main_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}