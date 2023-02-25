
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

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
import net.mcreator.elementure.client.particle.AngelstarparticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ElementureModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(ElementureModParticleTypes.SOULFLAME.get(), SoulflameParticle::provider);
		event.register(ElementureModParticleTypes.TELEPORTPARTICLE.get(), TeleportparticleParticle::provider);
		event.register(ElementureModParticleTypes.MEMORYPARTICLE.get(), MemoryparticleParticle::provider);
		event.register(ElementureModParticleTypes.TRANSPARENTMEMORYPARTICLE.get(), TransparentmemoryparticleParticle::provider);
		event.register(ElementureModParticleTypes.NEARMEMORYPARTICLE.get(), NearmemoryparticleParticle::provider);
		event.register(ElementureModParticleTypes.MEMORYCRYSTALPARTICLE_1.get(), Memorycrystalparticle1Particle::provider);
		event.register(ElementureModParticleTypes.MEMORYCRYSTALPARTICLE_2.get(), Memorycrystalparticle2Particle::provider);
		event.register(ElementureModParticleTypes.MEMORYCRYSTALPARTICLE_3.get(), Memorycrystalparticle3Particle::provider);
		event.register(ElementureModParticleTypes.FISHINGLINEPARTICLE.get(), FishinglineparticleParticle::provider);
		event.register(ElementureModParticleTypes.SPOREPARTICLE.get(), SporeparticleParticle::provider);
		event.register(ElementureModParticleTypes.FISHNOTIFPARTICLE.get(), FishnotifparticleParticle::provider);
		event.register(ElementureModParticleTypes.MINOSKULLFLAIL_PARTICLE.get(), MinoskullflailParticleParticle::provider);
		event.register(ElementureModParticleTypes.SHADOWPARTICLE_1.get(), Shadowparticle1Particle::provider);
		event.register(ElementureModParticleTypes.SHADOWPARTICLE_2.get(), Shadowparticle2Particle::provider);
		event.register(ElementureModParticleTypes.BRIGHTPARTICLE_1.get(), Brightparticle1Particle::provider);
		event.register(ElementureModParticleTypes.BRIGHTPARTICLE_2.get(), Brightparticle2Particle::provider);
		event.register(ElementureModParticleTypes.STRINGPARTICLE.get(), StringparticleParticle::provider);
		event.register(ElementureModParticleTypes.NETHERSTARDUST_1.get(), Netherstardust1Particle::provider);
		event.register(ElementureModParticleTypes.NETHERSTARDUST_2.get(), Netherstardust2Particle::provider);
		event.register(ElementureModParticleTypes.NETHERSTARDUST_3.get(), Netherstardust3Particle::provider);
		event.register(ElementureModParticleTypes.STARFLOWERPARTICLE.get(), StarflowerparticleParticle::provider);
		event.register(ElementureModParticleTypes.JELLYBUBBLE.get(), JellybubbleParticle::provider);
		event.register(ElementureModParticleTypes.REDSUN_SWIPE.get(), RedsunSwipeParticle::provider);
		event.register(ElementureModParticleTypes.REDSUN_FLAME.get(), RedsunFlameParticle::provider);
		event.register(ElementureModParticleTypes.CLOUDFLUFF.get(), CloudfluffParticle::provider);
		event.register(ElementureModParticleTypes.CLOUDFLUFF_BIG.get(), CloudfluffBigParticle::provider);
		event.register(ElementureModParticleTypes.CLOUDSMOKE.get(), CloudsmokeParticle::provider);
		event.register(ElementureModParticleTypes.WORTASHMOSS.get(), WortashmossParticle::provider);
		event.register(ElementureModParticleTypes.TARFLAME_PARTICLE.get(), TarflameParticleParticle::provider);
		event.register(ElementureModParticleTypes.MYCENAHOTSPRIINGBUBBLE.get(), MycenahotspriingbubbleParticle::provider);
		event.register(ElementureModParticleTypes.BONE_FRAGMENTS.get(), BoneFragmentsParticle::provider);
		event.register(ElementureModParticleTypes.WEB_PARTICLES.get(), WebParticlesParticle::provider);
		event.register(ElementureModParticleTypes.ANGELSTARPARTICLE.get(), AngelstarparticleParticle::provider);
	}
}
