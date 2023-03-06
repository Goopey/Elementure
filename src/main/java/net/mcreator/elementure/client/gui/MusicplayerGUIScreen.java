package net.mcreator.elementure.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.world.inventory.MusicplayerGUIMenu;
import net.mcreator.elementure.network.MusicplayerGUIButtonMessage;
import net.mcreator.elementure.ElementureMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MusicplayerGUIScreen extends AbstractContainerScreen<MusicplayerGUIMenu> {
	private final static HashMap<String, Object> guistate = MusicplayerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_credits;
	Button button_next;
	Button button_marble_forest_mudeth;
	Button button_coral_labyrinth_redgreen;
	Button button_intro_c418;
	Button button_dark_choir_mattia_cupelli;
	Button button_stop_music;
	Button button_forgotten_repulsive;

	public MusicplayerGUIScreen(MusicplayerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 206;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("elementure:textures/screens/musicplayer_gui.png");

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
		button_credits = new Button(this.leftPos + 73, this.topPos + 143, 60, 20, Component.translatable("gui.elementure.musicplayer_gui.button_credits"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new MusicplayerGUIButtonMessage(0, x, y, z));
				MusicplayerGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_credits", button_credits);
		this.addRenderableWidget(button_credits);
		button_next = new Button(this.leftPos + 157, this.topPos + 143, 45, 20, Component.translatable("gui.elementure.musicplayer_gui.button_next"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new MusicplayerGUIButtonMessage(1, x, y, z));
				MusicplayerGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_next", button_next);
		this.addRenderableWidget(button_next);
		button_marble_forest_mudeth = new Button(this.leftPos + 5, this.topPos + 27, 135, 20, Component.translatable("gui.elementure.musicplayer_gui.button_marble_forest_mudeth"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new MusicplayerGUIButtonMessage(2, x, y, z));
				MusicplayerGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_marble_forest_mudeth", button_marble_forest_mudeth);
		this.addRenderableWidget(button_marble_forest_mudeth);
		button_coral_labyrinth_redgreen = new Button(this.leftPos + 5, this.topPos + 49, 160, 20, Component.translatable("gui.elementure.musicplayer_gui.button_coral_labyrinth_redgreen"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new MusicplayerGUIButtonMessage(3, x, y, z));
				MusicplayerGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_coral_labyrinth_redgreen", button_coral_labyrinth_redgreen);
		this.addRenderableWidget(button_coral_labyrinth_redgreen);
		button_intro_c418 = new Button(this.leftPos + 5, this.topPos + 71, 85, 20, Component.translatable("gui.elementure.musicplayer_gui.button_intro_c418"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new MusicplayerGUIButtonMessage(4, x, y, z));
				MusicplayerGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_intro_c418", button_intro_c418);
		this.addRenderableWidget(button_intro_c418);
		button_dark_choir_mattia_cupelli = new Button(this.leftPos + 5, this.topPos + 93, 160, 20, Component.translatable("gui.elementure.musicplayer_gui.button_dark_choir_mattia_cupelli"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new MusicplayerGUIButtonMessage(5, x, y, z));
				MusicplayerGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:button_dark_choir_mattia_cupelli", button_dark_choir_mattia_cupelli);
		this.addRenderableWidget(button_dark_choir_mattia_cupelli);
		button_stop_music = new Button(this.leftPos + 64, this.topPos + 3, 77, 20, Component.translatable("gui.elementure.musicplayer_gui.button_stop_music"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new MusicplayerGUIButtonMessage(6, x, y, z));
				MusicplayerGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:button_stop_music", button_stop_music);
		this.addRenderableWidget(button_stop_music);
		button_forgotten_repulsive = new Button(this.leftPos + 5, this.topPos + 115, 134, 20, Component.translatable("gui.elementure.musicplayer_gui.button_forgotten_repulsive"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new MusicplayerGUIButtonMessage(7, x, y, z));
				MusicplayerGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:button_forgotten_repulsive", button_forgotten_repulsive);
		this.addRenderableWidget(button_forgotten_repulsive);
	}
}
