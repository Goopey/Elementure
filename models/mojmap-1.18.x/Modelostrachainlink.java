// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelostrachainlink<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "ostrachainlink"), "main");
	private final ModelPart bb_main;

	public Modelostrachainlink(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -14.0F, -7.0F, 14.0F, 14.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-6.0F, -13.0F, -9.0F, 12.0F, 12.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(44, 22)
						.addBox(0.0F, -18.0F, -9.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.01F)).texOffs(44, 32)
						.addBox(0.0F, -18.0F, 1.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.01F)).texOffs(0, 42)
						.addBox(-1.0F, -9.0F, -1.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(2.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(13, 19).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -12.0F, 10.0F, 0.2618F, -0.2618F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(13, 19).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -12.0F, 10.0F, 0.2618F, 0.2618F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(13, 19).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -1.0F, 10.0F, -0.2618F, -0.2618F, 0.0F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(13, 19).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -1.0F, 10.0F, -0.2618F, 0.2618F, 0.0F));

		PartDefinition spikes7_r1 = bb_main.addOrReplaceChild("spikes7_r1",
				CubeListBuilder.create().texOffs(44, 33)
						.addBox(0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.01F)).texOffs(44, 21)
						.addBox(0.0F, -4.5F, -10.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-6.0F, -13.5F, 2.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition spikes5_r1 = bb_main.addOrReplaceChild("spikes5_r1",
				CubeListBuilder.create().texOffs(44, 33)
						.addBox(0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.01F)).texOffs(44, 21)
						.addBox(0.0F, -4.5F, -10.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(6.0F, -13.5F, 2.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition spikes4_r1 = bb_main.addOrReplaceChild("spikes4_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(0.0F, -4.5F, -5.0F, 0.0F, 5.0F, 10.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-7.0F, -1.9F, 1.0F, 0.1309F, 0.0F, -2.4435F));

		PartDefinition spikes3_r1 = bb_main.addOrReplaceChild("spikes3_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(0.0F, -4.5F, -5.0F, 0.0F, 5.0F, 10.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(7.0F, -1.9F, 1.0F, 0.1309F, 0.0F, 2.4435F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bb_main.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.bb_main.xRot = headPitch / (180F / (float) Math.PI);
	}
}