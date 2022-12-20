
package net.mcreator.elementure.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.world.inventory.MusicplayerGUIMenu;
import net.mcreator.elementure.procedures.RepulsiveForgottenPlayProcedure;
import net.mcreator.elementure.procedures.Musicplayer2OpenProcedure;
import net.mcreator.elementure.procedures.MusicStopMusicProcedure;
import net.mcreator.elementure.procedures.MarbleforestPlayProcedure;
import net.mcreator.elementure.procedures.IntroPlayProcedure;
import net.mcreator.elementure.procedures.DarkchoirPlayProcedure;
import net.mcreator.elementure.procedures.CreditsopenProcedure;
import net.mcreator.elementure.procedures.CorallabyrinthPlayProcedure;
import net.mcreator.elementure.ElementureMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MusicplayerGUIButtonMessage {
	private final int buttonID, x, y, z;

	public MusicplayerGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MusicplayerGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MusicplayerGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MusicplayerGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = MusicplayerGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CreditsopenProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			Musicplayer2OpenProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			MarbleforestPlayProcedure.execute(entity);
		}
		if (buttonID == 3) {

			CorallabyrinthPlayProcedure.execute(entity);
		}
		if (buttonID == 4) {

			IntroPlayProcedure.execute(entity);
		}
		if (buttonID == 5) {

			DarkchoirPlayProcedure.execute(entity);
		}
		if (buttonID == 6) {

			MusicStopMusicProcedure.execute(entity);
		}
		if (buttonID == 7) {

			RepulsiveForgottenPlayProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ElementureMod.addNetworkMessage(MusicplayerGUIButtonMessage.class, MusicplayerGUIButtonMessage::buffer, MusicplayerGUIButtonMessage::new,
				MusicplayerGUIButtonMessage::handler);
	}
}
