// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmycena_shroomal<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mycena_shroomal"), "main");
	private final ModelPart Eye;
	private final ModelPart rArm;
	private final ModelPart lArm;
	private final ModelPart Body;
	private final ModelPart rLegbone;
	private final ModelPart lLegbone;

	public Modelmycena_shroomal(ModelPart root) {
		this.Eye = root.getChild("Eye");
		this.rArm = root.getChild("rArm");
		this.lArm = root.getChild("lArm");
		this.Body = root.getChild("Body");
		this.rLegbone = root.getChild("rLegbone");
		this.lLegbone = root.getChild("lLegbone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Eye = partdefinition.addOrReplaceChild("Eye", CubeListBuilder.create().texOffs(120, 0).addBox(
				-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.5F, -1.5F));

		PartDefinition rArm = partdefinition.addOrReplaceChild("rArm",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.7F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.7F, 1.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.55F, 1.0F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.5F, -6.6F, 0.0F));

		PartDefinition lArm = partdefinition.addOrReplaceChild("lArm",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.3F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.3F, 1.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.55F, 1.0F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.5F, -6.6F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -2.69F, -2.35F, 10.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-5.5F, -9.69F, -1.85F, 11.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.5F, -9.69F, -2.85F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.5F, -9.69F, -2.85F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.35F, -2.69F, -1.35F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.35F, -2.69F, -1.35F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.65F, -11.3F, -2.85F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.65F, -11.3F, -2.85F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.5F, -10.69F, -3.35F, 13.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.5F, -11.29F, -3.85F, 15.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.69F, 0.35F));

		PartDefinition Head = Body.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(64, 116)
						.addBox(-10.5F, -0.8F, -7.5F, 21.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(46, 100)
						.addBox(-13.0F, -1.2F, -9.5F, 26.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(50, 85)
						.addBox(-12.5F, -2.0F, -9.0F, 25.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(56, 71)
						.addBox(-11.5F, -2.7F, -8.5F, 23.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 116)
						.addBox(-10.0F, -3.3F, -7.5F, 20.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(4, 103)
						.addBox(-8.0F, -3.65F, -6.5F, 16.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -11.29F, 1.65F));

		PartDefinition rLegbone = partdefinition.addOrReplaceChild("rLegbone", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, 0.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 9.0F, 0.0F));

		PartDefinition lLegbone = partdefinition.addOrReplaceChild("lLegbone", CubeListBuilder.create().texOffs(0, 0)
				.addBox(0.0F, 0.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 9.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Eye.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rLegbone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lLegbone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Eye.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Eye.xRot = headPitch / (180F / (float) Math.PI);
		this.lArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rLegbone.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.lLegbone.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}