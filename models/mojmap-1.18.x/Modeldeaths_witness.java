// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldeaths_witness<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "deaths_witness"), "main");
	private final ModelPart WispBone;
	private final ModelPart WispFlame1;
	private final ModelPart WispFlame2;
	private final ModelPart EyeTop;
	private final ModelPart EyeSide;
	private final ModelPart EyeSideMain;
	private final ModelPart EyeBack;
	private final ModelPart EyeBackMain;
	private final ModelPart EyeBackMinor;
	private final ModelPart EyeTopMinor;
	private final ModelPart EyeSideMinor;
	private final ModelPart EyeBackMMinor1;
	private final ModelPart EyeBackMMinor2;
	private final ModelPart EyeBackMMinor3;
	private final ModelPart EyeBackMMinor4;
	private final ModelPart EyeSideMMinor1;
	private final ModelPart EyeSideMMinor2;
	private final ModelPart EyeTopMMinor1;
	private final ModelPart EyeTopMMinor2;
	private final ModelPart EyeFront1;
	private final ModelPart EyeFront2;
	private final ModelPart EyeFront3;
	private final ModelPart EyeFront4;
	private final ModelPart EyeMinor1;
	private final ModelPart EyeMinor2;
	private final ModelPart EyeMinor3;
	private final ModelPart EyeMinor4;
	private final ModelPart EyeTopMain;
	private final ModelPart BottomEyeBoneMain;
	private final ModelPart RightEyeBoneMain;
	private final ModelPart LeftEyeBoneMain;
	private final ModelPart TopEyeBoneMain;
	private final ModelPart EyeShine;
	private final ModelPart EyeSLayer1;
	private final ModelPart EyeSLayer2;
	private final ModelPart EyeSLayer3;
	private final ModelPart SkullDeco;
	private final ModelPart bb_main;

	public Modeldeaths_witness(ModelPart root) {
		this.WispBone = root.getChild("WispBone");
		this.WispFlame1 = WispBone.getChild("WispFlame1");
		this.WispFlame2 = WispBone.getChild("WispFlame2");
		this.EyeTop = root.getChild("EyeTop");
		this.EyeSide = root.getChild("EyeSide");
		this.EyeSideMain = root.getChild("EyeSideMain");
		this.EyeBack = root.getChild("EyeBack");
		this.EyeBackMain = root.getChild("EyeBackMain");
		this.EyeBackMinor = root.getChild("EyeBackMinor");
		this.EyeTopMinor = root.getChild("EyeTopMinor");
		this.EyeSideMinor = root.getChild("EyeSideMinor");
		this.EyeBackMMinor1 = root.getChild("EyeBackMMinor1");
		this.EyeBackMMinor2 = root.getChild("EyeBackMMinor2");
		this.EyeBackMMinor3 = root.getChild("EyeBackMMinor3");
		this.EyeBackMMinor4 = root.getChild("EyeBackMMinor4");
		this.EyeSideMMinor1 = root.getChild("EyeSideMMinor1");
		this.EyeSideMMinor2 = root.getChild("EyeSideMMinor2");
		this.EyeTopMMinor1 = root.getChild("EyeTopMMinor1");
		this.EyeTopMMinor2 = root.getChild("EyeTopMMinor2");
		this.EyeFront1 = root.getChild("EyeFront1");
		this.EyeFront2 = root.getChild("EyeFront2");
		this.EyeFront3 = root.getChild("EyeFront3");
		this.EyeFront4 = root.getChild("EyeFront4");
		this.EyeMinor1 = root.getChild("EyeMinor1");
		this.EyeMinor2 = root.getChild("EyeMinor2");
		this.EyeMinor3 = root.getChild("EyeMinor3");
		this.EyeMinor4 = root.getChild("EyeMinor4");
		this.EyeTopMain = root.getChild("EyeTopMain");
		this.BottomEyeBoneMain = root.getChild("BottomEyeBoneMain");
		this.RightEyeBoneMain = root.getChild("RightEyeBoneMain");
		this.LeftEyeBoneMain = root.getChild("LeftEyeBoneMain");
		this.TopEyeBoneMain = root.getChild("TopEyeBoneMain");
		this.EyeShine = root.getChild("EyeShine");
		this.EyeSLayer1 = EyeShine.getChild("EyeSLayer1");
		this.EyeSLayer2 = EyeShine.getChild("EyeSLayer2");
		this.EyeSLayer3 = EyeShine.getChild("EyeSLayer3");
		this.SkullDeco = root.getChild("SkullDeco");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition WispBone = partdefinition.addOrReplaceChild("WispBone",
				CubeListBuilder.create().texOffs(1800, 1200)
						.addBox(-116.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -69.2F, 0.0F));

		PartDefinition WispFlame2 = WispBone.addOrReplaceChild("WispFlame2", CubeListBuilder.create()
				.texOffs(1700, 1100).addBox(0.0F, -24.0F, -12.0F, 0.0F, 36.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-108.0F, 0.0F, 0.0F));

		PartDefinition WispFlame1 = WispBone.addOrReplaceChild("WispFlame1", CubeListBuilder.create()
				.texOffs(1800, 1100).addBox(-12.0F, -24.0F, 0.0F, 24.0F, 36.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-108.0F, 0.0F, 0.0F));

		PartDefinition EyeTop = partdefinition.addOrReplaceChild("EyeTop", CubeListBuilder.create().texOffs(300, 760)
				.addBox(-112.0F, 0.0F, 0.0F, 112.0F, 144.0F, 112.0F, new CubeDeformation(0.0F)),
				PartPose.offset(56.0F, -72.0F, -56.0F));

		PartDefinition EyeTopShade = EyeTop.addOrReplaceChild("EyeTopShade", CubeListBuilder.create().texOffs(0, 1556)
				.addBox(-112.0F, 0.0F, 0.0F, 112.0F, 144.0F, 72.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 112.0F));

		PartDefinition EyeSide = partdefinition.addOrReplaceChild("EyeSide", CubeListBuilder.create().texOffs(0, 512)
				.addBox(-144.0F, 0.0F, 0.0F, 144.0F, 112.0F, 112.0F, new CubeDeformation(0.0F)),
				PartPose.offset(72.0F, -56.0F, -56.0F));

		PartDefinition EyeSideShade = EyeSide.addOrReplaceChild("EyeSideShade", CubeListBuilder.create()
				.texOffs(0, 1800).addBox(-144.0F, 0.0F, 0.0F, 144.0F, 112.0F, 72.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 112.0F));

		PartDefinition EyeSideMain = partdefinition.addOrReplaceChild("EyeSideMain", CubeListBuilder.create()
				.texOffs(0, 360).addBox(-168.0F, 0.0F, 0.0F, 168.0F, 72.0F, 72.0F, new CubeDeformation(0.0F)),
				PartPose.offset(84.0F, -36.0F, -36.0F));

		PartDefinition EyeBack = partdefinition.addOrReplaceChild("EyeBack", CubeListBuilder.create().texOffs(800, 772)
				.addBox(-112.0F, 0.0F, 0.0F, 112.0F, 112.0F, 138.0F, new CubeDeformation(0.0F)),
				PartPose.offset(56.0F, -56.0F, -66.0F));

		PartDefinition EyeBackShade = EyeBack.addOrReplaceChild("EyeBackShade", CubeListBuilder.create()
				.texOffs(460, 1800).addBox(-112.0F, 0.0F, 0.0F, 112.0F, 112.0F, 104.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 138.0F));

		PartDefinition EyeBackMain = partdefinition.addOrReplaceChild("EyeBackMain", CubeListBuilder.create()
				.texOffs(0, 1080).addBox(-72.0F, 0.0F, 0.0F, 72.0F, 72.0F, 84.0F, new CubeDeformation(0.0F)),
				PartPose.offset(36.0F, -36.0F, 0.0F));

		PartDefinition EyeBackMainShade = EyeBackMain.addOrReplaceChild("EyeBackMainShade", CubeListBuilder.create()
				.texOffs(600, 1520).addBox(-72.0F, 0.0F, 0.0F, 72.0F, 72.0F, 120.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 84.0F));

		PartDefinition EyeBackMinor = partdefinition.addOrReplaceChild("EyeBackMinor", CubeListBuilder.create()
				.texOffs(512, 256).addBox(-88.0F, 0.0F, 0.0F, 88.0F, 128.0F, 132.0F, new CubeDeformation(0.0F)),
				PartPose.offset(44.0F, -64.0F, -66.0F));

		PartDefinition EyeBackMinorShade = EyeBackMinor.addOrReplaceChild("EyeBackMinorShade", CubeListBuilder.create()
				.texOffs(564, 1280).addBox(-88.0F, 0.0F, 0.0F, 88.0F, 128.0F, 84.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 132.0F));

		PartDefinition EyeTopMinor = partdefinition.addOrReplaceChild("EyeTopMinor", CubeListBuilder.create()
				.texOffs(688, 540).addBox(-132.0F, 0.0F, 0.0F, 132.0F, 128.0F, 88.0F, new CubeDeformation(0.0F)),
				PartPose.offset(66.0F, -64.0F, -44.0F));

		PartDefinition EyeSideMinor = partdefinition.addOrReplaceChild("EyeSideMinor", CubeListBuilder.create()
				.texOffs(0, 1284).addBox(-132.0F, 0.0F, 0.0F, 132.0F, 88.0F, 132.0F, new CubeDeformation(0.0F)),
				PartPose.offset(66.0F, -44.0F, -66.0F));

		PartDefinition EyeSideMinorShade = EyeSideMinor.addOrReplaceChild("EyeSideMinorShade", CubeListBuilder.create()
				.texOffs(960, 1284).addBox(-132.0F, 0.0F, 0.0F, 132.0F, 88.0F, 84.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 132.0F));

		PartDefinition EyeBackMMinor1 = partdefinition.addOrReplaceChild("EyeBackMMinor1", CubeListBuilder.create()
				.texOffs(1072, 0).addBox(-14.0F, 0.0F, 0.0F, 14.0F, 60.0F, 156.0F, new CubeDeformation(0.0F)),
				PartPose.offset(44.0F, -30.0F, -78.0F));

		PartDefinition EyeBackMMinor2Shade = EyeBackMMinor1.addOrReplaceChild("EyeBackMMinor2Shade",
				CubeListBuilder.create().texOffs(1072, 1800).addBox(-88.0F, 0.0F, 0.0F, 88.0F, 60.0F, 72.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 156.0F));

		PartDefinition EyeBackMMinor2 = partdefinition.addOrReplaceChild("EyeBackMMinor2", CubeListBuilder.create()
				.texOffs(1072, 0).addBox(-14.0F, 0.0F, 0.0F, 14.0F, 60.0F, 156.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-30.0F, -30.0F, -78.0F));

		PartDefinition EyeBackMMinor3 = partdefinition.addOrReplaceChild("EyeBackMMinor3", CubeListBuilder.create()
				.texOffs(1072, 264).addBox(-60.0F, 0.0F, 0.0F, 60.0F, 14.0F, 156.0F, new CubeDeformation(0.0F)),
				PartPose.offset(30.0F, -44.0F, -78.0F));

		PartDefinition EyeBackMMinor1Shade = EyeBackMMinor3.addOrReplaceChild("EyeBackMMinor1Shade",
				CubeListBuilder.create().texOffs(1072, 1600).addBox(-60.0F, 0.0F, 0.0F, 60.0F, 88.0F, 72.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 156.0F));

		PartDefinition EyeBackMMinor4 = partdefinition.addOrReplaceChild("EyeBackMMinor4", CubeListBuilder.create()
				.texOffs(1072, 264).addBox(-60.0F, 0.0F, 0.0F, 60.0F, 14.0F, 156.0F, new CubeDeformation(0.0F)),
				PartPose.offset(30.0F, 30.0F, -78.0F));

		PartDefinition EyeSideMMinor1 = partdefinition.addOrReplaceChild("EyeSideMMinor1", CubeListBuilder.create()
				.texOffs(1480, 0).addBox(-156.0F, 0.0F, 0.0F, 156.0F, 88.0F, 60.0F, new CubeDeformation(0.0F)),
				PartPose.offset(78.0F, -44.0F, -30.0F));

		PartDefinition EyeSideMMinor2 = partdefinition
				.addOrReplaceChild(
						"EyeSideMMinor2", CubeListBuilder.create().texOffs(1480, 856).addBox(-156.0F, 0.0F, 0.0F,
								156.0F, 60.0F, 88.0F, new CubeDeformation(0.0F)),
						PartPose.offset(78.0F, -30.0F, -44.0F));

		PartDefinition EyeTopMMinor1 = partdefinition.addOrReplaceChild("EyeTopMMinor1", CubeListBuilder.create()
				.texOffs(1548, 256).addBox(-60.0F, 0.0F, 0.0F, 60.0F, 156.0F, 88.0F, new CubeDeformation(0.0F)),
				PartPose.offset(30.0F, -78.0F, -44.0F));

		PartDefinition EyeTopMMinor2 = partdefinition.addOrReplaceChild("EyeTopMMinor2", CubeListBuilder.create()
				.texOffs(1480, 554).addBox(-88.0F, 0.0F, 0.0F, 88.0F, 156.0F, 60.0F, new CubeDeformation(0.0F)),
				PartPose.offset(44.0F, -78.0F, -30.0F));

		PartDefinition EyeFront1 = partdefinition.addOrReplaceChild("EyeFront1", CubeListBuilder.create()
				.texOffs(564, 0).addBox(-26.0F, 0.0F, 0.0F, 26.0F, 112.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(56.0F, -56.0F, -72.0F));

		PartDefinition EyeFront2 = partdefinition.addOrReplaceChild("EyeFront2", CubeListBuilder.create()
				.texOffs(450, 0).addBox(-26.0F, 0.0F, 0.0F, 26.0F, 112.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-30.0F, -56.0F, -72.0F));

		PartDefinition EyeFront3 = partdefinition.addOrReplaceChild("EyeFront3", CubeListBuilder.create()
				.texOffs(280, 0).addBox(-60.0F, 0.0F, 0.0F, 60.0F, 25.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(30.0F, -56.0F, -72.0F));

		PartDefinition EyeFront4 = partdefinition.addOrReplaceChild("EyeFront4", CubeListBuilder.create()
				.texOffs(140, 0).addBox(-60.0F, 0.0F, 0.0F, 60.0F, 25.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(30.0F, 31.0F, -72.0F));

		PartDefinition EyeMinor1 = partdefinition.addOrReplaceChild("EyeMinor1", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-8.0F, 0.0F, 0.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(30.0F, -30.0F, -72.0F));

		PartDefinition EyeMinor2 = partdefinition.addOrReplaceChild("EyeMinor2", CubeListBuilder.create().texOffs(64, 0)
				.addBox(-8.0F, 0.0F, 0.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-22.0F, -30.0F, -72.0F));

		PartDefinition EyeMinor3 = partdefinition.addOrReplaceChild("EyeMinor3", CubeListBuilder.create().texOffs(0, 64)
				.addBox(-8.0F, 0.0F, 0.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-22.0F, 22.0F, -72.0F));

		PartDefinition EyeMinor4 = partdefinition.addOrReplaceChild("EyeMinor4", CubeListBuilder.create()
				.texOffs(64, 64).addBox(-8.0F, 0.0F, 0.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(30.0F, 22.0F, -72.0F));

		PartDefinition EyeTopMain = partdefinition.addOrReplaceChild("EyeTopMain", CubeListBuilder.create()
				.texOffs(0, 772).addBox(-72.0F, 0.0F, 0.0F, 72.0F, 168.0F, 72.0F, new CubeDeformation(0.0F)),
				PartPose.offset(36.0F, -84.0F, -36.0F));

		PartDefinition BottomEyeBoneMain = partdefinition.addOrReplaceChild(
				"BottomEyeBoneMain", CubeListBuilder.create().texOffs(0, 120).addBox(-19.0F, -8.0F, -22.0F, 38.0F,
						16.0F, 48.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 82.0F, 0.0F, 0.0F, 0.0F, 3.1416F));

		PartDefinition BottomEyeBoneFront = BottomEyeBoneMain.addOrReplaceChild("BottomEyeBoneFront",
				CubeListBuilder.create().texOffs(184, 120).addBox(-12.0F, -8.0F, -48.0F, 24.0F, 16.0F, 48.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -18.0F, 0.2276F, 0.0F, 0.0F));

		PartDefinition BottomEyeBoneFrontTip = BottomEyeBoneFront.addOrReplaceChild("BottomEyeBoneFrontTip",
				CubeListBuilder.create().texOffs(356, 120).addBox(-9.0F, -4.0F, -24.0F, 18.0F, 12.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.6F, -43.4F, 0.5918F, 0.0F, 0.0F));

		PartDefinition BottomEyeBoneBack = BottomEyeBoneMain.addOrReplaceChild("BottomEyeBoneBack",
				CubeListBuilder.create().texOffs(0, 232).addBox(-14.0F, -8.0F, 0.0F, 28.0F, 14.0F, 64.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 23.0F, -0.2276F, 0.0F, 0.0F));

		PartDefinition BottomEyeBoneBackTip = BottomEyeBoneBack.addOrReplaceChild("BottomEyeBoneBackTip",
				CubeListBuilder.create().texOffs(178, 232).addBox(-12.0F, -6.0F, 0.0F, 24.0F, 12.0F, 18.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 61.2F, -0.3643F, 0.0F, 0.0F));

		PartDefinition BottomEyeBoneMinor1 = BottomEyeBoneMain.addOrReplaceChild("BottomEyeBoneMinor1",
				CubeListBuilder.create().texOffs(298, 232).addBox(-44.0F, -8.0F, -12.0F, 44.0F, 16.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.2F, 0.0F, -5.1F, 0.0F, 0.0F, -0.2731F));

		PartDefinition BottomEyeBoneMinor2 = BottomEyeBoneMain.addOrReplaceChild("BottomEyeBoneMinor2",
				CubeListBuilder.create().texOffs(298, 232).addBox(0.0F, -8.0F, -12.0F, 44.0F, 16.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.2F, 0.0F, -5.1F, 0.0F, 0.0F, 0.2731F));

		PartDefinition BottomEyeBoneMinor3 = BottomEyeBoneMinor2.addOrReplaceChild("BottomEyeBoneMinor3",
				CubeListBuilder.create().texOffs(480, 180).addBox(-26.0F, -6.0F, -12.0F, 26.0F, 16.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0F, -1.1F, 0.0F, 0.0F, 3.1416F, 0.5166F));

		PartDefinition RightEyeBoneMain = partdefinition.addOrReplaceChild("RightEyeBoneMain",
				CubeListBuilder.create().texOffs(0, 120).addBox(-19.0F, -8.0F, -22.0F, 38.0F, 16.0F, 48.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(82.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition RightEyeBoneFront = RightEyeBoneMain.addOrReplaceChild("RightEyeBoneFront",
				CubeListBuilder.create().texOffs(184, 120).addBox(-12.0F, -8.0F, -48.0F, 24.0F, 16.0F, 48.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -18.0F, -0.2276F, 0.0F, 0.0F));

		PartDefinition RightEyeBoneFrontTip = RightEyeBoneFront.addOrReplaceChild("RightEyeBoneFrontTip",
				CubeListBuilder.create().texOffs(356, 120).addBox(-9.0F, -6.0F, -24.0F, 18.0F, 12.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.6F, -43.4F, -0.5918F, 0.0F, 0.0F));

		PartDefinition RightEyeBoneBack = RightEyeBoneMain.addOrReplaceChild(
				"RightEyeBoneBack", CubeListBuilder.create().texOffs(0, 232).addBox(-14.0F, -8.0F, 0.0F, 28.0F, 14.0F,
						64.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 23.0F, 0.1403F, 0.0F, 0.0F));

		PartDefinition RightEyeBoneBackTip = RightEyeBoneBack.addOrReplaceChild(
				"RightEyeBoneBackTip", CubeListBuilder.create().texOffs(178, 232).addBox(-12.0F, -6.0F, 0.0F, 24.0F,
						12.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 61.2F, 0.3643F, 0.0F, 0.0F));

		PartDefinition RightEyeBoneMinor1 = RightEyeBoneMain.addOrReplaceChild("RightEyeBoneMinor1",
				CubeListBuilder.create().texOffs(298, 232).addBox(-44.0F, -8.0F, -12.0F, 44.0F, 16.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.2F, 0.0F, -5.1F, 0.0F, 0.0F, 0.2731F));

		PartDefinition RightEyeBoneMinor3 = RightEyeBoneMinor1.addOrReplaceChild("RightEyeBoneMinor3",
				CubeListBuilder.create().texOffs(480, 180).addBox(-26.0F, -8.0F, -12.0F, 26.0F, 16.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-40.0F, -1.1F, 0.0F, 0.0F, 0.0F, 0.5166F));

		PartDefinition RightEyeBoneMinor2 = RightEyeBoneMain.addOrReplaceChild("RightEyeBoneMinor2",
				CubeListBuilder.create().texOffs(298, 232).addBox(0.0F, -8.0F, -12.0F, 44.0F, 16.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.2F, 0.0F, -5.1F, 0.0F, 0.0F, -0.2731F));

		PartDefinition LeftEyeBoneMain = partdefinition.addOrReplaceChild("LeftEyeBoneMain",
				CubeListBuilder.create().texOffs(0, 120).addBox(-19.0F, -8.0F, -22.0F, 38.0F, 16.0F, 48.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-82.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition LeftEyeBoneFront = LeftEyeBoneMain.addOrReplaceChild("LeftEyeBoneFront",
				CubeListBuilder.create().texOffs(184, 120).addBox(-12.0F, -8.0F, -48.0F, 24.0F, 16.0F, 48.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -18.0F, -0.2276F, 0.0F, 0.0F));

		PartDefinition LeftEyeBoneFrontTip = LeftEyeBoneFront.addOrReplaceChild("LeftEyeBoneFrontTip",
				CubeListBuilder.create().texOffs(356, 120).addBox(-9.0F, -6.0F, -24.0F, 18.0F, 12.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.6F, -43.4F, -0.5918F, 0.0F, 0.0F));

		PartDefinition LeftEyeBoneBack = LeftEyeBoneMain.addOrReplaceChild(
				"LeftEyeBoneBack", CubeListBuilder.create().texOffs(0, 232).addBox(-14.0F, -8.0F, 0.0F, 28.0F, 14.0F,
						64.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 23.0F, 0.1403F, 0.0F, 0.0F));

		PartDefinition LeftEyeBoneBackTip = LeftEyeBoneBack.addOrReplaceChild(
				"LeftEyeBoneBackTip", CubeListBuilder.create().texOffs(178, 232).addBox(-12.0F, -6.0F, 0.0F, 24.0F,
						12.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 61.2F, 0.3643F, 0.0F, 0.0F));

		PartDefinition LeftEyeBoneMinor1 = LeftEyeBoneMain.addOrReplaceChild("LeftEyeBoneMinor1",
				CubeListBuilder.create().texOffs(298, 232).addBox(-44.0F, -8.0F, -12.0F, 44.0F, 16.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.2F, 0.0F, -5.1F, 0.0F, 0.0F, 0.2731F));

		PartDefinition LeftEyeBoneMinor3 = LeftEyeBoneMinor1.addOrReplaceChild("LeftEyeBoneMinor3",
				CubeListBuilder.create().texOffs(480, 180).addBox(-26.0F, -8.0F, -12.0F, 26.0F, 16.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-40.0F, -1.1F, 0.0F, 0.0F, 0.0F, 0.5166F));

		PartDefinition LeftEyeBoneMinor2 = LeftEyeBoneMain.addOrReplaceChild("LeftEyeBoneMinor2",
				CubeListBuilder.create().texOffs(298, 232).addBox(0.0F, -8.0F, -12.0F, 44.0F, 16.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.2F, 0.0F, -5.1F, 0.0F, 0.0F, -0.2731F));

		PartDefinition TopEyeBoneMain = partdefinition.addOrReplaceChild("TopEyeBoneMain", CubeListBuilder.create()
				.texOffs(0, 120).addBox(-19.0F, -8.0F, -22.0F, 38.0F, 16.0F, 48.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -82.0F, 0.0F));

		PartDefinition TopEyeBoneFront = TopEyeBoneMain.addOrReplaceChild("TopEyeBoneFront",
				CubeListBuilder.create().texOffs(184, 120).addBox(-12.0F, -8.0F, -48.0F, 24.0F, 16.0F, 48.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -18.0F, 0.2276F, 0.0F, 0.0F));

		PartDefinition TopEyeBoneFrontTip = TopEyeBoneFront.addOrReplaceChild("TopEyeBoneFrontTip",
				CubeListBuilder.create().texOffs(356, 120).addBox(-9.0F, -4.0F, -24.0F, 18.0F, 12.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.6F, -43.4F, 0.5918F, 0.0F, 0.0F));

		PartDefinition TopEyeBoneBack = TopEyeBoneMain.addOrReplaceChild("TopEyeBoneBack",
				CubeListBuilder.create().texOffs(0, 232).addBox(-14.0F, -8.0F, 0.0F, 28.0F, 14.0F, 64.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 23.0F, -0.2276F, 0.0F, 0.0F));

		PartDefinition TopEyeBoneBackTip = TopEyeBoneBack.addOrReplaceChild("TopEyeBoneBackTip",
				CubeListBuilder.create().texOffs(178, 232).addBox(-12.0F, -6.0F, 0.0F, 24.0F, 12.0F, 18.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 61.2F, -0.3643F, 0.0F, 0.0F));

		PartDefinition TopEyeBoneMinor1 = TopEyeBoneMain.addOrReplaceChild("TopEyeBoneMinor1",
				CubeListBuilder.create().texOffs(298, 232).addBox(-44.0F, -8.0F, -12.0F, 44.0F, 16.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.2F, 0.0F, -5.1F, 0.0F, 0.0F, -0.2731F));

		PartDefinition TopEyeBoneMinor2 = TopEyeBoneMain.addOrReplaceChild("TopEyeBoneMinor2",
				CubeListBuilder.create().texOffs(298, 232).addBox(0.0F, -8.0F, -12.0F, 44.0F, 16.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.2F, 0.0F, -5.1F, 0.0F, 0.0F, 0.2731F));

		PartDefinition TopEyeBoneMinor3 = TopEyeBoneMinor2.addOrReplaceChild("TopEyeBoneMinor3",
				CubeListBuilder.create().texOffs(480, 180).addBox(-26.0F, -7.0F, -12.0F, 26.0F, 16.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0F, -0.1F, 0.0F, 0.0F, 3.1416F, 0.5166F));

		PartDefinition EyeShine = partdefinition.addOrReplaceChild("EyeShine", CubeListBuilder.create().texOffs(0, 0)
				.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -87.0F));

		PartDefinition EyeSLayer1 = EyeShine.addOrReplaceChild("EyeSLayer1", CubeListBuilder.create()
				.texOffs(1800, 1800).addBox(-42.0F, -42.0F, 0.0F, 84.0F, 84.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition EyeSLayer2 = EyeShine.addOrReplaceChild("EyeSLayer2", CubeListBuilder.create()
				.texOffs(1600, 1600).addBox(-96.0F, -96.0F, 0.0F, 192.0F, 192.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition EyeSLayer3 = EyeShine.addOrReplaceChild("EyeSLayer3", CubeListBuilder.create()
				.texOffs(1800, 1400).addBox(-32.0F, -32.0F, 0.0F, 64.0F, 64.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -4.0F));

		PartDefinition SkullDeco = partdefinition.addOrReplaceChild("SkullDeco", CubeListBuilder.create().texOffs(0, 0)
				.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition DSkull1 = SkullDeco.addOrReplaceChild("DSkull1",
				CubeListBuilder.create().texOffs(768, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 5.2F, -70.2F, 0.5009F, -0.5463F, 0.0F));

		PartDefinition DSkull2 = SkullDeco.addOrReplaceChild("DSkull2",
				CubeListBuilder.create().texOffs(768, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8F, 7.5F, -68.6F, 0.5463F, 0.5009F, 0.0F));

		PartDefinition DSkull3 = SkullDeco.addOrReplaceChild("DSkull3",
				CubeListBuilder.create().texOffs(768, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7F, 0.0F, -67.0F, 0.3187F, -0.7285F, 0.0F));

		PartDefinition DSkull4 = SkullDeco.addOrReplaceChild("DSkull4",
				CubeListBuilder.create().texOffs(768, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.8F, 12.9F, -63.8F, 0.7285F, -0.6829F, 0.0F));

		PartDefinition DSkull5 = SkullDeco.addOrReplaceChild("DSkull5",
				CubeListBuilder.create().texOffs(768, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6F, -0.7F, -72.0F, 0.1367F, -0.1367F, 0.0F));

		PartDefinition DSkull6 = SkullDeco.addOrReplaceChild("DSkull6",
				CubeListBuilder.create().texOffs(768, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.5F, -2.0F, -69.1F, 0.2731F, 0.5918F, 0.0F));

		PartDefinition DSkull7 = SkullDeco.addOrReplaceChild("DSkull7",
				CubeListBuilder.create().texOffs(768, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.7F, 8.7F, -65.8F, 0.3187F, 0.6374F, 0.0F));

		PartDefinition DSkull8 = SkullDeco.addOrReplaceChild("DSkull8",
				CubeListBuilder.create().texOffs(768, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1F, 16.9F, -65.3F, 0.5463F, 0.0456F, 0.0F));

		PartDefinition DSkull9 = SkullDeco.addOrReplaceChild("DSkull9",
				CubeListBuilder.create().texOffs(768, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.7F, -13.5F, -65.8F, -0.3187F, 0.7741F, 0.0F));

		PartDefinition DSkull10 = SkullDeco.addOrReplaceChild("DSkull10",
				CubeListBuilder.create().texOffs(768, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.6F, -1.3F, -65.8F, 0.0911F, 0.7285F, 0.0F));

		PartDefinition DSkull11 = SkullDeco.addOrReplaceChild("DSkull11",
				CubeListBuilder.create().texOffs(768, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.6F, -1.3F, -65.8F, 0.0911F, -0.8196F, 0.0F));

		PartDefinition DSkull12 = SkullDeco.addOrReplaceChild("DSkull12",
				CubeListBuilder.create().texOffs(768, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, -12.0F, -65.8F, -0.4098F, -0.7741F, 0.0F));

		PartDefinition DSkull13 = SkullDeco.addOrReplaceChild("DSkull13",
				CubeListBuilder.create().texOffs(768, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4F, -9.2F, -71.1F, -0.3187F, -0.5463F, 0.0F));

		PartDefinition DSkull14 = SkullDeco.addOrReplaceChild("DSkull14",
				CubeListBuilder.create().texOffs(768, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7F, -9.2F, -71.1F, -0.2731F, 0.5463F, 0.0F));

		PartDefinition DSkull15 = SkullDeco.addOrReplaceChild("DSkull15",
				CubeListBuilder.create().texOffs(768, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4F, -16.9F, -66.6F, -0.3643F, -0.4098F, 0.0F));

		PartDefinition DSkull16 = SkullDeco.addOrReplaceChild("DSkull16",
				CubeListBuilder.create().texOffs(768, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.8F, -20.0F, -65.1F, -0.5463F, 0.6829F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0)
				.addBox(0.0F, -24.0F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 2048, 2048);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		WispBone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeTop.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeSide.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeSideMain.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeBack.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeBackMain.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeBackMinor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeTopMinor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeSideMinor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeBackMMinor1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeBackMMinor2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeBackMMinor3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeBackMMinor4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeSideMMinor1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeSideMMinor2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeTopMMinor1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeTopMMinor2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeFront1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeFront2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeFront3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeFront4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeMinor1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeMinor2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeMinor3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeMinor4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeTopMain.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BottomEyeBoneMain.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightEyeBoneMain.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftEyeBoneMain.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		TopEyeBoneMain.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		EyeShine.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		SkullDeco.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.EyeShine.zRot = ageInTicks / 20.f;
		this.WispBone.yRot = ageInTicks / 20.f;
		this.EyeSLayer3.zRot = ageInTicks;
		this.EyeSLayer2.zRot = ageInTicks / 20.f;
		this.WispFlame2.yRot = ageInTicks / 20.f;
		this.WispFlame1.yRot = ageInTicks / 20.f;
	}
}