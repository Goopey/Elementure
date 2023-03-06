
package net.mcreator.elementure.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.world.inventory.Fishingrecord1Menu;
import net.mcreator.elementure.procedures.ShellfishOpenProcedure;
import net.mcreator.elementure.procedures.OpenwindyshoresProcedure;
import net.mcreator.elementure.procedures.Openvoidfish1Procedure;
import net.mcreator.elementure.procedures.OpenregularfishProcedure;
import net.mcreator.elementure.procedures.Opennetherstarfish1Procedure;
import net.mcreator.elementure.procedures.Openmycenafish1Procedure;
import net.mcreator.elementure.procedures.OpenlegendaryfishProcedure;
import net.mcreator.elementure.procedures.Openlavafish1Procedure;
import net.mcreator.elementure.procedures.Openfishingrecord2Procedure;
import net.mcreator.elementure.procedures.Opendiseasedfish1Procedure;
import net.mcreator.elementure.procedures.Jellypoolsopen1Procedure;
import net.mcreator.elementure.procedures.DungeonwaterrecordOpenProcedure;
import net.mcreator.elementure.ElementureMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Fishingrecord1ButtonMessage {
	private final int buttonID, x, y, z;

	public Fishingrecord1ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public Fishingrecord1ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(Fishingrecord1ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(Fishingrecord1ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = Fishingrecord1Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenregularfishProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			OpenlegendaryfishProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			Openlavafish1Procedure.execute(world, entity);
		}
		if (buttonID == 3) {

			Openvoidfish1Procedure.execute(world, entity);
		}
		if (buttonID == 4) {

			Opendiseasedfish1Procedure.execute(world, entity);
		}
		if (buttonID == 5) {

			Openmycenafish1Procedure.execute(world, entity);
		}
		if (buttonID == 6) {

			Opennetherstarfish1Procedure.execute(world, entity);
		}
		if (buttonID == 7) {

			Jellypoolsopen1Procedure.execute(world, entity);
		}
		if (buttonID == 8) {

			ShellfishOpenProcedure.execute(world, entity);
		}
		if (buttonID == 9) {

			DungeonwaterrecordOpenProcedure.execute(world, entity);
		}
		if (buttonID == 10) {

			OpenwindyshoresProcedure.execute(world, entity);
		}
		if (buttonID == 11) {

			Openfishingrecord2Procedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ElementureMod.addNetworkMessage(Fishingrecord1ButtonMessage.class, Fishingrecord1ButtonMessage::buffer, Fishingrecord1ButtonMessage::new, Fishingrecord1ButtonMessage::handler);
	}
}
