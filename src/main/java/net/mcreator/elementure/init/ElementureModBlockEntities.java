
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.elementure.block.entity.WortashleavesBlockEntity;
import net.mcreator.elementure.block.entity.WindyshoresmemorialBlockEntity;
import net.mcreator.elementure.block.entity.WindyshoresOmeganBlockEntity;
import net.mcreator.elementure.block.entity.WeaponaltarBlockEntity;
import net.mcreator.elementure.block.entity.WarpedforestmemorialBlockEntity;
import net.mcreator.elementure.block.entity.TaigamemorialBlockEntity;
import net.mcreator.elementure.block.entity.SwampmemorialBlockEntity;
import net.mcreator.elementure.block.entity.StonememorymatrixBlockEntity;
import net.mcreator.elementure.block.entity.SpidernestCobblestoneBlockEntity;
import net.mcreator.elementure.block.entity.SpiderboreDeepslatebricksBlockEntity;
import net.mcreator.elementure.block.entity.SpiderboreCobblestoneBlockEntity;
import net.mcreator.elementure.block.entity.SpawnercrystalBlockEntity;
import net.mcreator.elementure.block.entity.SoulsandvalleymemorialBlockEntity;
import net.mcreator.elementure.block.entity.SoulforgeBlockEntity;
import net.mcreator.elementure.block.entity.SnowymemorialBlockEntity;
import net.mcreator.elementure.block.entity.SmallScrapperBlockEntity;
import net.mcreator.elementure.block.entity.ScrapleavesBlockEntity;
import net.mcreator.elementure.block.entity.SavannamemorialBlockEntity;
import net.mcreator.elementure.block.entity.Rarememoryplant3BlockEntity;
import net.mcreator.elementure.block.entity.Rarememoryplant2BlockEntity;
import net.mcreator.elementure.block.entity.Rarememoryplant1BlockEntity;
import net.mcreator.elementure.block.entity.PlainsmemorialBlockEntity;
import net.mcreator.elementure.block.entity.PervadedbedrockBlockEntity;
import net.mcreator.elementure.block.entity.OmegancenterBlockEntity;
import net.mcreator.elementure.block.entity.OceanmemorialBlockEntity;
import net.mcreator.elementure.block.entity.NetherstarmemorialBlockEntity;
import net.mcreator.elementure.block.entity.NetherstarBiomeOmeganBlockEntity;
import net.mcreator.elementure.block.entity.NetherstarBiomeAlphanBlockEntity;
import net.mcreator.elementure.block.entity.NethermemorialBlockEntity;
import net.mcreator.elementure.block.entity.NetherleavesBlockEntity;
import net.mcreator.elementure.block.entity.NanoshrimppotBlockEntity;
import net.mcreator.elementure.block.entity.MycenamemorialBlockEntity;
import net.mcreator.elementure.block.entity.MycenaBiomeOmeganBlockEntity;
import net.mcreator.elementure.block.entity.MycenaBiomeAlphanBlockEntity;
import net.mcreator.elementure.block.entity.MushroommemorialBlockEntity;
import net.mcreator.elementure.block.entity.MountainsmemorialBlockEntity;
import net.mcreator.elementure.block.entity.Memoryplant3BlockEntity;
import net.mcreator.elementure.block.entity.Memoryplant2BlockEntity;
import net.mcreator.elementure.block.entity.Memoryplant1BlockEntity;
import net.mcreator.elementure.block.entity.MemoryheartBlockEntity;
import net.mcreator.elementure.block.entity.JunglememorialBlockEntity;
import net.mcreator.elementure.block.entity.JellypoolsmemorialBlockEntity;
import net.mcreator.elementure.block.entity.JellyfloatOmeganBlockEntity;
import net.mcreator.elementure.block.entity.JellyfloatAlphanBlockEntity;
import net.mcreator.elementure.block.entity.IcespikesmemorialBlockEntity;
import net.mcreator.elementure.block.entity.GlasslightbrewerBlockEntity;
import net.mcreator.elementure.block.entity.ForgottenOmeganBlockEntity;
import net.mcreator.elementure.block.entity.ForestmemorialBlockEntity;
import net.mcreator.elementure.block.entity.FluffleavesBlockEntity;
import net.mcreator.elementure.block.entity.EndermemorialBlockEntity;
import net.mcreator.elementure.block.entity.EmptiedbedrockBlockEntity;
import net.mcreator.elementure.block.entity.DiverscrownOmeganBlockEntity;
import net.mcreator.elementure.block.entity.DiverscrownMemorialBlockEntity;
import net.mcreator.elementure.block.entity.DesertmemorialBlockEntity;
import net.mcreator.elementure.block.entity.DarkgemCrystalBeamBlockEntity;
import net.mcreator.elementure.block.entity.CrimsonforestmemorialBlockEntity;
import net.mcreator.elementure.block.entity.CrabpotBlockEntity;
import net.mcreator.elementure.block.entity.BluethornleavesBlockEntity;
import net.mcreator.elementure.block.entity.BirthingmoduleBlockEntity;
import net.mcreator.elementure.block.entity.BigglowingmushroomBlockEntity;
import net.mcreator.elementure.block.entity.BasaltdeltamemorialBlockEntity;
import net.mcreator.elementure.block.entity.BadlandsmemorialBlockEntity;
import net.mcreator.elementure.block.entity.AurumbricksBlockEntity;
import net.mcreator.elementure.ElementureMod;

