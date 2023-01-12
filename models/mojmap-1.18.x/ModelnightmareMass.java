// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelnightmareMass<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "nightmaremass"), "main");
	private final ModelPart leg_1;
	private final ModelPart leg_2;
	private final ModelPart leg_3;
	private final ModelPart leg_4;
	private final ModelPart leg_5;
	private final ModelPart leg_6;
	private final ModelPart leg_7;
	private final ModelPart bb_main;

	public ModelnightmareMass(ModelPart root) {
		this.leg_1 = root.getChild("leg_1");
		this.leg_2 = root.getChild("leg_2");
		this.leg_3 = root.getChild("leg_3");
		this.leg_4 = root.getChild("leg_4");
		this.leg_5 = root.getChild("leg_5");
		this.leg_6 = root.getChild("leg_6");
		this.leg_7 = root.getChild("leg_7");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leg_1 = partdefinition.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(0, 0).addBox(
				-1.0F, -1.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 18.0F, 0.0F));

		PartDefinition leg_2 = partdefinition.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(0, 0).addBox(
				-1.0F, -1.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 18.0F, -2.0F));

		PartDefinition leg_3 = partdefinition.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(0, 0).addBox(
				-1.0F, -3.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 18.0F, 3.0F));

		PartDefinition leg_4 = partdefinition.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.99F, -1.0F, -0.99F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 18.0F, 4.0F));

		PartDefinition leg_5 = partdefinition.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.99F, -2.0F, -0.99F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 18.0F, 3.0F));

		PartDefinition leg_6 = partdefinition.addOrReplaceChild("leg_6", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.99F, -2.0F, -0.99F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 18.0F, -4.0F));

		PartDefinition leg_7 = partdefinition.addOrReplaceChild("leg_7", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.99F, -3.0F, -0.99F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.0F, -5.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -13.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leg_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leg_2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg_1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg_4.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg_3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg_6.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg_5.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg_7.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}