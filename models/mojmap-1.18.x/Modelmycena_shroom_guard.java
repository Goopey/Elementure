// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmycena_shroom_guard<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mycena_shroom_guard"), "main");
	private final ModelPart RightArmBone;
	private final ModelPart LeftArmBone;
	private final ModelPart Body;
	private final ModelPart rLegBone;
	private final ModelPart lLegBone;
	private final ModelPart HeadBone;

	public Modelmycena_shroom_guard(ModelPart root) {
		this.RightArmBone = root.getChild("RightArmBone");
		this.LeftArmBone = root.getChild("LeftArmBone");
		this.Body = root.getChild("Body");
		this.rLegBone = root.getChild("rLegBone");
		this.lLegBone = root.getChild("lLegBone");
		this.HeadBone = root.getChild("HeadBone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightArmBone = partdefinition.addOrReplaceChild("RightArmBone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.75F, -1.0F, 1.0F, 9.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.75F, 5.5F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition SpearBone = RightArmBone.addOrReplaceChild("SpearBone",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.5F, -0.5F, -7.5F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-1.0F, -1.0F, -10.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-0.5F, -0.5F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.75F, 0.0F));

		PartDefinition LeftArmBone = partdefinition.addOrReplaceChild("LeftArmBone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.75F, -1.0F, 1.0F, 9.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, 5.5F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(56, 48)
						.addBox(-1.3F, -12.455F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 60)
						.addBox(-0.8F, -6.455F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 62)
						.addBox(-1.8F, -6.455F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.05F, -8.205F, -1.01F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.55F, -8.455F, -0.99F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.45F, -8.205F, -0.99F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.05F, -8.455F, -1.01F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-2.3F, -9.455F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 11)
						.addBox(0.45F, -8.445F, -1.65F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 22)
						.addBox(0.95F, -7.455F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 6)
						.addBox(0.45F, -4.455F, -1.35F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 6)
						.addBox(-3.05F, -8.445F, -1.65F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 16)
						.addBox(-3.55F, -7.455F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 11)
						.addBox(-3.05F, -4.455F, -1.35F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 16)
						.addBox(-1.8F, -3.955F, -1.49F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.3F, 12.455F, 0.0F));

		PartDefinition rLegBone = partdefinition.addOrReplaceChild("rLegBone", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.5F, 0.0F, -0.99F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 13.0F, 0.0F));

		PartDefinition lLegBone = partdefinition.addOrReplaceChild("lLegBone", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.5F, 0.0F, -1.01F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 13.0F, 0.0F));

		PartDefinition HeadBone = partdefinition.addOrReplaceChild("HeadBone",
				CubeListBuilder.create().texOffs(0, 58)
						.addBox(-2.5F, -25.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-3.0F, -25.4F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(17, 36)
						.addBox(-1.0F, -26.19F, -2.99F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 33)
						.addBox(-3.01F, -26.19F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
						.addBox(-2.5F, -26.2F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-2.0F, -26.7F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 30)
						.addBox(-0.5F, -26.69F, -2.49F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-2.51F, -26.69F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-1.5F, -27.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-1.5F, -24.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		RightArmBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArmBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rLegBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lLegBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		HeadBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftArmBone.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rLegBone.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightArmBone.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.lLegBone.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}