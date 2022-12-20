// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbigdioriteelemental<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bigdioriteelemental"), "main");
	private final ModelPart ArmRight;
	private final ModelPart Armleft;
	private final ModelPart Heart;
	private final ModelPart bone;

	public Modelbigdioriteelemental(ModelPart root) {
		this.ArmRight = root.getChild("ArmRight");
		this.Armleft = root.getChild("Armleft");
		this.Heart = root.getChild("Heart");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition ArmRight = partdefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(0, 86)
				.addBox(-1.5F, -8.0F, -1.5F, 3.0F, 22.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(13.0F, -7.0F, 0.0F));

		PartDefinition Ring2 = ArmRight.addOrReplaceChild("Ring2", CubeListBuilder.create().texOffs(96, 0).addBox(-2.5F,
				0.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.5F, 0.0F));

		PartDefinition Fist2 = Ring2.addOrReplaceChild("Fist2", CubeListBuilder.create().texOffs(44, 0).addBox(-2.0F,
				0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.6F, 0.0F));

		PartDefinition Armleft = partdefinition.addOrReplaceChild("Armleft", CubeListBuilder.create().texOffs(0, 86)
				.addBox(-1.5F, -8.0F, -1.5F, 3.0F, 22.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.0F, -7.0F, 0.0F));

		PartDefinition Ring1 = Armleft.addOrReplaceChild("Ring1", CubeListBuilder.create().texOffs(96, 0).addBox(-2.5F,
				0.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.5F, 0.0F));

		PartDefinition Fist1 = Ring1.addOrReplaceChild("Fist1", CubeListBuilder.create().texOffs(42, 0).addBox(-2.0F,
				0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.6F, 0.0F));

		PartDefinition Heart = partdefinition.addOrReplaceChild("Heart", CubeListBuilder.create().texOffs(44, 0)
				.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, -16.5F, -3.0F));

		PartDefinition HeadBone = Heart.addOrReplaceChild("HeadBone",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.3187F, 0.0F, 0.0F));

		PartDefinition Face1 = HeadBone.addOrReplaceChild("Face1",
				CubeListBuilder.create().texOffs(0, 48).mirror()
						.addBox(-6.0F, 0.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -4.7F, 0.6374F, 0.6829F, 0.0F));

		PartDefinition HeadSide1 = Face1.addOrReplaceChild("HeadSide1",
				CubeListBuilder.create().texOffs(16, 36).addBox(0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 12.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, -0.3187F, -0.5463F, 0.0F));

		PartDefinition Headback = HeadBone.addOrReplaceChild("Headback", CubeListBuilder.create().texOffs(32, 72)
				.addBox(-2.0F, -3.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, 0.0F, 11.2F));

		PartDefinition HeadTop = HeadBone.addOrReplaceChild("HeadTop",
				CubeListBuilder.create().texOffs(-12, 72).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 0.0F, 12.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -4.8F, -0.1F, -0.182F, 0.0F, 0.0F));

		PartDefinition HeadBottom = HeadBone
				.addOrReplaceChild("HeadBottom",
						CubeListBuilder.create().texOffs(4, 72).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 0.0F, 12.0F,
								new CubeDeformation(0.01F)),
						PartPose.offsetAndRotation(0.0F, 4.9F, -0.1F, 0.182F, 0.0F, 0.0F));

		PartDefinition Face4 = HeadBone.addOrReplaceChild("Face4",
				CubeListBuilder.create().texOffs(0, 24).mirror()
						.addBox(0.0F, -6.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -4.7F, -0.6374F, -0.6829F, 0.0F));

		PartDefinition HeadSide4 = Face4.addOrReplaceChild("HeadSide4",
				CubeListBuilder.create().texOffs(16, 12).addBox(0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 12.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.3187F, 0.5463F, 0.0F));

		PartDefinition Face3 = HeadBone.addOrReplaceChild("Face3",
				CubeListBuilder.create().texOffs(0, 36).mirror()
						.addBox(-6.0F, -6.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -4.7F, -0.6374F, 0.6829F, 0.0F));

		PartDefinition HeadSide3 = Face3.addOrReplaceChild("HeadSide3",
				CubeListBuilder.create().texOffs(16, 24).addBox(0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 12.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.3187F, -0.5463F, 0.0F));

		PartDefinition Face2 = HeadBone.addOrReplaceChild("Face2",
				CubeListBuilder.create().texOffs(0, 60).mirror()
						.addBox(0.0F, 0.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -4.7F, 0.6374F, -0.6829F, 0.0F));

		PartDefinition HeadSide2 = Face2.addOrReplaceChild("HeadSide2",
				CubeListBuilder.create().texOffs(16, 48).addBox(0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 12.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, -0.3187F, 0.5463F, 0.0F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(72, 4)
						.addBox(-3.5F, -18.41F, -6.8F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(72, 4)
						.addBox(-3.5F, -18.4F, 2.8F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 80)
						.addBox(-4.0F, -17.6F, -4.0F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.01F)).texOffs(44, 0)
						.addBox(-2.0F, -26.9F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Crystal6_r1 = bone.addOrReplaceChild("Crystal6_r1",
				CubeListBuilder.create().texOffs(64, 84).addBox(-9.5F, -15.4F, 4.2F, 6.0F, 15.0F, 0.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(5.9359F, -2.0915F, 3.2529F, -0.3187F, -1.0928F, 0.0F));

		PartDefinition Crystal5_r1 = bone.addOrReplaceChild("Crystal5_r1",
				CubeListBuilder.create().texOffs(64, 64).addBox(-9.5F, -15.4F, -5.2F, 6.0F, 15.0F, 0.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(6.7791F, -2.4048F, -3.816F, 0.3187F, 1.0928F, 0.0F));

		PartDefinition Crystal4_r1 = bone.addOrReplaceChild("Crystal4_r1",
				CubeListBuilder.create().texOffs(64, 24).addBox(3.5F, -15.4F, 4.2F, 6.0F, 15.0F, 0.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-5.9359F, -2.0915F, 3.2529F, -0.3187F, 1.0928F, 0.0F));

		PartDefinition Crystal3_r1 = bone.addOrReplaceChild("Crystal3_r1",
				CubeListBuilder.create().texOffs(64, 44).addBox(3.5F, -15.4F, -5.2F, 6.0F, 15.0F, 0.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-6.7791F, -2.4048F, -3.816F, 0.3187F, -1.0928F, 0.0F));

		PartDefinition Crystal2_r1 = bone.addOrReplaceChild("Crystal2_r1",
				CubeListBuilder.create().texOffs(48, 44).addBox(-3.5F, -15.4F, 4.2F, 7.0F, 15.0F, 0.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -2.0915F, -4.6138F, -0.3187F, 0.0F, 0.0F));

		PartDefinition Crystal1_r1 = bone.addOrReplaceChild("Crystal1_r1",
				CubeListBuilder.create().texOffs(48, 24).addBox(-3.5F, -15.4F, -5.2F, 7.0F, 15.0F, 0.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -2.4048F, 4.5634F, 0.3187F, 0.0F, 0.0F));

		PartDefinition Ring4_r1 = bone.addOrReplaceChild("Ring4_r1",
				CubeListBuilder.create().texOffs(72, 12).addBox(-7.5F, -18.41F, -1.0F, 3.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3537F, 0.0F, -3.2627F, 0.0F, 0.5463F, 0.0F));

		PartDefinition Ring3_r1 = bone.addOrReplaceChild("Ring3_r1",
				CubeListBuilder.create().texOffs(72, 12).addBox(-7.5F, -18.4F, -7.0F, 3.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8732F, 0.0F, 3.1171F, 0.0F, -0.5463F, 0.0F));

		PartDefinition Ring2_r1 = bone.addOrReplaceChild("Ring2_r1",
				CubeListBuilder.create().texOffs(72, 12).addBox(4.5F, -18.39F, -1.0F, 3.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3537F, 0.0F, -3.2627F, 0.0F, -0.5463F, 0.0F));

		PartDefinition Ring1_r1 = bone.addOrReplaceChild("Ring1_r1",
				CubeListBuilder.create().texOffs(72, 12).addBox(4.5F, -18.4F, -7.0F, 3.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8732F, 0.0F, 3.1171F, 0.0F, 0.5463F, 0.0F));

		PartDefinition Body2_r1 = bone.addOrReplaceChild("Body2_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(6.6F, -36.1F, -3.0F, 4.0F, 13.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7941F, -3.8815F, 13.1723F, 0.5463F, 1.0016F, 0.0F));

		PartDefinition Body3_r1 = bone.addOrReplaceChild("Body3_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(6.6F, -36.1F, -1.0F, 4.0F, 13.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7941F, -3.8815F, -13.1723F, -0.5463F, -1.0016F, 0.0F));

		PartDefinition Body4_r1 = bone.addOrReplaceChild("Body4_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-10.6F, -36.1F, -3.0F, 4.0F, 13.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.7941F, -3.8815F, 13.1723F, 0.5463F, -1.0016F, 0.0F));

		PartDefinition Body5_r1 = bone.addOrReplaceChild("Body5_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-10.6F, -36.1F, -1.0F, 4.0F, 13.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.7941F, -3.8815F, -13.1723F, -0.5463F, 1.0016F, 0.0F));

		PartDefinition Body6_r1 = bone.addOrReplaceChild("Body6_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(6.2F, -24.61F, -4.1F, 4.0F, 4.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.332F, 0.0F, -13.2669F, -3.1416F, -1.0928F, 3.1416F));

		PartDefinition Body7_r1 = bone.addOrReplaceChild("Body7_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(6.2F, -24.6F, 4.1F, 4.0F, 4.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.068F, 0.0F, -5.0669F, 0.0F, -1.0928F, 0.0F));

		PartDefinition Body8_r1 = bone.addOrReplaceChild("Body8_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-10.2F, -24.6F, -4.1F, 4.0F, 4.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.332F, 0.0F, -13.2669F, -3.1416F, 1.0928F, 3.1416F));

		PartDefinition Body9_r1 = bone.addOrReplaceChild("Body9_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-10.2F, -24.61F, 4.1F, 4.0F, 4.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.068F, 0.0F, -5.0669F, 0.0F, 1.0928F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		ArmRight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Armleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Heart.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Heart.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Heart.xRot = headPitch / (180F / (float) Math.PI);
		this.Armleft.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.ArmRight.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}