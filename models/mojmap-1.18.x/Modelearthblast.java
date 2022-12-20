// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelearthblast<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "earthblast"), "main");
	private final ModelPart Main1;
	private final ModelPart Main2;
	private final ModelPart Main3;
	private final ModelPart Main4;
	private final ModelPart Main5;
	private final ModelPart Main6;

	public Modelearthblast(ModelPart root) {
		this.Main1 = root.getChild("Main1");
		this.Main2 = root.getChild("Main2");
		this.Main3 = root.getChild("Main3");
		this.Main4 = root.getChild("Main4");
		this.Main5 = root.getChild("Main5");
		this.Main6 = root.getChild("Main6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Main1 = partdefinition.addOrReplaceChild("Main1", CubeListBuilder.create().texOffs(0, 0).addBox(
				-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.4F, 16.0F, 0.0F));

		PartDefinition Minor1 = Main1.addOrReplaceChild("Minor1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F,
				-1.5F, 0.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition Main2 = partdefinition.addOrReplaceChild("Main2", CubeListBuilder.create().texOffs(0, 0).addBox(
				-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 20.9F, -3.8F));

		PartDefinition Minor2 = Main2.addOrReplaceChild("Minor2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F,
				-1.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.5F));

		PartDefinition Main3 = partdefinition.addOrReplaceChild("Main3", CubeListBuilder.create().texOffs(0, 0).addBox(
				-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.8F, 19.9F, 2.3F));

		PartDefinition Minor3 = Main3.addOrReplaceChild("Minor3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F,
				-0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition Main4 = partdefinition.addOrReplaceChild("Main4", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.4F, 16.0F, -4.6F));

		PartDefinition Main5 = partdefinition.addOrReplaceChild("Main5", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 22.9F, -1.5F));

		PartDefinition Main6 = partdefinition.addOrReplaceChild("Main6", CubeListBuilder.create().texOffs(0, 0).addBox(
				-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 22.2F, 6.5F));

		return LayerDefinition.create(meshdefinition, 32, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Main1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Main2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Main3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Main4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Main5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Main6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}