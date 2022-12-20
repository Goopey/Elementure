
package net.mcreator.elementure.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.world.inventory.DemonheartGUIMenu;
import net.mcreator.elementure.network.DemonheartGUIButtonMessage;
import net.mcreator.elementure.ElementureMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class DemonheartGUIScreen extends AbstractContainerScreen<DemonheartGUIMenu> {
	private final static HashMap<String, Object> guistate = DemonheartGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public DemonheartGUIScreen(DemonheartGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 270;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("elementure:textures/screens/demonheart_gui.png");

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
		this.addRenderableWidget(new Button(this.leftPos + 0, this.topPos + 1, 108, 20, new TextComponent("Absorption"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(0, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 1, this.topPos + 20, 160, 20, new TextComponent("Fire-resistance"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(1, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 1, this.topPos + 41, 56, 20, new TextComponent("Haste"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(2, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 1, this.topPos + 61, 132, 20, new TextComponent("Regeneration"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(3, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 0, this.topPos + 80, 116, 20, new TextComponent("Jump-boost"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(4, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 0, this.topPos + 100, 188, 20, new TextComponent("Luck UP! Better loot"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(5, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 0, this.topPos + 120, 108, 20, new TextComponent("Resistance"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(6, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 0, this.topPos + 140, 264, 20, new TextComponent("Saturation, no more hunger"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(7, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 1, this.topPos + 160, 60, 20, new TextComponent("Speed"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(8, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 0, this.topPos + 179, 160, 20, new TextComponent("Strength. POWER!"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(9, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 153, this.topPos + 61, 116, 20, new TextComponent("Night-vision"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(10, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 104, this.topPos + 120, 164, 20, new TextComponent("Water-breathing"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(11, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 264, this.topPos + 143, 0, 20, new TextComponent(""), e -> {
		}));
	}
}
