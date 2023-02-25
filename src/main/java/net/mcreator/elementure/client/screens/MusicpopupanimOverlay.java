
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
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.procedures.MusicpopupanimConfirmProcedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm9Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm8Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm7Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm6Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm5Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm4Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm3Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm2Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm21Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm20Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm1Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm19Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm18Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm17Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm16Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm15Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm14Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm13Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm12Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm11Procedure;
import net.mcreator.elementure.procedures.MusicpopupanimConfirm10Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class MusicpopupanimOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
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
		if (MusicpopupanimConfirmProcedure.execute(entity)) {
			if (MusicpopupanimConfirm1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm4Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm5Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm6Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_6.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm7Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_7.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm8Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_8.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm9Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_9.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm10Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_10.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm11Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_11.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm12Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_12.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm13Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_13.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm14Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_14.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm15Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_15.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm16Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_16.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm17Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_17.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm18Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_18.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm19Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_19.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm20Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_20.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
			if (MusicpopupanimConfirm21Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/music_box_popup_anim_20.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -212, posY + -119, 0, 0, 128, 24, 128, 24);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
