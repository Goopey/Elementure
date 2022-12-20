// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsirenling<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sirenling"), "main");
	private final ModelPart body;
	private final ModelPart tail_rot;
	private final ModelPart tailtop;
	private final ModelPart tailmid;
	private final ModelPart tailend;

	public Modelsirenling(ModelPart root) {
		this.body = root.getChild("body");
		this.tail_rot = body.getChild("tail_rot");
		this.tailtop = tail_rot.getChild("tailtop");
		this.tailmid = tailtop.getChild("tailmid");
		this.tailend = tailmid.getChild("tailend");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -9.25F, -26.0F, 9.0F, 14.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, -8.0F, -18.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
						.addBox(-6.0F, -8.0F, -18.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 108).addBox(-8.0F, -12.25F, -7.0F, 17.0F, 20.0F, 0.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, 21.25F, 3.0F));

		PartDefinition tail_rot = body.addOrReplaceChild("tail_rot", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -2.25F, 1.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition tailtop = tail_rot.addOrReplaceChild("tailtop",
				CubeListBuilder.create().texOffs(84, 0)
						.addBox(-6.5F, -5.0F, -1.0F, 13.0F, 9.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(50, 43)
						.addBox(-7.0F, -4.0F, -0.99F, 14.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tailmid = tailtop.addOrReplaceChild("tailmid",
				CubeListBuilder.create().texOffs(138, 0)
						.addBox(-5.5F, -4.5F, -1.0F, 11.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(148, 29)
						.addBox(-6.0F, -4.0F, -0.99F, 12.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 13.0F));

		PartDefinition tailend = tailmid.addOrReplaceChild("tailend",
				CubeListBuilder.create().texOffs(116, 23)
						.addBox(-4.5F, -3.5F, -1.0F, 9.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(110, 45)
						.addBox(-5.0F, -3.0F, -0.99F, 10.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 13.0F));

		PartDefinition tailbit = tailend.addOrReplaceChild("tailbit", CubeListBuilder.create().texOffs(214, 21).addBox(
				-7.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -0.5F, 8.0F));

		PartDefinition fin_right = tailbit.addOrReplaceChild("fin_right",
				CubeListBuilder.create().texOffs(226, 0).mirror()
						.addBox(-5.5F, 0.0F, -1.0F, 11.0F, 0.0F, 8.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition fin_right2 = tailbit.addOrReplaceChild("fin_right2",
				CubeListBuilder.create().texOffs(226, 0).addBox(-5.5F, 0.0F, -1.0F, 11.0F, 0.0F, 8.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.tailtop.xRot = (float) (Math.sin(ageInTicks / 6) / 4);
		this.tailmid.xRot = (float) (Math.sin(ageInTicks / 6 + 1.9) / 4);
		this.tailend.xRot = (float) (Math.sin(ageInTicks / 6 + 3.8) / 4);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}