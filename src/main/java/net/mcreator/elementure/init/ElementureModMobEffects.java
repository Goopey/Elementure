
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.elementure.potion.SwingspeedMobEffect;
import net.mcreator.elementure.potion.StarburnsMobEffect;
import net.mcreator.elementure.potion.ParryMobEffect;
import net.mcreator.elementure.potion.ParryFatigueMobEffect;
import net.mcreator.elementure.potion.MycenansporesMobEffect;
import net.mcreator.elementure.potion.MycenansporegrowthsMobEffect;
import net.mcreator.elementure.potion.MycenanfungalsporesImmunityMobEffect;
import net.mcreator.elementure.potion.HinderedMobEffect;
import net.mcreator.elementure.potion.HeatresistanceMobEffect;
import net.mcreator.elementure.potion.FrozeneffectMobEffect;
import net.mcreator.elementure.potion.FragilityMobEffect;
import net.mcreator.elementure.potion.FishingpowerMobEffect;
import net.mcreator.elementure.potion.DodgeMobEffect;
import net.mcreator.elementure.potion.DarkflameMobEffect;
import net.mcreator.elementure.potion.CursedsightMobEffect;
import net.mcreator.elementure.potion.ColdeffectMobEffect;
import net.mcreator.elementure.potion.BubblingEffectMobEffect;
import net.mcreator.elementure.potion.BubbledEffectMobEffect;
import net.mcreator.elementure.ElementureMod;

public class ElementureModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ElementureMod.MODID);
	public static final RegistryObject<MobEffect> CURSEDSIGHT_POTION_ITEM = REGISTRY.register("cursedsight_potion_item", () -> new CursedsightMobEffect());
	public static final RegistryObject<MobEffect> FROZENEFFECT_POTION_ITEM = REGISTRY.register("frozeneffect_potion_item", () -> new FrozeneffectMobEffect());
	public static final RegistryObject<MobEffect> COLDEFFECT_POTION_ITEM = REGISTRY.register("coldeffect_potion_item", () -> new ColdeffectMobEffect());
	public static final RegistryObject<MobEffect> MYCENANSPORES = REGISTRY.register("mycenanspores", () -> new MycenansporesMobEffect());
	public static final RegistryObject<MobEffect> MYCENANSPOREGROWTHS = REGISTRY.register("mycenansporegrowths", () -> new MycenansporegrowthsMobEffect());
	public static final RegistryObject<MobEffect> FISHINGPOWER = REGISTRY.register("fishingpower", () -> new FishingpowerMobEffect());
	public static final RegistryObject<MobEffect> PARRY_FATIGUE = REGISTRY.register("parry_fatigue", () -> new ParryFatigueMobEffect());
	public static final RegistryObject<MobEffect> PARRY = REGISTRY.register("parry", () -> new ParryMobEffect());
	public static final RegistryObject<MobEffect> MYCENANFUNGALSPORES_IMMUNITY = REGISTRY.register("mycenanfungalspores_immunity", () -> new MycenanfungalsporesImmunityMobEffect());
	public static final RegistryObject<MobEffect> HINDERED = REGISTRY.register("hindered", () -> new HinderedMobEffect());
	public static final RegistryObject<MobEffect> HEATRESISTANCE = REGISTRY.register("heatresistance", () -> new HeatresistanceMobEffect());
	public static final RegistryObject<MobEffect> STARBURNS = REGISTRY.register("starburns", () -> new StarburnsMobEffect());
	public static final RegistryObject<MobEffect> DODGE = REGISTRY.register("dodge", () -> new DodgeMobEffect());
	public static final RegistryObject<MobEffect> FRAGILITY = REGISTRY.register("fragility", () -> new FragilityMobEffect());
	public static final RegistryObject<MobEffect> DARKFLAME = REGISTRY.register("darkflame", () -> new DarkflameMobEffect());
	public static final RegistryObject<MobEffect> BUBBLED_EFFECT = REGISTRY.register("bubbled_effect", () -> new BubbledEffectMobEffect());
	public static final RegistryObject<MobEffect> BUBBLING_EFFECT = REGISTRY.register("bubbling_effect", () -> new BubblingEffectMobEffect());
	public static final RegistryObject<MobEffect> SWINGSPEED = REGISTRY.register("swingspeed", () -> new SwingspeedMobEffect());
}
