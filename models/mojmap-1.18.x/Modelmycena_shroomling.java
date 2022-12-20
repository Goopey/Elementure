// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmycena_shroomling<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mycena_shroomling"), "main");
	private final ModelPart rArmBone;
	private final ModelPart lArmBone;
	private final ModelPart Body;
	private final ModelPart rLegBone;
	private final ModelPart lLegBone;

	public Modelmycena_shroomling(ModelPart root) {
		this.rArmBone = root.getChild("rArmBone");
		this.lArmBone = root.getChild("lArmBone");
		this.Body = root.getChild("Body");
		this.rLegBone = root.getChild("rLegBone");
		this.lLegBone = root.getChild("lLegBone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rArmBone = partdefinition.addOrReplaceChild("rArmBone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.01F, -1.01F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 12.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition lArmBone = partdefinition.addOrReplaceChild("lArmBone",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.01F, -1.01F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 12.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.5F, -6.0F, -0.99F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 18.0F, 0.0F));

		PartDefinition Head = Body.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 56)
						.addBox(-4.0F, -1.0F, -3.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 54)
						.addBox(-5.5F, -1.4F, -4.5F, 11.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(28, 45)
						.addBox(-5.0F, -2.0F, -4.0F, 10.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-5.49F, -1.85F, -1.5F, 11.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-2.5F, -1.85F, -4.51F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-4.99F, -2.3F, -1.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 28)
						.addBox(-2.0F, -2.3F, -4.01F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 37)
						.addBox(-4.5F, -2.45F, -3.5F, 9.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(15, 33)
						.addBox(-3.5F, -2.85F, -2.5F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, -6.0F, 0.0F));

		PartDefinition rLegBone = partdefinition.addOrReplaceChild("rLegBone", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 18.0F, 0.0F));

		PartDefinition lLegBone = partdefinition.addOrReplaceChild("lLegBone", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 18.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		rArmBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lArmBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rLegBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lLegBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.rLegBone.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.lArmBone.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.lLegBone.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rArmBone.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}