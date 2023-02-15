
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
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.procedures.TarwormlingDisplayProcedure;
import net.mcreator.elementure.procedures.FishabilitytimerReturnProcedure;
import net.mcreator.elementure.procedures.FishabilityposReturnProcedure;
import net.mcreator.elementure.procedures.FishPosReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class TarwormlingOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.LOW)
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
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.enableBlend();
			RenderSystem.setShader(GameRenderer::getPositionTexShader);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.setShaderColor(1, 1, 1, 1);
			if (TarwormlingDisplayProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/tar_wormling.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -57, posY + 68 - (int) FishPosReturnProcedure.execute(entity), 0, 0,
						16, 16, 16, 16);
				if (FishabilitytimerReturnProcedure.execute(entity) > 120) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/cthulhu_dark.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -71,
							posY + -108 - (int) FishabilityposReturnProcedure.execute(entity), 0, 0, 44, 96, 44, 96);
				}
			}
			RenderSystem.depthMask(true);
			RenderSystem.defaultBlendFunc();
			RenderSystem.enableDepthTest();
			RenderSystem.disableBlend();
			RenderSystem.setShaderColor(1, 1, 1, 1);
		}
	}
}