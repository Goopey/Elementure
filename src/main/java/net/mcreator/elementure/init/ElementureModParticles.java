
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.client.particle.WortashmossParticle;
import net.mcreator.elementure.client.particle.WebParticlesParticle;
import net.mcreator.elementure.client.particle.TransparentmemoryparticleParticle;
import net.mcreator.elementure.client.particle.TeleportparticleParticle;
import net.mcreator.elementure.client.particle.TarflameParticleParticle;
import net.mcreator.elementure.client.particle.StringparticleParticle;
import net.mcreator.elementure.client.particle.StarflowerparticleParticle;
import net.mcreator.elementure.client.particle.SporeparticleParticle;
import net.mcreator.elementure.client.particle.SoulflameParticle;
import net.mcreator.elementure.client.particle.Shadowparticle2Particle;
import net.mcreator.elementure.client.particle.Shadowparticle1Particle;
import net.mcreator.elementure.client.particle.RedsunSwipeParticle;
import net.mcreator.elementure.client.particle.RedsunFlameParticle;
import net.mcreator.elementure.client.particle.Netherstardust3Particle;
import net.mcreator.elementure.client.particle.Netherstardust2Particle;
import net.mcreator.elementure.client.particle.Netherstardust1Particle;
import net.mcreator.elementure.client.particle.NearmemoryparticleParticle;
import net.mcreator.elementure.client.particle.MycenahotspriingbubbleParticle;
import net.mcreator.elementure.client.particle.MinoskullflailParticleParticle;
import net.mcreator.elementure.client.particle.MemoryparticleParticle;
import net.mcreator.elementure.client.particle.Memorycrystalparticle3Particle;
import net.mcreator.elementure.client.particle.Memorycrystalparticle2Particle;
import net.mcreator.elementure.client.particle.Memorycrystalparticle1Particle;
import net.mcreator.elementure.client.particle.JellybubbleParticle;
import net.mcreator.elementure.client.particle.FishnotifparticleParticle;
import net.mcreator.elementure.client.particle.FishinglineparticleParticle;
import net.mcreator.elementure.client.particle.CloudsmokeParticle;
import net.mcreator.elementure.client.particle.CloudfluffParticle;
import net.mcreator.elementure.client.particle.CloudfluffBigParticle;
import net.mcreator.elementure.client.particle.Brightparticle2Particle;
import net.mcreator.elementure.client.particle.Brightparticle1Particle;
import net.mcreator.elementure.client.particle.BoneFragmentsParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ElementureModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.SOULFLAME.get(), SoulflameParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.TELEPORTPARTICLE.get(),
				TeleportparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.MEMORYPARTICLE.get(),
				MemoryparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.TRANSPARENTMEMORYPARTICLE.get(),
				TransparentmemoryparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.NEARMEMORYPARTICLE.get(),
				NearmemoryparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.MEMORYCRYSTALPARTICLE_1.get(),
				Memorycrystalparticle1Particle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.MEMORYCRYSTALPARTICLE_2.get(),
				Memorycrystalparticle2Particle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.MEMORYCRYSTALPARTICLE_3.get(),
				Memorycrystalparticle3Particle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.FISHINGLINEPARTICLE.get(),
				FishinglineparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.SPOREPARTICLE.get(),
				SporeparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.FISHNOTIFPARTICLE.get(),
				FishnotifparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.MINOSKULLFLAIL_PARTICLE.get(),
				MinoskullflailParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.SHADOWPARTICLE_1.get(),
				Shadowparticle1Particle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.SHADOWPARTICLE_2.get(),
				Shadowparticle2Particle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.BRIGHTPARTICLE_1.get(),
				Brightparticle1Particle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.BRIGHTPARTICLE_2.get(),
				Brightparticle2Particle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.STRINGPARTICLE.get(),
				StringparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.NETHERSTARDUST_1.get(),
				Netherstardust1Particle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.NETHERSTARDUST_2.get(),
				Netherstardust2Particle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.NETHERSTARDUST_3.get(),
				Netherstardust3Particle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.STARFLOWERPARTICLE.get(),
				StarflowerparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.JELLYBUBBLE.get(),
				JellybubbleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.REDSUN_SWIPE.get(),
				RedsunSwipeParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.REDSUN_FLAME.get(),
				RedsunFlameParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.CLOUDFLUFF.get(),
				CloudfluffParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.CLOUDFLUFF_BIG.get(),
				CloudfluffBigParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.CLOUDSMOKE.get(),
				CloudsmokeParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.WORTASHMOSS.get(),
				WortashmossParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.TARFLAME_PARTICLE.get(),
				TarflameParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.MYCENAHOTSPRIINGBUBBLE.get(),
				MycenahotspriingbubbleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.BONE_FRAGMENTS.get(),
				BoneFragmentsParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ElementureModParticleTypes.WEB_PARTICLES.get(),
				WebParticlesParticle::provider);
	}
}
