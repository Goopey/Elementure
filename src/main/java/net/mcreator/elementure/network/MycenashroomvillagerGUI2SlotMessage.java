
package net.mcreator.elementure.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.world.inventory.MycenashroomvillagerGUI2Menu;
import net.mcreator.elementure.procedures.Mycenavillagertransaction3Procedure;
import net.mcreator.elementure.procedures.Mycenavillagertransaction2Procedure;
import net.mcreator.elementure.procedures.Mycenavillagertransaction1Procedure;
import net.mcreator.elementure.procedures.Mycenavillagertrade2Procedure;
import net.mcreator.elementure.ElementureMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MycenashroomvillagerGUI2SlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public MycenashroomvillagerGUI2SlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public MycenashroomvillagerGUI2SlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(MycenashroomvillagerGUI2SlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(MycenashroomvillagerGUI2SlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int slotID = message.slotID;
			int changeType = message.changeType;
			int meta = message.meta;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleSlotAction(entity, slotID, changeType, meta, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleSlotAction(Player entity, int slotID, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = MycenashroomvillagerGUI2Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slotID == 1 && changeType == 1) {

			Mycenavillagertrade2Procedure.execute(entity);
		}
		if (slotID == 1 && changeType == 2) {
			int amount = meta;

			Mycenavillagertrade2Procedure.execute(entity);
		}
		if (slotID == 2 && changeType == 1) {

			Mycenavillagertransaction1Procedure.execute(entity);
		}
		if (slotID == 2 && changeType == 2) {
			int amount = meta;

			Mycenavillagertransaction1Procedure.execute(entity);
		}
		if (slotID == 5 && changeType == 1) {

			Mycenavillagertrade2Procedure.execute(entity);
		}
		if (slotID == 5 && changeType == 2) {
			int amount = meta;

			Mycenavillagertrade2Procedure.execute(entity);
		}
		if (slotID == 6 && changeType == 1) {

			Mycenavillagertransaction2Procedure.execute(entity);
		}
		if (slotID == 6 && changeType == 2) {
			int amount = meta;

			Mycenavillagertransaction2Procedure.execute(entity);
		}
		if (slotID == 9 && changeType == 1) {

			Mycenavillagertrade2Procedure.execute(entity);
		}
		if (slotID == 9 && changeType == 2) {
			int amount = meta;

			Mycenavillagertrade2Procedure.execute(entity);
		}
		if (slotID == 10 && changeType == 1) {

			Mycenavillagertransaction3Procedure.execute(entity);
		}
		if (slotID == 10 && changeType == 2) {
			int amount = meta;

			Mycenavillagertransaction3Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ElementureMod.addNetworkMessage(MycenashroomvillagerGUI2SlotMessage.class, MycenashroomvillagerGUI2SlotMessage::buffer,
				MycenashroomvillagerGUI2SlotMessage::new, MycenashroomvillagerGUI2SlotMessage::handler);
	}
}
