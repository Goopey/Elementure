
package net.mcreator.elementure.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.world.inventory.CreditsMusicGUIMenu;
import net.mcreator.elementure.network.CreditsMusicGUIButtonMessage;
import net.mcreator.elementure.ElementureMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CreditsMusicGUIScreen extends AbstractContainerScreen<CreditsMusicGUIMenu> {
	private final static HashMap<String, Object> guistate = CreditsMusicGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CreditsMusicGUIScreen(CreditsMusicGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 248;
		this.imageHeight = 176;
	}

	private static final ResourceLocation texture = new ResourceLocation("elementure:textures/screens/credits_music_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/credits.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 2, 0, 0, 248, 36, 248, 36);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Thanks for the music and art :", 3, 37, -35328);
		this.font.draw(poseStack, "Mudeth - Super chill guy. Cool music", 6, 46, -16777216);
		this.font.draw(poseStack, "C418 - For being based", 6, 56, -16777216);
		this.font.draw(poseStack, "Mattia Cupelli - Nice dark choir", 6, 66, -16777216);
		this.font.draw(poseStack, "Cryosyncopy - Has Pog stuff", 6, 76, -16777216);
		this.font.draw(poseStack, "Red&Green - Purple and Yellow", 6, 87, -16777216);
		this.font.draw(poseStack, "Search them up! They're all really cool people.", 1, 162, -35328);
		this.font.draw(poseStack, "Lena Raine - Great soundtracks all around", 6, 98, -16777216);
		this.font.draw(poseStack, "Repulsive - The scary stuff is amazing", 6, 109, -16777216);
		this.font.draw(poseStack, "Lui37 - Bumpin' soundtrack", 6, 120, -16777216);
		this.font.draw(poseStack, "Fred#4322 - For sharing a few great textures", 6, 131, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 169, this.topPos + 141, 72, 20, Component.literal("Next Page"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new CreditsMusicGUIButtonMessage(0, x, y, z));
				CreditsMusicGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
