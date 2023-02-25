
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.elementure.world.biome.Shadowrealm441Biome;
import net.mcreator.elementure.world.biome.ForbiddenRedShoresBiome;
import net.mcreator.elementure.world.biome.Familiar12Biome;
import net.mcreator.elementure.world.biome.Familiar11Biome;
import net.mcreator.elementure.world.biome.AbyssalplainsBiome;
import net.mcreator.elementure.ElementureMod;

public class ElementureModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, ElementureMod.MODID);
	public static final RegistryObject<Biome> ABYSSALPLAINS = REGISTRY.register("abyssalplains", AbyssalplainsBiome::createBiome);
	public static final RegistryObject<Biome> SHADOWREALM_441 = REGISTRY.register("shadowrealm_441", Shadowrealm441Biome::createBiome);
	public static final RegistryObject<Biome> FAMILIAR_11 = REGISTRY.register("familiar_11", Familiar11Biome::createBiome);
	public static final RegistryObject<Biome> FAMILIAR_12 = REGISTRY.register("familiar_12", Familiar12Biome::createBiome);
	public static final RegistryObject<Biome> FORBIDDEN_RED_SHORES = REGISTRY.register("forbidden_red_shores", ForbiddenRedShoresBiome::createBiome);
}
