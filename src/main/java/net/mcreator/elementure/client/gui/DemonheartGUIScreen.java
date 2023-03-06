package net.mcreator.elementure.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
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
	Button button_absorption;
	Button button_fireresistance;
	Button button_haste;
	Button button_regeneration;
	Button button_jumpboost;
	Button button_luck_up_better_loot;
	Button button_resistance;
	Button button_saturation_no_more_hunger;
	Button button_speed;
	Button button_strength_power;
	Button button_nightvision;
	Button button_waterbreathing;
	Button button_empty;

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
		button_absorption = new Button(this.leftPos + 0, this.topPos + 1, 108, 20, Component.translatable("gui.elementure.demonheart_gui.button_absorption"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(0, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_absorption", button_absorption);
		this.addRenderableWidget(button_absorption);
		button_fireresistance = new Button(this.leftPos + 1, this.topPos + 20, 160, 20, Component.translatable("gui.elementure.demonheart_gui.button_fireresistance"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(1, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_fireresistance", button_fireresistance);
		this.addRenderableWidget(button_fireresistance);
		button_haste = new Button(this.leftPos + 1, this.topPos + 41, 56, 20, Component.translatable("gui.elementure.demonheart_gui.button_haste"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(2, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_haste", button_haste);
		this.addRenderableWidget(button_haste);
		button_regeneration = new Button(this.leftPos + 1, this.topPos + 61, 132, 20, Component.translatable("gui.elementure.demonheart_gui.button_regeneration"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(3, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_regeneration", button_regeneration);
		this.addRenderableWidget(button_regeneration);
		button_jumpboost = new Button(this.leftPos + 0, this.topPos + 80, 116, 20, Component.translatable("gui.elementure.demonheart_gui.button_jumpboost"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(4, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_jumpboost", button_jumpboost);
		this.addRenderableWidget(button_jumpboost);
		button_luck_up_better_loot = new Button(this.leftPos + 0, this.topPos + 100, 188, 20, Component.translatable("gui.elementure.demonheart_gui.button_luck_up_better_loot"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(5, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:button_luck_up_better_loot", button_luck_up_better_loot);
		this.addRenderableWidget(button_luck_up_better_loot);
		button_resistance = new Button(this.leftPos + 0, this.topPos + 120, 108, 20, Component.translatable("gui.elementure.demonheart_gui.button_resistance"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(6, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:button_resistance", button_resistance);
		this.addRenderableWidget(button_resistance);
		button_saturation_no_more_hunger = new Button(this.leftPos + 0, this.topPos + 140, 264, 20, Component.translatable("gui.elementure.demonheart_gui.button_saturation_no_more_hunger"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(7, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:button_saturation_no_more_hunger", button_saturation_no_more_hunger);
		this.addRenderableWidget(button_saturation_no_more_hunger);
		button_speed = new Button(this.leftPos + 1, this.topPos + 160, 60, 20, Component.translatable("gui.elementure.demonheart_gui.button_speed"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(8, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:button_speed", button_speed);
		this.addRenderableWidget(button_speed);
		button_strength_power = new Button(this.leftPos + 0, this.topPos + 179, 160, 20, Component.translatable("gui.elementure.demonheart_gui.button_strength_power"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(9, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:button_strength_power", button_strength_power);
		this.addRenderableWidget(button_strength_power);
		button_nightvision = new Button(this.leftPos + 153, this.topPos + 61, 116, 20, Component.translatable("gui.elementure.demonheart_gui.button_nightvision"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(10, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:button_nightvision", button_nightvision);
		this.addRenderableWidget(button_nightvision);
		button_waterbreathing = new Button(this.leftPos + 104, this.topPos + 120, 164, 20, Component.translatable("gui.elementure.demonheart_gui.button_waterbreathing"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new DemonheartGUIButtonMessage(11, x, y, z));
				DemonheartGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:button_waterbreathing", button_waterbreathing);
		this.addRenderableWidget(button_waterbreathing);
		button_empty = new Button(this.leftPos + 264, this.topPos + 143, 0, 20, Component.translatable("gui.elementure.demonheart_gui.button_empty"), e -> {
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
	}
}
