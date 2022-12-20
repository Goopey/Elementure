
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

import net.mcreator.elementure.procedures.Stuntimer6Procedure;
import net.mcreator.elementure.procedures.Stuntimer5Procedure;
import net.mcreator.elementure.procedures.Stuntimer4Procedure;
import net.mcreator.elementure.procedures.Stuntimer3Procedure;
import net.mcreator.elementure.procedures.Stuntimer2Procedure;
import net.mcreator.elementure.procedures.Stuntimer1Procedure;
import net.mcreator.elementure.procedures.Reelingtimer8Procedure;
import net.mcreator.elementure.procedures.Reelingtimer7Procedure;
import net.mcreator.elementure.procedures.Reelingtimer6Procedure;
import net.mcreator.elementure.procedures.Reelingtimer5Procedure;
import net.mcreator.elementure.procedures.Reelingtimer4Procedure;
import net.mcreator.elementure.procedures.Reelingtimer3Procedure;
import net.mcreator.elementure.procedures.Reelingtimer2Procedure;
import net.mcreator.elementure.procedures.Reelingtimer1Procedure;
import net.mcreator.elementure.procedures.FishingbaroverlayDisplayProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class FishingbaroverlayOverlay {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
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
			if (FishingbaroverlayDisplayProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/backg_fishingminigame.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -77, posY + -114, 0, 0, 72, 212, 72, 212);

				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/fishing_progress_bar.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -23, posY + -110, 0, 0, 13, 204, 13, 204);

				if (Reelingtimer1Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/fishing_progress_bar_1.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -21, posY + 67, 0, 0, 9, 25, 9, 25);
				}
				if (Reelingtimer2Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/fishing_progress_bar_2.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -21, posY + 42, 0, 0, 9, 25, 9, 25);
				}
				if (Reelingtimer3Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/fishing_progress_bar_3.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -21, posY + 17, 0, 0, 9, 25, 9, 25);
				}
				if (Reelingtimer4Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/fishing_progress_bar_4.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -21, posY + -8, 0, 0, 9, 25, 9, 25);
				}
				if (Reelingtimer5Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/fishing_progress_bar_5.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -21, posY + -33, 0, 0, 9, 25, 9, 25);
				}
				if (Reelingtimer6Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/fishing_progress_bar_6.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -21, posY + -58, 0, 0, 9, 25, 9, 25);
				}
				if (Reelingtimer7Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/fishing_progress_bar_8.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -21, posY + -83, 0, 0, 9, 25, 9, 25);
				}
				if (Reelingtimer8Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/fishing_progress_bar_10.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -21, posY + -108, 0, 0, 9, 25, 9, 25);
				}
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/backg_fishingitems.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 9, posY + -64, 0, 0, 56, 124, 56, 124);

				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 15, posY + -11, 0, 0, 18, 18, 18, 18);

				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 15, posY + -56, 0, 0, 18, 18, 18, 18);

				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 15, posY + 34, 0, 0, 18, 18, 18, 18);

				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/fishing_stun_progress_bar.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 45, posY + -58, 0, 0, 13, 112, 13, 112);

				if (Stuntimer1Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/stun_bar_1.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 47, posY + 34, 0, 0, 9, 18, 9, 18);
				}
				if (Stuntimer2Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/stun_bar_2.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 47, posY + 16, 0, 0, 9, 18, 9, 18);
				}
				if (Stuntimer3Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/stun_bar_3.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 47, posY + -2, 0, 0, 9, 18, 9, 18);
				}
				if (Stuntimer4Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/stun_bar_4.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 47, posY + -20, 0, 0, 9, 18, 9, 18);
				}
				if (Stuntimer5Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/stun_bar_5.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 47, posY + -38, 0, 0, 9, 18, 9, 18);
				}
				if (Stuntimer6Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/stun_bar_6.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 47, posY + -56, 0, 0, 9, 18, 9, 18);
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
