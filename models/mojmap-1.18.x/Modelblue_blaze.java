// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelblue_blaze<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart rods;
	private final ModelPart bottom_rods;
	private final ModelPart bottom_rods_d;
	private final ModelPart top_rods;
	private final ModelPart top_rods_a;
	private final ModelPart big_rods;
	private final ModelPart big_rod_under_bob;
	private final ModelPart bb_main;

	public Modelblue_blaze(ModelPart root) {
		this.rods = root.getChild("rods");
		this.bottom_rods = rods.getChild("bottom_rods");
		this.bottom_rods_d = bottom_rods.getChild("bottom_rods_d");
		this.big_rods = rods.getChild("big_rods");
		this.big_rod_under_bob = big_rods.getChild("big_rod_under_bob");
		this.top_rods = rods.getChild("top_rods");
		this.top_rods_a = top_rods.getChild("top_rods_a");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rods = partdefinition.addOrReplaceChild("rods", CubeListBuilder.create(),
				PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition big_rods = rods.addOrReplaceChild("big_rods", CubeListBuilder.create().texOffs(0, 50).addBox(
				-1.5F, -8.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition big_rod_under_bob = big_rods.addOrReplaceChild("big_rod_under_bob", CubeListBuilder.create()
				.texOffs(52, 56).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition top_rods = rods.addOrReplaceChild("top_rods", CubeListBuilder.create(),
				PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition top_rods_a = top_rods.addOrReplaceChild("top_rods_a", CubeListBuilder.create().texOffs(56, 18)
				.addBox(6.0F, -3.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rod_a7_r1 = top_rods_a
				.addOrReplaceChild("rod_a7_r1",
						CubeListBuilder.create().texOffs(12, 0).addBox(6.0F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition rod_a4_r1 = top_rods_a
				.addOrReplaceChild("rod_a4_r1",
						CubeListBuilder.create().texOffs(12, 0).addBox(6.0F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition rod_a2_r1 = top_rods_a
				.addOrReplaceChild("rod_a2_r1",
						CubeListBuilder.create().texOffs(12, 0).addBox(6.0F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition rod_b8_r1 = top_rods_a
				.addOrReplaceChild("rod_b8_r1",
						CubeListBuilder.create().texOffs(44, 18).addBox(6.0F, 4.0F, -1.0F, 2.0F, 8.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rod_b6_r1 = top_rods_a
				.addOrReplaceChild("rod_b6_r1",
						CubeListBuilder.create().texOffs(24, 0).addBox(6.0F, 7.0F, -1.0F, 2.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.3562F, 0.0F));

		PartDefinition rod_b5_r1 = top_rods_a
				.addOrReplaceChild("rod_b5_r1",
						CubeListBuilder.create().texOffs(24, 0).addBox(6.0F, 7.0F, -1.0F, 2.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rod_b3_r1 = top_rods_a
				.addOrReplaceChild("rod_b3_r1",
						CubeListBuilder.create().texOffs(24, 0).addBox(6.0F, 7.0F, -1.0F, 2.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition top_rods_b = top_rods.addOrReplaceChild("top_rods_b", CubeListBuilder.create().texOffs(24, 0)
				.addBox(6.0F, 7.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rod_b7_r1 = top_rods_b
				.addOrReplaceChild("rod_b7_r1",
						CubeListBuilder.create().texOffs(44, 18).addBox(6.0F, 4.0F, -1.0F, 2.0F, 8.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition rod_b4_r1 = top_rods_b
				.addOrReplaceChild("rod_b4_r1",
						CubeListBuilder.create().texOffs(44, 18).addBox(6.0F, 4.0F, -1.0F, 2.0F, 8.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition rod_b2_r1 = top_rods_b
				.addOrReplaceChild("rod_b2_r1",
						CubeListBuilder.create().texOffs(44, 18).addBox(6.0F, 4.0F, -1.0F, 2.0F, 8.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition rod_a8_r1 = top_rods_b
				.addOrReplaceChild("rod_a8_r1",
						CubeListBuilder.create().texOffs(12, 0).addBox(6.0F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rod_a6_r1 = top_rods_b
				.addOrReplaceChild("rod_a6_r1",
						CubeListBuilder.create().texOffs(56, 18).addBox(6.0F, -3.0F, -1.0F, 2.0F, 9.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.3562F, 0.0F));

		PartDefinition rod_a5_r1 = top_rods_b
				.addOrReplaceChild("rod_a5_r1",
						CubeListBuilder.create().texOffs(56, 18).addBox(6.0F, -3.0F, -1.0F, 2.0F, 9.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rod_a3_r1 = top_rods_b
				.addOrReplaceChild("rod_a3_r1",
						CubeListBuilder.create().texOffs(56, 18).addBox(6.0F, -3.0F, -1.0F, 2.0F, 9.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bottom_rods = rods.addOrReplaceChild("bottom_rods", CubeListBuilder.create(),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition bottom_rods_c = bottom_rods.addOrReplaceChild("bottom_rods_c", CubeListBuilder.create()
				.texOffs(0, 10).addBox(-1.0F, 0.0F, 3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition rod_d3_r1 = bottom_rods_c
				.addOrReplaceChild("rod_d3_r1",
						CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, 0.0F, 3.0F, 2.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

		PartDefinition rod_d4_r1 = bottom_rods_c
				.addOrReplaceChild("rod_d4_r1",
						CubeListBuilder.create().texOffs(12, 11).addBox(-1.0F, 1.0F, 3.0F, 2.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rod_c6_r1 = bottom_rods_c
				.addOrReplaceChild("rod_c6_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, 3.0F, 2.0F, 5.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition rod_c5_r1 = bottom_rods_c
				.addOrReplaceChild("rod_c5_r1",
						CubeListBuilder.create().texOffs(24, 10).addBox(-1.0F, -4.0F, 3.0F, 2.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

		PartDefinition rod_c2_r1 = bottom_rods_c
				.addOrReplaceChild("rod_c2_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, 3.0F, 2.0F, 5.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition bottom_rods_d = bottom_rods.addOrReplaceChild("bottom_rods_d", CubeListBuilder.create()
				.texOffs(24, 10).addBox(-1.0F, -4.0F, 3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition rod_d6_r1 = bottom_rods_d
				.addOrReplaceChild("rod_d6_r1",
						CubeListBuilder.create().texOffs(12, 11).addBox(-1.0F, 1.0F, 3.0F, 2.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition rod_d5_r1 = bottom_rods_d
				.addOrReplaceChild("rod_d5_r1",
						CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, 0.0F, 3.0F, 2.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

		PartDefinition rod_d2_r1 = bottom_rods_d
				.addOrReplaceChild("rod_d2_r1",
						CubeListBuilder.create().texOffs(12, 11).addBox(-1.0F, 1.0F, 3.0F, 2.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition rod_c4_r1 = bottom_rods_d
				.addOrReplaceChild("rod_c4_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, 3.0F, 2.0F, 5.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rod_c3_r1 = bottom_rods_d
				.addOrReplaceChild("rod_c3_r1",
						CubeListBuilder.create().texOffs(24, 10).addBox(-1.0F, -4.0F, 3.0F, 2.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(32, 0)
				.addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		float rotRand = (float) (entity.getPersistentData().getDouble("animRot"));
		this.bottom_rods.yRot = ageInTicks / -10.f;
		this.bb_main.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.bb_main.xRot = headPitch / (180F / (float) Math.PI);
		this.rods.yRot = ageInTicks / 20.f;
		this.big_rods.yRot = ageInTicks / 20.f;
		this.top_rods.setPos(0.f, -6.f + (float) Math.cos((ageInTicks + rotRand) / 4.f) / 2.f, 0.f);
		this.top_rods_a.setPos(0.f, (float) Math.sin((ageInTicks + Math.PI) / 3.2F) / 2.5F, 0.f);
		this.bottom_rods.setPos(0.f, 16.f + (float) Math.sin((ageInTicks + rotRand) / 3.f) / 2.f, 0.f);
		this.bottom_rods_d.setPos(0.f, -6.f + (float) Math.cos((ageInTicks + (Math.PI / 3.f)) / 3.5f) / 2.2F, 0.f);
		this.big_rods.setPos(0.f, 3.f + (float) Math.cos((ageInTicks + rotRand + (Math.PI / 5)) / 3.f) / 2.7F, 0.f);
		this.big_rod_under_bob.setPos(0.f, 6.f + (float) Math.sin(ageInTicks / 3.7F) / 4.f, 0.f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		rods.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}