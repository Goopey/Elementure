// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelrimeBoid<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "rimeboid"), "main");
	private final ModelPart front;
	private final ModelPart fin;

	public ModelrimeBoid(ModelPart root) {
		this.front = root.getChild("front");
		this.fin = root.getChild("fin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition front = partdefinition.addOrReplaceChild("front",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.5F, -1.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, 3.0F));

		PartDefinition fin = partdefinition.addOrReplaceChild("fin",
				CubeListBuilder.create().texOffs(12, 13)
						.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-0.5F, -2.0F, 1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, 3.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.fin.yRot = (float) (Math.sin(ageInTicks / 6) / 4);
		this.front.yRot = (float) (Math.cos(ageInTicks / 6) / 4) / 2;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		front.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		fin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}