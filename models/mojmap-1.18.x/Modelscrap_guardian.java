// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelscrap_guardian<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "scrap_guardian"), "main");
	private final ModelPart eye;
	private final ModelPart body;

	public Modelscrap_guardian(ModelPart root) {
		this.eye = root.getChild("eye");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition eye = partdefinition.addOrReplaceChild("eye", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.0F, -15.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(3.5F)), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(8, 0)
						.addBox(-8.0F, -20.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(6.0F)).texOffs(80, 0)
						.addBox(-6.0F, -21.0F, -6.0F, 12.0F, 18.0F, 12.0F, new CubeDeformation(6.0F)).texOffs(0, 40)
						.addBox(-9.0F, -18.0F, -6.0F, 18.0F, 12.0F, 12.0F, new CubeDeformation(6.0F)).texOffs(68, 34)
						.addBox(-6.0F, -18.0F, -9.0F, 12.0F, 12.0F, 18.0F, new CubeDeformation(6.0F)),
				PartPose.offset(0.0F, 22.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.eye.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.eye.xRot = headPitch / (180F / (float) Math.PI);
		this.body.yRot = ageInTicks / 20.f + Mth.cos(ageInTicks / 4.f) / 2.f;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		eye.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}