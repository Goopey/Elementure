
package net.mcreator.elementure.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.procedures.MarbleforestpopupConfirmProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class MarbleforestPopupOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (MarbleforestpopupConfirmProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_2.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);

			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_dot.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -115, 0, 0, 16, 16, 16, 16);

			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_wheel.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -104, posY + -115, 0, 0, 16, 16, 16, 16);

			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.elementure.marbleforest_popup.label_marble_forest"), posX + -198, posY + -116, -203);
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.elementure.marbleforest_popup.label_bymudeth"), posX + -198, posY + -108, -203);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
