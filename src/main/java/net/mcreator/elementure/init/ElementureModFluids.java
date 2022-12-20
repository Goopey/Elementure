
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.elementure.fluid.WaterelementliquidFluid;
import net.mcreator.elementure.fluid.SpringwaterFluid;
import net.mcreator.elementure.fluid.SilvershoresliquidFluid;
import net.mcreator.elementure.fluid.RegensubstanceFluid;
import net.mcreator.elementure.fluid.NetherumfluidFluid;
import net.mcreator.elementure.fluid.LightningelementliquidFluid;
import net.mcreator.elementure.fluid.FireliquidFluid;
import net.mcreator.elementure.fluid.EarthelementliquidFluid;
import net.mcreator.elementure.fluid.DungeonwaterFluid;
import net.mcreator.elementure.fluid.DarkwaterFluid;
import net.mcreator.elementure.fluid.CorruptdewFluid;
import net.mcreator.elementure.fluid.AirelementliquidFluid;
import net.mcreator.elementure.ElementureMod;

public class ElementureModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, ElementureMod.MODID);
	public static final RegistryObject<Fluid> DARKWATER = REGISTRY.register("darkwater", () -> new DarkwaterFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_DARKWATER = REGISTRY.register("flowing_darkwater", () -> new DarkwaterFluid.Flowing());
	public static final RegistryObject<Fluid> REGENSUBSTANCE = REGISTRY.register("regensubstance", () -> new RegensubstanceFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_REGENSUBSTANCE = REGISTRY.register("flowing_regensubstance",
			() -> new RegensubstanceFluid.Flowing());
	public static final RegistryObject<Fluid> CORRUPTDEW = REGISTRY.register("corruptdew", () -> new CorruptdewFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_CORRUPTDEW = REGISTRY.register("flowing_corruptdew", () -> new CorruptdewFluid.Flowing());
	public static final RegistryObject<Fluid> FIRELIQUID = REGISTRY.register("fireliquid", () -> new FireliquidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_FIRELIQUID = REGISTRY.register("flowing_fireliquid", () -> new FireliquidFluid.Flowing());
	public static final RegistryObject<Fluid> EARTHELEMENTLIQUID = REGISTRY.register("earthelementliquid",
			() -> new EarthelementliquidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_EARTHELEMENTLIQUID = REGISTRY.register("flowing_earthelementliquid",
			() -> new EarthelementliquidFluid.Flowing());
	public static final RegistryObject<Fluid> AIRELEMENTLIQUID = REGISTRY.register("airelementliquid", () -> new AirelementliquidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_AIRELEMENTLIQUID = REGISTRY.register("flowing_airelementliquid",
			() -> new AirelementliquidFluid.Flowing());
	public static final RegistryObject<Fluid> WATERELEMENTLIQUID = REGISTRY.register("waterelementliquid",
			() -> new WaterelementliquidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_WATERELEMENTLIQUID = REGISTRY.register("flowing_waterelementliquid",
			() -> new WaterelementliquidFluid.Flowing());
	public static final RegistryObject<Fluid> LIGHTNINGELEMENTLIQUID = REGISTRY.register("lightningelementliquid",
			() -> new LightningelementliquidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_LIGHTNINGELEMENTLIQUID = REGISTRY.register("flowing_lightningelementliquid",
			() -> new LightningelementliquidFluid.Flowing());
	public static final RegistryObject<Fluid> SPRINGWATER = REGISTRY.register("springwater", () -> new SpringwaterFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_SPRINGWATER = REGISTRY.register("flowing_springwater", () -> new SpringwaterFluid.Flowing());
	public static final RegistryObject<Fluid> NETHERUMFLUID = REGISTRY.register("netherumfluid", () -> new NetherumfluidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_NETHERUMFLUID = REGISTRY.register("flowing_netherumfluid",
			() -> new NetherumfluidFluid.Flowing());
	public static final RegistryObject<Fluid> DUNGEONWATER = REGISTRY.register("dungeonwater", () -> new DungeonwaterFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_DUNGEONWATER = REGISTRY.register("flowing_dungeonwater", () -> new DungeonwaterFluid.Flowing());
	public static final RegistryObject<Fluid> SILVERSHORESLIQUID = REGISTRY.register("silvershoresliquid",
			() -> new SilvershoresliquidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_SILVERSHORESLIQUID = REGISTRY.register("flowing_silvershoresliquid",
			() -> new SilvershoresliquidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(DARKWATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_DARKWATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(REGENSUBSTANCE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_REGENSUBSTANCE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CORRUPTDEW.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CORRUPTDEW.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FIRELIQUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_FIRELIQUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(EARTHELEMENTLIQUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_EARTHELEMENTLIQUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(AIRELEMENTLIQUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_AIRELEMENTLIQUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(WATERELEMENTLIQUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_WATERELEMENTLIQUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LIGHTNINGELEMENTLIQUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIGHTNINGELEMENTLIQUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(SPRINGWATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SPRINGWATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(NETHERUMFLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_NETHERUMFLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(DUNGEONWATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_DUNGEONWATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(SILVERSHORESLIQUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SILVERSHORESLIQUID.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
