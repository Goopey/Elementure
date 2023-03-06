
package net.mcreator.elementure.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.elementure.procedures.FishingabilityOnKeyReleasedProcedure;
import net.mcreator.elementure.procedures.FishingabilityOnKeyPressedProcedure;
import net.mcreator.elementure.ElementureMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FishingabilityMessage {
	int type, pressedms;

	public FishingabilityMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public FishingabilityMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(FishingabilityMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(FishingabilityMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			FishingabilityOnKeyPressedProcedure.execute(entity);
		}
		if (type == 1) {

			FishingabilityOnKeyReleasedProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ElementureMod.addNetworkMessage(FishingabilityMessage.class, FishingabilityMessage::buffer, FishingabilityMessage::new, FishingabilityMessage::handler);
	}
}
