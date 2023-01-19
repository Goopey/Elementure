
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElementureModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("elementure", "mod.entity.nether_dragon_adult_roar_test.sound"),
				new SoundEvent(new ResourceLocation("elementure", "mod.entity.nether_dragon_adult_roar_test.sound")));
		REGISTRY.put(new ResourceLocation("elementure", "murk_mummy_breath"),
				new SoundEvent(new ResourceLocation("elementure", "murk_mummy_breath")));
		REGISTRY.put(new ResourceLocation("elementure", "dungeon_breath"), new SoundEvent(new ResourceLocation("elementure", "dungeon_breath")));
		REGISTRY.put(new ResourceLocation("elementure", "murky_corpse_hurt"),
				new SoundEvent(new ResourceLocation("elementure", "murky_corpse_hurt")));
		REGISTRY.put(new ResourceLocation("elementure", "dungeon_sound"), new SoundEvent(new ResourceLocation("elementure", "dungeon_sound")));
		REGISTRY.put(new ResourceLocation("elementure", "negative_dungeon_step_sound"),
				new SoundEvent(new ResourceLocation("elementure", "negative_dungeon_step_sound")));
		REGISTRY.put(new ResourceLocation("elementure", "murky_mummy_death"),
				new SoundEvent(new ResourceLocation("elementure", "murky_mummy_death")));
		REGISTRY.put(new ResourceLocation("elementure", "nether_dragon_summon"),
				new SoundEvent(new ResourceLocation("elementure", "nether_dragon_summon")));
		REGISTRY.put(new ResourceLocation("elementure", "vengefulspiritskillsound"),
				new SoundEvent(new ResourceLocation("elementure", "vengefulspiritskillsound")));
		REGISTRY.put(new ResourceLocation("elementure", "cryosyncopy_chthonic_slumber_abyss_music"),
				new SoundEvent(new ResourceLocation("elementure", "cryosyncopy_chthonic_slumber_abyss_music")));
		REGISTRY.put(new ResourceLocation("elementure", "mattia_cupelli_dark_choir_background_music_pitlands_theme"),
				new SoundEvent(new ResourceLocation("elementure", "mattia_cupelli_dark_choir_background_music_pitlands_theme")));
		REGISTRY.put(new ResourceLocation("elementure", "loot_chest_opening"),
				new SoundEvent(new ResourceLocation("elementure", "loot_chest_opening")));
		REGISTRY.put(new ResourceLocation("elementure", "memory_teleport_startup"),
				new SoundEvent(new ResourceLocation("elementure", "memory_teleport_startup")));
		REGISTRY.put(new ResourceLocation("elementure", "memory_teleport"), new SoundEvent(new ResourceLocation("elementure", "memory_teleport")));
		REGISTRY.put(new ResourceLocation("elementure", "intro_theme"), new SoundEvent(new ResourceLocation("elementure", "intro_theme")));
		REGISTRY.put(new ResourceLocation("elementure", "cucuiganon"), new SoundEvent(new ResourceLocation("elementure", "cucuiganon")));
		REGISTRY.put(new ResourceLocation("elementure", "corallabyrinth"), new SoundEvent(new ResourceLocation("elementure", "corallabyrinth")));
		REGISTRY.put(new ResourceLocation("elementure", "marbleforest_music"),
				new SoundEvent(new ResourceLocation("elementure", "marbleforest_music")));
		REGISTRY.put(new ResourceLocation("elementure", "repulsive_forgotten"),
				new SoundEvent(new ResourceLocation("elementure", "repulsive_forgotten")));
		REGISTRY.put(new ResourceLocation("elementure", "redsun_swing"), new SoundEvent(new ResourceLocation("elementure", "redsun_swing")));
		REGISTRY.put(new ResourceLocation("elementure", "redsun_super_swing"),
				new SoundEvent(new ResourceLocation("elementure", "redsun_super_swing")));
		REGISTRY.put(new ResourceLocation("elementure", "one_more_day"), new SoundEvent(new ResourceLocation("elementure", "one_more_day")));
		REGISTRY.put(new ResourceLocation("elementure", "stand_tall"), new SoundEvent(new ResourceLocation("elementure", "stand_tall")));
		REGISTRY.put(new ResourceLocation("elementure", "hydrothermal_hollow"),
				new SoundEvent(new ResourceLocation("elementure", "hydrothermal_hollow")));
		REGISTRY.put(new ResourceLocation("elementure", "rebel_base_1"), new SoundEvent(new ResourceLocation("elementure", "rebel_base_1")));
		REGISTRY.put(new ResourceLocation("elementure", "black_iron_pact"), new SoundEvent(new ResourceLocation("elementure", "black_iron_pact")));
		REGISTRY.put(new ResourceLocation("elementure", "stand_at_mithrill_hall"),
				new SoundEvent(new ResourceLocation("elementure", "stand_at_mithrill_hall")));
		REGISTRY.put(new ResourceLocation("elementure", "lebigma"), new SoundEvent(new ResourceLocation("elementure", "lebigma")));
		REGISTRY.put(new ResourceLocation("elementure", "kassem_hurt"), new SoundEvent(new ResourceLocation("elementure", "kassem_hurt")));
		REGISTRY.put(new ResourceLocation("elementure", "kassem_death"), new SoundEvent(new ResourceLocation("elementure", "kassem_death")));
		REGISTRY.put(new ResourceLocation("elementure", "shurifang_thrown"), new SoundEvent(new ResourceLocation("elementure", "shurifang_thrown")));
		REGISTRY.put(new ResourceLocation("elementure", "fang_bola_thrown"), new SoundEvent(new ResourceLocation("elementure", "fang_bola_thrown")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
