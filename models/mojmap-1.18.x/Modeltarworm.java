// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltarworm<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tarworm"), "main");
	private final ModelPart head;
	private final ModelPart bb_main;

	public Modeltarworm(ModelPart root) {
		this.head = root.getChild("head");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 25.0F, 2.0F));

		PartDefinition mask = head.addOrReplaceChild("mask", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -15.0F, -4.6F, 0.2182F, 0.0F, 0.0F));

		PartDefinition mouth_r1 = mask
				.addOrReplaceChild("mouth_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 3.9469F, -15.3764F, 1.0F, 1.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition mask_2_r1 = mask.addOrReplaceChild(
				"mask_2_r1", CubeListBuilder.create().texOffs(50, 0).addBox(-5.4945F, 1.4235F, -9.5168F, 7.0F, 7.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition mask_1_r1 = mask.addOrReplaceChild("mask_1_r1",
				CubeListBuilder.create().texOffs(50, 0).mirror()
						.addBox(-1.5055F, 1.4234F, -9.5168F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -14.0F, -7.0F, 14.0F, 14.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-6.0F, -13.0F, -9.0F, 12.0F, 12.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(2.0F, -10.0F, 1.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(2.0F)).texOffs(0, 42)
						.addBox(-7.0F, -10.0F, 1.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(2.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition spikes13_r1 = bb_main.addOrReplaceChild("spikes13_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(0.0F, -2.5F, -5.0F, 0.0F, 5.0F, 10.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.5F, -15.5F, 0.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition spikes1_r1 = bb_main.addOrReplaceChild("spikes1_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(0.0F, -3.5F, -5.0F, 0.0F, 5.0F, 10.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-3.5F, -14.5F, 0.5F, -0.1309F, 0.0F, -0.6545F));

		PartDefinition spikes2_r1 = bb_main.addOrReplaceChild("spikes2_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(0.0F, -3.5F, -5.0F, 0.0F, 5.0F, 10.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(3.5F, -14.5F, 0.5F, -0.1309F, 0.0F, 0.6545F));

		PartDefinition spikes11_r1 = bb_main.addOrReplaceChild("spikes11_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(5.0F, -2.5F, -5.0F, 0.0F, 5.0F, 10.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(7.0F, 0.1F, 1.0F, 0.1309F, 0.0F, 2.9234F));

		PartDefinition spikes12_r1 = bb_main.addOrReplaceChild("spikes12_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(-5.0F, -2.5F, -5.0F, 0.0F, 5.0F, 10.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-7.0F, 0.1F, 1.0F, 0.1309F, 0.0F, -2.9234F));

		PartDefinition spikes9_r1 = bb_main.addOrReplaceChild("spikes9_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(2.0F, -2.5F, -5.0F, 0.0F, 5.0F, 10.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(7.0F, 0.1F, 1.0F, 0.1309F, 0.0F, 2.7053F));

		PartDefinition spikes10_r1 = bb_main.addOrReplaceChild("spikes10_r1",
				CubeListBuilder.create().texOffs(44, 32).addBox(-2.0F, -2.5F, -5.0F, 0.0F, 5.0F, 10.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-7.0F, 0.1F, 1.0F, 0.1309F, 0.0F, -2.7053F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(8, 15).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -12.0F, 10.0F, 0.1309F, -0.1309F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 15).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -12.0F, 10.0F, 0.1309F, 0.1309F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(8, 15).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 4.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -1.0F, 10.0F, -0.1309F, -0.1309F, 0.0F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(8, 15).addBox(-3.0F, -3.0F, -2.0F, 4.0F, 4.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -1.0F, 10.0F, -0.1309F, 0.1309F, 0.0F));

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
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}