// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmycena_roamer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mycena_roamer"), "main");
	private final ModelPart body;
	private final ModelPart rLeg1;
	private final ModelPart lLeg1;
	private final ModelPart lLeg2;
	private final ModelPart rLeg2;

	public Modelmycena_roamer(ModelPart root) {
		this.body = root.getChild("body");
		this.rLeg1 = root.getChild("rLeg1");
		this.lLeg1 = root.getChild("lLeg1");
		this.lLeg2 = root.getChild("lLeg2");
		this.rLeg2 = root.getChild("rLeg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(42, 57)
						.addBox(-2.5F, -1.75F, -4.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-3.0F, -4.5F, -4.01F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(21, 40)
						.addBox(-3.0F, -5.5F, -3.76F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(35, 58)
						.addBox(-2.5F, -4.5F, -4.51F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 54)
						.addBox(-2.5F, -5.49F, -4.27F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Shell = body.addOrReplaceChild("Shell", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Shell1 = Shell.addOrReplaceChild("Shell1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -3.0F, -3.5F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, -2.5F, -2.75F, 9.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition shell7 = Shell1.addOrReplaceChild("shell7",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -2.25F, 3.0F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -3.25F, 4.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.75F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Shell2 = Shell.addOrReplaceChild("Shell2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.5F, -1.5F, -2.5F, 7.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -1.0F, -3.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, -3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Shell3 = Shell.addOrReplaceChild("Shell3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -1.0F, -2.5F, 7.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Shell4 = Shell3.addOrReplaceChild("Shell4",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.49F, -1.75F, -2.25F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.51F, 0.0F, -1.25F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.25F, -2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Shell8 = Shell.addOrReplaceChild("Shell8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.99F, -1.0F, -5.0F, 10.0F, 2.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 1.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Shell9 = Shell8
				.addOrReplaceChild("Shell9",
						CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -1.25F, -4.0F, 6.0F, 2.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Shell17 = Shell9.addOrReplaceChild("Shell17",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -0.9F, -1.25F, 5.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.25F, -1.75F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Shell18 = Shell9.addOrReplaceChild("Shell18",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.49F, 0.1F, -1.25F, 3.0F, 2.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.25F, 3.25F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Shell10 = Shell8.addOrReplaceChild("Shell10",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.51F, -1.0F, -5.75F, 9.0F, 2.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.25F, 1.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Shell11 = Shell8.addOrReplaceChild("Shell11",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -0.75F, -5.0F, 8.0F, 2.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.25F, 1.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Shell13 = Shell8.addOrReplaceChild("Shell13",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -1.5F, -3.5F, 7.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.25F, 1.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Shell14 = Shell8.addOrReplaceChild("Shell14",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.25F, -2.5F, 6.0F, 2.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.25F, 1.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Shell15 = Shell8.addOrReplaceChild("Shell15",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.25F, -1.5F, 5.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.25F, 1.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Shell16 = Shell8.addOrReplaceChild("Shell16",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.65F, -1.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.25F, 1.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition rLeg1 = partdefinition.addOrReplaceChild("rLeg1",
				CubeListBuilder.create().texOffs(54, 49).addBox(-1.0F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 21.25F, -0.5F, 0.0F, 0.4363F, 0.0F));

		PartDefinition rLeg1_2 = rLeg1.addOrReplaceChild("rLeg1_2",
				CubeListBuilder.create().texOffs(54, 49).addBox(-1.0F, -0.65F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.3054F, 0.2182F, -0.2618F));

		PartDefinition rLeg1_3 = rLeg1_2.addOrReplaceChild("rLeg1_3",
				CubeListBuilder.create().texOffs(54, 49).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 1.25F, 0.0F, 0.6109F, -0.4363F, -0.2618F));

		PartDefinition lLeg1 = partdefinition.addOrReplaceChild("lLeg1",
				CubeListBuilder.create().texOffs(54, 33).addBox(0.0F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 21.25F, -0.5F, 0.0F, -0.4363F, 0.0F));

		PartDefinition lLeg1_2 = lLeg1.addOrReplaceChild("lLeg1_2",
				CubeListBuilder.create().texOffs(54, 33).addBox(0.0F, -0.65F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.3054F, -0.2182F, 0.2618F));

		PartDefinition lLeg1_3 = lLeg1_2.addOrReplaceChild("lLeg1_3",
				CubeListBuilder.create().texOffs(54, 33).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 1.25F, 0.0F, 0.6109F, 0.4363F, 0.2618F));

		PartDefinition lLeg2 = partdefinition.addOrReplaceChild("lLeg2",
				CubeListBuilder.create().texOffs(58, 40).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 22.5F, -0.5F, 0.0F, -0.0873F, 0.0F));

		PartDefinition lLeg2_2 = lLeg2.addOrReplaceChild("lLeg2_2",
				CubeListBuilder.create().texOffs(58, 40).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, -2.0F, -0.1745F, -0.1745F, 0.0873F));

		PartDefinition rLeg2 = partdefinition.addOrReplaceChild("rLeg2",
				CubeListBuilder.create().texOffs(58, 44).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 22.5F, -0.5F, 0.0F, 0.0873F, 0.0F));

		PartDefinition rLeg2_2 = rLeg2.addOrReplaceChild("rLeg2_2",
				CubeListBuilder.create().texOffs(58, 44).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.1745F, 0.1745F, -0.0873F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rLeg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lLeg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.lLeg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.lLeg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rLeg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rLeg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}