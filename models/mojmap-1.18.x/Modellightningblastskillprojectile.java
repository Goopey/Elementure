// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modellightningblastskillprojectile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "lightningblastskillprojectile"), "main");
	private final ModelPart Main1;
	private final ModelPart Main2;
	private final ModelPart Main3;

	public Modellightningblastskillprojectile(ModelPart root) {
		this.Main1 = root.getChild("Main1");
		this.Main2 = root.getChild("Main2");
		this.Main3 = root.getChild("Main3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Main1 = partdefinition.addOrReplaceChild("Main1", CubeListBuilder.create().texOffs(0, 0).addBox(
				0.0F, -1.5F, -1.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Front1 = Main1.addOrReplaceChild("Front1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.5F, -5.0F, 1.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9F, 0.0F, -1.6F, 0.0F, -0.4554F, 0.0F));

		PartDefinition Minor1 = Main1.addOrReplaceChild("Minor1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F,
				-1.0F, -1.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 0.0F, 0.0F));

		PartDefinition Tail1 = Main1
				.addOrReplaceChild("Tail1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(4.5F, 0.0F, 0.6F, 0.0F, -0.5009F, 0.0F));

		PartDefinition Main2 = partdefinition.addOrReplaceChild("Main2",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.5F, -1.0F, 5.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3F, -4.8F, 3.3F, 0.0F, 0.0F, 3.1416F));

		PartDefinition Front2 = Main2.addOrReplaceChild("Front2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.5F, -5.0F, 1.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9F, 0.0F, -1.6F, 0.0F, -0.4554F, 0.0F));

		PartDefinition Tail2 = Main2
				.addOrReplaceChild("Tail2",
						CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(4.5F, 0.0F, 0.6F, 0.0F, -0.5009F, 0.0F));

		PartDefinition Minor2 = Main2.addOrReplaceChild("Minor2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F,
				-1.0F, -1.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 0.0F, 0.0F));

		PartDefinition Main3 = partdefinition
				.addOrReplaceChild("Main3",
						CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.5F, -1.0F, 5.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.5F, 3.2F, 5.3F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Minor3 = Main3.addOrReplaceChild("Minor3", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F,
				-1.0F, -1.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 0.0F, 0.0F));

		PartDefinition Front3 = Main3.addOrReplaceChild("Front3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.5F, -5.0F, 1.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9F, 0.0F, -1.6F, 0.0F, -0.4554F, 0.0F));

		PartDefinition Tail3 = Main3
				.addOrReplaceChild("Tail3",
						CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(4.5F, 0.0F, 0.6F, 0.0F, -0.5009F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Main1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Main2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Main3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}