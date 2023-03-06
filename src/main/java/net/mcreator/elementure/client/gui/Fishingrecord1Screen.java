package net.mcreator.elementure.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.world.inventory.Fishingrecord1Menu;
import net.mcreator.elementure.network.Fishingrecord1ButtonMessage;
import net.mcreator.elementure.ElementureMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Fishingrecord1Screen extends AbstractContainerScreen<Fishingrecord1Menu> {
	private final static HashMap<String, Object> guistate = Fishingrecord1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_regular_fish;
	Button button_legendary;
	Button button_lava_fish;
	Button button_void_fish;
	Button button_diseased;
	Button button_mycena;
	Button button_nether_star;
	Button button_jelly_pools;
	Button button_shellfish;
	Button button_special;
	Button button_windy_shores;
	Button button_next;

	public Fishingrecord1Screen(Fishingrecord1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 149;
	}

	private static final ResourceLocation texture = new ResourceLocation("elementure:textures/screens/fishingrecord_1.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/book_fishing.png"));
		this.blit(ms, this.leftPos + -31, this.topPos + -12, 0, 0, 242, 171, 242, 171);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/chub.png"));
		this.blit(ms, this.leftPos + -21, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/greenjack_gui.png"));
		this.blit(ms, this.leftPos + -21, this.topPos + 24, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/high_trahira.png"));
		this.blit(ms, this.leftPos + -20, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/supreme_trahira.png"));
		this.blit(ms, this.leftPos + -20, this.topPos + 74, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/diseased_chub.png"));
		this.blit(ms, this.leftPos + -20, this.topPos + 99, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/moss_fish.png"));
		this.blit(ms, this.leftPos + -21, this.topPos + 124, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/crumster.png"));
		this.blit(ms, this.leftPos + 86, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/shaub.png"));
		this.blit(ms, this.leftPos + 86, this.topPos + 24, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/grappler_crab.png"));
		this.blit(ms, this.leftPos + 86, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/golden_chub.png"));
		this.blit(ms, this.leftPos + 85, this.topPos + 74, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/skychub.png"));
		this.blit(ms, this.leftPos + 86, this.topPos + 99, 0, 0, 16, 16, 16, 16);

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
		button_regular_fish = new Button(this.leftPos + -5, this.topPos + -2, 85, 20, Component.translatable("gui.elementure.fishingrecord_1.button_regular_fish"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new Fishingrecord1ButtonMessage(0, x, y, z));
				Fishingrecord1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_regular_fish", button_regular_fish);
		this.addRenderableWidget(button_regular_fish);
		button_legendary = new Button(this.leftPos + -5, this.topPos + 22, 70, 20, Component.translatable("gui.elementure.fishingrecord_1.button_legendary"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new Fishingrecord1ButtonMessage(1, x, y, z));
				Fishingrecord1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_legendary", button_legendary);
		this.addRenderableWidget(button_legendary);
		button_lava_fish = new Button(this.leftPos + -5, this.topPos + 47, 70, 20, Component.translatable("gui.elementure.fishingrecord_1.button_lava_fish"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new Fishingrecord1ButtonMessage(2, x, y, z));
				Fishingrecord1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_lava_fish", button_lava_fish);
		this.addRenderableWidget(button_lava_fish);
		button_void_fish = new Button(this.leftPos + -5, this.topPos + 72, 70, 20, Component.translatable("gui.elementure.fishingrecord_1.button_void_fish"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new Fishingrecord1ButtonMessage(3, x, y, z));
				Fishingrecord1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_void_fish", button_void_fish);
		this.addRenderableWidget(button_void_fish);
		button_diseased = new Button(this.leftPos + -4, this.topPos + 97, 65, 20, Component.translatable("gui.elementure.fishingrecord_1.button_diseased"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new Fishingrecord1ButtonMessage(4, x, y, z));
				Fishingrecord1ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_diseased", button_diseased);
		this.addRenderableWidget(button_diseased);
		button_mycena = new Button(this.leftPos + -4, this.topPos + 122, 55, 20, Component.translatable("gui.elementure.fishingrecord_1.button_mycena"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new Fishingrecord1ButtonMessage(5, x, y, z));
				Fishingrecord1ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:button_mycena", button_mycena);
		this.addRenderableWidget(button_mycena);
		button_nether_star = new Button(this.leftPos + 117, this.topPos + -2, 80, 20, Component.translatable("gui.elementure.fishingrecord_1.button_nether_star"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new Fishingrecord1ButtonMessage(6, x, y, z));
				Fishingrecord1ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:button_nether_star", button_nether_star);
		this.addRenderableWidget(button_nether_star);
		button_jelly_pools = new Button(this.leftPos + 117, this.topPos + 22, 82, 20, Component.translatable("gui.elementure.fishingrecord_1.button_jelly_pools"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new Fishingrecord1ButtonMessage(7, x, y, z));
				Fishingrecord1ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:button_jelly_pools", button_jelly_pools);
		this.addRenderableWidget(button_jelly_pools);
		button_shellfish = new Button(this.leftPos + 117, this.topPos + 47, 72, 20, Component.translatable("gui.elementure.fishingrecord_1.button_shellfish"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new Fishingrecord1ButtonMessage(8, x, y, z));
				Fishingrecord1ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:button_shellfish", button_shellfish);
		this.addRenderableWidget(button_shellfish);
		button_special = new Button(this.leftPos + 117, this.topPos + 72, 61, 20, Component.translatable("gui.elementure.fishingrecord_1.button_special"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new Fishingrecord1ButtonMessage(9, x, y, z));
				Fishingrecord1ButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:button_special", button_special);
		this.addRenderableWidget(button_special);
		button_windy_shores = new Button(this.leftPos + 117, this.topPos + 97, 77, 20, Component.translatable("gui.elementure.fishingrecord_1.button_windy_shores"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new Fishingrecord1ButtonMessage(10, x, y, z));
				Fishingrecord1ButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:button_windy_shores", button_windy_shores);
		this.addRenderableWidget(button_windy_shores);
		button_next = new Button(this.leftPos + 117, this.topPos + 122, 46, 20, Component.translatable("gui.elementure.fishingrecord_1.button_next"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new Fishingrecord1ButtonMessage(11, x, y, z));
				Fishingrecord1ButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:button_next", button_next);
		this.addRenderableWidget(button_next);
	}
}
