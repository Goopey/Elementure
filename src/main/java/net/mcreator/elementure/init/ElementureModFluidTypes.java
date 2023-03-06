
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.elementure.fluid.types.WaterelementliquidFluidType;
import net.mcreator.elementure.fluid.types.SpringwaterFluidType;
import net.mcreator.elementure.fluid.types.SilvershoresliquidFluidType;
import net.mcreator.elementure.fluid.types.RegensubstanceFluidType;
import net.mcreator.elementure.fluid.types.NetherumfluidFluidType;
import net.mcreator.elementure.fluid.types.LightningelementliquidFluidType;
import net.mcreator.elementure.fluid.types.FireliquidFluidType;
import net.mcreator.elementure.fluid.types.EarthelementliquidFluidType;
import net.mcreator.elementure.fluid.types.DungeonwaterFluidType;
import net.mcreator.elementure.fluid.types.DarkwaterFluidType;
import net.mcreator.elementure.fluid.types.CorruptdewFluidType;
import net.mcreator.elementure.fluid.types.AirelementliquidFluidType;
import net.mcreator.elementure.ElementureMod;

public class ElementureModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ElementureMod.MODID);
	public static final RegistryObject<FluidType> DARKWATER_TYPE = REGISTRY.register("darkwater", () -> new DarkwaterFluidType());
	public static final RegistryObject<FluidType> REGENSUBSTANCE_TYPE = REGISTRY.register("regensubstance", () -> new RegensubstanceFluidType());
	public static final RegistryObject<FluidType> CORRUPTDEW_TYPE = REGISTRY.register("corruptdew", () -> new CorruptdewFluidType());
	public static final RegistryObject<FluidType> NETHERUMFLUID_TYPE = REGISTRY.register("netherumfluid", () -> new NetherumfluidFluidType());
	public static final RegistryObject<FluidType> DUNGEONWATER_TYPE = REGISTRY.register("dungeonwater", () -> new DungeonwaterFluidType());
	public static final RegistryObject<FluidType> SILVERSHORESLIQUID_TYPE = REGISTRY.register("silvershoresliquid", () -> new SilvershoresliquidFluidType());
	public static final RegistryObject<FluidType> FIRELIQUID_TYPE = REGISTRY.register("fireliquid", () -> new FireliquidFluidType());
	public static final RegistryObject<FluidType> EARTHELEMENTLIQUID_TYPE = REGISTRY.register("earthelementliquid", () -> new EarthelementliquidFluidType());
	public static final RegistryObject<FluidType> AIRELEMENTLIQUID_TYPE = REGISTRY.register("airelementliquid", () -> new AirelementliquidFluidType());
	public static final RegistryObject<FluidType> WATERELEMENTLIQUID_TYPE = REGISTRY.register("waterelementliquid", () -> new WaterelementliquidFluidType());
	public static final RegistryObject<FluidType> LIGHTNINGELEMENTLIQUID_TYPE = REGISTRY.register("lightningelementliquid", () -> new LightningelementliquidFluidType());
	public static final RegistryObject<FluidType> SPRINGWATER_TYPE = REGISTRY.register("springwater", () -> new SpringwaterFluidType());
}
