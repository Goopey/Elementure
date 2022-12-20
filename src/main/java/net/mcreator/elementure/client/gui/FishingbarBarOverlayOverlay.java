
package net.mcreator.elementure.client.gui;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.procedures.FishingbaroverlayDisplayProcedure;
import net.mcreator.elementure.procedures.BobberReelingStunProcedure;
import net.mcreator.elementure.procedures.BobberReelingGoodProcedure;
import net.mcreator.elementure.procedures.BobberReelingBadProcedure;
import net.mcreator.elementure.procedures.BobberPosReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class FishingbarBarOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Pre event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
			int w = event.getWindow().getGuiScaledWidth();
			int h = event.getWindow().getGuiScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			Level _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.level;
				_x = entity.getX();
				_y = entity.getY();
				_z = entity.getZ();
			}
			Level world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			if (FishingbaroverlayDisplayProcedure.execute(entity)) {
				if (BobberReelingGoodProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/fishing_bar_good.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -57, posY + 30 - (int) BobberPosReturnProcedure.execute(entity),
							0, 0, 16, 54, 16, 54);
				}
				if (BobberReelingBadProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/fishing_bar_bad.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -57, posY + 30 - (int) BobberPosReturnProcedure.execute(entity),
							0, 0, 16, 54, 16, 54);
				}
				if (BobberReelingStunProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/fishing_bar_damage.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -57, posY + 30 - (int) BobberPosReturnProcedure.execute(entity),
							0, 0, 16, 54, 16, 54);
				}
			}
		}
	}
}
