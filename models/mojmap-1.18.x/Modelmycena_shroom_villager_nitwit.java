// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmycena_shroom_villager_nitwit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mycena_shroom_villager_nitwit"), "main");
	private final ModelPart LeftArmBone;
	private final ModelPart RightArmBone;
	private final ModelPart rLegBone;
	private final ModelPart lLegBone;
	private final ModelPart HeadBone;
	private final ModelPart bb_main;

	public Modelmycena_shroom_villager_nitwit(ModelPart root) {
		this.LeftArmBone = root.getChild("LeftArmBone");
		this.RightArmBone = root.getChild("RightArmBone");
		this.rLegBone = root.getChild("rLegBone");
		this.lLegBone = root.getChild("lLegBone");
		this.HeadBone = root.getChild("HeadBone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftArmBone = partdefinition.addOrReplaceChild("LeftArmBone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.75F, -1.0F, 1.0F, 9.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, 5.5F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition RightArmBone = partdefinition.addOrReplaceChild("RightArmBone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.75F, -1.0F, 1.0F, 9.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.75F, 5.5F, 0.0F, 0.0F, 0.0F, 0.0873F));

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
						.addBox(-1.5F, -27.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(56, 48)
						.addBox(-1.0F, -24.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 60)
						.addBox(-0.5F, -18.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 62)
						.addBox(-1.5F, -18.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.75F, -19.75F, -1.01F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.25F, -20.0F, -0.99F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.25F, -20.0F, -1.01F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.75F, -19.75F, -0.99F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LeftArmBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArmBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rLegBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lLegBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		HeadBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftArmBone.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rLegBone.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.HeadBone.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.HeadBone.xRot = headPitch / (180F / (float) Math.PI);
		this.RightArmBone.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.lLegBone.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}