package net.mcreator.elementure.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.world.inventory.CreditsMusicGUI2Menu;
import net.mcreator.elementure.procedures.DeactivateSlotProcedure;
import net.mcreator.elementure.network.CreditsMusicGUI2ButtonMessage;
import net.mcreator.elementure.ElementureMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CreditsMusicGUI2Screen extends AbstractContainerScreen<CreditsMusicGUI2Menu> {
	private final static HashMap<String, Object> guistate = CreditsMusicGUI2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_next_page;
	Button button_previous_page;

	public CreditsMusicGUI2Screen(CreditsMusicGUI2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 248;
		this.imageHeight = 176;
	}

	private static final ResourceLocation texture = new ResourceLocation("elementure:textures/screens/credits_music_gui_2.png");

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
		this.font.draw(poseStack, Component.translatable("gui.elementure.credits_music_gui_2.label_thanks_for_the_music_and_art"), 3, 37, -35328);
		this.font.draw(poseStack, Component.translatable("gui.elementure.credits_music_gui_2.label_search_them_up_theyre_all_real"), 1, 162, -35328);
		this.font.draw(poseStack, Component.translatable("gui.elementure.credits_music_gui_2.label_battle_brothers_monkey_bros"), 6, 46, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.elementure.credits_music_gui_2.label_demon_stone_heavenly_choir"), 6, 56, -16777216);
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
		button_next_page = new Button(this.leftPos + 169, this.topPos + 141, 72, 20, Component.translatable("gui.elementure.credits_music_gui_2.button_next_page"), e -> {
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DeactivateSlotProcedure.execute())
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:button_next_page", button_next_page);
		this.addRenderableWidget(button_next_page);
		button_previous_page = new Button(this.leftPos + 5, this.topPos + 141, 93, 20, Component.translatable("gui.elementure.credits_music_gui_2.button_previous_page"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new CreditsMusicGUI2ButtonMessage(1, x, y, z));
				CreditsMusicGUI2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_previous_page", button_previous_page);
		this.addRenderableWidget(button_previous_page);
	}
}
