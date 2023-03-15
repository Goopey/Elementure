package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.client.player.AbstractClientPlayer;

import javax.annotation.Nullable;

import java.util.Map;
import java.util.IdentityHashMap;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;
import dev.kosmx.playerAnim.api.layered.AnimationStack;

@Mod.EventBusSubscriber(modid = "elementure", bus = Mod.EventBusSubscriber.Bus.MOD)
public class SetupAnimationsProcedure {
	public static final Map<AbstractClientPlayer, ModifierLayer<IAnimation>> animationData = new IdentityHashMap<>();

	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event) {
		PlayerAnimationAccess.REGISTER_ANIMATION_EVENT.register(SetupAnimationsProcedure::registerPlayerAnimation);
	}

	private static void registerPlayerAnimation(AbstractClientPlayer player, AnimationStack stack) {
		var layer = new ModifierLayer<>();
		stack.addAnimLayer(1000, layer); //Register the layer with a priority
		SetupAnimationsProcedure.animationData.put(player, layer);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
	}
}
