
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.elementure.enchantment.StrikeEnchantment;
import net.mcreator.elementure.enchantment.SelfsustainingFlameEnchantment;
import net.mcreator.elementure.enchantment.MagneticEnchantmentEnchantment;
import net.mcreator.elementure.enchantment.DarksmiteEnchantment;
import net.mcreator.elementure.ElementureMod;

public class ElementureModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ElementureMod.MODID);
	public static final RegistryObject<Enchantment> MAGNETIC_ENCHANTMENT = REGISTRY.register("magnetic_enchantment",
			() -> new MagneticEnchantmentEnchantment());
	public static final RegistryObject<Enchantment> DARKSMITE = REGISTRY.register("darksmite", () -> new DarksmiteEnchantment());
	public static final RegistryObject<Enchantment> STRIKE = REGISTRY.register("strike", () -> new StrikeEnchantment());
	public static final RegistryObject<Enchantment> SELFSUSTAINING_FLAME = REGISTRY.register("selfsustaining_flame",
			() -> new SelfsustainingFlameEnchantment());
}
