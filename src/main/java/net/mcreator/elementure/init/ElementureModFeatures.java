
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

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
import net.mcreator.elementure.world.features.SpidernestFeature;
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

@Mod.EventBusSubscriber
public class ElementureModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ElementureMod.MODID);
	public static final RegistryObject<Feature<?>> VAMITEORE = REGISTRY.register("vamiteore", VamiteoreFeature::feature);
	public static final RegistryObject<Feature<?>> NOOBIUMORE = REGISTRY.register("noobiumore", NoobiumoreFeature::feature);
	public static final RegistryObject<Feature<?>> FLUTANITEORE = REGISTRY.register("flutaniteore", FlutaniteoreFeature::feature);
	public static final RegistryObject<Feature<?>> FERZIUMORE = REGISTRY.register("ferziumore", FerziumoreFeature::feature);
	public static final RegistryObject<Feature<?>> MERTHIUMORE = REGISTRY.register("merthiumore", MerthiumoreFeature::feature);
	public static final RegistryObject<Feature<?>> SHIMMERINGORE = REGISTRY.register("shimmeringore", ShimmeringoreFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPFLUTANITEORE = REGISTRY.register("deepflutaniteore", DeepflutaniteoreFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPVAMITEORE = REGISTRY.register("deepvamiteore", DeepvamiteoreFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPFERZIUMORE = REGISTRY.register("deepferziumore", DeepferziumoreFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPMERTHIUMORE = REGISTRY.register("deepmerthiumore", DeepmerthiumoreFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPNOOBIUMORE = REGISTRY.register("deepnoobiumore", DeepnoobiumoreFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPSHIMMERINGORE = REGISTRY.register("deepshimmeringore", DeepshimmeringoreFeature::feature);
	public static final RegistryObject<Feature<?>> WILDBLUEBERRY = REGISTRY.register("wildblueberry", WildblueberryFeature::feature);
	public static final RegistryObject<Feature<?>> WILDPERRYBERRY = REGISTRY.register("wildperryberry", WildperryberryFeature::feature);
	public static final RegistryObject<Feature<?>> WILDBEESTINGBERRYBUSH = REGISTRY.register("wildbeestingberrybush",
			WildbeestingberrybushFeature::feature);
	public static final RegistryObject<Feature<?>> WILDSTRAWBERRYBUSH = REGISTRY.register("wildstrawberrybush", WildstrawberrybushFeature::feature);
	public static final RegistryObject<Feature<?>> WILDCOLDBERRYBUSH = REGISTRY.register("wildcoldberrybush", WildcoldberrybushFeature::feature);
	public static final RegistryObject<Feature<?>> WILDSUNBERRYBUSH = REGISTRY.register("wildsunberrybush", WildsunberrybushFeature::feature);
	public static final RegistryObject<Feature<?>> WILDGOBBERRYBUSH = REGISTRY.register("wildgobberrybush", WildgobberrybushFeature::feature);
	public static final RegistryObject<Feature<?>> WILDBILBORRYBUSH = REGISTRY.register("wildbilborrybush", WildbilborrybushFeature::feature);
	public static final RegistryObject<Feature<?>> PURPLEMUSHROOMS = REGISTRY.register("purplemushrooms", PurplemushroomsFeature::feature);
	public static final RegistryObject<Feature<?>> RAGDOLLARENA = REGISTRY.register("ragdollarena", RagdollarenaFeature::feature);
	public static final RegistryObject<Feature<?>> FROSTYICEARENA = REGISTRY.register("frostyicearena", FrostyicearenaFeature::feature);
	public static final RegistryObject<Feature<?>> VILLAGERSTATUE = REGISTRY.register("villagerstatue", VillagerstatueFeature::feature);
	public static final RegistryObject<Feature<?>> FLUTANITEFLOATINGCHUNK = REGISTRY.register("flutanitefloatingchunk",
			FlutanitefloatingchunkFeature::feature);
	public static final RegistryObject<Feature<?>> RUNICFIRESHRINE = REGISTRY.register("runicfireshrine", RunicfireshrineFeature::feature);
	public static final RegistryObject<Feature<?>> RUNICWATERSHRINE = REGISTRY.register("runicwatershrine", RunicwatershrineFeature::feature);
	public static final RegistryObject<Feature<?>> RUNICLIGHTNINGSHRINE = REGISTRY.register("runiclightningshrine",
			RuniclightningshrineFeature::feature);
	public static final RegistryObject<Feature<?>> RUNICEARTHSHRINE = REGISTRY.register("runicearthshrine", RunicearthshrineFeature::feature);
	public static final RegistryObject<Feature<?>> RUNICAIRSHRINE = REGISTRY.register("runicairshrine", RunicairshrineFeature::feature);
	public static final RegistryObject<Feature<?>> MYCENABIOMEBASEBLOCK = REGISTRY.register("mycenabiomebaseblock",
			MycenabiomebaseblockFeature::feature);
	public static final RegistryObject<Feature<?>> RUINGRANITEBIOME = REGISTRY.register("ruingranitebiome", RuingranitebiomeFeature::feature);
	public static final RegistryObject<Feature<?>> ENERGYDIORITEBIOME = REGISTRY.register("energydioritebiome", EnergydioritebiomeFeature::feature);
	public static final RegistryObject<Feature<?>> LIGHTNINGANDESITEBIOME = REGISTRY.register("lightningandesitebiome",
			LightningandesitebiomeFeature::feature);
	public static final RegistryObject<Feature<?>> MEMORYGROTTO_SPAWN = REGISTRY.register("memorygrotto_spawn", MemorygrottoSpawnFeature::feature);
	public static final RegistryObject<Feature<?>> DESERTRUINS_1 = REGISTRY.register("desertruins_1", Desertruins1Feature::feature);
	public static final RegistryObject<Feature<?>> SUBMERGEDTEMPLE = REGISTRY.register("submergedtemple", SubmergedtempleFeature::feature);
	public static final RegistryObject<Feature<?>> BOULDER_1 = REGISTRY.register("boulder_1", Boulder1Feature::feature);
	public static final RegistryObject<Feature<?>> BOULDER_2 = REGISTRY.register("boulder_2", Boulder2Feature::feature);
	public static final RegistryObject<Feature<?>> LOSTCRAFTINGTABLE = REGISTRY.register("lostcraftingtable", LostcraftingtableFeature::feature);
	public static final RegistryObject<Feature<?>> BOULDERSWORD = REGISTRY.register("bouldersword", BoulderswordFeature::feature);
	public static final RegistryObject<Feature<?>> BURIEDSWORDSTRUCTURE = REGISTRY.register("buriedswordstructure",
			BuriedswordstructureFeature::feature);
	public static final RegistryObject<Feature<?>> NETHERSTAR_SPAWN = REGISTRY.register("netherstar_spawn", NetherstarSpawnFeature::feature);
	public static final RegistryObject<Feature<?>> ABANDONNEDFARM = REGISTRY.register("abandonnedfarm", AbandonnedfarmFeature::feature);
	public static final RegistryObject<Feature<?>> SWORDTEMPLE = REGISTRY.register("swordtemple", SwordtempleFeature::feature);
	public static final RegistryObject<Feature<?>> CAMPFIRE_1 = REGISTRY.register("campfire_1", Campfire1Feature::feature);
	public static final RegistryObject<Feature<?>> PURPLEMUSHROOMBIG = REGISTRY.register("purplemushroombig", PurplemushroombigFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPRUINS_RANDOM = REGISTRY.register("deepruins_random", DeepruinsRandomFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPRUINS = REGISTRY.register("deepruins", DeepruinsFeature::feature);
	public static final RegistryObject<Feature<?>> JELLYFLOATLARGE_GEN = REGISTRY.register("jellyfloatlarge_gen", JellyfloatlargeGenFeature::feature);
	public static final RegistryObject<Feature<?>> JELLYFLOATSMALL_GEN = REGISTRY.register("jellyfloatsmall_gen", JellyfloatsmallGenFeature::feature);
	public static final RegistryObject<Feature<?>> GRAYSKULL_LAKE = REGISTRY.register("grayskull_lake", GrayskullLakeFeature::feature);
	public static final RegistryObject<Feature<?>> REDSUNSHRINE = REGISTRY.register("redsunshrine", RedsunshrineFeature::feature);
	public static final RegistryObject<Feature<?>> BOULDERS_OW = REGISTRY.register("boulders_ow", BouldersOWFeature::feature);
	public static final RegistryObject<Feature<?>> WINDYSHORES = REGISTRY.register("windyshores", WindyshoresFeature::feature);
	public static final RegistryObject<Feature<?>> DIVERSCROWN = REGISTRY.register("diverscrown", DiverscrownFeature::feature);
	public static final RegistryObject<Feature<?>> PUMPKINOBLECK_SPAWNER = REGISTRY.register("pumpkinobleck_spawner",
			PumpkinobleckSpawnerFeature::feature);
	public static final RegistryObject<Feature<?>> BEACON_TOWER = REGISTRY.register("beacon_tower", BeaconTowerFeature::feature);
	public static final RegistryObject<Feature<?>> CURIOUS_MONOLITH_1 = REGISTRY.register("curious_monolith_1", CuriousMonolith1Feature::feature);
	public static final RegistryObject<Feature<?>> CURIOUS_MONOLITH_2 = REGISTRY.register("curious_monolith_2", CuriousMonolith2Feature::feature);
	public static final RegistryObject<Feature<?>> CURIOUS_MONOLITH_3 = REGISTRY.register("curious_monolith_3", CuriousMonolith3Feature::feature);
	public static final RegistryObject<Feature<?>> CURIOUS_CART = REGISTRY.register("curious_cart", CuriousCartFeature::feature);
	public static final RegistryObject<Feature<?>> CURIOUS_BOAT = REGISTRY.register("curious_boat", CuriousBoatFeature::feature);
	public static final RegistryObject<Feature<?>> SPIDERNEST = REGISTRY.register("spidernest", SpidernestFeature::feature);
}
