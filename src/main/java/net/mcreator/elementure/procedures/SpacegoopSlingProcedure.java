package net.mcreator.elementure.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import java.util.List;
import java.util.ArrayList;

public class SpacegoopSlingProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity.getDisplayName().getString()).equals("mega1134227") || (sourceentity.getDisplayName().getString()).equals("Dev")) {
			entity.setDeltaMovement(new Vec3(0, 12, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 6000, 4));
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					entity.setDeltaMovement(new Vec3(0, 0, 0));
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 40);
			if (entity instanceof Player) {
				{
					List<? extends Player> _players = new ArrayList<>(world.players());
					for (Entity entityiterator : _players) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null)
								_ent.getServer().getCommands().performCommand(
										_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
										"playsound elementure:lebigma master @s");
						}
					}
				}
				if (!world.isClientSide()) {
					MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
					if (_mcserv != null)
						_mcserv.getPlayerList().broadcastMessage(new TextComponent("You wanted balls this much Alexandre?"), ChatType.SYSTEM,
								Util.NIL_UUID);
				}
				if (!world.isClientSide()) {
					MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
					if (_mcserv != null)
						_mcserv.getPlayerList().broadcastMessage(new TextComponent("Enjoy!"), ChatType.SYSTEM, Util.NIL_UUID);
				}
			}
		}
	}
}
