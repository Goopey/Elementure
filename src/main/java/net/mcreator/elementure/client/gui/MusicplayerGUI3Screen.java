
package net.mcreator.elementure.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.world.inventory.MusicplayerGUI3Menu;
import net.mcreator.elementure.procedures.DeactivateSlotProcedure;
import net.mcreator.elementure.network.MusicplayerGUI3ButtonMessage;
import net.mcreator.elementure.ElementureMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MusicplayerGUI3Screen extends AbstractContainerScreen<MusicplayerGUI3Menu> {
	private final static HashMap<String, Object> guistate = MusicplayerGUI3Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MusicplayerGUI3Screen(MusicplayerGUI3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 206;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("elementure:textures/screens/musicplayer_gui_3.png");

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
		this.addRenderableWidget(new Button(this.leftPos + 73, this.topPos + 143, 60, 20, Component.literal("Credits"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new MusicplayerGUI3ButtonMessage(0, x, y, z));
				MusicplayerGUI3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 157, this.topPos + 143, 45, 20, Component.literal("Next"), e -> {
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DeactivateSlotProcedure.execute())
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 2, this.topPos + 143, 45, 20, Component.literal("Back"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new MusicplayerGUI3ButtonMessage(2, x, y, z));
				MusicplayerGUI3ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 64, this.topPos + 3, 77, 20, Component.literal("STOP MUSIC"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new MusicplayerGUI3ButtonMessage(3, x, y, z));
				MusicplayerGUI3ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(
				new Button(this.leftPos + 1, this.topPos + 27, 202, 20, Component.literal("Stand At Mithrill Hall - Demon Stone"), e -> {
					if (true) {
						ElementureMod.PACKET_HANDLER.sendToServer(new MusicplayerGUI3ButtonMessage(4, x, y, z));
						MusicplayerGUI3ButtonMessage.handleButtonAction(entity, 4, x, y, z);
					}
				}));
	}
}
