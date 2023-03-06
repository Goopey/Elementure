
package net.mcreator.elementure.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.level.biome.AmbientAdditionsSettings;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.Music;
import net.minecraft.resources.ResourceLocation;

public class Shadowrealm441Biome {
	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-1).waterColor(-1).waterFogColor(-1).skyColor(-1).foliageColorOverride(-1).grassColorOverride(-1)
				.ambientMoodSound(new AmbientMoodSettings(new SoundEvent(new ResourceLocation("elementure:dungeon_breath")), 6000, 8, 2))
				.ambientAdditionsSound(new AmbientAdditionsSettings(new SoundEvent(new ResourceLocation("elementure:negative_dungeon_step_sound")), 0.0111D))
				.backgroundMusic(new Music(new SoundEvent(new ResourceLocation("elementure:cucuiganon")), 12000, 24000, true)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).temperature(2f).downfall(0.30000000000000004f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
