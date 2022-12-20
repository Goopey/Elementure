
package net.mcreator.elementure.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.world.inventory.MusicplayerGUI2Menu;
import net.mcreator.elementure.procedures.StandtallPlayProcedure;
import net.mcreator.elementure.procedures.OnemoredayPlayProcedure;
import net.mcreator.elementure.procedures.NetherstarPlayProcedure;
import net.mcreator.elementure.procedures.MusicplayerOpenProcedure;
import net.mcreator.elementure.procedures.Musicplayer3OpenProcedure;
import net.mcreator.elementure.procedures.MusicStopMusicProcedure;
import net.mcreator.elementure.procedures.HydrothermalhollowPlayProcedure;
import net.mcreator.elementure.procedures.CreditsopenProcedure;
import net.mcreator.elementure.procedures.BlackironpactPlayProcedure;
import net.mcreator.elementure.ElementureMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MusicplayerGUI2ButtonMessage {
	private final int buttonID, x, y, z;

	public MusicplayerGUI2ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MusicplayerGUI2ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MusicplayerGUI2ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MusicplayerGUI2ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = MusicplayerGUI2Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CreditsopenProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			Musicplayer3OpenProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			MusicplayerOpenProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			MusicStopMusicProcedure.execute(entity);
		}
		if (buttonID == 4) {

			OnemoredayPlayProcedure.execute(entity);
		}
		if (buttonID == 5) {

			StandtallPlayProcedure.execute(entity);
		}
		if (buttonID == 6) {

			HydrothermalhollowPlayProcedure.execute(entity);
		}
		if (buttonID == 7) {

			NetherstarPlayProcedure.execute(entity);
		}
		if (buttonID == 8) {

			BlackironpactPlayProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ElementureMod.addNetworkMessage(MusicplayerGUI2ButtonMessage.class, MusicplayerGUI2ButtonMessage::buffer, MusicplayerGUI2ButtonMessage::new,
				MusicplayerGUI2ButtonMessage::handler);
	}
}
