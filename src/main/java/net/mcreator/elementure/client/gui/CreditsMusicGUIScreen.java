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
	Button button_next_page;

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
		this.font.draw(poseStack, Component.translatable("gui.elementure.credits_music_gui.label_thanks_for_the_music_and_art"), 3, 37, -35328);
		this.font.draw(poseStack, Component.translatable("gui.elementure.credits_music_gui.label_mudeth_super_chill_guy_cool_m"), 6, 46, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.elementure.credits_music_gui.label_c418_for_being_based"), 6, 56, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.elementure.credits_music_gui.label_mattia_cupelli_nice_dark_choir"), 6, 66, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.elementure.credits_music_gui.label_cryosyncopy_has_pog_stuff"), 6, 76, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.elementure.credits_music_gui.label_redgreen_purple_and_yellow"), 6, 87, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.elementure.credits_music_gui.label_search_them_up_theyre_all_real"), 1, 162, -35328);
		this.font.draw(poseStack, Component.translatable("gui.elementure.credits_music_gui.label_lena_raine_great_soundtracks_a"), 6, 98, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.elementure.credits_music_gui.label_repulsive_the_scary_stuff_is_a"), 6, 109, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.elementure.credits_music_gui.label_lui37_bumpin_soundtrack"), 6, 120, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.elementure.credits_music_gui.label_fred4322_for_sharing_a_few_gr"), 6, 131, -16777216);
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
		button_next_page = new Button(this.leftPos + 169, this.topPos + 141, 72, 20, Component.translatable("gui.elementure.credits_music_gui.button_next_page"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new CreditsMusicGUIButtonMessage(0, x, y, z));
				CreditsMusicGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_next_page", button_next_page);
		this.addRenderableWidget(button_next_page);
	}
}
