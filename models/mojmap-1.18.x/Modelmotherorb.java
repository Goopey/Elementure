// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmotherorb<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "motherorb"), "main");
	private final ModelPart bone1;
	private final ModelPart bone2;
	private final ModelPart heads;

	public Modelmotherorb(ModelPart root) {
		this.bone1 = root.getChild("bone1");
		this.bone2 = root.getChild("bone2");
		this.heads = root.getChild("heads");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone1 = partdefinition.addOrReplaceChild("bone1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition three = bone1.addOrReplaceChild("three", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition hexadecagon5 = three.addOrReplaceChild("hexadecagon5",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.1826F, -11.0F, -8.01F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-23.99F, -11.0F, 4.8174F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r1 = hexadecagon5.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.0F, -3.1826F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r2 = hexadecagon5.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.0F, -3.1826F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r3 = hexadecagon5.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r4 = hexadecagon5.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon6 = three.addOrReplaceChild("hexadecagon6",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.0F, -11.1826F, -8.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.0F, -24.0F, 4.8174F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r5 = hexadecagon6.addOrReplaceChild("hexadecagon_r5",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -16.0F, -3.1826F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r6 = hexadecagon6.addOrReplaceChild("hexadecagon_r6",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -16.0F, -3.1826F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r7 = hexadecagon6.addOrReplaceChild("hexadecagon_r7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r8 = hexadecagon6.addOrReplaceChild("hexadecagon_r8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon7 = three.addOrReplaceChild("hexadecagon7",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.1826F, -24.0F, 5.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-24.0F, -11.1826F, 5.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r9 = hexadecagon7.addOrReplaceChild("hexadecagon_r9",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.1826F, -3.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon_r10 = hexadecagon7.addOrReplaceChild("hexadecagon_r10",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.1826F, -3.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon_r11 = hexadecagon7.addOrReplaceChild("hexadecagon_r11",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon_r12 = hexadecagon7.addOrReplaceChild("hexadecagon_r12",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition two = bone1.addOrReplaceChild("two", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition hexadecagon2 = two.addOrReplaceChild("hexadecagon2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.1826F, -11.0F, -8.01F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-23.99F, -11.0F, 4.8174F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r13 = hexadecagon2.addOrReplaceChild("hexadecagon_r13",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.0F, -3.1826F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r14 = hexadecagon2.addOrReplaceChild("hexadecagon_r14",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.0F, -3.1826F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r15 = hexadecagon2.addOrReplaceChild("hexadecagon_r15",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r16 = hexadecagon2.addOrReplaceChild("hexadecagon_r16",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon3 = two.addOrReplaceChild("hexadecagon3",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.0F, -11.1826F, -8.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.0F, -24.0F, 4.8174F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r17 = hexadecagon3.addOrReplaceChild("hexadecagon_r17",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -16.0F, -3.1826F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r18 = hexadecagon3.addOrReplaceChild("hexadecagon_r18",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -16.0F, -3.1826F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r19 = hexadecagon3.addOrReplaceChild("hexadecagon_r19",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r20 = hexadecagon3.addOrReplaceChild("hexadecagon_r20",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon4 = two.addOrReplaceChild("hexadecagon4",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.1826F, -24.0F, 5.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-24.0F, -11.1826F, 5.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r21 = hexadecagon4.addOrReplaceChild("hexadecagon_r21",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.1826F, -3.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon_r22 = hexadecagon4.addOrReplaceChild("hexadecagon_r22",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.1826F, -3.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon_r23 = hexadecagon4.addOrReplaceChild("hexadecagon_r23",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon_r24 = hexadecagon4.addOrReplaceChild("hexadecagon_r24",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition one = bone1.addOrReplaceChild("one", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ohexadecagon = one.addOrReplaceChild("ohexadecagon",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.1826F, -11.0F, -8.01F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-23.99F, -11.0F, 4.8174F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r25 = ohexadecagon.addOrReplaceChild("hexadecagon_r25",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.0F, -3.1826F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r26 = ohexadecagon.addOrReplaceChild("hexadecagon_r26",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.0F, -3.1826F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r27 = ohexadecagon.addOrReplaceChild("hexadecagon_r27",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r28 = ohexadecagon.addOrReplaceChild("hexadecagon_r28",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rhexadecagon = one.addOrReplaceChild("rhexadecagon",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.0F, -11.1826F, -8.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.0F, -24.0F, 4.8174F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r29 = rhexadecagon.addOrReplaceChild("hexadecagon_r29",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -16.0F, -3.1826F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r30 = rhexadecagon.addOrReplaceChild("hexadecagon_r30",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -16.0F, -3.1826F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r31 = rhexadecagon.addOrReplaceChild("hexadecagon_r31",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r32 = rhexadecagon.addOrReplaceChild("hexadecagon_r32",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition ehexadecagon = one.addOrReplaceChild("ehexadecagon",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.1826F, -24.0F, 5.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-24.0F, -11.1826F, 5.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r33 = ehexadecagon.addOrReplaceChild("hexadecagon_r33",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.1826F, -3.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon_r34 = ehexadecagon.addOrReplaceChild("hexadecagon_r34",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.1826F, -3.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon_r35 = ehexadecagon.addOrReplaceChild("hexadecagon_r35",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon_r36 = ehexadecagon.addOrReplaceChild("hexadecagon_r36",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition four = bone2.addOrReplaceChild("four", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition hexadecagon8 = four.addOrReplaceChild("hexadecagon8",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.1826F, -11.0F, -8.01F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-23.99F, -11.0F, 4.8174F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r37 = hexadecagon8.addOrReplaceChild("hexadecagon_r37",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.0F, -3.1826F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r38 = hexadecagon8.addOrReplaceChild("hexadecagon_r38",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.0F, -3.1826F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r39 = hexadecagon8.addOrReplaceChild("hexadecagon_r39",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r40 = hexadecagon8.addOrReplaceChild("hexadecagon_r40",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon9 = four.addOrReplaceChild("hexadecagon9",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.0F, -11.1826F, -8.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.0F, -24.0F, 4.8174F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r41 = hexadecagon9.addOrReplaceChild("hexadecagon_r41",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -16.0F, -3.1826F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r42 = hexadecagon9.addOrReplaceChild("hexadecagon_r42",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -16.0F, -3.1826F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r43 = hexadecagon9.addOrReplaceChild("hexadecagon_r43",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r44 = hexadecagon9.addOrReplaceChild("hexadecagon_r44",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon10 = four.addOrReplaceChild("hexadecagon10",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.1826F, -24.0F, 5.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-24.0F, -11.1826F, 5.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r45 = hexadecagon10.addOrReplaceChild("hexadecagon_r45",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.1826F, -3.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon_r46 = hexadecagon10.addOrReplaceChild("hexadecagon_r46",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.1826F, -3.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon_r47 = hexadecagon10.addOrReplaceChild("hexadecagon_r47",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon_r48 = hexadecagon10.addOrReplaceChild("hexadecagon_r48",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition five = bone2.addOrReplaceChild("five", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition hexadecagon11 = five.addOrReplaceChild("hexadecagon11",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.1826F, -11.0F, -8.01F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-23.99F, -11.0F, 4.8174F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r49 = hexadecagon11.addOrReplaceChild("hexadecagon_r49",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.0F, -3.1826F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r50 = hexadecagon11.addOrReplaceChild("hexadecagon_r50",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.0F, -3.1826F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r51 = hexadecagon11.addOrReplaceChild("hexadecagon_r51",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r52 = hexadecagon11.addOrReplaceChild("hexadecagon_r52",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon12 = five.addOrReplaceChild("hexadecagon12",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.0F, -11.1826F, -8.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.0F, -24.0F, 4.8174F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r53 = hexadecagon12.addOrReplaceChild("hexadecagon_r53",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -16.0F, -3.1826F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r54 = hexadecagon12.addOrReplaceChild("hexadecagon_r54",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -16.0F, -3.1826F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r55 = hexadecagon12.addOrReplaceChild("hexadecagon_r55",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r56 = hexadecagon12.addOrReplaceChild("hexadecagon_r56",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon13 = five.addOrReplaceChild("hexadecagon13",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.1826F, -24.0F, 5.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-24.0F, -11.1826F, 5.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r57 = hexadecagon13.addOrReplaceChild("hexadecagon_r57",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.1826F, -3.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon_r58 = hexadecagon13.addOrReplaceChild("hexadecagon_r58",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.1826F, -3.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon_r59 = hexadecagon13.addOrReplaceChild("hexadecagon_r59",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon_r60 = hexadecagon13.addOrReplaceChild("hexadecagon_r60",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition six = bone2.addOrReplaceChild("six", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hexadecagon14 = six.addOrReplaceChild("hexadecagon14",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.1826F, -11.0F, -8.01F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-23.99F, -11.0F, 4.8174F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r61 = hexadecagon14.addOrReplaceChild("hexadecagon_r61",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.0F, -3.1826F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r62 = hexadecagon14.addOrReplaceChild("hexadecagon_r62",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.0F, -3.1826F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r63 = hexadecagon14.addOrReplaceChild("hexadecagon_r63",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r64 = hexadecagon14.addOrReplaceChild("hexadecagon_r64",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -3.0F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon15 = six.addOrReplaceChild("hexadecagon15",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.0F, -11.1826F, -8.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.0F, -24.0F, 4.8174F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r65 = hexadecagon15.addOrReplaceChild("hexadecagon_r65",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -16.0F, -3.1826F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r66 = hexadecagon15.addOrReplaceChild("hexadecagon_r66",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -16.0F, -3.1826F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r67 = hexadecagon15.addOrReplaceChild("hexadecagon_r67",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r68 = hexadecagon15.addOrReplaceChild("hexadecagon_r68",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.1826F, -16.0F, 6.0F, 6.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon16 = six.addOrReplaceChild("hexadecagon16",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.1826F, -24.0F, 5.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-24.0F, -11.1826F, 5.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition hexadecagon_r69 = hexadecagon16.addOrReplaceChild("hexadecagon_r69",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.1826F, -3.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon_r70 = hexadecagon16.addOrReplaceChild("hexadecagon_r70",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -3.1826F, -3.0F, 32.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon_r71 = hexadecagon16.addOrReplaceChild("hexadecagon_r71",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon_r72 = hexadecagon16.addOrReplaceChild("hexadecagon_r72",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.1826F, -16.0F, -3.0F, 6.0F, 32.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition heads = partdefinition.addOrReplaceChild("heads",
				CubeListBuilder.create().texOffs(0, 68)
						.addBox(-15.0F, -15.0F, -17.0F, 30.0F, 30.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
						.addBox(-15.0F, -15.0F, 17.0F, 30.0F, 30.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(68, 68)
						.addBox(17.0F, -15.0F, -15.0F, 0.0F, 30.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(68, 38)
						.addBox(-17.0F, -15.0F, -15.0F, 0.0F, 30.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(-30, 38)
						.addBox(-15.0F, -17.0F, -15.0F, 30.0F, 0.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(38, 38)
						.addBox(-15.0F, 17.0F, -15.0F, 30.0F, 0.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		heads.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.heads.yRot = ageInTicks / 20.f;
	}
}