
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

import net.mcreator.elementure.procedures.InsanityNug7ConditionProcedure;
import net.mcreator.elementure.procedures.InsanityNug6ConditionProcedure;
import net.mcreator.elementure.procedures.InsanityNug5ConditionProcedure;
import net.mcreator.elementure.procedures.InsanityNug4ConditionProcedure;
import net.mcreator.elementure.procedures.InsanityNug3ConditionProcedure;
import net.mcreator.elementure.procedures.InsanityNug2ConditionProcedure;
import net.mcreator.elementure.procedures.InsanityNug1ConditionProcedure;
import net.mcreator.elementure.procedures.InsanityIsInDimensionProcedure;
import net.mcreator.elementure.procedures.InsanityBarConditionProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class InsanitybarOverlay {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
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
		if (InsanityIsInDimensionProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/insanitybar.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -72, posY + -115, 0, 0, 144, 18, 144, 18);

			if (InsanityBarConditionProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/full_insanitybar.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -72, posY + -115, 0, 0, 144, 18, 144, 18);
			}
			if (InsanityNug7ConditionProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/insanity_nug_1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -71, posY + -114, 0, 0, 21, 16, 21, 16);
			}
			if (InsanityNug6ConditionProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/insanity_nug_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -50, posY + -114, 0, 0, 20, 16, 20, 16);
			}
			if (InsanityNug5ConditionProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/insanity_nug_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -30, posY + -114, 0, 0, 20, 16, 20, 16);
			}
			if (InsanityNug4ConditionProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/insanity_nug_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -10, posY + -114, 0, 0, 20, 16, 20, 16);
			}
			if (InsanityNug3ConditionProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/insanity_nug_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 10, posY + -114, 0, 0, 20, 16, 20, 16);
			}
			if (InsanityNug2ConditionProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/insanity_nug_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 30, posY + -114, 0, 0, 20, 16, 20, 16);
			}
			if (InsanityNug1ConditionProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/insanity_nug_3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 50, posY + -114, 0, 0, 21, 16, 21, 16);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
