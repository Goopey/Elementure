// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelfireblastskillprojectile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "fireblastskillprojectile"), "main");
	private final ModelPart body;

	public Modelfireblastskillprojectile(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition
				.addOrReplaceChild("body",
						CubeListBuilder.create().texOffs(0, 0).addBox(-6.9F, -3.0F, -3.0F, 11.0F, 6.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition MainVertical = body.addOrReplaceChild("MainVertical", CubeListBuilder.create().texOffs(64, 48)
				.addBox(-3.0F, -4.0F, -3.0F, 7.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition MinorVertical = MainVertical.addOrReplaceChild("MinorVertical", CubeListBuilder.create()
				.texOffs(68, 32).addBox(-2.5F, -4.5F, -2.5F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Toptrail2 = MinorVertical.addOrReplaceChild("Toptrail2", CubeListBuilder.create().texOffs(-4, 32)
				.addBox(-8.0F, 0.0F, -2.5F, 8.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 4.5F, 0.0F));

		PartDefinition Toptrail1 = MinorVertical.addOrReplaceChild("Toptrail1", CubeListBuilder.create().texOffs(-4, 40)
				.addBox(-8.0F, 0.0F, -2.5F, 8.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, -4.5F, 0.0F));

		PartDefinition MainFront = body.addOrReplaceChild("MainFront", CubeListBuilder.create().texOffs(0, 16).addBox(
				0.0F, -2.5F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.6F, 0.0F, 0.0F));

		PartDefinition MainSide = body.addOrReplaceChild("MainSide", CubeListBuilder.create().texOffs(32, 48).addBox(
				-3.0F, -3.0F, -4.0F, 7.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition MinorSide = MainSide.addOrReplaceChild("MinorSide", CubeListBuilder.create().texOffs(36, 32)
				.addBox(-2.5F, -2.5F, -4.5F, 5.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition SideTrail2 = MinorSide.addOrReplaceChild("SideTrail2", CubeListBuilder.create().texOffs(0, 56)
				.addBox(-8.0F, -2.5F, 0.0F, 8.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 0.0F, -4.5F));

		PartDefinition SideTrail1 = MinorSide.addOrReplaceChild("SideTrail1", CubeListBuilder.create().texOffs(0, 48)
				.addBox(-8.0F, -2.5F, 0.0F, 8.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 0.0F, 4.5F));

		PartDefinition MainTrail = body.addOrReplaceChild("MainTrail", CubeListBuilder.create().texOffs(92, 0)
				.addBox(-10.3F, -3.0F, -3.0F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.5F, 0.0F, 0.0F));

		PartDefinition Minor = body.addOrReplaceChild("Minor", CubeListBuilder.create().texOffs(40, 0).addBox(-3.5F,
				-3.5F, -3.5F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}