// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelfluff_whale<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "fluff_whale"), "main");
	private final ModelPart head;
	private final ModelPart tailtop;
	private final ModelPart tailmid;
	private final ModelPart tailend;
	private final ModelPart tailfin;
	private final ModelPart rightfin;
	private final ModelPart leftfin;
	private final ModelPart bb_main;

	public Modelfluff_whale(ModelPart root) {
		this.head = root.getChild("head");
		this.tailtop = root.getChild("tailtop");
		this.tailmid = tailtop.getChild("tailmid");
		this.tailend = tailmid.getChild("tailend");
		this.tailfin = tailend.getChild("tailfin");
		this.rightfin = root.getChild("rightfin");
		this.leftfin = root.getChild("leftfin");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -7.0F, -15.0F, 14.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(37, 11)
						.addBox(-5.5F, -6.0F, -8.0F, 11.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-4.0F, -3.0F, -13.01F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, -4.0F));

		PartDefinition tailtop = partdefinition.addOrReplaceChild("tailtop", CubeListBuilder.create().texOffs(79, 0)
				.addBox(-4.0F, -4.0F, -10.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.0F, 13.0F));

		PartDefinition tailmid = tailtop.addOrReplaceChild("tailmid", CubeListBuilder.create().texOffs(84, 38).addBox(
				-3.5F, -3.5F, -10.0F, 7.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));

		PartDefinition tailend = tailmid.addOrReplaceChild("tailend", CubeListBuilder.create().texOffs(104, 52).addBox(
				-3.0F, -3.0F, -10.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));

		PartDefinition tailfin = tailend.addOrReplaceChild("tailfin", CubeListBuilder.create().texOffs(92, 0)
				.addBox(0.0F, -8.0F, -10.0F, 0.0F, 16.0F, 18.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, 0.0F, 6.0F));

		PartDefinition rightfin = partdefinition.addOrReplaceChild("rightfin", CubeListBuilder.create().texOffs(38, 52)
				.addBox(-18.0F, 0.0F, -16.0F, 18.0F, 0.0F, 12.0F, new CubeDeformation(0.01F)),
				PartPose.offset(-4.5F, 16.0F, 6.0F));

		PartDefinition leftfin = partdefinition.addOrReplaceChild("leftfin",
				CubeListBuilder.create().texOffs(38, 52).mirror()
						.addBox(0.0F, 0.0F, -16.0F, 18.0F, 0.0F, 12.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offset(4.5F, 16.0F, 6.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 43)
				.addBox(-4.5F, -13.5F, -9.0F, 9.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightfin.zRot = (float) (Math.sin(ageInTicks / 6) / 3);
		this.leftfin.zRot = (float) (Math.sin(ageInTicks / 6 + 3.8) / 3);
		this.tailtop.yRot = (float) (Math.sin(ageInTicks / 6) / 4);
		this.tailmid.yRot = (float) (Math.sin(ageInTicks / 6 + 1.9) / 4);
		this.tailend.yRot = (float) (Math.sin(ageInTicks / 6 + 3.8) / 4);
		this.tailfin.yRot = (float) (Math.sin(ageInTicks / 6 + 5.7) / 4);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tailtop.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightfin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftfin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}