// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modellousy_sword<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "lousy_sword"), "main");
	private final ModelPart main_body;
	private final ModelPart body;

	public Modellousy_sword(ModelPart root) {
		this.main_body = root.getChild("main_body");
		this.body = main_body.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main_body = partdefinition.addOrReplaceChild("main_body", CubeListBuilder.create(),
				PartPose.offset(-8.0F, 24.0F, 8.0F));

		PartDefinition body = main_body.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -17.0F, -3.0F, 16.0F, 16.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, -8.0F, -0.3927F, 0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.main_body.xRot = (float) Math.sin((ageInTicks / 10) - 1.5F) / 12;
		this.body.zRot = (float) Math.sin((ageInTicks / 10) - 1.5F) / 12;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		main_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}