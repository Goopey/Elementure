
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.elementure.ElementureMod;

public class ElementureModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ElementureMod.MODID);
	public static final RegistryObject<Potion> CURSEDSIGHT_POTION_ITEM = REGISTRY.register("cursedsight_potion_item",
			() -> new Potion(new MobEffectInstance(ElementureModMobEffects.CURSEDSIGHT_POTION_ITEM.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> FROZENEFFECT_POTION_ITEM = REGISTRY.register("frozeneffect_potion_item",
			() -> new Potion(new MobEffectInstance(ElementureModMobEffects.FROZENEFFECT_POTION_ITEM.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> COLDEFFECT_POTION_ITEM = REGISTRY.register("coldeffect_potion_item",
			() -> new Potion(new MobEffectInstance(ElementureModMobEffects.COLDEFFECT_POTION_ITEM.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> MYCENANSPORES = REGISTRY.register("mycenanspores",
			() -> new Potion(new MobEffectInstance(ElementureModMobEffects.MYCENANSPORES.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> MYCENANSPOREGROWTHS = REGISTRY.register("mycenansporegrowths",
			() -> new Potion(new MobEffectInstance(ElementureModMobEffects.MYCENANSPOREGROWTHS.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> HEATRESISTANCE_POTION = REGISTRY.register("heatresistance_potion",
			() -> new Potion(new MobEffectInstance(ElementureModMobEffects.HEATRESISTANCE.get(), 1200, 0, false, true)));
}
