package net.mcreator.elementure.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.world.inventory.RelicinventoryMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class RelicinventoryScreen extends AbstractContainerScreen<RelicinventoryMenu> {
	private final static HashMap<String, Object> guistate = RelicinventoryMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public RelicinventoryScreen(RelicinventoryMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("elementure:textures/screens/relicinventory.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/core_symbol.png"));
		this.blit(ms, this.leftPos + 93, this.topPos + 35, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/bag_symbol.png"));
		this.blit(ms, this.leftPos + 142, this.topPos + 12, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/familiar_symbol.png"));
		this.blit(ms, this.leftPos + 115, this.topPos + 12, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/blood_symbol.png"));
		this.blit(ms, this.leftPos + 66, this.topPos + 35, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/charm_symbol_1.png"));
		this.blit(ms, this.leftPos + 7, this.topPos + 57, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/charm_symbol_2.png"));
		this.blit(ms, this.leftPos + 30, this.topPos + 57, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/charm_symbol_3.png"));
		this.blit(ms, this.leftPos + 52, this.topPos + 57, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/charm_symbol_4.png"));
		this.blit(ms, this.leftPos + 106, this.topPos + 57, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/charm_symbol_5.png"));
		this.blit(ms, this.leftPos + 129, this.topPos + 57, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/charm_symbol_6.png"));
		this.blit(ms, this.leftPos + 151, this.topPos + 57, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/artefact_symbol_1.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 12, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/artefact_symbol_2.png"));
		this.blit(ms, this.leftPos + 43, this.topPos + 12, 0, 0, 16, 16, 16, 16);

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
	}
}
