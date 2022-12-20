
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.elementure.world.features.plants.WildsunberrybushFeature;
import net.mcreator.elementure.world.features.plants.WildstrawberrybushFeature;
import net.mcreator.elementure.world.features.plants.WildperryberryFeature;
import net.mcreator.elementure.world.features.plants.WildgobberrybushFeature;
import net.mcreator.elementure.world.features.plants.WildcoldberrybushFeature;
import net.mcreator.elementure.world.features.plants.WildblueberryFeature;
import net.mcreator.elementure.world.features.plants.WildbilborrybushFeature;
import net.mcreator.elementure.world.features.plants.WildbeestingberrybushFeature;
import net.mcreator.elementure.world.features.plants.PurplemushroomsFeature;
import net.mcreator.elementure.world.features.ores.VamiteoreFeature;
import net.mcreator.elementure.world.features.ores.ShimmeringoreFeature;
import net.mcreator.elementure.world.features.ores.NoobiumoreFeature;
import net.mcreator.elementure.world.features.ores.MerthiumoreFeature;
import net.mcreator.elementure.world.features.ores.FlutaniteoreFeature;
import net.mcreator.elementure.world.features.ores.FerziumoreFeature;
import net.mcreator.elementure.world.features.ores.DeepvamiteoreFeature;
import net.mcreator.elementure.world.features.ores.DeepshimmeringoreFeature;
import net.mcreator.elementure.world.features.ores.DeepnoobiumoreFeature;
import net.mcreator.elementure.world.features.ores.DeepmerthiumoreFeature;
import net.mcreator.elementure.world.features.ores.DeepflutaniteoreFeature;
import net.mcreator.elementure.world.features.ores.DeepferziumoreFeature;
import net.mcreator.elementure.world.features.WindyshoresFeature;
import net.mcreator.elementure.world.features.VillagerstatueFeature;
import net.mcreator.elementure.world.features.SwordtempleFeature;
import net.mcreator.elementure.world.features.SubmergedtempleFeature;
import net.mcreator.elementure.world.features.RunicwatershrineFeature;
import net.mcreator.elementure.world.features.RuniclightningshrineFeature;
import net.mcreator.elementure.world.features.RunicfireshrineFeature;
import net.mcreator.elementure.world.features.RunicearthshrineFeature;
import net.mcreator.elementure.world.features.RunicairshrineFeature;
import net.mcreator.elementure.world.features.RuingranitebiomeFeature;
import net.mcreator.elementure.world.features.RedsunshrineFeature;
import net.mcreator.elementure.world.features.RagdollarenaFeature;
import net.mcreator.elementure.world.features.PurplemushroombigFeature;
import net.mcreator.elementure.world.features.PumpkinobleckSpawnerFeature;
import net.mcreator.elementure.world.features.NetherstarSpawnFeature;
import net.mcreator.elementure.world.features.MycenabiomebaseblockFeature;
import net.mcreator.elementure.world.features.MemorygrottoSpawnFeature;
import net.mcreator.elementure.world.features.LostcraftingtableFeature;
import net.mcreator.elementure.world.features.LightningandesitebiomeFeature;
import net.mcreator.elementure.world.features.JellyfloatsmallGenFeature;
import net.mcreator.elementure.world.features.JellyfloatlargeGenFeature;
import net.mcreator.elementure.world.features.GrayskullLakeFeature;
import net.mcreator.elementure.world.features.FrostyicearenaFeature;
import net.mcreator.elementure.world.features.FlutanitefloatingchunkFeature;
import net.mcreator.elementure.world.features.EnergydioritebiomeFeature;
import net.mcreator.elementure.world.features.DiverscrownFeature;
import net.mcreator.elementure.world.features.Desertruins1Feature;
import net.mcreator.elementure.world.features.DeepruinsRandomFeature;
import net.mcreator.elementure.world.features.DeepruinsFeature;
import net.mcreator.elementure.world.features.CuriousMonolith3Feature;
import net.mcreator.elementure.world.features.CuriousMonolith2Feature;
import net.mcreator.elementure.world.features.CuriousMonolith1Feature;
import net.mcreator.elementure.world.features.CuriousCartFeature;
import net.mcreator.elementure.world.features.CuriousBoatFeature;
import net.mcreator.elementure.world.features.Campfire1Feature;
import net.mcreator.elementure.world.features.BuriedswordstructureFeature;
import net.mcreator.elementure.world.features.BoulderswordFeature;
import net.mcreator.elementure.world.features.BouldersOWFeature;
import net.mcreator.elementure.world.features.Boulder2Feature;
import net.mcreator.elementure.world.features.Boulder1Feature;
import net.mcreator.elementure.world.features.BeaconTowerFeature;
import net.mcreator.elementure.world.features.AbandonnedfarmFeature;
import net.mcreator.elementure.ElementureMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class ElementureModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ElementureMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> VAMITEORE = register("vamiteore", VamiteoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, VamiteoreFeature.GENERATE_BIOMES, VamiteoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NOOBIUMORE = register("noobiumore", NoobiumoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NoobiumoreFeature.GENERATE_BIOMES, NoobiumoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FLUTANITEORE = register("flutaniteore", FlutaniteoreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, FlutaniteoreFeature.GENERATE_BIOMES, FlutaniteoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FERZIUMORE = register("ferziumore", FerziumoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, FerziumoreFeature.GENERATE_BIOMES, FerziumoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MERTHIUMORE = register("merthiumore", MerthiumoreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, MerthiumoreFeature.GENERATE_BIOMES, MerthiumoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WILDBLUEBERRY = register("wildblueberry", WildblueberryFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, WildblueberryFeature.GENERATE_BIOMES, WildblueberryFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WILDPERRYBERRY = register("wildperryberry", WildperryberryFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, WildperryberryFeature.GENERATE_BIOMES,
					WildperryberryFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WILDBEESTINGBERRYBUSH = register("wildbeestingberrybush", WildbeestingberrybushFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, WildbeestingberrybushFeature.GENERATE_BIOMES,
					WildbeestingberrybushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WILDSTRAWBERRYBUSH = register("wildstrawberrybush", WildstrawberrybushFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, WildstrawberrybushFeature.GENERATE_BIOMES,
					WildstrawberrybushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RAGDOLLARENA = register("ragdollarena", RagdollarenaFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, RagdollarenaFeature.GENERATE_BIOMES, RagdollarenaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FROSTYICEARENA = register("frostyicearena", FrostyicearenaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, FrostyicearenaFeature.GENERATE_BIOMES,
					FrostyicearenaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VILLAGERSTATUE = register("villagerstatue", VillagerstatueFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, VillagerstatueFeature.GENERATE_BIOMES,
					VillagerstatueFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FLUTANITEFLOATINGCHUNK = register("flutanitefloatingchunk", FlutanitefloatingchunkFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, FlutanitefloatingchunkFeature.GENERATE_BIOMES,
					FlutanitefloatingchunkFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUNICFIRESHRINE = register("runicfireshrine", RunicfireshrineFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, RunicfireshrineFeature.GENERATE_BIOMES,
					RunicfireshrineFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUNICWATERSHRINE = register("runicwatershrine", RunicwatershrineFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, RunicwatershrineFeature.GENERATE_BIOMES,
					RunicwatershrineFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUNICLIGHTNINGSHRINE = register("runiclightningshrine", RuniclightningshrineFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, RuniclightningshrineFeature.GENERATE_BIOMES,
					RuniclightningshrineFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUNICEARTHSHRINE = register("runicearthshrine", RunicearthshrineFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, RunicearthshrineFeature.GENERATE_BIOMES,
					RunicearthshrineFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUNICAIRSHRINE = register("runicairshrine", RunicairshrineFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, RunicairshrineFeature.GENERATE_BIOMES,
					RunicairshrineFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MYCENABIOMEBASEBLOCK = register("mycenabiomebaseblock", MycenabiomebaseblockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, MycenabiomebaseblockFeature.GENERATE_BIOMES,
					MycenabiomebaseblockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SHIMMERINGORE = register("shimmeringore", ShimmeringoreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, ShimmeringoreFeature.GENERATE_BIOMES, ShimmeringoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUINGRANITEBIOME = register("ruingranitebiome", RuingranitebiomeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, RuingranitebiomeFeature.GENERATE_BIOMES,
					RuingranitebiomeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ENERGYDIORITEBIOME = register("energydioritebiome", EnergydioritebiomeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, EnergydioritebiomeFeature.GENERATE_BIOMES,
					EnergydioritebiomeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LIGHTNINGANDESITEBIOME = register("lightningandesitebiome", LightningandesitebiomeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, LightningandesitebiomeFeature.GENERATE_BIOMES,
					LightningandesitebiomeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MEMORYGROTTO_SPAWN = register("memorygrotto_spawn", MemorygrottoSpawnFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, MemorygrottoSpawnFeature.GENERATE_BIOMES,
					MemorygrottoSpawnFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DESERTRUINS_1 = register("desertruins_1", Desertruins1Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Desertruins1Feature.GENERATE_BIOMES, Desertruins1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBMERGEDTEMPLE = register("submergedtemple", SubmergedtempleFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, SubmergedtempleFeature.GENERATE_BIOMES,
					SubmergedtempleFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WILDCOLDBERRYBUSH = register("wildcoldberrybush", WildcoldberrybushFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, WildcoldberrybushFeature.GENERATE_BIOMES,
					WildcoldberrybushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WILDSUNBERRYBUSH = register("wildsunberrybush", WildsunberrybushFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, WildsunberrybushFeature.GENERATE_BIOMES,
					WildsunberrybushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WILDGOBBERRYBUSH = register("wildgobberrybush", WildgobberrybushFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, WildgobberrybushFeature.GENERATE_BIOMES,
					WildgobberrybushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WILDBILBORRYBUSH = register("wildbilborrybush", WildbilborrybushFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, WildbilborrybushFeature.GENERATE_BIOMES,
					WildbilborrybushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BOULDER_1 = register("boulder_1", Boulder1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Boulder1Feature.GENERATE_BIOMES, Boulder1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> BOULDER_2 = register("boulder_2", Boulder2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Boulder2Feature.GENERATE_BIOMES, Boulder2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> LOSTCRAFTINGTABLE = register("lostcraftingtable", LostcraftingtableFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, LostcraftingtableFeature.GENERATE_BIOMES,
					LostcraftingtableFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BOULDERSWORD = register("bouldersword", BoulderswordFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, BoulderswordFeature.GENERATE_BIOMES, BoulderswordFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BURIEDSWORDSTRUCTURE = register("buriedswordstructure", BuriedswordstructureFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BuriedswordstructureFeature.GENERATE_BIOMES,
					BuriedswordstructureFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NETHERSTAR_SPAWN = register("netherstar_spawn", NetherstarSpawnFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NetherstarSpawnFeature.GENERATE_BIOMES,
					NetherstarSpawnFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ABANDONNEDFARM = register("abandonnedfarm", AbandonnedfarmFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AbandonnedfarmFeature.GENERATE_BIOMES,
					AbandonnedfarmFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SWORDTEMPLE = register("swordtemple", SwordtempleFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, SwordtempleFeature.GENERATE_BIOMES, SwordtempleFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CAMPFIRE_1 = register("campfire_1", Campfire1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Campfire1Feature.GENERATE_BIOMES, Campfire1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> PURPLEMUSHROOMS = register("purplemushrooms", PurplemushroomsFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PurplemushroomsFeature.GENERATE_BIOMES,
					PurplemushroomsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PURPLEMUSHROOMBIG = register("purplemushroombig", PurplemushroombigFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, PurplemushroombigFeature.GENERATE_BIOMES,
					PurplemushroombigFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPFLUTANITEORE = register("deepflutaniteore", DeepflutaniteoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepflutaniteoreFeature.GENERATE_BIOMES,
					DeepflutaniteoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPVAMITEORE = register("deepvamiteore", DeepvamiteoreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, DeepvamiteoreFeature.GENERATE_BIOMES, DeepvamiteoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPFERZIUMORE = register("deepferziumore", DeepferziumoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepferziumoreFeature.GENERATE_BIOMES,
					DeepferziumoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPMERTHIUMORE = register("deepmerthiumore", DeepmerthiumoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepmerthiumoreFeature.GENERATE_BIOMES,
					DeepmerthiumoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPNOOBIUMORE = register("deepnoobiumore", DeepnoobiumoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepnoobiumoreFeature.GENERATE_BIOMES,
					DeepnoobiumoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSHIMMERINGORE = register("deepshimmeringore", DeepshimmeringoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepshimmeringoreFeature.GENERATE_BIOMES,
					DeepshimmeringoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPRUINS_RANDOM = register("deepruins_random", DeepruinsRandomFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, DeepruinsRandomFeature.GENERATE_BIOMES,
					DeepruinsRandomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPRUINS = register("deepruins", DeepruinsFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, DeepruinsFeature.GENERATE_BIOMES, DeepruinsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> JELLYFLOATLARGE_GEN = register("jellyfloatlarge_gen", JellyfloatlargeGenFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, JellyfloatlargeGenFeature.GENERATE_BIOMES,
					JellyfloatlargeGenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> JELLYFLOATSMALL_GEN = register("jellyfloatsmall_gen", JellyfloatsmallGenFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, JellyfloatsmallGenFeature.GENERATE_BIOMES,
					JellyfloatsmallGenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GRAYSKULL_LAKE = register("grayskull_lake", GrayskullLakeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, GrayskullLakeFeature.GENERATE_BIOMES, GrayskullLakeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> REDSUNSHRINE = register("redsunshrine", RedsunshrineFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, RedsunshrineFeature.GENERATE_BIOMES, RedsunshrineFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BOULDERS_OW = register("boulders_ow", BouldersOWFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, BouldersOWFeature.GENERATE_BIOMES, BouldersOWFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WINDYSHORES = register("windyshores", WindyshoresFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, WindyshoresFeature.GENERATE_BIOMES, WindyshoresFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DIVERSCROWN = register("diverscrown", DiverscrownFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, DiverscrownFeature.GENERATE_BIOMES, DiverscrownFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PUMPKINOBLECK_SPAWNER = register("pumpkinobleck_spawner", PumpkinobleckSpawnerFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, PumpkinobleckSpawnerFeature.GENERATE_BIOMES,
					PumpkinobleckSpawnerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BEACON_TOWER = register("beacon_tower", BeaconTowerFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, BeaconTowerFeature.GENERATE_BIOMES, BeaconTowerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CURIOUS_MONOLITH_1 = register("curious_monolith_1", CuriousMonolith1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, CuriousMonolith1Feature.GENERATE_BIOMES,
					CuriousMonolith1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> CURIOUS_MONOLITH_2 = register("curious_monolith_2", CuriousMonolith2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, CuriousMonolith2Feature.GENERATE_BIOMES,
					CuriousMonolith2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> CURIOUS_MONOLITH_3 = register("curious_monolith_3", CuriousMonolith3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, CuriousMonolith3Feature.GENERATE_BIOMES,
					CuriousMonolith3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> CURIOUS_CART = register("curious_cart", CuriousCartFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, CuriousCartFeature.GENERATE_BIOMES, CuriousCartFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CURIOUS_BOAT = register("curious_boat", CuriousBoatFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, CuriousBoatFeature.GENERATE_BIOMES, CuriousBoatFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
