// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldragonite_boots_scalemail<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dragonite_boots_scalemail"), "main");
	private final ModelPart l_foot;
	private final ModelPart r_foot;

	public Modeldragonite_boots_scalemail(ModelPart root) {
		this.l_foot = root.getChild("l_foot");
		this.r_foot = root.getChild("r_foot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition l_foot = partdefinition.addOrReplaceChild("l_foot",
				CubeListBuilder.create().texOffs(0, 86).mirror()
						.addBox(-2.0F, 5.99F, -2.01F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false)
						.texOffs(0, 74).mirror().addBox(2.0F, 4.5F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition r_foot = partdefinition.addOrReplaceChild("r_foot",
				CubeListBuilder.create().texOffs(0, 74)
						.addBox(-3.0F, 4.5F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 86)
						.addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 96);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		l_foot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_foot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}