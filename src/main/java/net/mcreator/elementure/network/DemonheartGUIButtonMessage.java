
package net.mcreator.elementure.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.world.inventory.DemonheartGUIMenu;
import net.mcreator.elementure.procedures.WaterstardemonProcedure;
import net.mcreator.elementure.procedures.VisionstardemonProcedure;
import net.mcreator.elementure.procedures.StrenghtstareffectProcedure;
import net.mcreator.elementure.procedures.SpeedstardemonProcedure;
import net.mcreator.elementure.procedures.SaturationstardemonProcedure;
import net.mcreator.elementure.procedures.ResistancestardemonProcedure;
import net.mcreator.elementure.procedures.LuckystareffectProcedure;
import net.mcreator.elementure.procedures.JumpstardemonProcedure;
import net.mcreator.elementure.procedures.HealthstardemonProcedure;
import net.mcreator.elementure.procedures.HastestardemonProcedure;
import net.mcreator.elementure.procedures.FirestardemonProcedure;
import net.mcreator.elementure.procedures.AbsorptionstardemonProcedure;
import net.mcreator.elementure.ElementureMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DemonheartGUIButtonMessage {
	private final int buttonID, x, y, z;

	public DemonheartGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public DemonheartGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(DemonheartGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(DemonheartGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = DemonheartGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			AbsorptionstardemonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			FirestardemonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			HastestardemonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			HealthstardemonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			JumpstardemonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			LuckystareffectProcedure.execute(entity);
		}
		if (buttonID == 6) {

			ResistancestardemonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			SaturationstardemonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			SpeedstardemonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			StrenghtstareffectProcedure.execute(entity);
		}
		if (buttonID == 10) {

			VisionstardemonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			WaterstardemonProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ElementureMod.addNetworkMessage(DemonheartGUIButtonMessage.class, DemonheartGUIButtonMessage::buffer, DemonheartGUIButtonMessage::new, DemonheartGUIButtonMessage::handler);
	}
}
