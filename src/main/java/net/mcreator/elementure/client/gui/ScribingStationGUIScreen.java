package net.mcreator.elementure.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.world.inventory.ScribingStationGUIMenu;
import net.mcreator.elementure.network.ScribingStationGUIButtonMessage;
import net.mcreator.elementure.ElementureMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ScribingStationGUIScreen extends AbstractContainerScreen<ScribingStationGUIMenu> {
	private final static HashMap<String, Object> guistate = ScribingStationGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_scribe;

	public ScribingStationGUIScreen(ScribingStationGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 118;
	}

	private static final ResourceLocation texture = new ResourceLocation("elementure:textures/screens/scribing_station_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/arrow.png"));
		this.blit(ms, this.leftPos + 40, this.topPos + 13, 0, 0, 22, 15, 22, 15);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/gui_dot.png"));
		this.blit(ms, this.leftPos + 22, this.topPos + 6, 0, 0, 4, 4, 4, 4);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/gui_dot.png"));
		this.blit(ms, this.leftPos + 73, this.topPos + 6, 0, 0, 4, 4, 4, 4);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/gui_dot.png"));
		this.blit(ms, this.leftPos + 79, this.topPos + 6, 0, 0, 4, 4, 4, 4);

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
		button_scribe = new Button(this.leftPos + 101, this.topPos + 10, 56, 20, Component.translatable("gui.elementure.scribing_station_gui.button_scribe"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new ScribingStationGUIButtonMessage(0, x, y, z));
				ScribingStationGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_scribe", button_scribe);
		this.addRenderableWidget(button_scribe);
	}
}
