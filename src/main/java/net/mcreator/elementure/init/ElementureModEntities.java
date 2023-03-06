
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.entity.ZehandEntity;
import net.mcreator.elementure.entity.WindyshoresCloudEntity;
import net.mcreator.elementure.entity.WindyshoreFlare1Entity;
import net.mcreator.elementure.entity.WeakdioriteelementalEntity;
import net.mcreator.elementure.entity.WeakandesiteelementalEntity;
import net.mcreator.elementure.entity.WaterblastskillEntity;
import net.mcreator.elementure.entity.WarpedspearEntity;
import net.mcreator.elementure.entity.VengefulspiritskillEntity;
import net.mcreator.elementure.entity.VamitechannelerEntity;
import net.mcreator.elementure.entity.UmbrasylSegmentEntity;
import net.mcreator.elementure.entity.UmbrasylEntity;
import net.mcreator.elementure.entity.TwistedknightEntity;
import net.mcreator.elementure.entity.TwistedBladeEntity;
import net.mcreator.elementure.entity.TinyclaymanfamiliarEntity;
import net.mcreator.elementure.entity.TidalcometEntity;
import net.mcreator.elementure.entity.TheninefamiliarEntity;
import net.mcreator.elementure.entity.TarwormLinkEntity;
import net.mcreator.elementure.entity.TarwormEntity;
import net.mcreator.elementure.entity.TarumbraEntity;
import net.mcreator.elementure.entity.TarspiritEntity;
import net.mcreator.elementure.entity.TargodBlasterEntity;
import net.mcreator.elementure.entity.TarbombEntity;
import net.mcreator.elementure.entity.TallkassemEntity;
import net.mcreator.elementure.entity.SunlighteggfamiliarEntity;
import net.mcreator.elementure.entity.StatuewraithEntity;
import net.mcreator.elementure.entity.StatueprotectorEntity;
import net.mcreator.elementure.entity.StaticspriteEntity;
import net.mcreator.elementure.entity.StarryvillagerguardianEntity;
import net.mcreator.elementure.entity.StarryvillagergathererEntity;
import net.mcreator.elementure.entity.StarryvillagerblacksmithEntity;
import net.mcreator.elementure.entity.StarguardianstandEntity;
import net.mcreator.elementure.entity.SpidermatriarchEntity;
import net.mcreator.elementure.entity.SpiderlingEntity;
import net.mcreator.elementure.entity.SpiderSwarmerEntity;
import net.mcreator.elementure.entity.SpiderQueenEntity;
import net.mcreator.elementure.entity.SpectreknightEntity;
import net.mcreator.elementure.entity.SoulskullfamiliarEntity;
import net.mcreator.elementure.entity.SoulobleckEntity;
import net.mcreator.elementure.entity.SnyEntity;
import net.mcreator.elementure.entity.SmallgraniteelementalEntity;
import net.mcreator.elementure.entity.SmallObleckminionEntity;
import net.mcreator.elementure.entity.SlumberingSoldierEntity;
import net.mcreator.elementure.entity.SlumberingGeneralEntity;
import net.mcreator.elementure.entity.SlumberinGeneralOrbEntity;
import net.mcreator.elementure.entity.SkeletalHostEntity;
import net.mcreator.elementure.entity.SkeletalHeadHostEntity;
import net.mcreator.elementure.entity.SirenqueenEntity;
import net.mcreator.elementure.entity.SirenlingEntity;
import net.mcreator.elementure.entity.ShurifangEntity;
import net.mcreator.elementure.entity.ShatteredobsidianchargerEntity;
import net.mcreator.elementure.entity.ShadowcandleEntity;
import net.mcreator.elementure.entity.ScrapguardiansmallEntity;
import net.mcreator.elementure.entity.ScrapguardianEntity;
import net.mcreator.elementure.entity.RocketwormEntity;
import net.mcreator.elementure.entity.RimecormunculusChannelerEntity;
import net.mcreator.elementure.entity.RimeboidEntity;
import net.mcreator.elementure.entity.RedsunpillarEntity;
import net.mcreator.elementure.entity.RedjellyfloatEntity;
import net.mcreator.elementure.entity.PumpkinmimicEntity;
import net.mcreator.elementure.entity.PumpkingrenadeEntity;
import net.mcreator.elementure.entity.PsyblastskillEntity;
import net.mcreator.elementure.entity.PowerstrikeskillEntity;
import net.mcreator.elementure.entity.PhaseblinkchannelerEntity;
import net.mcreator.elementure.entity.PerinealbotflyminionEntity;
import net.mcreator.elementure.entity.PerinealbotflyEntity;
import net.mcreator.elementure.entity.PapyscrownfamiliarEntity;
import net.mcreator.elementure.entity.OstrachainLinkEntity;
import net.mcreator.elementure.entity.OstrachainEntity;
import net.mcreator.elementure.entity.OctolankEntity;
import net.mcreator.elementure.entity.OceangraceEntity;
import net.mcreator.elementure.entity.OceanangelEntity;
import net.mcreator.elementure.entity.ObsidianbobberEntEntity;
import net.mcreator.elementure.entity.ObleckturretEntityProjectile;
import net.mcreator.elementure.entity.ObleckturretEntity;
import net.mcreator.elementure.entity.OblecklordeldritchEntity;
import net.mcreator.elementure.entity.OblecklordEntity;
import net.mcreator.elementure.entity.ObleckclericEntity;
import net.mcreator.elementure.entity.ObleckEntity;
import net.mcreator.elementure.entity.NoobiumchannelerEntity;
import net.mcreator.elementure.entity.NightmareSpikeEntity;
import net.mcreator.elementure.entity.NightmareMassEntity;
import net.mcreator.elementure.entity.NightmareArbalestEntity;
import net.mcreator.elementure.entity.NetherumleaperEntity;
import net.mcreator.elementure.entity.NetherumTitanEntity;
import net.mcreator.elementure.entity.NetherstarvillagerdustyEntity;
import net.mcreator.elementure.entity.NetherstarflareEntity;
import net.mcreator.elementure.entity.Netherstarflare2Entity;
import net.mcreator.elementure.entity.NetherquartzchargerEntity;
import net.mcreator.elementure.entity.NeonchannelerEntity;
import net.mcreator.elementure.entity.MycenatruffloonEntity;
import net.mcreator.elementure.entity.MycenatrufflingEntity;
import net.mcreator.elementure.entity.MycenasporeslingeringcloudEntity;
import net.mcreator.elementure.entity.MycenasporelingEntity;
import net.mcreator.elementure.entity.MycenashroomvillagerpriestEntity;
import net.mcreator.elementure.entity.MycenashroomvillagerlibrarianEntity;
import net.mcreator.elementure.entity.MycenashroomvillagerleatherworkerEntity;
import net.mcreator.elementure.entity.MycenashroomvillagerfarmerEntity;
import net.mcreator.elementure.entity.MycenashroomvillagerelderEntity;
import net.mcreator.elementure.entity.MycenashroomvillagerblacksmithEntity;
import net.mcreator.elementure.entity.MycenashroomvillagerNitwitEntity;
import net.mcreator.elementure.entity.MycenashroomvillagerFishermanEntity;
import net.mcreator.elementure.entity.MycenashroomlordEntity;
import net.mcreator.elementure.entity.MycenashroomlingEntity;
import net.mcreator.elementure.entity.MycenashroomguardEntity;
import net.mcreator.elementure.entity.MycenashroomalEntity;
import net.mcreator.elementure.entity.MycenaroamerEntity;
import net.mcreator.elementure.entity.MycenansuperchannelerEntity;
import net.mcreator.elementure.entity.MycenansporessplashEntity;
import net.mcreator.elementure.entity.MycenansporeslingeringEntity;
import net.mcreator.elementure.entity.MycenanchannelerEntity;
import net.mcreator.elementure.entity.MycenainfectedshroomguardEntity;
import net.mcreator.elementure.entity.MycenafumoonsporelingEntity;
import net.mcreator.elementure.entity.MycenafumoonsporeEntity;
import net.mcreator.elementure.entity.MycenafumoonshroomlordEntity;
import net.mcreator.elementure.entity.MycenafumoonshroomlingEntity;
import net.mcreator.elementure.entity.MycenafumoonmushroomEntity;
import net.mcreator.elementure.entity.MycenafumoonEntity;
import net.mcreator.elementure.entity.MotherorbEntity;
import net.mcreator.elementure.entity.MinoskullflaibulletEntity;
import net.mcreator.elementure.entity.MinoskullEntity;
import net.mcreator.elementure.entity.MindobleckEntity;
import net.mcreator.elementure.entity.MerthiumchannelerEntity;
import net.mcreator.elementure.entity.MemorybobberEntityEntity;
import net.mcreator.elementure.entity.MasterstaffEntity;
import net.mcreator.elementure.entity.MagtunabusterEntity;
import net.mcreator.elementure.entity.MagtunaBusterFirestormBallEntity;
import net.mcreator.elementure.entity.LousyswordfamiliarEntity;
import net.mcreator.elementure.entity.LocalisedvacuityskillEntity;
import net.mcreator.elementure.entity.LignitechannelerEntity;
import net.mcreator.elementure.entity.LightningblastskillEntity;
import net.mcreator.elementure.entity.LargejellyEntity;
import net.mcreator.elementure.entity.LargecrystalhopperEntity;
import net.mcreator.elementure.entity.KingsknightEntity;
import net.mcreator.elementure.entity.KassemstaffEntity;
import net.mcreator.elementure.entity.KassemEntity;
import net.mcreator.elementure.entity.JellyEntity;
import net.mcreator.elementure.entity.IvoryshadeEntity;
import net.mcreator.elementure.entity.IronknightEntity;
import net.mcreator.elementure.entity.InfinityblastskillEntity;
import net.mcreator.elementure.entity.HiddenrunesfamiliarEntity;
import net.mcreator.elementure.entity.HeatseekerEntity;
import net.mcreator.elementure.entity.HeadlessDiscardedSkeletonEntity;
import net.mcreator.elementure.entity.HeadHostEntity;
import net.mcreator.elementure.entity.HarpoonbulletEntity;
import net.mcreator.elementure.entity.HalloweenspiritEntity;
import net.mcreator.elementure.entity.GreenjellyfloatEntity;
import net.mcreator.elementure.entity.GreendemonEntity;
import net.mcreator.elementure.entity.GreedyknightEntity;
import net.mcreator.elementure.entity.GraniteelementalEntity;
import net.mcreator.elementure.entity.GoldenSpiderlingEntity;
import net.mcreator.elementure.entity.GnoblinEntity;
import net.mcreator.elementure.entity.GlassbellboatEntityEntity;
import net.mcreator.elementure.entity.GhostwarriorEntity;
import net.mcreator.elementure.entity.GamerbowEntity;
import net.mcreator.elementure.entity.Forgottenwatcher2Entity;
import net.mcreator.elementure.entity.Forgottenwatcher1Entity;
import net.mcreator.elementure.entity.ForceobleckEntity;
import net.mcreator.elementure.entity.FoamfishEntity;
import net.mcreator.elementure.entity.FlutanitechannelerEntity;
import net.mcreator.elementure.entity.FluffwhaleEntity;
import net.mcreator.elementure.entity.FlashskillEntity;
import net.mcreator.elementure.entity.FireblastskillEntity;
import net.mcreator.elementure.entity.FerziumchannelerEntity;
import net.mcreator.elementure.entity.FangbombEntity;
import net.mcreator.elementure.entity.FangbolaEntity;
import net.mcreator.elementure.entity.EnhancedtargodBlasterEntity;
import net.mcreator.elementure.entity.EnhancedtarbombEntity;
import net.mcreator.elementure.entity.EnergyblastskillEntity;
import net.mcreator.elementure.entity.EchoBerryEntity;
import net.mcreator.elementure.entity.EarthblastskillEntity;
import net.mcreator.elementure.entity.DustfluxchannelerEntity;
import net.mcreator.elementure.entity.DragoniteEntity;
import net.mcreator.elementure.entity.DragonewtEntity;
import net.mcreator.elementure.entity.DizmiteEntity;
import net.mcreator.elementure.entity.DiscardedSkeletonEntity;
import net.mcreator.elementure.entity.DioriteelementalEntity;
import net.mcreator.elementure.entity.DeathswitnessEntity;
import net.mcreator.elementure.entity.DeadscrapguardianEntity;
import net.mcreator.elementure.entity.DazzlingbowEntity;
import net.mcreator.elementure.entity.DarkspiritEntity;
import net.mcreator.elementure.entity.DarklurkerEntity;
import net.mcreator.elementure.entity.DarkgemcrossbolterEntity;
import net.mcreator.elementure.entity.DarkenskillEntity;
import net.mcreator.elementure.entity.DarkcormunculusChannelerEntity;
import net.mcreator.elementure.entity.CustombobberEntity;
import net.mcreator.elementure.entity.CurserbowEntity;
import net.mcreator.elementure.entity.CthulhupetEntity;
import net.mcreator.elementure.entity.CrystalhopperEntity;
import net.mcreator.elementure.entity.CrystalcreeperEntity;
import net.mcreator.elementure.entity.CruelknightEntity;
import net.mcreator.elementure.entity.CosmicslimefamiliarEntity;
import net.mcreator.elementure.entity.CormunculusChannelerEntity;
import net.mcreator.elementure.entity.CoalpuckfamiliarEntity;
import net.mcreator.elementure.entity.CoalpuckEntity;
import net.mcreator.elementure.entity.ChromaticwheelBulletEntity;
import net.mcreator.elementure.entity.ChargedchannelerEntity;
import net.mcreator.elementure.entity.CausticvialLiquidEntity;
import net.mcreator.elementure.entity.CausticknightEntity;
import net.mcreator.elementure.entity.CausticbladeEntity;
import net.mcreator.elementure.entity.CandleKnightEntity;
import net.mcreator.elementure.entity.BuzybeefamiliarEntity;
import net.mcreator.elementure.entity.ButterflybudfamiliarEntity;
import net.mcreator.elementure.entity.BubbleblasterEntity;
import net.mcreator.elementure.entity.BubbleOBlueEntity;
import net.mcreator.elementure.entity.BubbleEntity;
import net.mcreator.elementure.entity.BrontiumchannelerEntity;
import net.mcreator.elementure.entity.BrightcandleEntity;
import net.mcreator.elementure.entity.BluejellyfloatEntity;
import net.mcreator.elementure.entity.BlueblazeEntity;
import net.mcreator.elementure.entity.BlackstoneGrimaceEntity;
import net.mcreator.elementure.entity.BigkassemEntity;
import net.mcreator.elementure.entity.BiggranitelementalEntity;
import net.mcreator.elementure.entity.BigdioriteelementalEntity;
import net.mcreator.elementure.entity.BigandesiteelementalEntity;
import net.mcreator.elementure.entity.BabyghastEntity;
import net.mcreator.elementure.entity.AscendedaspidEntityProjectile;
import net.mcreator.elementure.entity.AscendedaspidEntity;
import net.mcreator.elementure.entity.ArmoredturtleEntity;
import net.mcreator.elementure.entity.ArchkassemStaffEntity;
import net.mcreator.elementure.entity.ArchkassemEntity;
import net.mcreator.elementure.entity.ArachneelbowEntity;
import net.mcreator.elementure.entity.ArachneelEntityProjectile;
import net.mcreator.elementure.entity.ArachneelEntity;
import net.mcreator.elementure.entity.AngelfishChannelerEntity;
import net.mcreator.elementure.entity.AndesiteelementalEntity;
import net.mcreator.elementure.entity.AirblastskillEntity;
import net.mcreator.elementure.ElementureMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElementureModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ElementureMod.MODID);
	public static final RegistryObject<EntityType<GamerbowEntity>> GAMERBOW = register("projectile_gamerbow",
			EntityType.Builder.<GamerbowEntity>of(GamerbowEntity::new, MobCategory.MISC).setCustomClientFactory(GamerbowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CurserbowEntity>> CURSERBOW = register("projectile_curserbow",
			EntityType.Builder.<CurserbowEntity>of(CurserbowEntity::new, MobCategory.MISC).setCustomClientFactory(CurserbowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ZehandEntity>> ZEHAND = register("projectile_zehand",
			EntityType.Builder.<ZehandEntity>of(ZehandEntity::new, MobCategory.MISC).setCustomClientFactory(ZehandEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MasterstaffEntity>> MASTERSTAFF = register("projectile_masterstaff",
			EntityType.Builder.<MasterstaffEntity>of(MasterstaffEntity::new, MobCategory.MISC).setCustomClientFactory(MasterstaffEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<OceangraceEntity>> OCEANGRACE = register("projectile_oceangrace",
			EntityType.Builder.<OceangraceEntity>of(OceangraceEntity::new, MobCategory.MISC).setCustomClientFactory(OceangraceEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DazzlingbowEntity>> DAZZLINGBOW = register("projectile_dazzlingbow",
			EntityType.Builder.<DazzlingbowEntity>of(DazzlingbowEntity::new, MobCategory.MISC).setCustomClientFactory(DazzlingbowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MycenafumoonmushroomEntity>> MYCENAFUMOONMUSHROOM = register("projectile_mycenafumoonmushroom", EntityType.Builder.<MycenafumoonmushroomEntity>of(MycenafumoonmushroomEntity::new, MobCategory.MISC)
			.setCustomClientFactory(MycenafumoonmushroomEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PumpkingrenadeEntity>> PUMPKINGRENADE = register("projectile_pumpkingrenade",
			EntityType.Builder.<PumpkingrenadeEntity>of(PumpkingrenadeEntity::new, MobCategory.MISC).setCustomClientFactory(PumpkingrenadeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TwistedBladeEntity>> TWISTED_BLADE = register("projectile_twisted_blade",
			EntityType.Builder.<TwistedBladeEntity>of(TwistedBladeEntity::new, MobCategory.MISC).setCustomClientFactory(TwistedBladeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CausticbladeEntity>> CAUSTICBLADE = register("projectile_causticblade",
			EntityType.Builder.<CausticbladeEntity>of(CausticbladeEntity::new, MobCategory.MISC).setCustomClientFactory(CausticbladeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WarpedspearEntity>> WARPEDSPEAR = register("projectile_warpedspear",
			EntityType.Builder.<WarpedspearEntity>of(WarpedspearEntity::new, MobCategory.MISC).setCustomClientFactory(WarpedspearEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BubbleblasterEntity>> BUBBLEBLASTER = register("projectile_bubbleblaster",
			EntityType.Builder.<BubbleblasterEntity>of(BubbleblasterEntity::new, MobCategory.MISC).setCustomClientFactory(BubbleblasterEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MagtunabusterEntity>> MAGTUNABUSTER = register("projectile_magtunabuster",
			EntityType.Builder.<MagtunabusterEntity>of(MagtunabusterEntity::new, MobCategory.MISC).setCustomClientFactory(MagtunabusterEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DarkgemcrossbolterEntity>> DARKGEMCROSSBOLTER = register("projectile_darkgemcrossbolter", EntityType.Builder.<DarkgemcrossbolterEntity>of(DarkgemcrossbolterEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DarkgemcrossbolterEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TarbombEntity>> TARBOMB = register("projectile_tarbomb",
			EntityType.Builder.<TarbombEntity>of(TarbombEntity::new, MobCategory.MISC).setCustomClientFactory(TarbombEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TargodBlasterEntity>> TARGOD_BLASTER = register("projectile_targod_blaster",
			EntityType.Builder.<TargodBlasterEntity>of(TargodBlasterEntity::new, MobCategory.MISC).setCustomClientFactory(TargodBlasterEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EnhancedtarbombEntity>> ENHANCEDTARBOMB = register("projectile_enhancedtarbomb", EntityType.Builder.<EnhancedtarbombEntity>of(EnhancedtarbombEntity::new, MobCategory.MISC)
			.setCustomClientFactory(EnhancedtarbombEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EnhancedtargodBlasterEntity>> ENHANCEDTARGOD_BLASTER = register("projectile_enhancedtargod_blaster",
			EntityType.Builder.<EnhancedtargodBlasterEntity>of(EnhancedtargodBlasterEntity::new, MobCategory.MISC).setCustomClientFactory(EnhancedtargodBlasterEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ArachneelbowEntity>> ARACHNEELBOW = register("projectile_arachneelbow",
			EntityType.Builder.<ArachneelbowEntity>of(ArachneelbowEntity::new, MobCategory.MISC).setCustomClientFactory(ArachneelbowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TidalcometEntity>> TIDALCOMET = register("projectile_tidalcomet",
			EntityType.Builder.<TidalcometEntity>of(TidalcometEntity::new, MobCategory.MISC).setCustomClientFactory(TidalcometEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShurifangEntity>> SHURIFANG = register("projectile_shurifang",
			EntityType.Builder.<ShurifangEntity>of(ShurifangEntity::new, MobCategory.MISC).setCustomClientFactory(ShurifangEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IronknightEntity>> IRONKNIGHT = register("ironknight",
			EntityType.Builder.<IronknightEntity>of(IronknightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IronknightEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TwistedknightEntity>> TWISTEDKNIGHT = register("twistedknight",
			EntityType.Builder.<TwistedknightEntity>of(TwistedknightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TwistedknightEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GreedyknightEntity>> GREEDYKNIGHT = register("greedyknight",
			EntityType.Builder.<GreedyknightEntity>of(GreedyknightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GreedyknightEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CausticknightEntity>> CAUSTICKNIGHT = register("causticknight",
			EntityType.Builder.<CausticknightEntity>of(CausticknightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CausticknightEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CruelknightEntity>> CRUELKNIGHT = register("cruelknight",
			EntityType.Builder.<CruelknightEntity>of(CruelknightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CruelknightEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<CandleKnightEntity>> CANDLE_KNIGHT = register("candle_knight", EntityType.Builder.<CandleKnightEntity>of(CandleKnightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CandleKnightEntity::new).fireImmune().sized(0.9f, 1.6f));
	public static final RegistryObject<EntityType<SpectreknightEntity>> SPECTREKNIGHT = register("spectreknight", EntityType.Builder.<SpectreknightEntity>of(SpectreknightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpectreknightEntity::new).fireImmune().sized(0.6f, 2.2f));
	public static final RegistryObject<EntityType<KingsknightEntity>> KINGSKNIGHT = register("kingsknight", EntityType.Builder.<KingsknightEntity>of(KingsknightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KingsknightEntity::new).fireImmune().sized(0.6f, 2f));
	public static final RegistryObject<EntityType<LargejellyEntity>> LARGEJELLY = register("largejelly",
			EntityType.Builder.<LargejellyEntity>of(LargejellyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LargejellyEntity::new)

					.sized(1.6f, 2.4f));
	public static final RegistryObject<EntityType<UmbrasylEntity>> UMBRASYL = register("umbrasyl",
			EntityType.Builder.<UmbrasylEntity>of(UmbrasylEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(512).setUpdateInterval(3).setCustomClientFactory(UmbrasylEntity::new)

					.sized(3.6f, 3.6f));
	public static final RegistryObject<EntityType<SirenqueenEntity>> SIRENQUEEN = register("sirenqueen",
			EntityType.Builder.<SirenqueenEntity>of(SirenqueenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(SirenqueenEntity::new)

					.sized(1.6f, 3.2f));
	public static final RegistryObject<EntityType<SpiderQueenEntity>> SPIDER_QUEEN = register("spider_queen",
			EntityType.Builder.<SpiderQueenEntity>of(SpiderQueenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpiderQueenEntity::new)

					.sized(1.4f, 1.4000000000000001f));
	public static final RegistryObject<EntityType<SlumberingGeneralEntity>> SLUMBERING_GENERAL = register("slumbering_general",
			EntityType.Builder.<SlumberingGeneralEntity>of(SlumberingGeneralEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SlumberingGeneralEntity::new)

					.sized(1.8f, 1.5f));
	public static final RegistryObject<EntityType<VengefulspiritskillEntity>> VENGEFULSPIRITSKILL = register("projectile_vengefulspiritskill", EntityType.Builder.<VengefulspiritskillEntity>of(VengefulspiritskillEntity::new, MobCategory.MISC)
			.setCustomClientFactory(VengefulspiritskillEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EarthblastskillEntity>> EARTHBLASTSKILL = register("projectile_earthblastskill", EntityType.Builder.<EarthblastskillEntity>of(EarthblastskillEntity::new, MobCategory.MISC)
			.setCustomClientFactory(EarthblastskillEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FireblastskillEntity>> FIREBLASTSKILL = register("projectile_fireblastskill",
			EntityType.Builder.<FireblastskillEntity>of(FireblastskillEntity::new, MobCategory.MISC).setCustomClientFactory(FireblastskillEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WaterblastskillEntity>> WATERBLASTSKILL = register("projectile_waterblastskill", EntityType.Builder.<WaterblastskillEntity>of(WaterblastskillEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WaterblastskillEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AirblastskillEntity>> AIRBLASTSKILL = register("projectile_airblastskill",
			EntityType.Builder.<AirblastskillEntity>of(AirblastskillEntity::new, MobCategory.MISC).setCustomClientFactory(AirblastskillEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LightningblastskillEntity>> LIGHTNINGBLASTSKILL = register("projectile_lightningblastskill", EntityType.Builder.<LightningblastskillEntity>of(LightningblastskillEntity::new, MobCategory.MISC)
			.setCustomClientFactory(LightningblastskillEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EnergyblastskillEntity>> ENERGYBLASTSKILL = register("projectile_energyblastskill", EntityType.Builder.<EnergyblastskillEntity>of(EnergyblastskillEntity::new, MobCategory.MISC)
			.setCustomClientFactory(EnergyblastskillEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PsyblastskillEntity>> PSYBLASTSKILL = register("projectile_psyblastskill",
			EntityType.Builder.<PsyblastskillEntity>of(PsyblastskillEntity::new, MobCategory.MISC).setCustomClientFactory(PsyblastskillEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PowerstrikeskillEntity>> POWERSTRIKESKILL = register("projectile_powerstrikeskill", EntityType.Builder.<PowerstrikeskillEntity>of(PowerstrikeskillEntity::new, MobCategory.MISC)
			.setCustomClientFactory(PowerstrikeskillEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<InfinityblastskillEntity>> INFINITYBLASTSKILL = register("projectile_infinityblastskill", EntityType.Builder.<InfinityblastskillEntity>of(InfinityblastskillEntity::new, MobCategory.MISC)
			.setCustomClientFactory(InfinityblastskillEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlashskillEntity>> FLASHSKILL = register("projectile_flashskill",
			EntityType.Builder.<FlashskillEntity>of(FlashskillEntity::new, MobCategory.MISC).setCustomClientFactory(FlashskillEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DarkenskillEntity>> DARKENSKILL = register("projectile_darkenskill",
			EntityType.Builder.<DarkenskillEntity>of(DarkenskillEntity::new, MobCategory.MISC).setCustomClientFactory(DarkenskillEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LocalisedvacuityskillEntity>> LOCALISEDVACUITYSKILL = register("projectile_localisedvacuityskill",
			EntityType.Builder.<LocalisedvacuityskillEntity>of(LocalisedvacuityskillEntity::new, MobCategory.MISC).setCustomClientFactory(LocalisedvacuityskillEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FerziumchannelerEntity>> FERZIUMCHANNELER = register("projectile_ferziumchanneler", EntityType.Builder.<FerziumchannelerEntity>of(FerziumchannelerEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FerziumchannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NoobiumchannelerEntity>> NOOBIUMCHANNELER = register("projectile_noobiumchanneler", EntityType.Builder.<NoobiumchannelerEntity>of(NoobiumchannelerEntity::new, MobCategory.MISC)
			.setCustomClientFactory(NoobiumchannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MerthiumchannelerEntity>> MERTHIUMCHANNELER = register("projectile_merthiumchanneler", EntityType.Builder.<MerthiumchannelerEntity>of(MerthiumchannelerEntity::new, MobCategory.MISC)
			.setCustomClientFactory(MerthiumchannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DustfluxchannelerEntity>> DUSTFLUXCHANNELER = register("projectile_dustfluxchanneler", EntityType.Builder.<DustfluxchannelerEntity>of(DustfluxchannelerEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DustfluxchannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlutanitechannelerEntity>> FLUTANITECHANNELER = register("projectile_flutanitechanneler", EntityType.Builder.<FlutanitechannelerEntity>of(FlutanitechannelerEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FlutanitechannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LignitechannelerEntity>> LIGNITECHANNELER = register("projectile_lignitechanneler", EntityType.Builder.<LignitechannelerEntity>of(LignitechannelerEntity::new, MobCategory.MISC)
			.setCustomClientFactory(LignitechannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VamitechannelerEntity>> VAMITECHANNELER = register("projectile_vamitechanneler", EntityType.Builder.<VamitechannelerEntity>of(VamitechannelerEntity::new, MobCategory.MISC)
			.setCustomClientFactory(VamitechannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BrontiumchannelerEntity>> BRONTIUMCHANNELER = register("projectile_brontiumchanneler", EntityType.Builder.<BrontiumchannelerEntity>of(BrontiumchannelerEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BrontiumchannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MycenansuperchannelerEntity>> MYCENANSUPERCHANNELER = register("projectile_mycenansuperchanneler",
			EntityType.Builder.<MycenansuperchannelerEntity>of(MycenansuperchannelerEntity::new, MobCategory.MISC).setCustomClientFactory(MycenansuperchannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ChargedchannelerEntity>> CHARGEDCHANNELER = register("projectile_chargedchanneler", EntityType.Builder.<ChargedchannelerEntity>of(ChargedchannelerEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ChargedchannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MycenanchannelerEntity>> MYCENANCHANNELER = register("projectile_mycenanchanneler", EntityType.Builder.<MycenanchannelerEntity>of(MycenanchannelerEntity::new, MobCategory.MISC)
			.setCustomClientFactory(MycenanchannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NeonchannelerEntity>> NEONCHANNELER = register("projectile_neonchanneler",
			EntityType.Builder.<NeonchannelerEntity>of(NeonchannelerEntity::new, MobCategory.MISC).setCustomClientFactory(NeonchannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PhaseblinkchannelerEntity>> PHASEBLINKCHANNELER = register("projectile_phaseblinkchanneler", EntityType.Builder.<PhaseblinkchannelerEntity>of(PhaseblinkchannelerEntity::new, MobCategory.MISC)
			.setCustomClientFactory(PhaseblinkchannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CormunculusChannelerEntity>> CORMUNCULUS_CHANNELER = register("projectile_cormunculus_channeler", EntityType.Builder.<CormunculusChannelerEntity>of(CormunculusChannelerEntity::new, MobCategory.MISC)
			.setCustomClientFactory(CormunculusChannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DarkcormunculusChannelerEntity>> DARKCORMUNCULUS_CHANNELER = register("projectile_darkcormunculus_channeler",
			EntityType.Builder.<DarkcormunculusChannelerEntity>of(DarkcormunculusChannelerEntity::new, MobCategory.MISC).setCustomClientFactory(DarkcormunculusChannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RimecormunculusChannelerEntity>> RIMECORMUNCULUS_CHANNELER = register("projectile_rimecormunculus_channeler",
			EntityType.Builder.<RimecormunculusChannelerEntity>of(RimecormunculusChannelerEntity::new, MobCategory.MISC).setCustomClientFactory(RimecormunculusChannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ArchkassemStaffEntity>> ARCHKASSEM_STAFF = register("projectile_archkassem_staff", EntityType.Builder.<ArchkassemStaffEntity>of(ArchkassemStaffEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ArchkassemStaffEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KassemstaffEntity>> KASSEMSTAFF = register("projectile_kassemstaff",
			EntityType.Builder.<KassemstaffEntity>of(KassemstaffEntity::new, MobCategory.MISC).setCustomClientFactory(KassemstaffEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FangbombEntity>> FANGBOMB = register("projectile_fangbomb",
			EntityType.Builder.<FangbombEntity>of(FangbombEntity::new, MobCategory.MISC).setCustomClientFactory(FangbombEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FangbolaEntity>> FANGBOLA = register("projectile_fangbola",
			EntityType.Builder.<FangbolaEntity>of(FangbolaEntity::new, MobCategory.MISC).setCustomClientFactory(FangbolaEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AngelfishChannelerEntity>> ANGELFISH_CHANNELER = register("projectile_angelfish_channeler", EntityType.Builder.<AngelfishChannelerEntity>of(AngelfishChannelerEntity::new, MobCategory.MISC)
			.setCustomClientFactory(AngelfishChannelerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MycenashroomvillagerNitwitEntity>> MYCENASHROOMVILLAGER_NITWIT = register("mycenashroomvillager_nitwit",
			EntityType.Builder.<MycenashroomvillagerNitwitEntity>of(MycenashroomvillagerNitwitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MycenashroomvillagerNitwitEntity::new)

					.sized(0.6f, 1.85f));
	public static final RegistryObject<EntityType<MycenashroomguardEntity>> MYCENASHROOMGUARD = register("mycenashroomguard",
			EntityType.Builder.<MycenashroomguardEntity>of(MycenashroomguardEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MycenashroomguardEntity::new)

					.sized(0.6f, 1.85f));
	public static final RegistryObject<EntityType<MycenainfectedshroomguardEntity>> MYCENAINFECTEDSHROOMGUARD = register("mycenainfectedshroomguard",
			EntityType.Builder.<MycenainfectedshroomguardEntity>of(MycenainfectedshroomguardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MycenainfectedshroomguardEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MycenashroomvillagerleatherworkerEntity>> MYCENASHROOMVILLAGERLEATHERWORKER = register("mycenashroomvillagerleatherworker",
			EntityType.Builder.<MycenashroomvillagerleatherworkerEntity>of(MycenashroomvillagerleatherworkerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MycenashroomvillagerleatherworkerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MycenashroomvillagerblacksmithEntity>> MYCENASHROOMVILLAGERBLACKSMITH = register("mycenashroomvillagerblacksmith",
			EntityType.Builder.<MycenashroomvillagerblacksmithEntity>of(MycenashroomvillagerblacksmithEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MycenashroomvillagerblacksmithEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MycenashroomvillagerlibrarianEntity>> MYCENASHROOMVILLAGERLIBRARIAN = register("mycenashroomvillagerlibrarian",
			EntityType.Builder.<MycenashroomvillagerlibrarianEntity>of(MycenashroomvillagerlibrarianEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MycenashroomvillagerlibrarianEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MycenashroomvillagerpriestEntity>> MYCENASHROOMVILLAGERPRIEST = register("mycenashroomvillagerpriest",
			EntityType.Builder.<MycenashroomvillagerpriestEntity>of(MycenashroomvillagerpriestEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MycenashroomvillagerpriestEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MycenashroomvillagerelderEntity>> MYCENASHROOMVILLAGERELDER = register("mycenashroomvillagerelder",
			EntityType.Builder.<MycenashroomvillagerelderEntity>of(MycenashroomvillagerelderEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MycenashroomvillagerelderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MycenashroomlingEntity>> MYCENASHROOMLING = register("mycenashroomling",
			EntityType.Builder.<MycenashroomlingEntity>of(MycenashroomlingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3).setCustomClientFactory(MycenashroomlingEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<MycenasporelingEntity>> MYCENASPORELING = register("mycenasporeling",
			EntityType.Builder.<MycenasporelingEntity>of(MycenasporelingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MycenasporelingEntity::new)

					.sized(0.19999999999999998f, 0.30000000000000004f));
	public static final RegistryObject<EntityType<MycenashroomalEntity>> MYCENASHROOMAL = register("mycenashroomal",
			EntityType.Builder.<MycenashroomalEntity>of(MycenashroomalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MycenashroomalEntity::new)

					.sized(0.7000000000000001f, 2.1f));
	public static final RegistryObject<EntityType<MycenashroomlordEntity>> MYCENASHROOMLORD = register("mycenashroomlord",
			EntityType.Builder.<MycenashroomlordEntity>of(MycenashroomlordEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MycenashroomlordEntity::new)

					.sized(1f, 2.2f));
	public static final RegistryObject<EntityType<MycenafumoonEntity>> MYCENAFUMOON = register("mycenafumoon",
			EntityType.Builder.<MycenafumoonEntity>of(MycenafumoonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MycenafumoonEntity::new)

					.sized(0.7999999999999999f, 0.9f));
	public static final RegistryObject<EntityType<MycenafumoonsporeEntity>> MYCENAFUMOONSPORE = register("mycenafumoonspore",
			EntityType.Builder.<MycenafumoonsporeEntity>of(MycenafumoonsporeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MycenafumoonsporeEntity::new)

					.sized(0.30000000000000004f, 0.6f));
	public static final RegistryObject<EntityType<MycenaroamerEntity>> MYCENAROAMER = register("mycenaroamer",
			EntityType.Builder.<MycenaroamerEntity>of(MycenaroamerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MycenaroamerEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<MycenasporeslingeringcloudEntity>> MYCENASPORESLINGERINGCLOUD = register("mycenasporeslingeringcloud",
			EntityType.Builder.<MycenasporeslingeringcloudEntity>of(MycenasporeslingeringcloudEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MycenasporeslingeringcloudEntity::new).fireImmune().sized(0f, 0f));
	public static final RegistryObject<EntityType<MycenafumoonshroomlingEntity>> MYCENAFUMOONSHROOMLING = register("mycenafumoonshroomling",
			EntityType.Builder.<MycenafumoonshroomlingEntity>of(MycenafumoonshroomlingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MycenafumoonshroomlingEntity::new)

					.sized(0.6f, 1.2000000000000002f));
	public static final RegistryObject<EntityType<MycenatruffloonEntity>> MYCENATRUFFLOON = register("mycenatruffloon",
			EntityType.Builder.<MycenatruffloonEntity>of(MycenatruffloonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MycenatruffloonEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<MycenatrufflingEntity>> MYCENATRUFFLING = register("mycenatruffling",
			EntityType.Builder.<MycenatrufflingEntity>of(MycenatrufflingEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MycenatrufflingEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<MycenafumoonsporelingEntity>> MYCENAFUMOONSPORELING = register("mycenafumoonsporeling",
			EntityType.Builder.<MycenafumoonsporelingEntity>of(MycenafumoonsporelingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MycenafumoonsporelingEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<MycenafumoonshroomlordEntity>> MYCENAFUMOONSHROOMLORD = register("mycenafumoonshroomlord",
			EntityType.Builder.<MycenafumoonshroomlordEntity>of(MycenafumoonshroomlordEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MycenafumoonshroomlordEntity::new)

					.sized(0.9f, 2f));
	public static final RegistryObject<EntityType<MycenashroomvillagerfarmerEntity>> MYCENASHROOMVILLAGERFARMER = register("mycenashroomvillagerfarmer",
			EntityType.Builder.<MycenashroomvillagerfarmerEntity>of(MycenashroomvillagerfarmerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MycenashroomvillagerfarmerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PapyscrownfamiliarEntity>> PAPYSCROWNFAMILIAR = register("papyscrownfamiliar", EntityType.Builder.<PapyscrownfamiliarEntity>of(PapyscrownfamiliarEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(PapyscrownfamiliarEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SunlighteggfamiliarEntity>> SUNLIGHTEGGFAMILIAR = register("sunlighteggfamiliar", EntityType.Builder.<SunlighteggfamiliarEntity>of(SunlighteggfamiliarEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(SunlighteggfamiliarEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CosmicslimefamiliarEntity>> COSMICSLIMEFAMILIAR = register("cosmicslimefamiliar", EntityType.Builder.<CosmicslimefamiliarEntity>of(CosmicslimefamiliarEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(CosmicslimefamiliarEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BiggranitelementalEntity>> BIGGRANITELEMENTAL = register("biggranitelemental", EntityType.Builder.<BiggranitelementalEntity>of(BiggranitelementalEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BiggranitelementalEntity::new).fireImmune().sized(0.7999999999999999f, 2f));
	public static final RegistryObject<EntityType<GraniteelementalEntity>> GRANITEELEMENTAL = register("graniteelemental", EntityType.Builder.<GraniteelementalEntity>of(GraniteelementalEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GraniteelementalEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SmallgraniteelementalEntity>> SMALLGRANITEELEMENTAL = register("smallgraniteelemental", EntityType.Builder.<SmallgraniteelementalEntity>of(SmallgraniteelementalEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SmallgraniteelementalEntity::new).fireImmune().sized(0.4f, 1.5999999999999999f));
	public static final RegistryObject<EntityType<BigandesiteelementalEntity>> BIGANDESITEELEMENTAL = register("bigandesiteelemental", EntityType.Builder.<BigandesiteelementalEntity>of(BigandesiteelementalEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigandesiteelementalEntity::new).fireImmune().sized(0.7000000000000001f, 2f));
	public static final RegistryObject<EntityType<AndesiteelementalEntity>> ANDESITEELEMENTAL = register("andesiteelemental",
			EntityType.Builder.<AndesiteelementalEntity>of(AndesiteelementalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AndesiteelementalEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WeakandesiteelementalEntity>> WEAKANDESITEELEMENTAL = register("weakandesiteelemental", EntityType.Builder.<WeakandesiteelementalEntity>of(WeakandesiteelementalEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WeakandesiteelementalEntity::new).fireImmune().sized(0.30000000000000004f, 1.5999999999999999f));
	public static final RegistryObject<EntityType<WeakdioriteelementalEntity>> WEAKDIORITEELEMENTAL = register("weakdioriteelemental", EntityType.Builder.<WeakdioriteelementalEntity>of(WeakdioriteelementalEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WeakdioriteelementalEntity::new).fireImmune().sized(0.5f, 1.5999999999999999f));
	public static final RegistryObject<EntityType<DioriteelementalEntity>> DIORITEELEMENTAL = register("dioriteelemental", EntityType.Builder.<DioriteelementalEntity>of(DioriteelementalEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DioriteelementalEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BigdioriteelementalEntity>> BIGDIORITEELEMENTAL = register("bigdioriteelemental", EntityType.Builder.<BigdioriteelementalEntity>of(BigdioriteelementalEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigdioriteelementalEntity::new).fireImmune().sized(0.7000000000000001f, 2f));
	public static final RegistryObject<EntityType<ObleckEntity>> OBLECK = register("obleck",
			EntityType.Builder.<ObleckEntity>of(ObleckEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ObleckEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<StatuewraithEntity>> STATUEWRAITH = register("statuewraith", EntityType.Builder.<StatuewraithEntity>of(StatuewraithEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StatuewraithEntity::new).fireImmune().sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<StatueprotectorEntity>> STATUEPROTECTOR = register("statueprotector", EntityType.Builder.<StatueprotectorEntity>of(StatueprotectorEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StatueprotectorEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MindobleckEntity>> MINDOBLECK = register("mindobleck",
			EntityType.Builder.<MindobleckEntity>of(MindobleckEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MindobleckEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<OblecklordEntity>> OBLECKLORD = register("oblecklord",
			EntityType.Builder.<OblecklordEntity>of(OblecklordEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(OblecklordEntity::new)

					.sized(0.9f, 2.1f));
	public static final RegistryObject<EntityType<CoalpuckEntity>> COALPUCK = register("coalpuck",
			EntityType.Builder.<CoalpuckEntity>of(CoalpuckEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CoalpuckEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<OblecklordeldritchEntity>> OBLECKLORDELDRITCH = register("oblecklordeldritch", EntityType.Builder.<OblecklordeldritchEntity>of(OblecklordeldritchEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OblecklordeldritchEntity::new).fireImmune().sized(1.4000000000000001f, 1.4000000000000001f));
	public static final RegistryObject<EntityType<ObleckturretEntity>> OBLECKTURRET = register("obleckturret",
			EntityType.Builder.<ObleckturretEntity>of(ObleckturretEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ObleckturretEntity::new)

					.sized(0.6f, 1.2999999999999998f));
	public static final RegistryObject<EntityType<ObleckturretEntityProjectile>> OBLECKTURRET_PROJECTILE = register("projectile_obleckturret", EntityType.Builder.<ObleckturretEntityProjectile>of(ObleckturretEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(ObleckturretEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CustombobberEntity>> CUSTOMBOBBER = register("custombobber", EntityType.Builder.<CustombobberEntity>of(CustombobberEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CustombobberEntity::new).fireImmune().sized(0.19999999999999998f, 0.2f));
	public static final RegistryObject<EntityType<MycenashroomvillagerFishermanEntity>> MYCENASHROOMVILLAGER_FISHERMAN = register("mycenashroomvillager_fisherman",
			EntityType.Builder.<MycenashroomvillagerFishermanEntity>of(MycenashroomvillagerFishermanEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MycenashroomvillagerFishermanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DragonewtEntity>> DRAGONEWT = register("dragonewt", EntityType.Builder.<DragonewtEntity>of(DragonewtEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
			.setUpdateInterval(3).setCustomClientFactory(DragonewtEntity::new).fireImmune().sized(1.2000000000000002f, 1.2000000000000002f));
	public static final RegistryObject<EntityType<DragoniteEntity>> DRAGONITE = register("dragonite", EntityType.Builder.<DragoniteEntity>of(DragoniteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(DragoniteEntity::new).fireImmune().sized(1.2000000000000002f, 1.2f));
	public static final RegistryObject<EntityType<MinoskullEntity>> MINOSKULL = register("minoskull",
			EntityType.Builder.<MinoskullEntity>of(MinoskullEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MinoskullEntity::new)

					.sized(1.6f, 2.7f));
	public static final RegistryObject<EntityType<PumpkinmimicEntity>> PUMPKINMIMIC = register("pumpkinmimic",
			EntityType.Builder.<PumpkinmimicEntity>of(PumpkinmimicEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PumpkinmimicEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<AscendedaspidEntity>> ASCENDEDASPID = register("ascendedaspid", EntityType.Builder.<AscendedaspidEntity>of(AscendedaspidEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AscendedaspidEntity::new).fireImmune().sized(0.5f, 1.2000000000000002f));
	public static final RegistryObject<EntityType<AscendedaspidEntityProjectile>> ASCENDEDASPID_PROJECTILE = register("projectile_ascendedaspid",
			EntityType.Builder.<AscendedaspidEntityProjectile>of(AscendedaspidEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(AscendedaspidEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShadowcandleEntity>> SHADOWCANDLE = register("shadowcandle", EntityType.Builder.<ShadowcandleEntity>of(ShadowcandleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadowcandleEntity::new).fireImmune().sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<BrightcandleEntity>> BRIGHTCANDLE = register("brightcandle", EntityType.Builder.<BrightcandleEntity>of(BrightcandleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BrightcandleEntity::new).fireImmune().sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<DarklurkerEntity>> DARKLURKER = register("darklurker",
			EntityType.Builder.<DarklurkerEntity>of(DarklurkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarklurkerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GnoblinEntity>> GNOBLIN = register("gnoblin",
			EntityType.Builder.<GnoblinEntity>of(GnoblinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GnoblinEntity::new)

					.sized(0.6f, 0.7999999999999999f));
	public static final RegistryObject<EntityType<DarkspiritEntity>> DARKSPIRIT = register("darkspirit",
			EntityType.Builder.<DarkspiritEntity>of(DarkspiritEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkspiritEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HalloweenspiritEntity>> HALLOWEENSPIRIT = register("halloweenspirit",
			EntityType.Builder.<HalloweenspiritEntity>of(HalloweenspiritEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HalloweenspiritEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StarryvillagergathererEntity>> STARRYVILLAGERGATHERER = register("starryvillagergatherer", EntityType.Builder.<StarryvillagergathererEntity>of(StarryvillagergathererEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StarryvillagergathererEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StarryvillagerblacksmithEntity>> STARRYVILLAGERBLACKSMITH = register("starryvillagerblacksmith",
			EntityType.Builder.<StarryvillagerblacksmithEntity>of(StarryvillagerblacksmithEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(StarryvillagerblacksmithEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StarryvillagerguardianEntity>> STARRYVILLAGERGUARDIAN = register("starryvillagerguardian", EntityType.Builder.<StarryvillagerguardianEntity>of(StarryvillagerguardianEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StarryvillagerguardianEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NetherstarvillagerdustyEntity>> NETHERSTARVILLAGERDUSTY = register("netherstarvillagerdusty",
			EntityType.Builder.<NetherstarvillagerdustyEntity>of(NetherstarvillagerdustyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(NetherstarvillagerdustyEntity::new).fireImmune().sized(0.7f, 1.7000000000000002f));
	public static final RegistryObject<EntityType<StarguardianstandEntity>> STARGUARDIANSTAND = register("starguardianstand", EntityType.Builder.<StarguardianstandEntity>of(StarguardianstandEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StarguardianstandEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HeatseekerEntity>> HEATSEEKER = register("heatseeker", EntityType.Builder.<HeatseekerEntity>of(HeatseekerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(HeatseekerEntity::new).fireImmune().sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<BlackstoneGrimaceEntity>> BLACKSTONE_GRIMACE = register("blackstone_grimace", EntityType.Builder.<BlackstoneGrimaceEntity>of(BlackstoneGrimaceEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlackstoneGrimaceEntity::new).fireImmune().sized(1.3f, 1.2999999999999998f));
	public static final RegistryObject<EntityType<StaticspriteEntity>> STATICSPRITE = register("staticsprite",
			EntityType.Builder.<StaticspriteEntity>of(StaticspriteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StaticspriteEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<CausticvialLiquidEntity>> CAUSTICVIAL_LIQUID = register("causticvial_liquid", EntityType.Builder.<CausticvialLiquidEntity>of(CausticvialLiquidEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CausticvialLiquidEntity::new).fireImmune().sized(0f, 0f));
	public static final RegistryObject<EntityType<GhostwarriorEntity>> GHOSTWARRIOR = register("ghostwarrior", EntityType.Builder.<GhostwarriorEntity>of(GhostwarriorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GhostwarriorEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PerinealbotflyEntity>> PERINEALBOTFLY = register("perinealbotfly",
			EntityType.Builder.<PerinealbotflyEntity>of(PerinealbotflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PerinealbotflyEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<PerinealbotflyminionEntity>> PERINEALBOTFLYMINION = register("perinealbotflyminion", EntityType.Builder.<PerinealbotflyminionEntity>of(PerinealbotflyminionEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PerinealbotflyminionEntity::new).fireImmune().sized(0.6f, 0.7999999999999999f));
	public static final RegistryObject<EntityType<CrystalcreeperEntity>> CRYSTALCREEPER = register("crystalcreeper", EntityType.Builder.<CrystalcreeperEntity>of(CrystalcreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrystalcreeperEntity::new).fireImmune().sized(0.6f, 1.6f));
	public static final RegistryObject<EntityType<BlueblazeEntity>> BLUEBLAZE = register("blueblaze", EntityType.Builder.<BlueblazeEntity>of(BlueblazeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(BlueblazeEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrystalhopperEntity>> CRYSTALHOPPER = register("crystalhopper", EntityType.Builder.<CrystalhopperEntity>of(CrystalhopperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrystalhopperEntity::new).fireImmune().sized(0.6f, 0.9f));
	public static final RegistryObject<EntityType<LargecrystalhopperEntity>> LARGECRYSTALHOPPER = register("largecrystalhopper", EntityType.Builder.<LargecrystalhopperEntity>of(LargecrystalhopperEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(LargecrystalhopperEntity::new).fireImmune().sized(1.3f, 2.4f));
	public static final RegistryObject<EntityType<SnyEntity>> SNY = register("sny",
			EntityType.Builder.<SnyEntity>of(SnyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnyEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<ObleckclericEntity>> OBLECKCLERIC = register("obleckcleric",
			EntityType.Builder.<ObleckclericEntity>of(ObleckclericEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ObleckclericEntity::new)

					.sized(0.6f, 1.4000000000000001f));
	public static final RegistryObject<EntityType<SmallObleckminionEntity>> SMALL_OBLECKMINION = register("small_obleckminion", EntityType.Builder.<SmallObleckminionEntity>of(SmallObleckminionEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SmallObleckminionEntity::new).fireImmune().sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<DizmiteEntity>> DIZMITE = register("dizmite",
			EntityType.Builder.<DizmiteEntity>of(DizmiteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DizmiteEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<OctolankEntity>> OCTOLANK = register("octolank",
			EntityType.Builder.<OctolankEntity>of(OctolankEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OctolankEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<NetherquartzchargerEntity>> NETHERQUARTZCHARGER = register("netherquartzcharger", EntityType.Builder.<NetherquartzchargerEntity>of(NetherquartzchargerEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NetherquartzchargerEntity::new).fireImmune().sized(1f, 1.4000000000000001f));
	public static final RegistryObject<EntityType<ShatteredobsidianchargerEntity>> SHATTEREDOBSIDIANCHARGER = register("shatteredobsidiancharger",
			EntityType.Builder.<ShatteredobsidianchargerEntity>of(ShatteredobsidianchargerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ShatteredobsidianchargerEntity::new).fireImmune().sized(1.4000000000000001f, 1.9f));
	public static final RegistryObject<EntityType<NetherumTitanEntity>> NETHERUM_TITAN = register("netherum_titan", EntityType.Builder.<NetherumTitanEntity>of(NetherumTitanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NetherumTitanEntity::new).fireImmune().sized(0.7999999999999999f, 0.8f));
	public static final RegistryObject<EntityType<NetherumleaperEntity>> NETHERUMLEAPER = register("netherumleaper", EntityType.Builder.<NetherumleaperEntity>of(NetherumleaperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NetherumleaperEntity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<ScrapguardiansmallEntity>> SCRAPGUARDIANSMALL = register("scrapguardiansmall", EntityType.Builder.<ScrapguardiansmallEntity>of(ScrapguardiansmallEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ScrapguardiansmallEntity::new).fireImmune().sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<ScrapguardianEntity>> SCRAPGUARDIAN = register("scrapguardian", EntityType.Builder.<ScrapguardianEntity>of(ScrapguardianEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ScrapguardianEntity::new).fireImmune().sized(2f, 2f));
	public static final RegistryObject<EntityType<DeadscrapguardianEntity>> DEADSCRAPGUARDIAN = register("deadscrapguardian", EntityType.Builder.<DeadscrapguardianEntity>of(DeadscrapguardianEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DeadscrapguardianEntity::new).fireImmune().sized(2f, 2f));
	public static final RegistryObject<EntityType<NetherstarflareEntity>> NETHERSTARFLARE = register("netherstarflare", EntityType.Builder.<NetherstarflareEntity>of(NetherstarflareEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NetherstarflareEntity::new).fireImmune().sized(0f, 0f));
	public static final RegistryObject<EntityType<Netherstarflare2Entity>> NETHERSTARFLARE_2 = register("netherstarflare_2", EntityType.Builder.<Netherstarflare2Entity>of(Netherstarflare2Entity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Netherstarflare2Entity::new).fireImmune().sized(0f, 0f));
	public static final RegistryObject<EntityType<EchoBerryEntity>> ECHO_BERRY = register("echo_berry",
			EntityType.Builder.<EchoBerryEntity>of(EchoBerryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(EchoBerryEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<RedsunpillarEntity>> REDSUNPILLAR = register("redsunpillar", EntityType.Builder.<RedsunpillarEntity>of(RedsunpillarEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(RedsunpillarEntity::new).fireImmune().sized(0f, 0f));
	public static final RegistryObject<EntityType<FoamfishEntity>> FOAMFISH = register("foamfish",
			EntityType.Builder.<FoamfishEntity>of(FoamfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FoamfishEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<BluejellyfloatEntity>> BLUEJELLYFLOAT = register("bluejellyfloat",
			EntityType.Builder.<BluejellyfloatEntity>of(BluejellyfloatEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(BluejellyfloatEntity::new)

					.sized(1.2000000000000002f, 2f));
	public static final RegistryObject<EntityType<GreenjellyfloatEntity>> GREENJELLYFLOAT = register("greenjellyfloat",
			EntityType.Builder.<GreenjellyfloatEntity>of(GreenjellyfloatEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GreenjellyfloatEntity::new)

					.sized(1.2000000000000002f, 2f));
	public static final RegistryObject<EntityType<RedjellyfloatEntity>> REDJELLYFLOAT = register("redjellyfloat",
			EntityType.Builder.<RedjellyfloatEntity>of(RedjellyfloatEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(RedjellyfloatEntity::new)

					.sized(1.2000000000000002f, 2f));
	public static final RegistryObject<EntityType<JellyEntity>> JELLY = register("jelly",
			EntityType.Builder.<JellyEntity>of(JellyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JellyEntity::new)

					.sized(1.2000000000000002f, 2f));
	public static final RegistryObject<EntityType<MotherorbEntity>> MOTHERORB = register("motherorb",
			EntityType.Builder.<MotherorbEntity>of(MotherorbEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(MotherorbEntity::new).fireImmune().sized(3f, 3f));
	public static final RegistryObject<EntityType<IvoryshadeEntity>> IVORYSHADE = register("ivoryshade", EntityType.Builder.<IvoryshadeEntity>of(IvoryshadeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(IvoryshadeEntity::new).fireImmune().sized(0.6f, 2f));
	public static final RegistryObject<EntityType<FluffwhaleEntity>> FLUFFWHALE = register("fluffwhale",
			EntityType.Builder.<FluffwhaleEntity>of(FluffwhaleEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(FluffwhaleEntity::new)

					.sized(1.6f, 1f));
	public static final RegistryObject<EntityType<ForceobleckEntity>> FORCEOBLECK = register("forceobleck",
			EntityType.Builder.<ForceobleckEntity>of(ForceobleckEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ForceobleckEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<SoulobleckEntity>> SOULOBLECK = register("soulobleck",
			EntityType.Builder.<SoulobleckEntity>of(SoulobleckEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SoulobleckEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<GlassbellboatEntityEntity>> GLASSBELLBOAT_ENTITY = register("glassbellboat_entity",
			EntityType.Builder.<GlassbellboatEntityEntity>of(GlassbellboatEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlassbellboatEntityEntity::new)

					.sized(1.6f, 1.5999999999999999f));
	public static final RegistryObject<EntityType<ArmoredturtleEntity>> ARMOREDTURTLE = register("armoredturtle",
			EntityType.Builder.<ArmoredturtleEntity>of(ArmoredturtleEntity::new, MobCategory.WATER_AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ArmoredturtleEntity::new)

					.sized(0.7f, 0.7000000000000001f));
	public static final RegistryObject<EntityType<SirenlingEntity>> SIRENLING = register("sirenling",
			EntityType.Builder.<SirenlingEntity>of(SirenlingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SirenlingEntity::new)

					.sized(1.2000000000000002f, 1f));
	public static final RegistryObject<EntityType<OstrachainEntity>> OSTRACHAIN = register("ostrachain",
			EntityType.Builder.<OstrachainEntity>of(OstrachainEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OstrachainEntity::new)

					.sized(0.7999999999999999f, 0.7999999999999999f));
	public static final RegistryObject<EntityType<RimeboidEntity>> RIMEBOID = register("rimeboid",
			EntityType.Builder.<RimeboidEntity>of(RimeboidEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RimeboidEntity::new)

					.sized(0.19999999999999998f, 0.19999999999999998f));
	public static final RegistryObject<EntityType<BubbleOBlueEntity>> BUBBLE_O_BLUE = register("bubble_o_blue",
			EntityType.Builder.<BubbleOBlueEntity>of(BubbleOBlueEntity::new, MobCategory.WATER_AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BubbleOBlueEntity::new)

					.sized(0.7999999999999999f, 1.8f));
	public static final RegistryObject<EntityType<TarwormEntity>> TARWORM = register("tarworm",
			EntityType.Builder.<TarwormEntity>of(TarwormEntity::new, MobCategory.WATER_AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TarwormEntity::new)

					.sized(0.7999999999999999f, 0.8f));
	public static final RegistryObject<EntityType<TarwormLinkEntity>> TARWORM_LINK = register("tarworm_link",
			EntityType.Builder.<TarwormLinkEntity>of(TarwormLinkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TarwormLinkEntity::new)

					.sized(0.7999999999999999f, 0.8f));
	public static final RegistryObject<EntityType<TarumbraEntity>> TARUMBRA = register("tarumbra", EntityType.Builder.<TarumbraEntity>of(TarumbraEntity::new, MobCategory.WATER_AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(TarumbraEntity::new).fireImmune().sized(1.4000000000000001f, 1.4000000000000001f));
	public static final RegistryObject<EntityType<UmbrasylSegmentEntity>> UMBRASYL_SEGMENT = register("umbrasyl_segment",
			EntityType.Builder.<UmbrasylSegmentEntity>of(UmbrasylSegmentEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(UmbrasylSegmentEntity::new)

					.sized(2.6f, 2.6f));
	public static final RegistryObject<EntityType<TarspiritEntity>> TARSPIRIT = register("tarspirit",
			EntityType.Builder.<TarspiritEntity>of(TarspiritEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TarspiritEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<RocketwormEntity>> ROCKETWORM = register("rocketworm", EntityType.Builder.<RocketwormEntity>of(RocketwormEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256)
			.setUpdateInterval(3).setCustomClientFactory(RocketwormEntity::new).fireImmune().sized(1.2000000000000002f, 1.2f));
	public static final RegistryObject<EntityType<BubbleEntity>> BUBBLE = register("bubble",
			EntityType.Builder.<BubbleEntity>of(BubbleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BubbleEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<KassemEntity>> KASSEM = register("kassem",
			EntityType.Builder.<KassemEntity>of(KassemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KassemEntity::new)

					.sized(0.6f, 1.5f));
	public static final RegistryObject<EntityType<TallkassemEntity>> TALLKASSEM = register("tallkassem",
			EntityType.Builder.<TallkassemEntity>of(TallkassemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TallkassemEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<BigkassemEntity>> BIGKASSEM = register("bigkassem",
			EntityType.Builder.<BigkassemEntity>of(BigkassemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigkassemEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<ArchkassemEntity>> ARCHKASSEM = register("archkassem",
			EntityType.Builder.<ArchkassemEntity>of(ArchkassemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ArchkassemEntity::new)

					.sized(0.6f, 1.5f));
	public static final RegistryObject<EntityType<ArachneelEntity>> ARACHNEEL = register("arachneel",
			EntityType.Builder.<ArachneelEntity>of(ArachneelEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ArachneelEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<ArachneelEntityProjectile>> ARACHNEEL_PROJECTILE = register("projectile_arachneel", EntityType.Builder.<ArachneelEntityProjectile>of(ArachneelEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(ArachneelEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SkeletalHeadHostEntity>> SKELETAL_HEAD_HOST = register("skeletal_head_host",
			EntityType.Builder.<SkeletalHeadHostEntity>of(SkeletalHeadHostEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkeletalHeadHostEntity::new)

					.sized(0.7f, 1.8f));
	public static final RegistryObject<EntityType<SkeletalHostEntity>> SKELETAL_HOST = register("skeletal_host",
			EntityType.Builder.<SkeletalHostEntity>of(SkeletalHostEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkeletalHostEntity::new)

					.sized(0.7f, 1.8f));
	public static final RegistryObject<EntityType<HeadHostEntity>> HEAD_HOST = register("head_host",
			EntityType.Builder.<HeadHostEntity>of(HeadHostEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HeadHostEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<DiscardedSkeletonEntity>> DISCARDED_SKELETON = register("discarded_skeleton",
			EntityType.Builder.<DiscardedSkeletonEntity>of(DiscardedSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DiscardedSkeletonEntity::new)

					.sized(1.2000000000000002f, 0.6f));
	public static final RegistryObject<EntityType<HeadlessDiscardedSkeletonEntity>> HEADLESS_DISCARDED_SKELETON = register("headless_discarded_skeleton",
			EntityType.Builder.<HeadlessDiscardedSkeletonEntity>of(HeadlessDiscardedSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(HeadlessDiscardedSkeletonEntity::new)

					.sized(1.2000000000000002f, 0.6f));
	public static final RegistryObject<EntityType<SpiderlingEntity>> SPIDERLING = register("spiderling",
			EntityType.Builder.<SpiderlingEntity>of(SpiderlingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpiderlingEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<GoldenSpiderlingEntity>> GOLDEN_SPIDERLING = register("golden_spiderling",
			EntityType.Builder.<GoldenSpiderlingEntity>of(GoldenSpiderlingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoldenSpiderlingEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<SpiderSwarmerEntity>> SPIDER_SWARMER = register("spider_swarmer",
			EntityType.Builder.<SpiderSwarmerEntity>of(SpiderSwarmerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpiderSwarmerEntity::new)

					.sized(0.7000000000000001f, 0.7000000000000001f));
	public static final RegistryObject<EntityType<SpidermatriarchEntity>> SPIDERMATRIARCH = register("spidermatriarch",
			EntityType.Builder.<SpidermatriarchEntity>of(SpidermatriarchEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpidermatriarchEntity::new)

					.sized(1.2f, 1.2000000000000002f));
	public static final RegistryObject<EntityType<SlumberingSoldierEntity>> SLUMBERING_SOLDIER = register("slumbering_soldier",
			EntityType.Builder.<SlumberingSoldierEntity>of(SlumberingSoldierEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SlumberingSoldierEntity::new)

					.sized(1f, 1.7f));
	public static final RegistryObject<EntityType<NightmareArbalestEntity>> NIGHTMARE_ARBALEST = register("nightmare_arbalest",
			EntityType.Builder.<NightmareArbalestEntity>of(NightmareArbalestEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareArbalestEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<NightmareMassEntity>> NIGHTMARE_MASS = register("nightmare_mass",
			EntityType.Builder.<NightmareMassEntity>of(NightmareMassEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareMassEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<SlumberinGeneralOrbEntity>> SLUMBERIN_GENERAL_ORB = register("slumberin_general_orb",
			EntityType.Builder.<SlumberinGeneralOrbEntity>of(SlumberinGeneralOrbEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SlumberinGeneralOrbEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<MycenansporessplashEntity>> MYCENANSPORESSPLASH = register("projectile_mycenansporessplash", EntityType.Builder.<MycenansporessplashEntity>of(MycenansporessplashEntity::new, MobCategory.MISC)
			.setCustomClientFactory(MycenansporessplashEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MycenansporeslingeringEntity>> MYCENANSPORESLINGERING = register("projectile_mycenansporeslingering",
			EntityType.Builder.<MycenansporeslingeringEntity>of(MycenansporeslingeringEntity::new, MobCategory.MISC).setCustomClientFactory(MycenansporeslingeringEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GreendemonEntity>> GREENDEMON = register("projectile_greendemon",
			EntityType.Builder.<GreendemonEntity>of(GreendemonEntity::new, MobCategory.MISC).setCustomClientFactory(GreendemonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ButterflybudfamiliarEntity>> BUTTERFLYBUDFAMILIAR = register("butterflybudfamiliar", EntityType.Builder.<ButterflybudfamiliarEntity>of(ButterflybudfamiliarEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(ButterflybudfamiliarEntity::new).fireImmune().sized(0.6f, 1.6f));
	public static final RegistryObject<EntityType<LousyswordfamiliarEntity>> LOUSYSWORDFAMILIAR = register("lousyswordfamiliar", EntityType.Builder.<LousyswordfamiliarEntity>of(LousyswordfamiliarEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(LousyswordfamiliarEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HiddenrunesfamiliarEntity>> HIDDENRUNESFAMILIAR = register("hiddenrunesfamiliar", EntityType.Builder.<HiddenrunesfamiliarEntity>of(HiddenrunesfamiliarEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(HiddenrunesfamiliarEntity::new).fireImmune().sized(0.6f, 1.6f));
	public static final RegistryObject<EntityType<SoulskullfamiliarEntity>> SOULSKULLFAMILIAR = register("soulskullfamiliar", EntityType.Builder.<SoulskullfamiliarEntity>of(SoulskullfamiliarEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(SoulskullfamiliarEntity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<TinyclaymanfamiliarEntity>> TINYCLAYMANFAMILIAR = register("tinyclaymanfamiliar", EntityType.Builder.<TinyclaymanfamiliarEntity>of(TinyclaymanfamiliarEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(TinyclaymanfamiliarEntity::new).fireImmune().sized(0.4f, 0.8f));
	public static final RegistryObject<EntityType<TheninefamiliarEntity>> THENINEFAMILIAR = register("theninefamiliar", EntityType.Builder.<TheninefamiliarEntity>of(TheninefamiliarEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(TheninefamiliarEntity::new).fireImmune().sized(0.7999999999999999f, 1.4000000000000001f));
	public static final RegistryObject<EntityType<BuzybeefamiliarEntity>> BUZYBEEFAMILIAR = register("buzybeefamiliar", EntityType.Builder.<BuzybeefamiliarEntity>of(BuzybeefamiliarEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(BuzybeefamiliarEntity::new).fireImmune().sized(0.7f, 1f));
	public static final RegistryObject<EntityType<ObsidianbobberEntEntity>> OBSIDIANBOBBER_ENT = register("obsidianbobber_ent", EntityType.Builder.<ObsidianbobberEntEntity>of(ObsidianbobberEntEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ObsidianbobberEntEntity::new).fireImmune().sized(0.19999999999999998f, 0.19999999999999998f));
	public static final RegistryObject<EntityType<CoalpuckfamiliarEntity>> COALPUCKFAMILIAR = register("coalpuckfamiliar", EntityType.Builder.<CoalpuckfamiliarEntity>of(CoalpuckfamiliarEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CoalpuckfamiliarEntity::new).fireImmune().sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<MinoskullflaibulletEntity>> MINOSKULLFLAIBULLET = register("minoskullflaibullet",
			EntityType.Builder.<MinoskullflaibulletEntity>of(MinoskullflaibulletEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MinoskullflaibulletEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<HarpoonbulletEntity>> HARPOONBULLET = register("harpoonbullet",
			EntityType.Builder.<HarpoonbulletEntity>of(HarpoonbulletEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HarpoonbulletEntity::new)

					.sized(0.2f, 0.19999999999999998f));
	public static final RegistryObject<EntityType<CthulhupetEntity>> CTHULHUPET = register("cthulhupet", EntityType.Builder.<CthulhupetEntity>of(CthulhupetEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(CthulhupetEntity::new).fireImmune().sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<ChromaticwheelBulletEntity>> CHROMATICWHEEL_BULLET = register("chromaticwheel_bullet", EntityType.Builder.<ChromaticwheelBulletEntity>of(ChromaticwheelBulletEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChromaticwheelBulletEntity::new).fireImmune().sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<BabyghastEntity>> BABYGHAST = register("babyghast", EntityType.Builder.<BabyghastEntity>of(BabyghastEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
			.setUpdateInterval(3).setCustomClientFactory(BabyghastEntity::new).fireImmune().sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<DeathswitnessEntity>> DEATHSWITNESS = register("deathswitness", EntityType.Builder.<DeathswitnessEntity>of(DeathswitnessEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DeathswitnessEntity::new).fireImmune().sized(2f, 2f));
	public static final RegistryObject<EntityType<MemorybobberEntityEntity>> MEMORYBOBBER_ENTITY = register("memorybobber_entity", EntityType.Builder.<MemorybobberEntityEntity>of(MemorybobberEntityEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MemorybobberEntityEntity::new).fireImmune().sized(0.30000000000000004f, 0.30000000000000004f));
	public static final RegistryObject<EntityType<Forgottenwatcher1Entity>> FORGOTTENWATCHER_1 = register("forgottenwatcher_1", EntityType.Builder.<Forgottenwatcher1Entity>of(Forgottenwatcher1Entity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(Forgottenwatcher1Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Forgottenwatcher2Entity>> FORGOTTENWATCHER_2 = register("forgottenwatcher_2", EntityType.Builder.<Forgottenwatcher2Entity>of(Forgottenwatcher2Entity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(Forgottenwatcher2Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WindyshoreFlare1Entity>> WINDYSHORE_FLARE_1 = register("windyshore_flare_1", EntityType.Builder.<WindyshoreFlare1Entity>of(WindyshoreFlare1Entity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(WindyshoreFlare1Entity::new).fireImmune().sized(0f, 0f));
	public static final RegistryObject<EntityType<WindyshoresCloudEntity>> WINDYSHORES_CLOUD = register("windyshores_cloud",
			EntityType.Builder.<WindyshoresCloudEntity>of(WindyshoresCloudEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3).setCustomClientFactory(WindyshoresCloudEntity::new)

					.sized(1.4000000000000001f, 0.8f));
	public static final RegistryObject<EntityType<OstrachainLinkEntity>> OSTRACHAIN_LINK = register("ostrachain_link",
			EntityType.Builder.<OstrachainLinkEntity>of(OstrachainLinkEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OstrachainLinkEntity::new)

					.sized(0.7999999999999999f, 0.7999999999999999f));
	public static final RegistryObject<EntityType<MagtunaBusterFirestormBallEntity>> MAGTUNA_BUSTER_FIRESTORM_BALL = register("magtuna_buster_firestorm_ball",
			EntityType.Builder.<MagtunaBusterFirestormBallEntity>of(MagtunaBusterFirestormBallEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MagtunaBusterFirestormBallEntity::new).fireImmune().sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<NightmareSpikeEntity>> NIGHTMARE_SPIKE = register("nightmare_spike", EntityType.Builder.<NightmareSpikeEntity>of(NightmareSpikeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareSpikeEntity::new).fireImmune().sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<OceanangelEntity>> OCEANANGEL = register("oceanangel", EntityType.Builder.<OceanangelEntity>of(OceanangelEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(OceanangelEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			IronknightEntity.init();
			TwistedknightEntity.init();
			GreedyknightEntity.init();
			CausticknightEntity.init();
			CruelknightEntity.init();
			CandleKnightEntity.init();
			SpectreknightEntity.init();
			KingsknightEntity.init();
			LargejellyEntity.init();
			UmbrasylEntity.init();
			SirenqueenEntity.init();
			SpiderQueenEntity.init();
			SlumberingGeneralEntity.init();
			MycenashroomvillagerNitwitEntity.init();
			MycenashroomguardEntity.init();
			MycenainfectedshroomguardEntity.init();
			MycenashroomvillagerleatherworkerEntity.init();
			MycenashroomvillagerblacksmithEntity.init();
			MycenashroomvillagerlibrarianEntity.init();
			MycenashroomvillagerpriestEntity.init();
			MycenashroomvillagerelderEntity.init();
			MycenashroomlingEntity.init();
			MycenasporelingEntity.init();
			MycenashroomalEntity.init();
			MycenashroomlordEntity.init();
			MycenafumoonEntity.init();
			MycenafumoonsporeEntity.init();
			MycenaroamerEntity.init();
			MycenasporeslingeringcloudEntity.init();
			MycenafumoonshroomlingEntity.init();
			MycenatruffloonEntity.init();
			MycenatrufflingEntity.init();
			MycenafumoonsporelingEntity.init();
			MycenafumoonshroomlordEntity.init();
			MycenashroomvillagerfarmerEntity.init();
			PapyscrownfamiliarEntity.init();
			SunlighteggfamiliarEntity.init();
			CosmicslimefamiliarEntity.init();
			BiggranitelementalEntity.init();
			GraniteelementalEntity.init();
			SmallgraniteelementalEntity.init();
			BigandesiteelementalEntity.init();
			AndesiteelementalEntity.init();
			WeakandesiteelementalEntity.init();
			WeakdioriteelementalEntity.init();
			DioriteelementalEntity.init();
			BigdioriteelementalEntity.init();
			ObleckEntity.init();
			StatuewraithEntity.init();
			StatueprotectorEntity.init();
			MindobleckEntity.init();
			OblecklordEntity.init();
			CoalpuckEntity.init();
			OblecklordeldritchEntity.init();
			ObleckturretEntity.init();
			CustombobberEntity.init();
			MycenashroomvillagerFishermanEntity.init();
			DragonewtEntity.init();
			DragoniteEntity.init();
			MinoskullEntity.init();
			PumpkinmimicEntity.init();
			AscendedaspidEntity.init();
			ShadowcandleEntity.init();
			BrightcandleEntity.init();
			DarklurkerEntity.init();
			GnoblinEntity.init();
			DarkspiritEntity.init();
			HalloweenspiritEntity.init();
			StarryvillagergathererEntity.init();
			StarryvillagerblacksmithEntity.init();
			StarryvillagerguardianEntity.init();
			NetherstarvillagerdustyEntity.init();
			StarguardianstandEntity.init();
			HeatseekerEntity.init();
			BlackstoneGrimaceEntity.init();
			StaticspriteEntity.init();
			CausticvialLiquidEntity.init();
			GhostwarriorEntity.init();
			PerinealbotflyEntity.init();
			PerinealbotflyminionEntity.init();
			CrystalcreeperEntity.init();
			BlueblazeEntity.init();
			CrystalhopperEntity.init();
			LargecrystalhopperEntity.init();
			SnyEntity.init();
			ObleckclericEntity.init();
			SmallObleckminionEntity.init();
			DizmiteEntity.init();
			OctolankEntity.init();
			NetherquartzchargerEntity.init();
			ShatteredobsidianchargerEntity.init();
			NetherumTitanEntity.init();
			NetherumleaperEntity.init();
			ScrapguardiansmallEntity.init();
			ScrapguardianEntity.init();
			DeadscrapguardianEntity.init();
			NetherstarflareEntity.init();
			Netherstarflare2Entity.init();
			EchoBerryEntity.init();
			RedsunpillarEntity.init();
			FoamfishEntity.init();
			BluejellyfloatEntity.init();
			GreenjellyfloatEntity.init();
			RedjellyfloatEntity.init();
			JellyEntity.init();
			MotherorbEntity.init();
			IvoryshadeEntity.init();
			FluffwhaleEntity.init();
			ForceobleckEntity.init();
			SoulobleckEntity.init();
			GlassbellboatEntityEntity.init();
			ArmoredturtleEntity.init();
			SirenlingEntity.init();
			OstrachainEntity.init();
			RimeboidEntity.init();
			BubbleOBlueEntity.init();
			TarwormEntity.init();
			TarwormLinkEntity.init();
			TarumbraEntity.init();
			UmbrasylSegmentEntity.init();
			TarspiritEntity.init();
			RocketwormEntity.init();
			BubbleEntity.init();
			KassemEntity.init();
			TallkassemEntity.init();
			BigkassemEntity.init();
			ArchkassemEntity.init();
			ArachneelEntity.init();
			SkeletalHeadHostEntity.init();
			SkeletalHostEntity.init();
			HeadHostEntity.init();
			DiscardedSkeletonEntity.init();
			HeadlessDiscardedSkeletonEntity.init();
			SpiderlingEntity.init();
			GoldenSpiderlingEntity.init();
			SpiderSwarmerEntity.init();
			SpidermatriarchEntity.init();
			SlumberingSoldierEntity.init();
			NightmareArbalestEntity.init();
			NightmareMassEntity.init();
			SlumberinGeneralOrbEntity.init();
			ButterflybudfamiliarEntity.init();
			LousyswordfamiliarEntity.init();
			HiddenrunesfamiliarEntity.init();
			SoulskullfamiliarEntity.init();
			TinyclaymanfamiliarEntity.init();
			TheninefamiliarEntity.init();
			BuzybeefamiliarEntity.init();
			ObsidianbobberEntEntity.init();
			CoalpuckfamiliarEntity.init();
			MinoskullflaibulletEntity.init();
			HarpoonbulletEntity.init();
			CthulhupetEntity.init();
			ChromaticwheelBulletEntity.init();
			BabyghastEntity.init();
			DeathswitnessEntity.init();
			MemorybobberEntityEntity.init();
			Forgottenwatcher1Entity.init();
			Forgottenwatcher2Entity.init();
			WindyshoreFlare1Entity.init();
			WindyshoresCloudEntity.init();
			OstrachainLinkEntity.init();
			MagtunaBusterFirestormBallEntity.init();
			NightmareSpikeEntity.init();
			OceanangelEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(IRONKNIGHT.get(), IronknightEntity.createAttributes().build());
		event.put(TWISTEDKNIGHT.get(), TwistedknightEntity.createAttributes().build());
		event.put(GREEDYKNIGHT.get(), GreedyknightEntity.createAttributes().build());
		event.put(CAUSTICKNIGHT.get(), CausticknightEntity.createAttributes().build());
		event.put(CRUELKNIGHT.get(), CruelknightEntity.createAttributes().build());
		event.put(CANDLE_KNIGHT.get(), CandleKnightEntity.createAttributes().build());
		event.put(SPECTREKNIGHT.get(), SpectreknightEntity.createAttributes().build());
		event.put(KINGSKNIGHT.get(), KingsknightEntity.createAttributes().build());
		event.put(LARGEJELLY.get(), LargejellyEntity.createAttributes().build());
		event.put(UMBRASYL.get(), UmbrasylEntity.createAttributes().build());
		event.put(SIRENQUEEN.get(), SirenqueenEntity.createAttributes().build());
		event.put(SPIDER_QUEEN.get(), SpiderQueenEntity.createAttributes().build());
		event.put(SLUMBERING_GENERAL.get(), SlumberingGeneralEntity.createAttributes().build());
		event.put(MYCENASHROOMVILLAGER_NITWIT.get(), MycenashroomvillagerNitwitEntity.createAttributes().build());
		event.put(MYCENASHROOMGUARD.get(), MycenashroomguardEntity.createAttributes().build());
		event.put(MYCENAINFECTEDSHROOMGUARD.get(), MycenainfectedshroomguardEntity.createAttributes().build());
		event.put(MYCENASHROOMVILLAGERLEATHERWORKER.get(), MycenashroomvillagerleatherworkerEntity.createAttributes().build());
		event.put(MYCENASHROOMVILLAGERBLACKSMITH.get(), MycenashroomvillagerblacksmithEntity.createAttributes().build());
		event.put(MYCENASHROOMVILLAGERLIBRARIAN.get(), MycenashroomvillagerlibrarianEntity.createAttributes().build());
		event.put(MYCENASHROOMVILLAGERPRIEST.get(), MycenashroomvillagerpriestEntity.createAttributes().build());
		event.put(MYCENASHROOMVILLAGERELDER.get(), MycenashroomvillagerelderEntity.createAttributes().build());
		event.put(MYCENASHROOMLING.get(), MycenashroomlingEntity.createAttributes().build());
		event.put(MYCENASPORELING.get(), MycenasporelingEntity.createAttributes().build());
		event.put(MYCENASHROOMAL.get(), MycenashroomalEntity.createAttributes().build());
		event.put(MYCENASHROOMLORD.get(), MycenashroomlordEntity.createAttributes().build());
		event.put(MYCENAFUMOON.get(), MycenafumoonEntity.createAttributes().build());
		event.put(MYCENAFUMOONSPORE.get(), MycenafumoonsporeEntity.createAttributes().build());
		event.put(MYCENAROAMER.get(), MycenaroamerEntity.createAttributes().build());
		event.put(MYCENASPORESLINGERINGCLOUD.get(), MycenasporeslingeringcloudEntity.createAttributes().build());
		event.put(MYCENAFUMOONSHROOMLING.get(), MycenafumoonshroomlingEntity.createAttributes().build());
		event.put(MYCENATRUFFLOON.get(), MycenatruffloonEntity.createAttributes().build());
		event.put(MYCENATRUFFLING.get(), MycenatrufflingEntity.createAttributes().build());
		event.put(MYCENAFUMOONSPORELING.get(), MycenafumoonsporelingEntity.createAttributes().build());
		event.put(MYCENAFUMOONSHROOMLORD.get(), MycenafumoonshroomlordEntity.createAttributes().build());
		event.put(MYCENASHROOMVILLAGERFARMER.get(), MycenashroomvillagerfarmerEntity.createAttributes().build());
		event.put(PAPYSCROWNFAMILIAR.get(), PapyscrownfamiliarEntity.createAttributes().build());
		event.put(SUNLIGHTEGGFAMILIAR.get(), SunlighteggfamiliarEntity.createAttributes().build());
		event.put(COSMICSLIMEFAMILIAR.get(), CosmicslimefamiliarEntity.createAttributes().build());
		event.put(BIGGRANITELEMENTAL.get(), BiggranitelementalEntity.createAttributes().build());
		event.put(GRANITEELEMENTAL.get(), GraniteelementalEntity.createAttributes().build());
		event.put(SMALLGRANITEELEMENTAL.get(), SmallgraniteelementalEntity.createAttributes().build());
		event.put(BIGANDESITEELEMENTAL.get(), BigandesiteelementalEntity.createAttributes().build());
		event.put(ANDESITEELEMENTAL.get(), AndesiteelementalEntity.createAttributes().build());
		event.put(WEAKANDESITEELEMENTAL.get(), WeakandesiteelementalEntity.createAttributes().build());
		event.put(WEAKDIORITEELEMENTAL.get(), WeakdioriteelementalEntity.createAttributes().build());
		event.put(DIORITEELEMENTAL.get(), DioriteelementalEntity.createAttributes().build());
		event.put(BIGDIORITEELEMENTAL.get(), BigdioriteelementalEntity.createAttributes().build());
		event.put(OBLECK.get(), ObleckEntity.createAttributes().build());
		event.put(STATUEWRAITH.get(), StatuewraithEntity.createAttributes().build());
		event.put(STATUEPROTECTOR.get(), StatueprotectorEntity.createAttributes().build());
		event.put(MINDOBLECK.get(), MindobleckEntity.createAttributes().build());
		event.put(OBLECKLORD.get(), OblecklordEntity.createAttributes().build());
		event.put(COALPUCK.get(), CoalpuckEntity.createAttributes().build());
		event.put(OBLECKLORDELDRITCH.get(), OblecklordeldritchEntity.createAttributes().build());
		event.put(OBLECKTURRET.get(), ObleckturretEntity.createAttributes().build());
		event.put(CUSTOMBOBBER.get(), CustombobberEntity.createAttributes().build());
		event.put(MYCENASHROOMVILLAGER_FISHERMAN.get(), MycenashroomvillagerFishermanEntity.createAttributes().build());
		event.put(DRAGONEWT.get(), DragonewtEntity.createAttributes().build());
		event.put(DRAGONITE.get(), DragoniteEntity.createAttributes().build());
		event.put(MINOSKULL.get(), MinoskullEntity.createAttributes().build());
		event.put(PUMPKINMIMIC.get(), PumpkinmimicEntity.createAttributes().build());
		event.put(ASCENDEDASPID.get(), AscendedaspidEntity.createAttributes().build());
		event.put(SHADOWCANDLE.get(), ShadowcandleEntity.createAttributes().build());
		event.put(BRIGHTCANDLE.get(), BrightcandleEntity.createAttributes().build());
		event.put(DARKLURKER.get(), DarklurkerEntity.createAttributes().build());
		event.put(GNOBLIN.get(), GnoblinEntity.createAttributes().build());
		event.put(DARKSPIRIT.get(), DarkspiritEntity.createAttributes().build());
		event.put(HALLOWEENSPIRIT.get(), HalloweenspiritEntity.createAttributes().build());
		event.put(STARRYVILLAGERGATHERER.get(), StarryvillagergathererEntity.createAttributes().build());
		event.put(STARRYVILLAGERBLACKSMITH.get(), StarryvillagerblacksmithEntity.createAttributes().build());
		event.put(STARRYVILLAGERGUARDIAN.get(), StarryvillagerguardianEntity.createAttributes().build());
		event.put(NETHERSTARVILLAGERDUSTY.get(), NetherstarvillagerdustyEntity.createAttributes().build());
		event.put(STARGUARDIANSTAND.get(), StarguardianstandEntity.createAttributes().build());
		event.put(HEATSEEKER.get(), HeatseekerEntity.createAttributes().build());
		event.put(BLACKSTONE_GRIMACE.get(), BlackstoneGrimaceEntity.createAttributes().build());
		event.put(STATICSPRITE.get(), StaticspriteEntity.createAttributes().build());
		event.put(CAUSTICVIAL_LIQUID.get(), CausticvialLiquidEntity.createAttributes().build());
		event.put(GHOSTWARRIOR.get(), GhostwarriorEntity.createAttributes().build());
		event.put(PERINEALBOTFLY.get(), PerinealbotflyEntity.createAttributes().build());
		event.put(PERINEALBOTFLYMINION.get(), PerinealbotflyminionEntity.createAttributes().build());
		event.put(CRYSTALCREEPER.get(), CrystalcreeperEntity.createAttributes().build());
		event.put(BLUEBLAZE.get(), BlueblazeEntity.createAttributes().build());
		event.put(CRYSTALHOPPER.get(), CrystalhopperEntity.createAttributes().build());
		event.put(LARGECRYSTALHOPPER.get(), LargecrystalhopperEntity.createAttributes().build());
		event.put(SNY.get(), SnyEntity.createAttributes().build());
		event.put(OBLECKCLERIC.get(), ObleckclericEntity.createAttributes().build());
		event.put(SMALL_OBLECKMINION.get(), SmallObleckminionEntity.createAttributes().build());
		event.put(DIZMITE.get(), DizmiteEntity.createAttributes().build());
		event.put(OCTOLANK.get(), OctolankEntity.createAttributes().build());
		event.put(NETHERQUARTZCHARGER.get(), NetherquartzchargerEntity.createAttributes().build());
		event.put(SHATTEREDOBSIDIANCHARGER.get(), ShatteredobsidianchargerEntity.createAttributes().build());
		event.put(NETHERUM_TITAN.get(), NetherumTitanEntity.createAttributes().build());
		event.put(NETHERUMLEAPER.get(), NetherumleaperEntity.createAttributes().build());
		event.put(SCRAPGUARDIANSMALL.get(), ScrapguardiansmallEntity.createAttributes().build());
		event.put(SCRAPGUARDIAN.get(), ScrapguardianEntity.createAttributes().build());
		event.put(DEADSCRAPGUARDIAN.get(), DeadscrapguardianEntity.createAttributes().build());
		event.put(NETHERSTARFLARE.get(), NetherstarflareEntity.createAttributes().build());
		event.put(NETHERSTARFLARE_2.get(), Netherstarflare2Entity.createAttributes().build());
		event.put(ECHO_BERRY.get(), EchoBerryEntity.createAttributes().build());
		event.put(REDSUNPILLAR.get(), RedsunpillarEntity.createAttributes().build());
		event.put(FOAMFISH.get(), FoamfishEntity.createAttributes().build());
		event.put(BLUEJELLYFLOAT.get(), BluejellyfloatEntity.createAttributes().build());
		event.put(GREENJELLYFLOAT.get(), GreenjellyfloatEntity.createAttributes().build());
		event.put(REDJELLYFLOAT.get(), RedjellyfloatEntity.createAttributes().build());
		event.put(JELLY.get(), JellyEntity.createAttributes().build());
		event.put(MOTHERORB.get(), MotherorbEntity.createAttributes().build());
		event.put(IVORYSHADE.get(), IvoryshadeEntity.createAttributes().build());
		event.put(FLUFFWHALE.get(), FluffwhaleEntity.createAttributes().build());
		event.put(FORCEOBLECK.get(), ForceobleckEntity.createAttributes().build());
		event.put(SOULOBLECK.get(), SoulobleckEntity.createAttributes().build());
		event.put(GLASSBELLBOAT_ENTITY.get(), GlassbellboatEntityEntity.createAttributes().build());
		event.put(ARMOREDTURTLE.get(), ArmoredturtleEntity.createAttributes().build());
		event.put(SIRENLING.get(), SirenlingEntity.createAttributes().build());
		event.put(OSTRACHAIN.get(), OstrachainEntity.createAttributes().build());
		event.put(RIMEBOID.get(), RimeboidEntity.createAttributes().build());
		event.put(BUBBLE_O_BLUE.get(), BubbleOBlueEntity.createAttributes().build());
		event.put(TARWORM.get(), TarwormEntity.createAttributes().build());
		event.put(TARWORM_LINK.get(), TarwormLinkEntity.createAttributes().build());
		event.put(TARUMBRA.get(), TarumbraEntity.createAttributes().build());
		event.put(UMBRASYL_SEGMENT.get(), UmbrasylSegmentEntity.createAttributes().build());
		event.put(TARSPIRIT.get(), TarspiritEntity.createAttributes().build());
		event.put(ROCKETWORM.get(), RocketwormEntity.createAttributes().build());
		event.put(BUBBLE.get(), BubbleEntity.createAttributes().build());
		event.put(KASSEM.get(), KassemEntity.createAttributes().build());
		event.put(TALLKASSEM.get(), TallkassemEntity.createAttributes().build());
		event.put(BIGKASSEM.get(), BigkassemEntity.createAttributes().build());
		event.put(ARCHKASSEM.get(), ArchkassemEntity.createAttributes().build());
		event.put(ARACHNEEL.get(), ArachneelEntity.createAttributes().build());
		event.put(SKELETAL_HEAD_HOST.get(), SkeletalHeadHostEntity.createAttributes().build());
		event.put(SKELETAL_HOST.get(), SkeletalHostEntity.createAttributes().build());
		event.put(HEAD_HOST.get(), HeadHostEntity.createAttributes().build());
		event.put(DISCARDED_SKELETON.get(), DiscardedSkeletonEntity.createAttributes().build());
		event.put(HEADLESS_DISCARDED_SKELETON.get(), HeadlessDiscardedSkeletonEntity.createAttributes().build());
		event.put(SPIDERLING.get(), SpiderlingEntity.createAttributes().build());
		event.put(GOLDEN_SPIDERLING.get(), GoldenSpiderlingEntity.createAttributes().build());
		event.put(SPIDER_SWARMER.get(), SpiderSwarmerEntity.createAttributes().build());
		event.put(SPIDERMATRIARCH.get(), SpidermatriarchEntity.createAttributes().build());
		event.put(SLUMBERING_SOLDIER.get(), SlumberingSoldierEntity.createAttributes().build());
		event.put(NIGHTMARE_ARBALEST.get(), NightmareArbalestEntity.createAttributes().build());
		event.put(NIGHTMARE_MASS.get(), NightmareMassEntity.createAttributes().build());
		event.put(SLUMBERIN_GENERAL_ORB.get(), SlumberinGeneralOrbEntity.createAttributes().build());
		event.put(BUTTERFLYBUDFAMILIAR.get(), ButterflybudfamiliarEntity.createAttributes().build());
		event.put(LOUSYSWORDFAMILIAR.get(), LousyswordfamiliarEntity.createAttributes().build());
		event.put(HIDDENRUNESFAMILIAR.get(), HiddenrunesfamiliarEntity.createAttributes().build());
		event.put(SOULSKULLFAMILIAR.get(), SoulskullfamiliarEntity.createAttributes().build());
		event.put(TINYCLAYMANFAMILIAR.get(), TinyclaymanfamiliarEntity.createAttributes().build());
		event.put(THENINEFAMILIAR.get(), TheninefamiliarEntity.createAttributes().build());
		event.put(BUZYBEEFAMILIAR.get(), BuzybeefamiliarEntity.createAttributes().build());
		event.put(OBSIDIANBOBBER_ENT.get(), ObsidianbobberEntEntity.createAttributes().build());
		event.put(COALPUCKFAMILIAR.get(), CoalpuckfamiliarEntity.createAttributes().build());
		event.put(MINOSKULLFLAIBULLET.get(), MinoskullflaibulletEntity.createAttributes().build());
		event.put(HARPOONBULLET.get(), HarpoonbulletEntity.createAttributes().build());
		event.put(CTHULHUPET.get(), CthulhupetEntity.createAttributes().build());
		event.put(CHROMATICWHEEL_BULLET.get(), ChromaticwheelBulletEntity.createAttributes().build());
		event.put(BABYGHAST.get(), BabyghastEntity.createAttributes().build());
		event.put(DEATHSWITNESS.get(), DeathswitnessEntity.createAttributes().build());
		event.put(MEMORYBOBBER_ENTITY.get(), MemorybobberEntityEntity.createAttributes().build());
		event.put(FORGOTTENWATCHER_1.get(), Forgottenwatcher1Entity.createAttributes().build());
		event.put(FORGOTTENWATCHER_2.get(), Forgottenwatcher2Entity.createAttributes().build());
		event.put(WINDYSHORE_FLARE_1.get(), WindyshoreFlare1Entity.createAttributes().build());
		event.put(WINDYSHORES_CLOUD.get(), WindyshoresCloudEntity.createAttributes().build());
		event.put(OSTRACHAIN_LINK.get(), OstrachainLinkEntity.createAttributes().build());
		event.put(MAGTUNA_BUSTER_FIRESTORM_BALL.get(), MagtunaBusterFirestormBallEntity.createAttributes().build());
		event.put(NIGHTMARE_SPIKE.get(), NightmareSpikeEntity.createAttributes().build());
		event.put(OCEANANGEL.get(), OceanangelEntity.createAttributes().build());
	}
}
