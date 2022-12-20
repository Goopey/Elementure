// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpowerstrikeskillprojectile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "powerstrikeskillprojectile"), "main");
	private final ModelPart Front;

	public Modelpowerstrikeskillprojectile(ModelPart root) {
		this.Front = root.getChild("Front");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Front = partdefinition.addOrReplaceChild("Front", CubeListBuilder.create().texOffs(0, 0).addBox(
				-0.5F, -0.5F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -6.0F));

		PartDefinition Minor = Front.addOrReplaceChild("Minor", CubeListBuilder.create().texOffs(16, 0).addBox(-1.5F,
				-1.5F, 0.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));

		PartDefinition Tail = Minor.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 8).addBox(-1.5F,
				-1.5F, -6.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 11.0F));

		PartDefinition Back = Minor.addOrReplaceChild("Back", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F,
				-1.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.8F));

		PartDefinition body = Front.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F,
				-1.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Front.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}