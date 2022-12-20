// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpapys_crown<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "papys_crown"), "main");
	private final ModelPart bone;
	private final ModelPart main_body_bone;
	private final ModelPart crown;
	private final ModelPart crownbone;

	public Modelpapys_crown(ModelPart root) {
		this.bone = root.getChild("bone");
		this.main_body_bone = bone.getChild("main_body_bone");
		this.crown = bone.getChild("crown");
		this.crownbone = crown.getChild("crownbone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition main_body_bone = bone.addOrReplaceChild("main_body_bone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.7854F, 0.3927F, 0.0F));

		PartDefinition crown = bone.addOrReplaceChild("crown", CubeListBuilder.create(),
				PartPose.offset(6.0F, -13.0F, 0.0F));

		PartDefinition crownbone = crown.addOrReplaceChild("crownbone",
				CubeListBuilder.create().texOffs(0, 51).addBox(-11.0F, -6.5F, -3.5F, 10.0F, 3.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 4.5F, 0.0F, 0.0F, -0.2618F, 0.1309F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.crownbone.zRot = (float) Math.sin(ageInTicks / 10) / 20;
		this.bone.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.bone.xRot = headPitch / (180F / (float) Math.PI);
		this.main_body_bone.setPos(0.0F, (-7.0F + (float) (Math.sin(ageInTicks / 4) / 4)), 0.0F);
		this.bone.setPos(0.0F, (15.0F + (float) (Math.sin(ageInTicks / 4) / 4)), 0.0F);
		this.crown.setPos(6.0F, (-13.0F + (float) (Math.sin(ageInTicks / 4) / 6)), 0.0F);
		this.crownbone.setPos(-0.5F, (4.5F + (float) (Math.sin(ageInTicks / 4) / 6)), 0.0F);

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}