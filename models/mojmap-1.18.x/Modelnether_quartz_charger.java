// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelnether_quartz_charger<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "nether_quartz_charger"), "main");
	private final ModelPart l_leg;
	private final ModelPart r_leg;
	private final ModelPart head;
	private final ModelPart btm_jaw;
	private final ModelPart tail;
	private final ModelPart bb_main;

	public Modelnether_quartz_charger(ModelPart root) {
		this.l_leg = root.getChild("l_leg");
		this.r_leg = root.getChild("r_leg");
		this.head = root.getChild("head");
		this.btm_jaw = head.getChild("btm_jaw");
		this.tail = root.getChild("tail");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition l_leg = partdefinition.addOrReplaceChild("l_leg", CubeListBuilder.create(),
				PartPose.offset(8.0F, -6.0F, 0.0F));

		PartDefinition leg_2_r1 = l_leg.addOrReplaceChild("leg_2_r1",
				CubeListBuilder.create().texOffs(54, 9).addBox(-2.9F, -2.8F, -3.5F, 8.0F, 29.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, 6.0F, 6.5F, -0.2182F, 0.0F, -0.0873F));

		PartDefinition leg_1_r1 = l_leg.addOrReplaceChild("leg_1_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.5F, -2.0F, 7.0F, 9.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.5F, 0.0F, 0.7418F, 0.0F, -0.5236F));

		PartDefinition r_leg = partdefinition.addOrReplaceChild("r_leg", CubeListBuilder.create(),
				PartPose.offset(-8.0F, -6.0F, 0.0F));

		PartDefinition leg_2_r2 = r_leg.addOrReplaceChild("leg_2_r2",
				CubeListBuilder.create().texOffs(54, 9).mirror()
						.addBox(-5.1F, -2.8F, -3.5F, 8.0F, 29.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.5F, 6.0F, 6.5F, -0.2182F, 0.0F, 0.0873F));

		PartDefinition leg_1_r2 = r_leg.addOrReplaceChild("leg_1_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -2.5F, -2.0F, 7.0F, 9.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 2.5F, 0.0F, 0.7418F, 0.0F, 0.5236F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(46, 52).addBox(
				-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, -3.0F, -12.0F));

		PartDefinition horn_3_2_r1 = head.addOrReplaceChild("horn_3_2_r1",
				CubeListBuilder.create().texOffs(110, 17).addBox(-3.5F, -8.5F, -1.5F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.5F, -1.5F, -2.0F, -0.9599F, -0.9163F, 0.5672F));

		PartDefinition horn_3_r1 = head.addOrReplaceChild("horn_3_r1",
				CubeListBuilder.create().texOffs(95, 9).addBox(-2.5F, -4.5F, -2.0F, 5.0F, 13.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.5F, -1.5F, -2.0F, -0.9599F, -0.7418F, 0.5672F));

		PartDefinition horn_4_r1 = head.addOrReplaceChild("horn_4_r1",
				CubeListBuilder.create().texOffs(101, 5).addBox(-2.5F, -1.0F, -1.5F, 4.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.5F, 5.5F, -7.0F, -0.9599F, 0.3927F, 0.5672F));

		PartDefinition horn_2_r1 = head.addOrReplaceChild("horn_2_r1",
				CubeListBuilder.create().texOffs(92, 0).addBox(-1.5F, -1.0F, -1.5F, 4.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.5F, 5.5F, -7.0F, -0.9599F, -0.3927F, -0.5672F));

		PartDefinition horn_1_2_r1 = head.addOrReplaceChild("horn_1_2_r1",
				CubeListBuilder.create().texOffs(112, 5).addBox(-0.75F, -8.5F, -1.5F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5F, -1.5F, -2.0F, -0.9599F, 0.9163F, -0.5672F));

		PartDefinition horn_1_r1 = head.addOrReplaceChild("horn_1_r1",
				CubeListBuilder.create().texOffs(110, 0).addBox(-2.5F, -4.5F, -2.0F, 5.0F, 13.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5F, -1.5F, -2.0F, -0.9599F, 0.7418F, -0.5672F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-10.5F, -2.0F, 1.5F, 21.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -3.125F, -3.5F, 12.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -4.25F, 2.5F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, -4.0F, -3.5F, 5.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -4.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition teeth_top_2_r1 = head.addOrReplaceChild("teeth_top_2_r1",
				CubeListBuilder.create().texOffs(80, 39)
						.addBox(-6.5F, -1.985F, -5.0F, 13.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.5F, -5.01F, -5.0F, 13.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(78, 52)
						.addBox(-7.5F, -1.99F, -4.0F, 15.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.5F, -5.0F, -4.0F, 15.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, -5.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition btm_jaw = head.addOrReplaceChild("btm_jaw", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 5.0F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = btm_jaw.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.5F, 2.0F, -4.0F, 13.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-6.5F, -0.01F, -4.0F, 13.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.5F, 3.5F, -4.01F, 11.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -7.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 8.0F));

		PartDefinition stomach_2_r1 = tail.addOrReplaceChild("stomach_2_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.99F, -7.25F, -21.5F, 6.0F, 6.0F, 30.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.5F, -2.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition stomach_r1 = tail
				.addOrReplaceChild("stomach_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-7.99F, -8.0F, -11.0F, 16.0F, 16.0F, 15.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail_4_r1 = tail
				.addOrReplaceChild("tail_4_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 0.5F, 20.5F, 12.0F, 12.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail_3_r1 = tail
				.addOrReplaceChild("tail_3_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -3.0F, 12.0F, 14.0F, 14.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail_2_r1 = tail
				.addOrReplaceChild("tail_2_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-7.5F, -9.0F, 2.0F, 15.0F, 16.0F, 14.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition tail_1_r1 = tail
				.addOrReplaceChild("tail_1_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -9.0F, -6.0F, 16.0F, 16.0F, 14.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-9.0F, -34.0F, -12.0F, 18.0F, 14.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.99F, -35.0F, -9.0F, 18.0F, 16.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.tail.yRot = Mth.cos(ageInTicks * 0.6662F) * 0.1F
				+ Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.33F * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.l_leg.xRot = Mth.cos(limbSwing * 1.0F) * -0.5F * limbSwingAmount;
		this.r_leg.xRot = Mth.cos(limbSwing * 1.0F) * 0.5F * limbSwingAmount;
		this.btm_jaw.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.33F * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		l_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}