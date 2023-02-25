
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.elementure.network.QuickBackpackKeyMessage;
import net.mcreator.elementure.network.OpenrelicinventorykeyMessage;
import net.mcreator.elementure.network.MusicplayerMessage;
import net.mcreator.elementure.network.FishingreelInMessage;
import net.mcreator.elementure.network.FishingabilityMessage;
import net.mcreator.elementure.network.DirectionalDodgeKeyMessage;
import net.mcreator.elementure.ElementureMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ElementureModKeyMappings {
	public static final KeyMapping OPENRELICINVENTORYKEY = new KeyMapping("key.elementure.openrelicinventorykey", GLFW.GLFW_KEY_0,
			"key.categories.inventory") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ElementureMod.PACKET_HANDLER.sendToServer(new OpenrelicinventorykeyMessage(0, 0));
				OpenrelicinventorykeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping QUICK_BACKPACK_KEY = new KeyMapping("key.elementure.quick_backpack_key", GLFW.GLFW_KEY_MINUS,
			"key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ElementureMod.PACKET_HANDLER.sendToServer(new QuickBackpackKeyMessage(0, 0));
				QuickBackpackKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping FISHINGREEL_IN = new KeyMapping("key.elementure.fishingreel_in", GLFW.GLFW_KEY_Z, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ElementureMod.PACKET_HANDLER.sendToServer(new FishingreelInMessage(0, 0));
				FishingreelInMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				FISHINGREEL_IN_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - FISHINGREEL_IN_LASTPRESS);
				ElementureMod.PACKET_HANDLER.sendToServer(new FishingreelInMessage(1, dt));
				FishingreelInMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping FISHINGABILITY = new KeyMapping("key.elementure.fishingability", GLFW.GLFW_KEY_X, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ElementureMod.PACKET_HANDLER.sendToServer(new FishingabilityMessage(0, 0));
				FishingabilityMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				FISHINGABILITY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - FISHINGABILITY_LASTPRESS);
				ElementureMod.PACKET_HANDLER.sendToServer(new FishingabilityMessage(1, dt));
				FishingabilityMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MUSICPLAYER = new KeyMapping("key.elementure.musicplayer", GLFW.GLFW_KEY_EQUAL, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ElementureMod.PACKET_HANDLER.sendToServer(new MusicplayerMessage(0, 0));
				MusicplayerMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DIRECTIONAL_DODGE_KEY = new KeyMapping("key.elementure.directional_dodge_key", GLFW.GLFW_KEY_SPACE,
			"key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DirectionalDodgeKeyMessage(0, 0));
				DirectionalDodgeKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping WEAPON_ARTS_KEY = new KeyMapping("key.elementure.weapon_arts_key", GLFW.GLFW_KEY_V, "key.categories.gameplay");
	private static long FISHINGREEL_IN_LASTPRESS = 0;
	private static long FISHINGABILITY_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(OPENRELICINVENTORYKEY);
		event.register(QUICK_BACKPACK_KEY);
		event.register(FISHINGREEL_IN);
		event.register(FISHINGABILITY);
		event.register(MUSICPLAYER);
		event.register(DIRECTIONAL_DODGE_KEY);
		event.register(WEAPON_ARTS_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				OPENRELICINVENTORYKEY.consumeClick();
				QUICK_BACKPACK_KEY.consumeClick();
				FISHINGREEL_IN.consumeClick();
				FISHINGABILITY.consumeClick();
				MUSICPLAYER.consumeClick();
				DIRECTIONAL_DODGE_KEY.consumeClick();
			}
		}
	}
}
