
package net.mcreator.elementure.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.world.inventory.MusicplayerGUI3Menu;
import net.mcreator.elementure.procedures.StandatmithrillhallPlayProcedure;
import net.mcreator.elementure.procedures.Musicplayer2OpenProcedure;
import net.mcreator.elementure.procedures.MusicStopMusicProcedure;
import net.mcreator.elementure.procedures.CreditsopenProcedure;
import net.mcreator.elementure.ElementureMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MusicplayerGUI3ButtonMessage {
	private final int buttonID, x, y, z;

	public MusicplayerGUI3ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MusicplayerGUI3ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MusicplayerGUI3ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MusicplayerGUI3ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = MusicplayerGUI3Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CreditsopenProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			Musicplayer2OpenProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			MusicStopMusicProcedure.execute(entity);
		}
		if (buttonID == 4) {

			StandatmithrillhallPlayProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ElementureMod.addNetworkMessage(MusicplayerGUI3ButtonMessage.class, MusicplayerGUI3ButtonMessage::buffer, MusicplayerGUI3ButtonMessage::new,
				MusicplayerGUI3ButtonMessage::handler);
	}
}
