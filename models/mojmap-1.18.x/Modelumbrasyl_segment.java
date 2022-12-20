// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelumbrasyl_segment<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "umbrasyl_segment"), "main");
	private final ModelPart bb_main;

	public Modelumbrasyl_segment(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-24.0F, -37.0F, -24.0F, 48.0F, 48.0F, 48.0F, new CubeDeformation(4.0F)).texOffs(0, 0)
						.addBox(-22.0F, -40.0F, -22.0F, 44.0F, 54.0F, 44.0F, new CubeDeformation(4.0F)).texOffs(0, 0)
						.addBox(-27.0F, -35.0F, -22.0F, 54.0F, 44.0F, 44.0F, new CubeDeformation(4.0F)).texOffs(0, 0)
						.addBox(-22.0F, -35.0F, -27.0F, 44.0F, 44.0F, 54.0F, new CubeDeformation(4.0F)).texOffs(0, 98)
						.addBox(-4.95F, -43.0F, -27.05F, 10.0F, 6.0F, 54.0F, new CubeDeformation(4.0F)).texOffs(0, 210)
						.addBox(-27.5F, -40.5F, -27.0F, 55.0F, 56.0F, 54.0F, new CubeDeformation(4.0F)).texOffs(132, 36)
						.addBox(0.0F, -61.0F, -31.01F, 0.0F, 14.0F, 62.0F, new CubeDeformation(0.01F)).texOffs(132, 54)
						.addBox(0.0F, 18.0F, -31.01F, 0.0F, 14.0F, 62.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 98)
						.addBox(-20.95F, -42.51F, -46.05F, 10.0F, 6.0F, 54.0F, new CubeDeformation(4.0F)).texOffs(0, 98)
						.addBox(-20.95F, -42.5F, -8.05F, 10.0F, 6.0F, 54.0F, new CubeDeformation(4.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(55, 108).addBox(-9.0F, -33.0F, -4.5F, 6.0F, 36.0F, 3.0F,
						new CubeDeformation(2.0F)),
				PartPose.offsetAndRotation(-30.0F, 0.0F, 0.5F, -1.9635F, -0.4363F, 1.0908F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(55, 108).addBox(3.0F, -33.0F, -4.5F, 6.0F, 36.0F, 3.0F,
						new CubeDeformation(2.0F)),
				PartPose.offsetAndRotation(30.0F, 0.0F, 0.5F, -1.9635F, 0.4363F, -1.0908F));

		return LayerDefinition.create(meshdefinition, 256, 320);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}