public class ElementureModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ElementureMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> OMEGANCENTER = register("omegancenter", ElementureModBlocks.OMEGANCENTER,
			OmegancenterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BIGGLOWINGMUSHROOM = register("bigglowingmushroom", ElementureModBlocks.BIGGLOWINGMUSHROOM,
			BigglowingmushroomBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MYCENA_BIOME_ALPHAN = register("mycena_biome_alphan",
			ElementureModBlocks.MYCENA_BIOME_ALPHAN, MycenaBiomeAlphanBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MYCENA_BIOME_OMEGAN = register("mycena_biome_omegan",
			ElementureModBlocks.MYCENA_BIOME_OMEGAN, MycenaBiomeOmeganBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PERVADEDBEDROCK = register("pervadedbedrock", ElementureModBlocks.PERVADEDBEDROCK,
			PervadedbedrockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EMPTIEDBEDROCK = register("emptiedbedrock", ElementureModBlocks.EMPTIEDBEDROCK,
			EmptiedbedrockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MEMORYHEART = register("memoryheart", ElementureModBlocks.MEMORYHEART,
			MemoryheartBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENDERMEMORIAL = register("endermemorial", ElementureModBlocks.ENDERMEMORIAL,
			EndermemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STONEMEMORYMATRIX = register("stonememorymatrix", ElementureModBlocks.STONEMEMORYMATRIX,
			StonememorymatrixBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PLAINSMEMORIAL = register("plainsmemorial", ElementureModBlocks.PLAINSMEMORIAL,
			PlainsmemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ICESPIKESMEMORIAL = register("icespikesmemorial", ElementureModBlocks.ICESPIKESMEMORIAL,
			IcespikesmemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SWAMPMEMORIAL = register("swampmemorial", ElementureModBlocks.SWAMPMEMORIAL,
			SwampmemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MYCENAMEMORIAL = register("mycenamemorial", ElementureModBlocks.MYCENAMEMORIAL,
			MycenamemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MOUNTAINSMEMORIAL = register("mountainsmemorial", ElementureModBlocks.MOUNTAINSMEMORIAL,
			MountainsmemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SNOWYMEMORIAL = register("snowymemorial", ElementureModBlocks.SNOWYMEMORIAL,
			SnowymemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHERMEMORIAL = register("nethermemorial", ElementureModBlocks.NETHERMEMORIAL,
			NethermemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MUSHROOMMEMORIAL = register("mushroommemorial", ElementureModBlocks.MUSHROOMMEMORIAL,
			MushroommemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OCEANMEMORIAL = register("oceanmemorial", ElementureModBlocks.OCEANMEMORIAL,
			OceanmemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BADLANDSMEMORIAL = register("badlandsmemorial", ElementureModBlocks.BADLANDSMEMORIAL,
			BadlandsmemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DESERTMEMORIAL = register("desertmemorial", ElementureModBlocks.DESERTMEMORIAL,
			DesertmemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> JUNGLEMEMORIAL = register("junglememorial", ElementureModBlocks.JUNGLEMEMORIAL,
			JunglememorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FORESTMEMORIAL = register("forestmemorial", ElementureModBlocks.FORESTMEMORIAL,
			ForestmemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SAVANNAMEMORIAL = register("savannamemorial", ElementureModBlocks.SAVANNAMEMORIAL,
			SavannamemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TAIGAMEMORIAL = register("taigamemorial", ElementureModBlocks.TAIGAMEMORIAL,
			TaigamemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BIRTHINGMODULE = register("birthingmodule", ElementureModBlocks.BIRTHINGMODULE,
			BirthingmoduleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHERSTAR_BIOME_ALPHAN = register("netherstar_biome_alphan",
			ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN, NetherstarBiomeAlphanBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHERSTAR_BIOME_OMEGAN = register("netherstar_biome_omegan",
			ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN, NetherstarBiomeOmeganBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHERLEAVES = register("netherleaves", ElementureModBlocks.NETHERLEAVES,
			NetherleavesBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SCRAPLEAVES = register("scrapleaves", ElementureModBlocks.SCRAPLEAVES,
			ScrapleavesBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOULFORGE = register("soulforge", ElementureModBlocks.SOULFORGE,
			SoulforgeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPAWNERCRYSTAL = register("spawnercrystal", ElementureModBlocks.SPAWNERCRYSTAL,
			SpawnercrystalBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> JELLYFLOAT_OMEGAN = register("jellyfloat_omegan", ElementureModBlocks.JELLYFLOAT_OMEGAN,
			JellyfloatOmeganBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> AURUMBRICKS = register("aurumbricks", ElementureModBlocks.AURUMBRICKS,
			AurumbricksBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRIMSONFORESTMEMORIAL = register("crimsonforestmemorial",
			ElementureModBlocks.CRIMSONFORESTMEMORIAL, CrimsonforestmemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WARPEDFORESTMEMORIAL = register("warpedforestmemorial",
			ElementureModBlocks.WARPEDFORESTMEMORIAL, WarpedforestmemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOULSANDVALLEYMEMORIAL = register("soulsandvalleymemorial",
			ElementureModBlocks.SOULSANDVALLEYMEMORIAL, SoulsandvalleymemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASALTDELTAMEMORIAL = register("basaltdeltamemorial",
			ElementureModBlocks.BASALTDELTAMEMORIAL, BasaltdeltamemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHERSTARMEMORIAL = register("netherstarmemorial", ElementureModBlocks.NETHERSTARMEMORIAL,
			NetherstarmemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MEMORYPLANT_1 = register("memoryplant_1", ElementureModBlocks.MEMORYPLANT_1,
			Memoryplant1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MEMORYPLANT_2 = register("memoryplant_2", ElementureModBlocks.MEMORYPLANT_2,
			Memoryplant2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MEMORYPLANT_3 = register("memoryplant_3", ElementureModBlocks.MEMORYPLANT_3,
			Memoryplant3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RAREMEMORYPLANT_1 = register("rarememoryplant_1", ElementureModBlocks.RAREMEMORYPLANT_1,
			Rarememoryplant1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RAREMEMORYPLANT_2 = register("rarememoryplant_2", ElementureModBlocks.RAREMEMORYPLANT_2,
			Rarememoryplant2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RAREMEMORYPLANT_3 = register("rarememoryplant_3", ElementureModBlocks.RAREMEMORYPLANT_3,
			Rarememoryplant3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FORGOTTEN_OMEGAN = register("forgotten_omegan", ElementureModBlocks.FORGOTTEN_OMEGAN,
			ForgottenOmeganBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> JELLYFLOAT_ALPHAN = register("jellyfloat_alphan", ElementureModBlocks.JELLYFLOAT_ALPHAN,
			JellyfloatAlphanBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WINDYSHORES_OMEGAN = register("windyshores_omegan", ElementureModBlocks.WINDYSHORES_OMEGAN,
			WindyshoresOmeganBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WEAPONALTAR = register("weaponaltar", ElementureModBlocks.WEAPONALTAR,
			WeaponaltarBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FLUFFLEAVES = register("fluffleaves", ElementureModBlocks.FLUFFLEAVES,
			FluffleavesBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> JELLYPOOLSMEMORIAL = register("jellypoolsmemorial", ElementureModBlocks.JELLYPOOLSMEMORIAL,
			JellypoolsmemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WORTASHLEAVES = register("wortashleaves", ElementureModBlocks.WORTASHLEAVES,
			WortashleavesBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BLUETHORNLEAVES = register("bluethornleaves", ElementureModBlocks.BLUETHORNLEAVES,
			BluethornleavesBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WINDYSHORESMEMORIAL = register("windyshoresmemorial",
			ElementureModBlocks.WINDYSHORESMEMORIAL, WindyshoresmemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DIVERSCROWN_OMEGAN = register("diverscrown_omegan", ElementureModBlocks.DIVERSCROWN_OMEGAN,
			DiverscrownOmeganBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GLASSLIGHTBREWER = register("glasslightbrewer", ElementureModBlocks.GLASSLIGHTBREWER,
			GlasslightbrewerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARKGEM_CRYSTAL_BEAM = register("darkgem_crystal_beam",
			ElementureModBlocks.DARKGEM_CRYSTAL_BEAM, DarkgemCrystalBeamBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DIVERSCROWN_MEMORIAL = register("diverscrown_memorial",
			ElementureModBlocks.DIVERSCROWN_MEMORIAL, DiverscrownMemorialBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRABPOT = register("crabpot", ElementureModBlocks.CRABPOT, CrabpotBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NANOSHRIMPPOT = register("nanoshrimppot", ElementureModBlocks.NANOSHRIMPPOT,
			NanoshrimppotBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPIDERNEST_COBBLESTONE = register("spidernest_cobblestone",
			ElementureModBlocks.SPIDERNEST_COBBLESTONE, SpidernestCobblestoneBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPIDERBORE_COBBLESTONE = register("spiderbore_cobblestone",
			ElementureModBlocks.SPIDERBORE_COBBLESTONE, SpiderboreCobblestoneBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPIDERBORE_DEEPSLATEBRICKS = register("spiderbore_deepslatebricks",
			ElementureModBlocks.SPIDERBORE_DEEPSLATEBRICKS, SpiderboreDeepslatebricksBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SMALL_SCRAPPER = register("small_scrapper", ElementureModBlocks.SMALL_SCRAPPER,
			SmallScrapperBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
