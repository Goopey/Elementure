// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelironknighthelmet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "ironknighthelmet"), "main");
	private final ModelPart head;

	public Modelironknighthelmet(ModelPart root) {
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 32).addBox(
				-4.5F, -8.5F, -4.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.5F, 0.0F));

		PartDefinition HornRightBase = head.addOrReplaceChild("HornRightBase",
				CubeListBuilder.create().texOffs(0, 55).addBox(-2.0F, -8.1F, -3.2F, 4.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.7854F, 0.8727F, 0.0F));

		PartDefinition HornRightMain = HornRightBase.addOrReplaceChild("HornRightMain",
				CubeListBuilder.create().texOffs(25, 54).addBox(-0.9F, -9.0F, -8.0F, 3.0F, 7.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9561F, -0.2731F, -0.1676F));

		PartDefinition HornLeftBase = head.addOrReplaceChild("HornLeftBase",
				CubeListBuilder.create().texOffs(0, 55).mirror()
						.addBox(-2.0F, -8.1F, -3.2F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.7854F, -0.8727F, 0.0F));

		PartDefinition HornLeftMain = HornLeftBase.addOrReplaceChild("HornLeftMain",
				CubeListBuilder.create().texOffs(25, 54).mirror()
						.addBox(-0.9F, -9.2F, -8.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9561F, 0.2731F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}